package actividadesRepasoRefuerzoBucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Escriba un programa que pida al usuario un número, y muestre el mensaje "has
		introducido el numero ---" (mostrando el número que ha sido introducido). Esta acción
		debe repetirse hasta que el usuario introduzca el número 0. En ese momento se
		mostrará el mensaje "Finalizando: Se ha introducido el número 0". Además, se debe
		mostrar cuántos números se han introducido y su suma*/
		Scanner teclado=new Scanner(System.in);
		int n=0;
		int contadorNumeros=0;
		int sumaNumeros=0;
		System.out.println("Introduzca un número: ");
		n=teclado.nextInt();
		System.out.println("Has introducido el número "+n);
		while (n!=0) {
			System.out.println("Introduzca un número: ");
			n=teclado.nextInt();
			System.out.println("Has introducido el número "+n);
			contadorNumeros++;
			sumaNumeros+=n;
		}
		System.out.println("Finalizando: Se ha introducido el número 0");
		if (contadorNumeros!=0)
			System.out.println("Se han introducido "+contadorNumeros+" números y la suma de todos ellos es "+sumaNumeros);
		teclado.close();
	}
}
