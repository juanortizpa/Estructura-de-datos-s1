import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Agropecuario2 {
    static class Pedido {
        String cliente;
        LocalDate fecha;

        Pedido(String cliente, LocalDate fecha) {
            this.cliente = cliente;
            this.fecha = fecha;
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

        ArrayList<Pedido> pedidos = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Agregar algunos pedidos a la lista
        pedidos.add(new Pedido("Juanes Diaz", LocalDate.parse("01/01/2025", formatter)));
        pedidos.add(new Pedido("Miguel Angel", LocalDate.parse("15/01/2025", formatter)));
        pedidos.add(new Pedido("Juan Ortiz", LocalDate.parse("20/02/2025", formatter)));
        pedidos.add(new Pedido("Paola sanchez", LocalDate.parse("10/03/2024", formatter)));
        pedidos.add(new Pedido("Carlos Perez", LocalDate.parse("05/04/2024", formatter)));
        pedidos.add(new Pedido("Juanes Diaz", LocalDate.parse("01/05/2024", formatter)));
        pedidos.add(new Pedido("Miguel Angel", LocalDate.parse("15/06/2024", formatter)));
        pedidos.add(new Pedido("Juan Ortiz", LocalDate.parse("20/07/2024", formatter)));
        pedidos.add(new Pedido("Paola sanchez", LocalDate.parse("10/08/2024", formatter)));
        pedidos.add(new Pedido("Carlos Perez", LocalDate.parse("05/09/2024", formatter)));

        Scanner scanner = new Scanner(System.in);

        // Solicitar el rango de fechas
        System.out.print("Ingrese la fecha de inicio (dd/MM/yyyy): ");
        LocalDate fechaInicio = LocalDate.parse(scanner.nextLine(), formatter);
        System.out.print("Ingrese la fecha de fin (dd/MM/yyyy): ");
        LocalDate fechaFin = LocalDate.parse(scanner.nextLine(), formatter);

        boolean encontrado = false;
        for (Pedido pedido : pedidos) {
            if ((pedido.fecha.isEqual(fechaInicio) || pedido.fecha.isAfter(fechaInicio)) &&
                (pedido.fecha.isEqual(fechaFin) || pedido.fecha.isBefore(fechaFin))) {
                System.out.println("Pedido encontrado: Cliente = " + pedido.cliente + ", Fecha = " + pedido.fecha.format(formatter));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron pedidos para el cliente en el rango de fechas especificado.");
        }

        scanner.close();
    }
}
