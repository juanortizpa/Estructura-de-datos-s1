import java.util.LinkedList;

public class ListaEnlazadaMantenimiento {
    private LinkedList<SolicitudMantenimiento> lista;

    public ListaEnlazadaMantenimiento() {
        lista = new LinkedList<>();
    }

    public void agregarSolicitud(String id, String equipo, String prioridad) {
        lista.add(new SolicitudMantenimiento(id, equipo, prioridad));
    }

    public SolicitudMantenimiento procesarSolicitud() {
        // Asumiendo que las solicitudes se procesan en orden de prioridad
        return lista.poll();
    }

    public void mostrarSolicitudes() {
        for (SolicitudMantenimiento solicitud : lista) {
            System.out.println("ID: " + solicitud.getId() + ", Equipo: " + solicitud.getEquipo() + ", Prioridad: " + solicitud.getPrioridad());
        }
    }

    public int size() {
        return lista.size();
    }
}