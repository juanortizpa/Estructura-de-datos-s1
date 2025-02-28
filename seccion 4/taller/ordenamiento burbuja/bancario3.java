import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class bancario3 {
    public static class cliente {
        String nombre;
        long ingresos;

        public cliente(String nombre, long ingresos) {
            this.nombre = nombre;
            this.ingresos = ingresos;
        }
        public String toString() {
            return "Cliente{" +
                    "nombre='" + nombre + '\'' +
                    ", ingresos=" + ingresos +
                    '}';
        }
        public static void ordenarClientesPorIngresos(cliente[] clientes) {
            int n = clientes.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (clientes[j].ingresos < clientes[j + 1].ingresos) {
                        // Intercambiar clientes[j] y clientes[j + 1]
                        cliente temp = clientes[j];
                        clientes[j] = clientes[j + 1];
                        clientes[j + 1] = temp;
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
            cliente[] clientes = {
                new cliente
                        ("Carlos Steven", 50500000),
                new cliente("Juan David", 25000000),
                new cliente("Santiago", 31000000),
                new cliente("Juan Pablo", 12000000),
                new cliente("Juan Camilo", 420005000),
                new cliente("Juan Sebastian", 54000000),
                new cliente("Juan Felipe", 36000000),
                new cliente("Juan Esteban", 13000000),
        };
            ordenarClientesPorIngresos(clientes);

            // Imprimir la lista ordenada
            System.out.println("Lista de clientes ordenada por ingresos:");
            for (cliente c : clientes) {
                System.out.println(c);
            }
        }
    
        
    }
}
