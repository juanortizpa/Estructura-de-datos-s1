import java.util.ArrayList;
import java.util.Scanner;
public class ListaCompras {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int num = 0;
    System.out.println("Lista de compras");
        while (num != 4) {
        System.out.println("1. Agregar producto");
        System.out.println("2. Eliminar producto");
        System.out.println("3. Mostrar lista de compras");
        System.out.println("4. Salir");
        num = sc.nextInt();
        if (num ==1) {
           System.out.println("Ingrese el nombre del producto:"); 
              String producto = sc.next();
            lista.add(producto);
        }if (num == 2) {
            System.out.println("Ingrese el nombre del producto a eliminar:");
            String producto = sc.next();
            lista.remove(producto); 
        }if (num == 3) {
            System.out.println("Lista de compras:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println((i+1) + ". " + lista.get(i));
            }
   
        }if (num == 4) {
            sc.close();
            
        }if (num > 4 || num < 1) {
            System.out.println("Opción no válida");
        }
        
    
}

    

    }
}
