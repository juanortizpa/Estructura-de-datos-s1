import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Bancario3 {

    public static void encabezadopgm() {
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

    }

    public static class cliente {
        int id;
        String nombre;
        int telefono;
        String estado;

        cliente(int id, String nombre, int telefono, String estado) {
            this.id = id;
            this.nombre = nombre;
            this.telefono = telefono;
            this.estado = estado;
        }
    }

    public static void main(String[] args) {
        encabezadopgm();
        ArrayList<cliente> clientes = new ArrayList<>();

        clientes.add(new cliente(1, "Juan", 1234567, "Sin reportar"));
        clientes.add(new cliente(2, "Maria", 7654321, "Reportado"));
        clientes.add(new cliente(3, "Pedro", 9876543, "Sin reportar"));
        clientes.add(new cliente(4, "Luis", 3456789,    "Reportado"));
        clientes.add(new cliente(5, "Ana", 9876543, "Reportado"));
        clientes.add(new cliente(6, "Carlos", 3456789,  "Sin reportar"));
        clientes.add(new cliente(7, "Sofia", 9876543, "Reportado"));
        clientes.add(new cliente(8, "Andres", 3456789,  "Sin reportar"));
        clientes.add(new cliente(9, "Laura", 9876543, "Sin reportar"));
        clientes.add(new cliente(10, "Camila", 3456789, "Reportado"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del cliente que desea buscar: ");
        int idBuscado = scanner.nextInt();

        cliente clienteEncontrada = null;
        for (cliente f : clientes) {
            if (f.id == idBuscado) {
                clienteEncontrada = f;
                break;
            }
        }

        if (clienteEncontrada != null) {
            System.out.println("cliente encontrado:");
            System.out.println("ID: " + clienteEncontrada.id);
            System.out.println("Nombre: " + clienteEncontrada.nombre);
            System.out.println("telefono: " + clienteEncontrada.telefono);
            System.out.println("estado: " + clienteEncontrada.estado);
        } else {
            System.out.println("cliente con ID " + idBuscado + " no encontrado.");
        }

        scanner.close();
    }
}