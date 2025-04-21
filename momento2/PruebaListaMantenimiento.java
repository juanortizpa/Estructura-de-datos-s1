import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class PruebaListaMantenimiento {
    public static void main(String[] args) {
        // Datos del encabezado
            String nombre = "Juan Ortiz";
            String campus = "Campus Cali, U. Cooperativa de Colombia";
            String repositorioGit = "https://github.com/juanortizpa/Estructura-de-datos-s1";

            // Obtener la fecha y hora actual
            LocalDateTime ahora = LocalDateTime.now();
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fechaHora = ahora.format(formateador);

            // Imprimir el encabezado
            System.out.println("+----------------------------------------");
            System.out.println("| 👤 Nombre: " + nombre);
            System.out.println("| 🎓 Campus: " + campus);
            System.out.println("| 📅 Fecha y hora: " + fechaHora);
            System.out.println("| 📂 Repositorio Git: " + repositorioGit);
            System.out.println("+----------------------------------------");
            System.out.println();

        ListaEnlazadaMantenimiento lista = new ListaEnlazadaMantenimiento();

        
 
        // Agregar solicitudes de mantenimiento con diferentes prioridades
        lista.agregarSolicitud("M001", "paneles solares", "media");
        lista.agregarSolicitud("M002", "Generador Principal", "alta");
        lista.agregarSolicitud("M003", "Sistema de Ventilación", "baja");     //generar directamente las solicitudes
        lista.agregarSolicitud("M004", "Sensor de fuga", "alta");
        lista.agregarSolicitud("M005", "Sistema de Alarma", "media");


 
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