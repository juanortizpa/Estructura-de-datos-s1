package proyecto_final.modelo;
import java.util.*;

public class Grafo {
    private final Map<Nodo, List<Arista>> adj = new HashMap<>();

    public void addNodo(Nodo n) {
        adj.putIfAbsent(n, new ArrayList<>());
    }

    public void addArista(Nodo u, Nodo v, int peso) {
        addNodo(u); addNodo(v);
        adj.get(u).add(new Arista(u, v, peso));
    }

    public List<Arista> getAristasDesde(Nodo n) {
        return adj.getOrDefault(n, Collections.emptyList());
    }
    
    public List<Arista> getAdyacentes(Nodo nodo) {
        List<Arista> adyacentes = new ArrayList<>();
        for (Arista arista : adj.getOrDefault(nodo, Collections.emptyList())) {
            if (arista.getOrigen().equals(nodo)) {
                adyacentes.add(arista);
            }
        }
        return adyacentes;
    }
    
    

    public Set<Nodo> getNodos() { return adj.keySet(); }
}