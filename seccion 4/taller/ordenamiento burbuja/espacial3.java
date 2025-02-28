import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class espacial3 {
    public static class espectro {
        String nombre;
        int temperatura;
        public espectro(String nombre, int temperatura) {
            this.nombre = nombre;
            this.temperatura = temperatura;
        }
        public String toString() {
            return "Estrella{" +
                    "nombre='" + nombre + '\'' +
                    ", temperatura=" + temperatura +
                    '}';
        }

        public static void ordenarTorresPorIntensidad(espectro[] espectros) {
            int n = espectros.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (espectros[j].temperatura < espectros[j + 1].temperatura) {
                        // Intercambiar torres[j] y torres[j + 1]
                        espectro temp = espectros[j];
                        espectros[j] = espectros[j + 1];
                        espectros[j + 1] = temp;
                    }
                }
            }
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
            
        espectro[] espectros = {
                new espectro("Espectro A", 135),
                new espectro("Espectro A", 185),
                new espectro("Espectro B", 306),
                new espectro("Espectro C", 220),
                new espectro("Espectro D", 120),
                new espectro("Espectro E", 512),
                new espectro("Espectro F", 349),
                new espectro("Espectro G", 136),
            };
            ordenarTorresPorIntensidad(espectros);


    
            System.out.println("Estrellas ordenadas:");
            for (espectro p : espectros) {
                System.out.println(p);
            }
        }
    
        
    }
}
