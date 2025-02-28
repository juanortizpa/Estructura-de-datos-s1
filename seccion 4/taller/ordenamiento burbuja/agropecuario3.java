import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class agropecuario3 {
    public static class parcela {
        String nombre;
        int tamaño;

        LocalDateTime fecha;

        public parcela(String nombre, int tamaño, LocalDateTime fecha) {
            this.nombre = nombre;
            this.tamaño = tamaño;
            this.fecha = fecha;
        }

        public String toString() {
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            return "Parcela{" +
                "nombre='" + nombre + '\'' +
                ", tamaño=" + tamaño + " m²" +
                ", fecha=" + fecha.format(formateador) +
                '}';
        }

        public static void ordenarParcelasPorFecha(parcela[] parcelas) {
            int n = parcelas.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (parcelas[j].fecha.isAfter(parcelas[j + 1].fecha)) {
                        // Intercambiar parcelas[j] y parcelas[j + 1]
                        parcela temp = parcelas[j];
                        parcelas[j] = parcelas[j + 1];
                        parcelas[j + 1] = temp;
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
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fechaHora = ahora.format(formateador);

            // Imprimir el encabezado
            System.out.println("+----------------------------------------");
            System.out.println("| 👤 Nombre: " + nombre);
            System.out.println("| 🎓 Campus: " + campus);
            System.out.println("| 📅 Fecha y hora: " + fechaHora);
            System.out.println("| 📂 Repositorio Git: " + repositorioGit);
            System.out.println("+----------------------------------------");
            System.out.println();

            parcela[] parcelas = {
                new parcela("Parcela A", 100,  LocalDateTime.of(2024, 10, 18, 0, 0)),
                new parcela("Parcela B", 200,  LocalDateTime.of(2024, 8, 20, 0, 0)),
                new parcela("Parcela C", 150,  LocalDateTime.of(2025, 2, 14, 0, 0)),
                new parcela("Parcela D", 120,  LocalDateTime.of(2024, 10, 19, 0, 0)),
                new parcela("Parcela E", 180,  LocalDateTime.of(2025, 1, 29, 0, 0)),
                new parcela("Parcela F", 160,  LocalDateTime.of(2024, 5, 10, 0, 0)),
                new parcela("Parcela G", 140,  LocalDateTime.of(2024, 7, 22, 0, 0)),
                new parcela("Parcela H", 130,  LocalDateTime.of(2024, 9, 15, 0, 0)),
                new parcela("Parcela I", 110,  LocalDateTime.of(2024, 6, 30, 0, 0)),
                new parcela("Parcela J", 170,  LocalDateTime.of(2024, 11, 5, 0, 0)),
            };

            ordenarParcelasPorFecha(parcelas);

            System.out.println("Parcelas ordenadas por fecha:");
            for (parcela p : parcelas) {
                System.out.println(p);
            }
        }
    }
}
