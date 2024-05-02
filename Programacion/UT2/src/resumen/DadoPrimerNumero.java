package resumen;

import java.util.Scanner;

public class DadoPrimerNumero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int primerNumero=0;
        int contadorPares=0;
        int sumaImparesMenoresDe10=0;
        System.out.println("Introduzca un número: ");
        int n=sc.nextInt();
        if (n!=2) {
	        primerNumero=n;
	        while (n!=2) {
	            if (n%2==0) 
	                contadorPares++;
	            else if (n<10) 
	                sumaImparesMenoresDe10+=n;
	            System.out.println("Introduce un número (2 para salir): ");
	            n=sc.nextInt();
	        }
	        if (primerNumero%2==0) 
	            System.out.println("Se introdujeron "+contadorPares+" números pares.");
	        else 
	            System.out.println("La suma de los impares menores de 10 es: "+sumaImparesMenoresDe10);
        }
        else
        	System.out.println("No se ha introducido ningún número");
        sc.close();
	}

}
