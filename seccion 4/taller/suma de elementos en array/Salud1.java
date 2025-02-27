import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Salud1 {

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
        
        System.out.print("Ingrese la cantidad de comidas consumidas al día : ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[n];
        int suma = 0;
        

 
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la cantidad de calorias de la comida " + (i+1) + " :");
            arr[i] = scanner.nextInt();
            suma += arr[i];
        }

        scanner.close();
        System.out.println("La suma de calorias consumidas al día es: " + suma);
    }
}
           
 
        
