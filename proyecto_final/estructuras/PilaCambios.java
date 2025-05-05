package proyecto_final.estructuras;

import proyecto_final.modelo.*;
import java.util.*;

public class PilaCambios {
    private final Deque<String> pila = new ArrayDeque<>();

    public void push(String cambio) { pila.push(cambio); }
    public String pop() { return pila.isEmpty() ? null : pila.pop(); }
    public boolean isEmpty() { return pila.isEmpty(); }
}
