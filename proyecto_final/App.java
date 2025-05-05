package proyecto_final;

import java.io.IOException;

import proyecto_final.modelo.*;
import proyecto_final.algoritmos.*;
import proyecto_final.estructuras.*;
import proyecto_final.simulacion.*;
import proyecto_final.io.*;

import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ruta CSV: ");
        String path = sc.nextLine();
        Grafo grafo = CSVLoader.cargar(path);
        PilaCambios pila = new PilaCambios();
        ListaCongestiones lista = new ListaCongestiones();

        List<Nodo> nodos = new ArrayList<>(grafo.getNodos());

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ruta más rápida entre estaciones (Dijkstra)");
            System.out.println("2. Recorrido completo (Floyd-Warshall)");
            System.out.println("3. Replanificar (Floyd-Warshall)");
            System.out.println("4. Detectar inconsistencias (Bellman-Ford)");
            System.out.println("5. Deshacer último cambio");
            System.out.println("6. Mostrar congestiones");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            int op = sc.nextInt();
            sc.nextLine(); // Limpieza de buffer

            switch (op) {
                case 1: {
                    System.out.print("Origen: ");
                    Nodo o = new Nodo(sc.next());
                    System.out.print("Destino: ");
                    Nodo d = new Nodo(sc.next());

                    // Iniciar simulación (20s)
                    Thread simulador = new Thread(new SimuladorTráfico(grafo, 20000));
                    simulador.start();

                    System.out.println("Calculando ruta más rápida... espera 20 segundos.");
                    try {
                        Thread.sleep(20000);
                    } catch (InterruptedException e) {
                        System.err.println("Cálculo interrumpido.");
                    }

                    Map<Nodo, Integer> distancias = Dijkstra.calcular(grafo, o);
                    Map<Nodo, Nodo> previos = Dijkstra.getPrevios();

                    // Reconstruir ruta
                    List<Nodo> ruta = new ArrayList<>();
                    Nodo actual = d;
                    while (actual != null && !actual.equals(o)) {
                        ruta.add(actual);
                        actual = previos.get(actual);
                    }

                    if (actual == null) {
                        System.out.println("No hay ruta desde " + o + " a " + d);
                    } else {
                        ruta.add(o);
                        Collections.reverse(ruta);

                        System.out.print("Ruta: ");
                        for (int i = 0; i < ruta.size(); i++) {
                            System.out.print(ruta.get(i));
                            if (i < ruta.size() - 1)
                                System.out.print(" -> ");
                        }
                        System.out.println();

                        System.out.printf("Tiempo estimado: %d min%n", distancias.get(d));
                    }

                    pila.push("Dijkstra de " + o + " a " + d);
                    break;
                }
                case 2: {
                    System.out.println("Calculando recorrido completo...");
                    int[][] distFW = FloydWarshall.calcular(grafo, nodos);
                    System.out.println("Matriz de distancias:");
                    for (int i = 0; i < nodos.size(); i++)
                        System.out.println(Arrays.toString(distFW[i]));
                    pila.push("Floyd-Warshall completo");
                    break;
                }
                case 3: {
                    int[][] distFW = FloydWarshall.calcular(grafo, nodos);
                    System.out.println("Matriz de distancias:");
                    for (int i = 0; i < nodos.size(); i++)
                        System.out.println(Arrays.toString(distFW[i]));
                    pila.push("Floyd-Warshall completo");
                    break;
                }
                case 4: {
                    System.out.print("Origen: ");
                    Nodo bo = new Nodo(sc.next());
                    try {
                        Map<Nodo, Integer> distBF = BellmanFord.calcular(grafo, bo);
                        distBF.forEach((n, d2) -> System.out.printf("%s: %d%n", n, d2));
                        pila.push("Bellman-Ford desde " + bo);
                    } catch (RuntimeException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                }
                case 5: {
                    String cambio = pila.pop();
                    System.out.println("Deshecho: " + (cambio != null ? cambio : "Nada"));
                    break;
                }
                case 6: {
                    System.out.println("Congestiones:");
                    for (Nodo n : nodos) {
                        for (Arista a : grafo.getAristasDesde(n)) {
                            if (a.getPeso() > 10) {
                                System.out.printf("%s -> %s: %d min%n", n, a.getDestino(), a.getPeso());
                            }
                        }
                    }
                    break;
                }
                case 7: {
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Opción no válida.");
                    break;
                }
            }
        }
    }
}
