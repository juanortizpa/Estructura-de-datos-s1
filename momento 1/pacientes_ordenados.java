import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class pacientes_ordenados {
    public static class paciente {
        String nombre;
        int id;
        LocalDateTime fecha;

        public paciente(String nombre, int id, LocalDateTime fecha) {
            this.nombre = nombre;
            this.id = id;
            this.fecha = fecha;
        }

        public String toString() {
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss");
            return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", ID=" + id +
                ", hora=" + fecha.format(formateador) +
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
            paciente[] nuevosPacientes = new paciente[pacientes.length - 1];
            for (int i = 0; i < nuevosPacientes.length; i++) {
                nuevosPacientes[i] = pacientes[i + 1];
            }
            System.out.println("El paciente " + pacientes[0].nombre + " ha sido eliminado de la lista.");
            System.out.println("El paciente " + pacientes[0].nombre + " ha sido atendido.");
            return nuevosPacientes;
        }

        // Método para ordenar pacientes por hora de llegada
        public static void ordenarPacientesPorHora(paciente[] pacientes) {
            int n = pacientes.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (pacientes[j].fecha.toLocalTime().isAfter(pacientes[j + 1].fecha.toLocalTime())) {
                        // Intercambiar pacientes[j] y pacientes[j + 1]
                        paciente temp = pacientes[j];
                        pacientes[j] = pacientes[j + 1];
                        pacientes[j + 1] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

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

            paciente[] pacientes = {
                new paciente("Juan Perez", 100,  LocalDateTime.of(2024, 10, 18, 10, 0)),
                new paciente("Maria Lopez", 101, LocalDateTime.of(2024, 10, 19, 9, 0)),
                new paciente("Carlos Gomez", 102, LocalDateTime.of(2024, 10, 17, 11, 0)),
                new paciente("Ana Torres", 103, LocalDateTime.of(2024, 10, 20, 8, 0)),
                new paciente("Luis Martinez", 104, LocalDateTime.of(2024, 10, 16, 12, 0)),
                new paciente("Sofia Ramirez", 105, LocalDateTime.of(2024, 10, 21, 7, 0)),
                new paciente("Pedro Sanchez", 106, LocalDateTime.of(2024, 10, 15, 13, 0)),
                new paciente("Laura Fernandez", 107, LocalDateTime.of(2024, 10, 22, 6, 0)),
                new paciente("Javier Diaz", 108, LocalDateTime.of(2024, 10, 14, 14, 0)),
                new paciente("Isabel Morales", 109, LocalDateTime.of(2024, 10, 23, 5, 0))
            };

            ordenarPacientesPorHora(pacientes);

            System.out.println("Pacientes ordenados por hora de llegada:");
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
                        System.out.println("Ingrese el ID del paciente:");
                        int idPaciente = scanner.nextInt();
                        scanner.nextLine(); // Consumir la nueva línea
                        System.out.println("Ingrese la hora de llegada del paciente (HH:mm):");
                        String horaLlegada = scanner.nextLine();
                        LocalDateTime fechaLlegada = LocalDateTime.of(2024, 10, 24, Integer.parseInt(horaLlegada.split(":")[0]), Integer.parseInt(horaLlegada.split(":")[1]));
                        paciente nuevoPaciente = new paciente(nombrePaciente, idPaciente, fechaLlegada);
                        pacientes = agregarPaciente(pacientes, nuevoPaciente);
                        ordenarPacientesPorHora(pacientes);
                        System.out.println("Pacientes ordenados por hora de llegada:");
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