public class SolicitudMantenimiento {
    private String id;
    private String zona;
    private String prioridad;

    public SolicitudMantenimiento(String id, String zona, String prioridad) {
        this.id = id;
        this.zona = zona;
        this.prioridad = prioridad;
    }

    public String getId() {
        return id;
    }

    public String getEquipo() {
        return zona;
    }

    public String getPrioridad() {
        return prioridad;
    }

}
