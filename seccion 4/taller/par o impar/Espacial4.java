import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Espacial4 {
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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de pieza: ");
        long codigo = scanner.nextLong();
        scanner.close();
        if (codigo % 2 == 0) {
            System.out.println("El numero de piezaes es par.");
        } else {
            System.out.println("El numero de pieza es impar.");
            
        }
        
    }
}

