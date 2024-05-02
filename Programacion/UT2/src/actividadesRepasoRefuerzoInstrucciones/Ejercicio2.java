package actividadesRepasoRefuerzoInstrucciones;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/* Escriba un programa en el que se declaren tres variables, a, b y c y se asigne a esas
		variables los valores 5, 7 y 9 respectivamente. El programa deberá entonces calcular su
		suma y mostrar el resultado. Modifíquelo para que los valores de las variables sean
		introducidos por el usuario.*/
		Scanner teclado=new Scanner(System.in);
		int a,b,c;
		System.out.println("Introduzca el valor de a: ");
		a=teclado.nextInt();
		System.out.println("Introduzca el valor de b: ");
		b=teclado.nextInt();
		System.out.println("Introduzca el valor de c: ");
		c=teclado.nextInt();
		System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c));
		teclado.close();
	}
}
