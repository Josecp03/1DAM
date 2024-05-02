package prueba;

import java.util.Scanner;

public class PacticaEntregable {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a,b;
		String opcion;
		// Introduzco los dos números por pantalla
		do {
            System.out.print("Ingrese el primer número entero positivo: ");
            a=sc.nextInt();
            System.out.print("Ingrese el segundo número entero positivo (<=10): ");
            b=sc.nextInt();
        } while (!correctos(a,b)); // Hasta que los dos números no son correctos el programa no avanza
		sc.nextLine();
		// Se muestra el menú hasta que se introduzca la opción de salir "e"
		do {
			mostrarmenu(); // Llamada a método para mostrar el menú
			opcion=sc.nextLine();
			switch (opcion) {
			case "a":
				imprimirFibonacci(a); //Llamada a método para imprimir los primeros a términos de la sucesión de Fibonacci
				System.out.println();
				break;
			case "b":
				imprimirMayorPrimo(a,b); // Llamada a método para imprimir el mayor primo entre a y b
				break;
			case "c":
				imprimirPalindromosImpares(a,b); // Llamada a método para imprimir los palíndromos impares entre a y b
				System.out.println();
				break;
			case "d":
				imprimirFactorial(b); // Llamada a método para imprimir el factorial de b
				break;
			}
		} while (!opcion.equals("e"));
		sc.close();
		// Salimos del bucle por lo que termina el programa y se muestra un mensaje
		System.out.println("Programa terminado");
	}
	
	// Método para saber si los números introducidos por el susuario son correctos (distintos, positivos y b<=10)
	private static boolean correctos(int a, int b) {
		if (a!=b && a>0 && b>0 && b<=10)
			return true;
		else 
			return false;
	}
	
	// Método para mostrar el menú
	private static void mostrarmenu() {
		System.out.println();
		System.out.println("a. Imprimir los primeros a términos de la sucesión de Fibonacci");
		System.out.println("b. El mayor primo entre a y b");
		System.out.println("c. Imprimir los palíndromos impares entre a y b");
		System.out.println("d. Imprimir el factorial de b");
		System.out.println("e. Salir");
	}
	
	// Método RECURSIVO para calcular la sucesión de Fibonacci
	public static int calcularFibonacci(int n) {
        if (n<=1)
            return n;
        else 
            return calcularFibonacci(n-1)+calcularFibonacci(n-2);
    }
	
	// Método para imprimir los primeros a términos de la sucesión de Fibonacci
	private static void imprimirFibonacci(int a) {
		System.out.println("Los primeros "+a+" términos de la sucesión de Fibonacci son:");
		for (int i=0;i<a;i++) 
            System.out.print(calcularFibonacci(i)+" ");
	}
	
	// Método para calcular si un número es primo
	public static boolean esprimo(int n){
		for (int i=2;i<=n/2;i++){
		if (n%i==0)
			return false;
		}
		return true;	
	}
	
	// Método para imprimir el número primo mayor entre a y b
	private static void imprimirMayorPrimo(int a, int b) {
		int mayorPrimo=1;
		for (int i=a;i>=b;i--) {
			if (esprimo(i) && i>mayorPrimo)
				mayorPrimo=i;	
		}
		System.out.println("El mayor primo entre "+a+" y "+b+" es "+mayorPrimo);
	}
	
	// Método para calcular si un número es palíndromo impar
	public static boolean esPalindromoImpar(int n) {
		int numeroOriginal=n;
        int numeroInvertido=0;
        while (n>0) {
            int digito=n%10;
            numeroInvertido=numeroInvertido*10+digito;
            n=n/10;
        }
        if (numeroOriginal==numeroInvertido && numeroOriginal%2!=0)
        	return true;
        else 
            return false;
	}
	
	// Método para imprimir los palíndromos impares entre a y b
	private static void imprimirPalindromosImpares(int a, int b){
		System.out.println("Los palíndromos impares entre "+a+" y "+b+" son:");
		for (int i=a;i>=b;i--) {
			if (esPalindromoImpar(i))
				System.out.print(i+" ");
		}
	}
	
	// Método RECURSIVO para calcular el factorial de un número
	public static int calcularFactorial(int n) {
		if (n==0) 
			return 1;
	    else 
	    	return n*calcularFactorial(n-1);
	    }
		
	// Método para imprimir el factorial de un número
	private static void imprimirFactorial(int n) {
		System.out.println("El factorial de "+n+ " es "+calcularFactorial(n));
	}
	
}
