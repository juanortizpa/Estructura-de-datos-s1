import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
 
public class Ejercicio6 {
    public static int maximo(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
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
 
        System.out.print("Ingrese el tamaño del array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
 
        System.out.println("Ingrese los elementos del array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
 
        System.out.println("El número máximo es: " + maximo(arr));
    }
}

