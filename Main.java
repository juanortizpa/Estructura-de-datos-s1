import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[5];
    
    for (int i = 0; i < 5; i++) {
      System.out.print("Digite el " + (i + 1) + "º número: ");
      numeros[i] = sc.nextInt();
    }
    int mayor = numeros[0];
    int menor =  numeros[0];

    for (int i = 0; i < 5; i++) {
      if (numeros[i] > mayor) {
        mayor = numeros[i];
      }
      if (numeros[i] < menor) {
        menor = numeros[i];
      }
      
    } 
    sc.close();
    System.out.println("el numero mayor es: " + mayor);
    System.out.println("el numero menor es: " + menor);
  
  }

}
