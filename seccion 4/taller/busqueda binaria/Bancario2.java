
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public class Bancario2 {
    
    public static class cliente {
        int id;
        String nombre;
        int telefono;

        cliente(int id, String nombre, int telefono) {
            this.id = id;
            this.nombre = nombre;
            this.telefono = telefono;
        }
    }

    public static void main(String[] args) {
        // Datos del encabezado
    String nombre1 = "Juan Ortiz";
    String campus = "Campus Cali, U. Cooperativa de Colombia";
    String repositorioGit = "https://github.com/juanortizpa/Estructura-de-datos-s1";

    // Obtener la fecha y hora actual
    LocalDateTime ahora = LocalDateTime.now();
    DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String fechaHora = ahora.format(formateador);

    // Imprimir el encabezado
    System.out.println("+----------------------------------------");
    System.out.println("| 👤 Nombre: " + nombre1);
    System.out.println("| 🎓 Campus: " + campus);
    System.out.println("| 📅 Fecha y hora: " + fechaHora);
    System.out.println("| 📂 Repositorio Git: " + repositorioGit);
    System.out.println("+----------------------------------------");
    System.out.println();
        ArrayList<cliente> clientes = new ArrayList<>();

        clientes.add(new cliente(1, "Juan", 1234567));
        clientes.add(new cliente(2, "Maria", 7654321));
        clientes.add(new cliente(3, "Pedro", 9876543));
        clientes.add(new cliente(4, "Luis", 3456789));
        clientes.add(new cliente(5, "Ana", 9876543));
        clientes.add(new cliente(6, "Carlos", 3456789));
        clientes.add(new cliente(7, "Sofia", 9876543));
        clientes.add(new cliente(8, "Andres", 3456789));
        clientes.add(new cliente(9, "Laura", 9876543));
        clientes.add(new cliente(10, "Camila", 3456789));


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
        } else {
            System.out.println("cliente con ID " + idBuscado + " no encontrado.");
        }

        scanner.close();
    }
}
