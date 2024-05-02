package arraysUnidimensionales;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*Se quiere hacer un programa para rellenar una apuesta sencilla del sorteo "El
		gordo de la primitiva". En este sorteo se deben rellenar cinco casillas del bloque 1
		(números del 1 al 54) y 1 casilla del bloque 2 (números del 0 al 9). Teniendo en
		cuenta que los números del bloque 1 no se pueden repetir, elaborar un programa
		que de forma aleatoria nos muestre una apuesta válida para este juego.
		La solución debe ser similar a (ten en cuenta que los números son aleatorios, no
		tienes que salir estos mismos);*/
		/*Bloque 1:
		41	12	29	16	50
		Bloque 2:
		8*/
		int[] bloque1=new int[5];
	    int bloque2=generarNumeroAleatorio(0, 9);
	    generarBloque1(bloque1);
	    System.out.println("Bloque 1: " + Arrays.toString(bloque1));
	    System.out.println("Bloque 2: " + bloque2);
	}
	
	public static void generarBloque1(int[] bloque1) {
        for (int i=0;i<bloque1.length;i++) {
            bloque1[i]=generarNumeroAleatorio(1, 54);
            // Verificar si el número ya está en el bloque1
            while (existeEnBloque1(bloque1, i, bloque1[i])) {
                bloque1[i]=generarNumeroAleatorio(1, 54);
            }
        }
    }

    public static boolean existeEnBloque1(int[] bloque1, int indice, int numero) {
        for (int i = 0; i < indice; i++) {
            if (bloque1[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public static int generarNumeroAleatorio(int min, int max) {
        // Math.random() devuelve un número entre 0 (inclusive) y 1 (exclusive)
        return (int) (Math.random() * (max - min + 1)) + min;
    }

}
