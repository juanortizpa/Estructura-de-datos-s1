package proyecto_final.algoritmos;

import proyecto_final.modelo.*;
import java.util.*;

public class Dijkstra {
    private static Map<Nodo, Nodo> previos; // Para rastrear los nodos previos

    public static Map<Nodo, Integer> calcular(Grafo g, Nodo origen) {
        Map<Nodo, Integer> dist = new HashMap<>();
        previos = new HashMap<>(); // Inicializar el mapa de nodos previos

        for (Nodo n : g.getNodos()) dist.put(n, Integer.MAX_VALUE);
        dist.put(origen, 0);

        PriorityQueue<Nodo> pq = new PriorityQueue<>(Comparator.comparingInt(dist::get));
        pq.add(origen);

        while (!pq.isEmpty()) {
            Nodo u = pq.poll();
            for (Arista a : g.getAristasDesde(u)) {
                Nodo v = a.getDestino();
                int alt = dist.get(u) + a.getPeso();
                if (alt < dist.get(v)) {
                    dist.put(v, alt);
                    previos.put(v, u); // Registrar el nodo previo
                    pq.remove(v);
                    pq.add(v);
                }
            }
        }
        return dist;
    }

    public static Map<Nodo, Nodo> getPrevios() {
        return previos;
    }
}