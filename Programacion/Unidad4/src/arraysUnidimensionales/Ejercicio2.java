package arraysUnidimensionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Realizar un programa que genera 20 números aleatorios enteros entre 1 y 25 y los
		almacena en un array. Después pide al usuario un número entre 1 y 25
		(suponemos que el usuario teclea el número correctamente, no hay que validarlo)
		y el programa mostrará las veces que se ha generado ese número y en que
		posiciones aparece. Por último, mostrará los 20 números aleatorios que han sido
		generados.
		La solución quedará de la siguiente forma (los valores numéricos pueden cambiar,
		pues son aleatorios).*/
		/*Dame el valor que deseas buscar: 20
		Se ha encontrado el valor en la aposición: 8
		Se ha encontrado el valor en la posición: 17
		El valor 20 ha aparecido 2 veces en los números generados.
		Los 20 números generados son:
		13	2	8	23	21	16	23	4	20	21	24	4	13	10	19	15	1	20	12	1
		*/
		Scanner sc=new Scanner(System.in);
		int n;
		int[] numerosAleatorios=new int[20];
		System.out.println("Dame el valor que deseas buscar: ");
		n=sc.nextInt();
		generarNumerosAleatorios(numerosAleatorios);
		encontrarValorEnArray(numerosAleatorios,n);
		mostrarNumerosAleatorios(numerosAleatorios);
		sc.close();
	}

	private static void encontrarValorEnArray(int[]numerosAleatorios, int n) {
		int contador=0;
		for (int i=0;i<=numerosAleatorios.length-1;i++) {
			if (numerosAleatorios[i]==n) {
				System.out.println("Se ha encontrado el valor en la posición: "+i);
				contador++;
			}
		}
		System.out.println("El valor "+n+" ha aparecido "+contador+" veces en los números generados.");	
		
	}

	private static void generarNumerosAleatorios(int[] numerosAleatorios) {
        for (int i=0;i<numerosAleatorios.length;i++) 
            numerosAleatorios[i]=(int)(Math.random()*25)+ 1;
        
    }
	
	private static void mostrarNumerosAleatorios(int[] numerosAleatorios) {
    	System.out.println("Los 20 números generados son: ");
        for (int i=0;i<numerosAleatorios.length;i++) 
            System.out.print(numerosAleatorios[i]+" ");
    }
	
}
