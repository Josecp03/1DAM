package matrices;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Realizar un programa que pida al usuario las filas (mínimo 2 y máximo 10) y las
		columnas (mínimo 2 y máximo 10) . Suponemos que el usuario tecleará
		correctamente los datos. Después se rellenará esta matriz con números aleatorios
		del 1 al 50 y se mostrará en pantalla.
		Para leer el número de filas y de columnas utilizaremos la clase Scanner.
		La salida será similar a (recuerda que son números aleatorios, tus valores serán
		diferentes):*/
		/*
		Dame el número de filas: 3
		Dame el número de columnas: 5
			15	37	47	24	22
			34	32	7	9	48
			10	42	1	44	32
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el número de filas: ");
		int nFilas=sc.nextInt();
		System.out.println("Dame el número de columnas: ");
		int nColumnas=sc.nextInt();
		int[][]matriz=new int[nFilas][nColumnas];
		generarNumerosAleatorios(matriz);
		mostrarMatriz(matriz);
		sc.close();
		
	}
	
	private static void generarNumerosAleatorios(int[][] matriz) {
		for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) 
            	matriz[i][j]=(int)(Math.random()*50)+1;
        }
    }
	
	private static void mostrarMatriz(int[][] matriz) {
		for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) 
                System.out.print(matriz[i][j]+"	");
            System.out.println();
        }
	}

}
