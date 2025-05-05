package proyecto_final.algoritmos;

import proyecto_final.modelo.*;
import java.util.*;

public class FloydWarshall {
    public static int[][] calcular(Grafo g, List<Nodo> nodos) {
        int n = nodos.size();
        int[][] dist = new int[n][n];
        final int INF = Integer.MAX_VALUE / 2;

        // inicialización
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                dist[i][j] = (i == j ? 0 : INF);

        for (int i = 0; i < n; i++) {
            Nodo u = nodos.get(i);
            for (Arista a : g.getAristasDesde(u)) {
                int j = nodos.indexOf(a.getDestino());
                dist[i][j] = a.getPeso();
            }
        }

        // algoritmo
        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);

        return dist;
    }
}