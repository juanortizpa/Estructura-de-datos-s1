import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class salud3 {
    public static class paciente {
        String nombre;
        int prioridad;

        public paciente(String nombre, int prioridad) {
            this.nombre = nombre;
            this.prioridad = prioridad;
        }

        public String toString() {
            return "Paciente{" +
                    "nombre='" + nombre + '\'' +
                    ", prioridad=" + prioridad +
                    '}';
        }
        public static void ordenarPacientesPorPrioridad(paciente[] pacientes) {
            int n = pacientes.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (pacientes[j].prioridad > pacientes[j + 1].prioridad) {
                        // Intercambiar pacientes[j] y pacientes[j + 1]
                        paciente temp = pacientes[j];
                        pacientes[j] = pacientes[j + 1];
                        pacientes[j + 1] = temp;
                    }
                }
            }
        }
    
        public static void main(String[] args) {
            // Datos del encabezado
        String nombre = "Juan Ortiz";
        String campus = "Campus Cali, U. Cooperativa de Colombia";
        String repositorioGit = "https://github.com/juanortizpa/Estructura-de-datos-s1";

        // Obtener la fecha y hora actual
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaHora = ahora.format(formateador);

        // Imprimir el encabezado
        System.out.println("+----------------------------------------");
        System.out.println("| 👤 Nombre: " + nombre);
        System.out.println("| 🎓 Campus: " + campus);
        System.out.println("| 📅 Fecha y hora: " + fechaHora);
        System.out.println("| 📂 Repositorio Git: " + repositorioGit);
        System.out.println("+----------------------------------------");
        System.out.println();
            paciente[] pacientes = {
                new paciente("Ana", 1),
                new paciente("Pedro", 3),
                new paciente("Maria", 2),
                new paciente("Carlos", 1),
                new paciente("Sofia", 2),
                new paciente("Miguel", 3),
                new paciente("Laura", 1),
                new paciente("Javier", 2),
                new paciente("Elena", 3),
                new paciente("Andres", 1),
                new paciente("Luis", 2),
                new paciente("Juan", 3),
            };

            ordenarPacientesPorPrioridad(pacientes);
    
            System.out.println("Pacientes ordenados:");
            for (paciente p : pacientes) {
                System.out.println(p);
            }
        }
    
        
    }
}
