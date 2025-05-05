package proyecto_final.algoritmos;

import proyecto_final.modelo.*;
import java.util.*;

public class BellmanFord {
    public static Map<Nodo, Integer> calcular(Grafo g, Nodo origen) {
        Map<Nodo, Integer> dist = new HashMap<>();
        for (Nodo n : g.getNodos()) dist.put(n, Integer.MAX_VALUE);
        dist.put(origen, 0);

        int V = g.getNodos().size();
        for (int i = 0; i < V - 1; i++) {
            for (Nodo u : g.getNodos()) {
                for (Arista a : g.getAristasDesde(u)) {
                    if (dist.get(u) != Integer.MAX_VALUE) {
                        int alt = dist.get(u) + a.getPeso();
                        if (alt < dist.get(a.getDestino())) {
                            dist.put(a.getDestino(), alt);
                        }
                    }
                }
            }
        }
        // detectar ciclo negativo
        for (Nodo u : g.getNodos())
            for (Arista a : g.getAristasDesde(u))
                if (dist.get(u) + a.getPeso() < dist.get(a.getDestino()))
                    throw new RuntimeException("Ciclo de peso negativo detectado");

        return dist;
    }
}
