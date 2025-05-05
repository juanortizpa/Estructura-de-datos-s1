package proyecto_final.modelo;

public class Arista {
    private final Nodo origen;
    private final Nodo destino;
    private int peso; // tiempo en minutos

    public Arista(Nodo origen, Nodo destino, int peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }

    public Nodo getOrigen() { return origen; }
    public Nodo getDestino() { return destino; }
    public int getPeso() { return peso; }
    public void setPeso(int peso) { this.peso = peso; }
}
