import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Agropecuario {

    public static Double obtenerPrimerElemento(Double[] arr) { 
        return arr[0];
    }

    public  double obtenerHumedad( ) {
        //debido a que necesitamos una API para obtener la humedad, se simulará un valor aleatorio
        Random rand = new Random();
        double humedad = rand.nextDouble(100);
        return humedad;
    }

 
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
        
    Double[] arr = new Double[24];
    Agropecuario humedad = new Agropecuario();
    
    for (int i = 0; i < 24; i++) { //se obtiene la humedad las 24 horas del día
        arr[i] = humedad.obtenerHumedad();
    }
    System.out.println("la primera lectura de humedad del da es " + obtenerPrimerElemento(arr) + "%");
    }
}
