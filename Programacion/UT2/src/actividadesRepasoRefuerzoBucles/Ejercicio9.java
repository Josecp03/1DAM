package actividadesRepasoRefuerzoBucles;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/* Escriba un programa en Java que solicite 10 números enteros positivos al usuario y
		calcule y muestre los siguientes valores:
			• La suma de todos los números leídos.
			• La media de los números.
			• El mayor número introducido.
			• El menor número introducido.*/ 
		Scanner teclado=new Scanner(System.in);
        int suma=0;
        int mayor=0; 
        int menor=0; 
        for (int i=1;i<=10;i++) {
            System.out.print("Ingrese el número #"+i+": ");
            int numero = teclado.nextInt();
            // Verificar si el número es positivo
            if (numero < 0) {
                System.out.println("Debe ingresar un número entero positivo.");
                i--; // Restar uno al contador para repetir la entrada del número
            } else {
                suma+=numero;
                if (i==1) {
                    mayor=numero;
                    menor=numero;
                } else {
                    if (numero>mayor) {
                        mayor=numero;
                    }
                    if (numero<menor) {
                        menor=numero;
                    }
                }
            }
        }
        // Calcular la media
        double media=(double)suma/10;
        // Mostrar los resultados
        System.out.println("Suma de todos los números: "+suma);
        System.out.println("Media de los números: "+media);
        System.out.println("El mayor número introducido: "+mayor);
        System.out.println("El menor número introducido: "+menor);
        teclado.close();
	}
}
