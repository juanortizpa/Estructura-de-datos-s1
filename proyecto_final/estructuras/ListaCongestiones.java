package proyecto_final.estructuras;

import java.util.*;

public class ListaCongestiones {
    private final LinkedList<String> lista = new LinkedList<>();

    public void add(String interseccion) { lista.add(interseccion); }
    public String remove() { return lista.isEmpty() ? null : lista.removeFirst(); }
    public boolean isEmpty() { return lista.isEmpty(); }
}
