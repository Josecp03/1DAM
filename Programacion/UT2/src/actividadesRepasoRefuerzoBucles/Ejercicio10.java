package actividadesRepasoRefuerzoBucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*Escriba un programa en Java que solicite números al usuario hasta que se hayan
		introducido 10 números o la suma de todos los números leídos sea mayor que 100. A
		continuación, mostrar un mensaje indicando qué condición se ha cumplido (es decir, si
		se han introducido 10 números o si su suma es mayor que 100).*/
		Scanner teclado=new Scanner(System.in);
		int contadorNumeros=0;
		int sumaNumeros=0;
		int n=0;
        while (contadorNumeros<10 && sumaNumeros<=100) {
        	System.out.println("Introduzca el número: ");
        	n=teclado.nextInt();
        	contadorNumeros++;
        	sumaNumeros+=n;
        }
        if (contadorNumeros==10) 
        	System.out.println("El programa terminó por ingresar 10 números");
        else
        	System.out.println("El programa terminó porque la suma de todos los números es mayor que 100");
        teclado.close();
	}
}
