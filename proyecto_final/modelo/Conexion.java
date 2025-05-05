package proyecto_final.modelo; // o ajusta según tu estructura de paquetes

public class Conexion {
    private Nodo destino;
    private int peso;

    public Conexion(Nodo destino, int peso) {
        this.destino = destino;
        this.peso = peso;
    }

    public Nodo getDestino() {
        return destino;
    }

    public int getPeso() {
        return peso;
    }
}
