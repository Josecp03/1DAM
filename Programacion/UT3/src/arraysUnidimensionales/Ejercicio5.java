package arraysUnidimensionales;

import java.util.Scanner;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]numeros=new int[5];
        // Solicitar al usuario que ingrese cinco números
        for (int i=0;i<5;i++) {
            System.out.print("Dame un número: ");
            numeros[i]=sc.nextInt();
        }
        // Ordenar los números de menor a mayor
        Arrays.sort(numeros);
        // Mostrar los números ordenados
        System.out.println("Números ordenados de menor a mayor:");
        for (int i=0;i<numeros.length;i++) 
            System.out.print(numeros[i]+" ");
        sc.close();
    }
}

