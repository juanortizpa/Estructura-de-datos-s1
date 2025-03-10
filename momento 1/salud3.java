import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class salud3 {
    public static class paciente {
        String nombre;
        String prioridad;

        public paciente(String nombre, String prioridad) {
            this.nombre = nombre;
            this.prioridad = prioridad;
        }

        public String toString() {
            return "Paciente{" +
                    "nombre='" + nombre + '\'' +
                    ", prioridad='" + prioridad + '\'' +
                    '}';
        }

        public static paciente[] agregarPaciente(paciente[] pacientes, paciente nuevoPaciente) {
            paciente[] nuevosPacientes = new paciente[pacientes.length + 1];
            for (int i = 0; i < pacientes.length; i++) {
                nuevosPacientes[i] = pacientes[i];
            }
            nuevosPacientes[nuevosPacientes.length - 1] = nuevoPaciente;
            return nuevosPacientes;
        }

        public static paciente[] eliminarPrimerPaciente(paciente[] pacientes){
            if (pacientes.length == 0) {
                System.out.println("No hay pacientes en la lista.");
                return pacientes;
            }
            paciente[] nuevosPacientes = new paciente[pacientes.length - 1];
            for (int i = 0; i < nuevosPacientes.length; i++) {
                nuevosPacientes[i] = pacientes[i + 1];
            }
            System.out.println("El paciente " + pacientes[0].nombre + " ha sido eliminado de la lista.");
            System.out.println("El paciente " + pacientes[0].nombre + " ha sido atendido.");
            return nuevosPacientes;
        }

        public static void ordenarPacientesPorPrioridad(paciente[] pacientes) {
            int n = pacientes.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (compararPrioridad(pacientes[j].prioridad, pacientes[j + 1].prioridad) > 0) {
                        // Intercambiar pacientes[j] y pacientes[j + 1]
                        paciente temp = pacientes[j];
                        pacientes[j] = pacientes[j + 1];
                        pacientes[j + 1] = temp;
                    }
                }
            }
        }

        public static int compararPrioridad(String p1, String p2) {
            String[] prioridades = {"críticas", "importantes", "generales"};
            int prioridad1 = -1, prioridad2 = -1;
            for (int i = 0; i < prioridades.length; i++) {
                if (prioridades[i].equals(p1)) {
                    prioridad1 = i;
                }
                if (prioridades[i].equals(p2)) {
                    prioridad2 = i;
                }
            }
            return Integer.compare(prioridad1, prioridad2);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

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
                new paciente("Ana", "críticas"),
                new paciente("Pedro", "generales"),
                new paciente("Maria", "importantes"),
                new paciente("Carlos", "críticas"),
                new paciente("Sofia", "importantes"),
                new paciente("Miguel", "generales"),
                new paciente("Laura", "críticas"),
                new paciente("Javier", "importantes"),
                new paciente("Elena", "generales"),
                new paciente("Andres", "críticas"),
                new paciente("Luis", "importantes"),
                new paciente("Juan", "generales"),
            };

            ordenarPacientesPorPrioridad(pacientes);

            System.out.println("Pacientes ordenados:");
            for (paciente p : pacientes) {
                System.out.println(p);
            }

            int opcion = 0;

            while (opcion != 3) {
                System.out.println("Ingrese una opcion:");
                System.out.println("1. Agregar un nuevo paciente");
                System.out.println("2. Iniciar la consulta");
                System.out.println("3. Salir");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nombre del paciente:");
                        String nombrePaciente = scanner.nextLine();
                        System.out.println("Ingrese la prioridad del paciente (críticas, importantes, generales):");
                        String prioridadPaciente = scanner.nextLine();
                        paciente nuevoPaciente = new paciente(nombrePaciente, prioridadPaciente);
                        pacientes = agregarPaciente(pacientes, nuevoPaciente);
                        ordenarPacientesPorPrioridad(pacientes);
                        System.out.println("Pacientes ordenados por prioridad:");
                        for (paciente p : pacientes) {
                            System.out.println(p);
                        }
                        break;
                    case 2:
                        pacientes = eliminarPrimerPaciente(pacientes);
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }

            scanner.close();
        }
    }
}