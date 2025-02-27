import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bancario {

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

    public static String obtenerPrimerElemento(String[] arr) {
        return arr[0];
    }

    public static void main(String[] args) {
        encabezadopgm();
        String[] arr = new String[5];

        arr[0] = "juan pablo ortiz";
        arr[1] = "roberto roldan";
        arr[2] = "harold roldan";
        arr[3] = "roberto ortiz";
        arr[4] = "miguel angel roldan";

        System.out.println("el primer cliente que generó una transacción en el día es " + obtenerPrimerElemento(arr));
    }

}