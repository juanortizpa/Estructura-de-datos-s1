import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
 
public class Ejercicio3 {
    public static int busquedaBinaria(int[] arr, int target) {
        int izquierda = 0, derecha = arr.length - 1;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            if (arr[medio] == target) return medio;
            if (arr[medio] < target) izquierda = medio + 1;
            else derecha = medio - 1;
        }
        return -1;
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
 
        System.out.println("Ingrese los elementos del array en orden ascendente:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
 
        System.out.print("Ingrese el número a buscar: ");
        int target = scanner.nextInt();
 
        int resultado = busquedaBinaria(arr, target);
        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }
}
