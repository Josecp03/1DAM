package practicas;

import java.util.Scanner;

public class practica1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int nFilas,nColumnas;
		int opcion;
		do {
			System.out.println("Dame le número de filas: ");
			nFilas=sc.nextInt();
		} while(nFilas<1 || nFilas>10);
		do {
			System.out.println("Dame le número de columnas: ");
			nColumnas=sc.nextInt();
		} while(nColumnas<1 || nColumnas>10);
		int[][]matriz=new int[nFilas][nColumnas];
		do {
			mostrarmenu();
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				generarMatriz(matriz);
				break;
			case 2:
				imprimeMatriz(matriz);
				break;
			case 3:
				System.out.println("Dame un número: ");
				int numero=sc.nextInt();
				System.out.println();
				buscarMatriz(numero,matriz);
				break;
			case 4:
				System.out.println("Caso 4");
				break;
			case 5:
				System.out.println("Caso 2");
				break;
			case 6:
				System.out.println("Caso 3");
				break;
			case 7:
				System.out.println("Caso 4");
				break;
			case 8:
				System.out.println("Caso 3");
				break;
			case 9:
				System.out.println("Caso 4");
				break;
			}
		} while (opcion!=0);
		sc.close();
	}

	private static void buscarMatriz(int numero, int[][] matriz) {
		int contador=0;
		for (int i=0;i<matriz.length; i++) {
            for (int j=0;j<matriz[i].length;j++) {
                if (matriz[i][j]==numero) {
                	System.out.println(numero+" se ha encontrado en la posición ("+(i+1)+","+(j+1)+")");
                	contador++;
                }
            }
        }
		System.out.println("El número "+numero+" se ha encontrado "+contador+" veces");
	}

	private static void imprimeMatriz(int[][] matriz) {
		for (int i=0;i<matriz.length; i++) {
            for (int j=0;j<matriz[i].length;j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }
	}

	private static void generarMatriz(int[][] matriz) {
		for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) 
            	matriz[i][j]=(int)(Math.random()*20)+1;
        }
	}

	private static void mostrarmenu() {
		System.out.println();
		System.out.println("1) Genrar Matriz");
		System.out.println("2) Imprimir Matriz");
		System.out.println("3) Buscar Matriz");
		System.out.println("4) Fila Suma Mayor");
		System.out.println("5) Es cuadrada");
		System.out.println("6) Suma Pares");
		System.out.println("7) Suma Impares");
		System.out.println("8) Suma Diagonal");
		System.out.println("9) Convertir Matriz");
		System.out.println("0) Salir");
		System.out.println();
	}

	
}
