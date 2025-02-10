package diccionario_persona;
import java.util.Scanner;


public class diccionario extends persona {
    diccionario(String nombre, int telefono) {
        super(nombre, telefono);
    }

   
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       persona[] personas = new persona[5];
        personas[0] = new persona("juan", 123456789);
        personas[1] = new persona("pedro", 987654321);
        personas[2] = new persona("maria", 123456789);
        personas[3] = new persona("jose", 987654321);
        personas[4] = new persona("luis", 123456789);
        System.out.println("Digite el nombre de la persona: ");
        String nombre = sc.nextLine();

        String msg = "persona no encontrada";
        for (int i = 0; i < 5; i++) {
            if (personas[i].nombre.equals(nombre)) {
                System.out.println("el telefono de " + nombre + " es: " + personas[i].telefono);
                msg = "";
            }
        }
        System.out.println(msg);
        sc.close();
    }
}
