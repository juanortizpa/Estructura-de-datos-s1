package diccionario_ciudad;

import java.util.Scanner;


public class diccionario extends ciudad {
    diccionario(String nombre, int telefono) {
        super(nombre, telefono);
    }

   
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       ciudad[] ciudades = new ciudad[5];
        ciudades[0] = new ciudad("cali", 32);
        ciudades[1] = new ciudad("medellin", 34);
        ciudades[2] = new ciudad("bogota", 29);
        ciudades[3] = new ciudad("chigorojo", 23);
        ciudades[4] = new ciudad("pasto", 25);
        System.out.println("Digite el nombre de la ciudad: ");
        String nombre = sc.nextLine();

        String msg = "ciudad no encontrada";
        for (int i = 0; i < 5; i++) {
            if (ciudades[i].nombre.equals(nombre)) {
                System.out.println("La temperatura de " + nombre + " es: " + ciudades[i].temperatura +"°C o " + (ciudades[i].temperatura*1.8+32) + "°F");
                msg = "";
            }
        }
        System.out.println(msg);
        sc.close();
    }
}
