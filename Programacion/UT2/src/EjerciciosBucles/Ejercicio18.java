package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        // Dibuja un cuadrado de n elementos de lado utilizando *.
    	Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce el valor de n (lado del cuadrado): ");
        int n=teclado.nextInt();
        System.out.println();
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n;j++) {
                if (i==1 || i==n || j==1 || j==n) 
                    System.out.print("* ");
                else 
                    System.out.print("  "); 
            }
            System.out.println(); 
        }
        teclado.close();
    }
}

