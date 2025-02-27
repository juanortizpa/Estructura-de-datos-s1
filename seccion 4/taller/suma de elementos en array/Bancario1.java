import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bancario1 {

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

    public static int sumaElementos(int[] arr) {
        int suma = 0;
        for (int num : arr) {
            suma += num;
        }
        return suma;
    }

    public static void main(String[] args) {
        encabezadopgm();

        int[] arr = { 100, 200, 300, 400, 500, 1000, 2000, 3000, 4000, 5000 };

        System.out.println("la suma total de depósitos realizados en el día es de: " + sumaElementos(arr));

    }
}
