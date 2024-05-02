package actividadesRepasoRefuerzoInstrucciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Escriba un programa que muestre en la pantalla un mensaje de saludo, por ejemplo
		"Hola",y luego muestre el mensaje "Por favor introduzca el año en que nació". El
		programa debe leer ese valor y almacenarlo en una variable de tipo entero llamada
		fecha. Por último, haga que el programa escriba la frase " Si usted nació en <valor de la
		fecha leída> este año cumple <edad calculada> años.*/
		Scanner teclado= new Scanner (System.in);
		int añoNacimiento;
		System.out.println("Hola");
		System.out.println("Por favor introduzca el año en que nació");
		añoNacimiento=teclado.nextInt();
		System.out.println("Si usted nació en "+añoNacimiento+" este año cumple "+(2023-añoNacimiento));
		teclado.close();
	}
}
