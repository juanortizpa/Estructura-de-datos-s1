import java.util.Scanner;
public class PruebaListaMantenimiento {
    public static void main(String[] args) {
        ListaEnlazadaMantenimiento lista = new ListaEnlazadaMantenimiento();

        Scanner sc = new Scanner(System.in);
        int n=1;
        while (n!=0) {
            System.out.println("Desea agregar una solicitud de mantenimiento? 1=si, 0=no");
            n = sc.nextInt();
            if (n==1) {
                System.out.println("Ingrese el ID de la solicitud");
                String id = sc.next();                          //generar las solicitudes a partir de la entrada del usuario
                System.out.println("Ingrese el equipo a reparar");
                String equipo = sc.next();
                System.out.println("Ingrese la prioridad de la solicitud");
                String prioridad = sc.next();
                lista.agregarSolicitud(id, equipo, prioridad);
            }
        }
 
        // Agregar solicitudes de mantenimiento con diferentes prioridades
        /*lista.agregarSolicitud("M001", "Bomba de Agua", "media");
        lista.agregarSolicitud("M002", "Generador Principal", "alta");
        lista.agregarSolicitud("M003", "Sistema de Ventilación", "baja");     //generar directamente las solicitudes
        lista.agregarSolicitud("M004", "Sensor de Gas", "alta");
        lista.agregarSolicitud("M005", "Sistema de Alarma", "media");*/

        sc.close();
 
        // Mostrar solicitudes pendientes
        System.out.println("Solicitudes pendientes:");
        lista.mostrarSolicitudes();
        
        // Procesar todas las solicitudes
        while (lista.size() > 0) {
            // Procesar la solicitud más prioritaria
            SolicitudMantenimiento procesada = lista.procesarSolicitud();
            System.out.println("\nSolicitud procesada: ID: " + procesada.getId() + ", Equipo: " + procesada.getEquipo());
 
            // Mostrar solicitudes pendientes después del procesamiento
            System.out.println("\nSolicitudes pendientes:");
            lista.mostrarSolicitudes();
        }
    }
}