import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class telecomunicaciones3 {
    public static class torre {
        String codigo;
        int intencidad;
        public torre(String codigo, int intencidad) {
            this.codigo = codigo;
            this.intencidad = intencidad;
        }
        public String toString() {
            return "Torre{" +
                    "codigo='" + codigo + '\'' +
                    ", intencidad=" + intencidad +
                    '}';
        }

        public static void ordenarTorresPorIntensidad(torre[] torres) {
            int n = torres.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (torres[j].intencidad < torres[j + 1].intencidad) {
                        // Intercambiar torres[j] y torres[j + 1]
                        torre temp = torres[j];
                        torres[j] = torres[j + 1];
                        torres[j + 1] = temp;
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
            
            torre[] torres = {
                new torre("Torre A", 100),
                new torre("Torre B", 300),
                new torre("Torre C", 200),
                new torre("Torre D", 100),
                new torre("Torre E", 200),
                new torre("Torre F", 300),
                new torre("Torre G", 100),
            };
            ordenarTorresPorIntensidad(torres);


    
            System.out.println("Torres ordenadas:");
            for (torre p : torres) {
                System.out.println(p);
            }
        }
    
        
    }
}
