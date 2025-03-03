public class ListaEnlazadaTransacciones {

    private Transaccion cabeza;

 

    public ListaEnlazadaTransacciones() {

        this.cabeza = null;

    }

 

    // Agregar una transacción al final de la lista

    public void agregarTransaccion(String id, double monto, String tipo) {

        Transaccion nueva = new Transaccion(id, monto, tipo);

        if (cabeza == null) {

            cabeza = nueva;

        } else {

            Transaccion temp = cabeza;

            while (temp.siguiente != null) {

                temp = temp.siguiente;

            }

            temp.siguiente = nueva;

        }

    }

 

    // Procesar la primera transacción de la lista

    public Transaccion procesarTransaccion() {

        if (cabeza == null) {

            return null;

        }

        Transaccion procesada = cabeza;

        cabeza = cabeza.siguiente;

        return procesada;

    }

 

    // Mostrar todas las transacciones pendientes

    public void mostrarTransacciones() {

        Transaccion temp = cabeza;

        while (temp != null) {

            System.out.println("ID: " + temp.getId() + ", Monto: " + temp.getMonto() + ", Tipo: " + temp.getTipo());

            temp = temp.siguiente;

        }

    }

}
