package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=0;
        System.out.println("Ingresa un número (ingresa un número negativo para salir): ");
    	n =scanner.nextInt();
        while(n>=0) {
        	System.out.println("Ingresa un número (ingresa un número negativo para salir): ");
        	n =scanner.nextInt();
	        System.out.println("El cuadrado de "+n+" es "+Math.pow(n, 2));
        }
        System.out.println("Programa terminado!");
        scanner.close();
    }
}

