package arraysUnidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*Realiza un programa que pida al usuario cinco números y los muestre en pantalla
		ordenados de menor a mayor.
		La salida debe ser similar a:*/
		/*Dame un número: 7
		Dame un número: 5
		Dame un número: 3
		Dame un número: 6
		Dame un número: 2
		Números ordenados de menor a mayor:
		2	3	5	6	7*/
        int[]numeros=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++) {
            System.out.print("Dame un número: ");
            numeros[i]=sc.nextInt();
        }
        ordenarNumeros(numeros);
        mostrarNumerosOrdenados(numeros);
        sc.close();
	}
	
    private static void ordenarNumeros(int[] numeros) {
        Arrays.sort(numeros);
    }

    private static void mostrarNumerosOrdenados(int[] numeros) {
        System.out.println("Números ordenados de menor a mayor:");
        for (int i=0;i<5;i++) {
            System.out.print(numeros[i]+" ");
        }
    }

}
