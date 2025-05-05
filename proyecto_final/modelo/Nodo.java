package proyecto_final.modelo;

public class Nodo {
    private final String id;
    public Nodo(String id) { this.id = id; }
    public String getId() { return id; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nodo)) return false;
        return id.equals(((Nodo) o).id);
    }

    @Override
    public int hashCode() { return id.hashCode(); }

    @Override
    public String toString() { return id; }
}
