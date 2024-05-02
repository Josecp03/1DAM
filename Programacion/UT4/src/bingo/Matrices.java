package bingo;

import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nFilas=sc.nextInt();
		int nCols=sc.nextInt();
		
		// Comprobar que son correctos
		int[][]matriz=new int[nFilas][nCols];
		// Rellenar matriz
		generarMatriz(matriz);
		
		// Imprimir matriz
		imprimeMatriz(matriz);
		
		// Cerrar Scanner
		sc.close();
		
	}

	private static void imprimeMatriz(int[][] matriz) {
	    for (int i=0;i<matriz.length;i++) {
	        for (int j=0;j<matriz[0].length;j++) {
	            System.out.print(matriz[i][j]+"	"); 
	        }
	        System.out.println(); 
	    }
	}

	private static void generarMatriz(int[][] matriz) {
		for (int i=0;i<matriz.length;i++) {
			for (int j=0; j<matriz[0].length;j++) 
				matriz[i][j]=(int)(Math.random()*21);
		}
		
	}

}
