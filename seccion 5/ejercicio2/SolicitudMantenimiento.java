public class SolicitudMantenimiento {
    private String id;
    private String equipo;
    private String prioridad;

    public SolicitudMantenimiento(String id, String equipo, String prioridad) {
        this.id = id;
        this.equipo = equipo;
        this.prioridad = prioridad;
    }

    public String getId() {
        return id;
    }

    public String getEquipo() {
        return equipo;
    }

    public String getPrioridad() {
        return prioridad;
    }
}