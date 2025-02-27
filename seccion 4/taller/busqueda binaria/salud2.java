import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class salud2 {
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
    String nombre;
    int edad;
    String diagnostico;

    Usuario(String nombre, String diagnostico, int edad) {
        this.nombre = nombre;
        this.diagnostico = diagnostico;
        this.edad = edad;
    }
}

ArrayList<Usuario> usuarios = new ArrayList<>();
usuarios.add(new Usuario("Juan Ortiz", "Dolor de cabeza", 25));
usuarios.add(new Usuario("Ana Perez", "Covid-19", 30));
usuarios.add(new Usuario("Maria Perez", "Covid-19", 40));
usuarios.add(new Usuario("Carlos Lopez", "Fiebre", 35));
usuarios.add(new Usuario("Luisa Gomez", "Gripe", 45));
usuarios.add(new Usuario("Pedro Ramirez", "Cancer", 50));

Scanner scanner = new Scanner(System.in);
System.out.print("Ingrese el diagnóstico a buscar: ");
String diagnosticoBuscado = scanner.nextLine();

boolean encontrado = false;
for (Usuario usuario : usuarios) {
    if (usuario.diagnostico.equalsIgnoreCase(diagnosticoBuscado)) {
        System.out.println("Nombre: " + usuario.nombre + ", Diagnóstico: " + usuario.diagnostico + ", Edad: " + usuario.edad);
        encontrado = true;
    }
}

if (!encontrado) {
    System.out.println("No se encontró ningún usuario con el diagnóstico: " + diagnosticoBuscado);
}
scanner.close();

}
}