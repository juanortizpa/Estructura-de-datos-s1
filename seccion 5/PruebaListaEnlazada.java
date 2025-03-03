public class PruebaListaEnlazada {

    public static void main(String[] args) {

        ListaEnlazadaTransacciones lista = new ListaEnlazadaTransacciones();

 

        // Agregar transacciones

        lista.agregarTransaccion("T001", 500.0, "deposito");

        lista.agregarTransaccion("T002", 200.0, "retiro");

        lista.agregarTransaccion("T003", 1000.0, "deposito");

 

        // Mostrar transacciones pendientes

        System.out.println("Transacciones pendientes:");

        lista.mostrarTransacciones();

 

        // Procesar una transacción

        Transaccion procesada = lista.procesarTransaccion();

        System.out.println("\nTransacción procesada: ID: " + procesada.getId());

 

        // Mostrar transacciones pendientes después del procesamiento

        System.out.println("\nTransacciones pendientes:");

        lista.mostrarTransacciones();

    }

}