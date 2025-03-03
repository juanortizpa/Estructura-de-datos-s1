public class Transaccion {

    private String id;

    private double monto;

    private String tipo; // "deposito" o "retiro"

    public Transaccion siguiente;

 

    public Transaccion(String id, double monto, String tipo) {

        this.id = id;

        this.monto = monto;

        this.tipo = tipo;

        this.siguiente = null;

    }

 

    public String getId() {

        return id;

    }

 

    public double getMonto() {

        return monto;

    }

 

    public String getTipo() {

        return tipo;

    }

}