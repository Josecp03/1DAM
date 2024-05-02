package arraysUnidimensionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Realizar un programa que genera 20 números aleatorios enteros entre 1 y 25 y los
		almacena en un array. Después pide al usuario un número entre 1 y 25
		(suponemos que el usuario teclea el número correctamente, no hay que validarlo)
		y el programa mostrará las veces que se ha generado ese número y en que
		posiciones aparece. Por último, mostrará los 20 números aleatorios que han sido
		generados.*/
		int[] numerosAleatorios = new int[20];
        Scanner sc=new Scanner(System.in);
        int contador=0;
		for (int i=0;i<20;i++) 
			numerosAleatorios[i]=(int)(Math.random()*25)+1;		        
		System.out.print("Dame el valor que deseas buscar: ");
	    int numeroUsuario=sc.nextInt();
	    for (int i=0;i<20;i++) {
            if (numerosAleatorios[i]==numeroUsuario) {
                System.out.println("Se ha encontrado el valor "+numeroUsuario+" en la posición: "+i);
            }
        }
	    for (int i=0;i<20;i++) {
		    if (numerosAleatorios[i]==numeroUsuario) {
		    	contador++;
	        }
	    }
	    System.out.println("El valor "+numeroUsuario+" ha aparecido "+contador+" veces en los números generados.");
	    System.out.println("Los 20 números generados son: ");
	    for (int i=0;i<20;i++) 
	    	System.out.print(numerosAleatorios[i]+" ");
		sc.close();
	}
	
}
