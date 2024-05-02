package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Pedir 10 números. Mostrar la media de los números positivos, la media de los númerosnegativos y la cantidad de ceros.
		Scanner teclado=new Scanner(System.in);
		int n=0;
		int sumaNumerosPares=0;
		int contadorPares=0;
		int sumaNumerosImpares=0;
		int contadorImpares=0;
		int contadorCeros=0;
		for (int i=1;i<=10;i++) {
			System.out.println("Introduzca el número "+i+": ");
			n=teclado.nextInt();
			if (n%2==0 && n!=0) {
				sumaNumerosPares+=n;
				contadorPares++;
			}
			else if (n%2!=0) {
				sumaNumerosImpares+=n;
				contadorImpares++;
			}
			else 
				contadorCeros++;
		}
		if (contadorPares!=0) 
            System.out.println("La media de los números pares es: "+sumaNumerosPares/contadorPares);
        else 
            System.out.println("No se han ingresado números pares.");
        if (contadorImpares!=0) 
            System.out.println("La media de los números impares es: "+sumaNumerosImpares/contadorImpares);
        else 
            System.out.println("No se han ingresado números impares.");
        System.out.println("El número de ceros introducidos es: "+contadorCeros);
		teclado.close();
	}
}
