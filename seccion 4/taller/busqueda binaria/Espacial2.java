import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public class Espacial2 {
    
    public class foto {
        int id;
        String nombre;
        String codigo;

        foto(int id, String nombre, String codigo) {
            this.id = id;
            this.nombre = nombre;
            this.codigo = codigo;
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
        ArrayList<foto> fotos = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 3500000; i++) {
            int id = i;
            String nombre = "Foto" + i;
            String codigo = "Codigo" + random.nextInt(1000000);
            fotos.add(new Espacial2().new foto(id, nombre, codigo));
        }

        System.out.println("Se han generado " + fotos.size() + " fotos.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID de la foto que desea buscar: ");
        int idBuscado = scanner.nextInt();

        foto fotoEncontrada = null;
        for (foto f : fotos) {
            if (f.id == idBuscado) {
            fotoEncontrada = f;
            break;
            }
        }

        if (fotoEncontrada != null) {
            System.out.println("Foto encontrada:");
            System.out.println("ID: " + fotoEncontrada.id);
            System.out.println("Nombre: " + fotoEncontrada.nombre);
            System.out.println("Codigo: " + fotoEncontrada.codigo);
        } else {
            System.out.println("Foto con ID " + idBuscado + " no encontrada.");
        }

        scanner.close();
    }
}
