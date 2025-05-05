package proyecto_final.simulacion;

import proyecto_final.modelo.Grafo;
import proyecto_final.modelo.Nodo;
import proyecto_final.modelo.Arista;

import java.util.*;

public class SimuladorTráfico implements Runnable {
    private final Grafo grafo;
    private final long duracionMs;
    private final Random rand = new Random();

    public SimuladorTráfico(Grafo grafo, long duracionMs) {
        this.grafo = grafo;
        this.duracionMs = duracionMs;
    }

    @Override
    public void run() {
        long fin = System.currentTimeMillis() + duracionMs;
        List<Nodo> nodos = new ArrayList<>(grafo.getNodos());
        while (System.currentTimeMillis() < fin) {
            try {
                Thread.sleep(2000 + rand.nextInt(3000));
                Nodo o = nodos.get(rand.nextInt(nodos.size()));
                Nodo d = nodos.get(rand.nextInt(nodos.size()));
                for (Arista a : grafo.getAristasDesde(o)) {
                    if (a.getDestino().equals(d)) {
                        int inc = 1 + rand.nextInt(10);
                        a.setPeso(a.getPeso() + inc);
                        System.out.printf("Incremento de %d minutos en %s -> %s%n",
                                inc, o, d);
                    }
                }
            } catch (InterruptedException ignored) {}
        }
    }
}
