package codigoFuenteEjercicio4_Factorial;

import java.util.Scanner;

/** 
 * Clase principal que ejecuta la aplicación.
 * <p>
 * Esta clase contiene el método main, que es el punto de entrada de la aplicación.
 * </p>
 * @author José Corrochano Pardo
 * @version 1.0
 */
public class Factorial {
 
	/**
	 * El punto de entrada principal del programa.
	 * <p>
	 * No devuelve ningún valor ya que su tipo de retorno es 'void'.
	 * </p>
	 * 
	 * @param args	Argumentos de línea de comandos (no utilizados), del tipo 'String[]'
	 */
	public static void main ( String [ ] args ) {
		/**
		 * Creación de un objeto de la clase Scanner
		 * 
		 * @links Scanner
		 */
		Scanner sc = new Scanner(System.in);
		
		// Creación de la variable factorial de tipo double
		double factorial = 1;
		
		// Imprimir por pantalla el mensaje indicado y guardar en una variable 'numero', lo siguiente que escriba el usuario
		System.out.println("Introduzca un numero mayor o igual a cero: ");
		double numero = sc.nextDouble();
		
		// Guardar en una variable el resultado obtenido en el método 'calcularFactorial'
		factorial = calcularFactorial(numero,factorial);
		
		// Imprimir por pantalla el resultado del método anterior
		System.out.println ( factorial ) ;
	}

	/**
	 * Método para calcular el factorial de un número
	 * 
	 * @param numero		Número, del que queremos calcular su fatorial, del tipo 'double'
	 * @param factorial		Variable inicializada a 1 para guardar el factorial del número, del tipo 'double'
	 * @return				Factorial del número, del tipo 'double'
	 */
	private static double calcularFactorial(double numero, double factorial) {
		//Calcula el factorial de un número
		while ((numero!= 0) && (numero!= 1)) {
			factorial *= numero;
			numero--;
		}
		return factorial;
	}
 
}