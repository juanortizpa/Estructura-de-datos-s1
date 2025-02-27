import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Telecomunicaciones {

    public static String obtenerPrimerElemento(String[] arr) { 
        return arr[0];
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
        
        System.out.print("Ingrese el numero de routers activos : ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[n];
 
 
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el codigo del nodo del router " + (i+1) + " :");
            arr[i] = scanner.nextLine();
        }
        scanner.close();
        System.out.println("El primer nodo es: " + obtenerPrimerElemento(arr));
    }
}
