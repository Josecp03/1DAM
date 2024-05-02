package actividadesRepasoRefuerzoBucles;

import java.util.Scanner;

public class Ejercicio11 {
    
	public static void main(String[] args) {
        /*Escriba un programa en Java que solicite al usuario números positivos de tres o más
		cifras y compruebe si son pares. Si el número introducido es positivo pero de una o dos
		cifras, se solicitará un nuevo número. El programa finaliza cuando se introduce “0” o un
		número negativo.*/
		Scanner teclado=new Scanner(System.in);
        int n; 
        do {
            System.out.print("Ingrese un número positivo de tres o más cifras (Introduzca un 0 o un número negativo para salir): ");
            n=teclado.nextInt();
            if (n>0) {
                if (n>=100) { 
                    if (n%2==0) {
                        System.out.println("El número "+n+" es par.");
                    } else {
                        System.out.println("El número "+n+" no es par.");
                    }
                } else {
                    System.err.println("!Error El número introducido es de menos de 3 cifras");
                }
            } 
        } while (n!=0 && n>0);
        System.out.println("Programa finalizado.");
        teclado.close();
    }
}
