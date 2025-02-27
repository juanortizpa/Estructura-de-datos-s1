import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class telecomunicaciones2 {
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

class Usuario {
    int ID;
    String nombre;
    int telefono;

    Usuario(int ID, String nombre, int telefono) {
        this.ID = ID;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}

ArrayList<Usuario> usuarios = new ArrayList<>();
usuarios.add(new Usuario(1, "Carlos Ortiz", 310566980));
usuarios.add(new Usuario(2, "Juan Alberto", 31526685));
usuarios.add(new Usuario(3, "Venito Javier", 318620336));
usuarios.add(new Usuario(4, "Julian torres", 320788541));
usuarios.add(new Usuario(5, "Felipe Diaz", 302665894));
usuarios.add(new Usuario(6, "Kevin Caceres", 310461552));

Scanner scanner = new Scanner(System.in);
System.out.print("Ingrese el ID del usuario ");
int IDBuscado = Integer.parseInt(scanner.nextLine());

boolean encontrado = false;
for (Usuario usuario : usuarios) {
    if (usuario.ID == IDBuscado) {
        System.out.println("ID: " + usuario.ID + ", Nombre: " + usuario.nombre + ", Teléfono: " + usuario.telefono);
        encontrado = true;
    }
}

if (!encontrado) {
    System.out.println("No se encontró ningún usuario con el ID: " + IDBuscado);
}
scanner.close();

}
}