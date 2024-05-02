package matrices;

import java.util.Arrays;
import java.util.Scanner;

public class RepasoMatrices {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el número de filas: ");
		int nFilas=sc.nextInt();//==matriz.length
		System.out.println("Dame el nñumero de columnas: ");
		int nCol=sc.nextInt();//==matriz[0].length
		//Comprobar que son correctos
		int [][]matriz=new int[nFilas][nCol];
		//Rellenar la matriz
		generarMatriz(matriz);
		//Imprimir la matriz
		imprimeMatriz(matriz);
		//Buscar un número 
		System.out.println("\nBuscar un número");
		int numero=sc.nextInt();
		buscarMatriz(numero, matriz);
		System.out.println("La fila con el numero mayor es: "+filaSumaMayor(matriz));
		//es cuadrada
		if(esCuadrada(matriz)) {
			System.out.println("La matriz es cuadrada");
			System.out.println("La suma de los números de la diagonal es: "+sumaDiagonal(matriz));
			convierteTriangularSuperior(matriz);
			imprimeMatriz(matriz);
		}
		else
			System.out.println("\nLa matriz no es cuadrada");
		System.out.println("\nLa suma de los números pares de la matriz es: "+sumaPares(matriz));
		System.out.println("La suma de los números impares de la matriz es: "+sumaImpares(matriz));
		sc.close();
	}
	
	private static void imprimeMatriz(int[][] matriz) {
		for(int i=0;i<matriz.length;i++) {
			System.out.println();
			for(int j=0;j<matriz[0].length;j++) 
				System.out.print(matriz[i][j]+"\t");
		}
	}

	private static void generarMatriz(int[][] matriz) {
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) 
				matriz[i][j]=(int)(Math.random()*21);
		}
	}
	
	public static void buscarMatriz(int numero, int[][]m) {
		int contador=0;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				if(numero==m[i][j]) {
					System.out.println("Encontrado "+numero+" en la posicion ("+i+","+j+")");
					contador++;
				}
			}
		}
		System.out.println("Encontrado "+contador+" vez/veces");
	}

	 public static boolean esCuadrada(int [][]m) {
		 return (m.length==m[0].length);
	 }
	 
	 public static int sumaPares(int[][]m) {
		 int suma=0;
			for(int i=0;i<m.length;i++) {
				for(int j=0;j<m[0].length;j++) {
					if(m[i][j]%2==0)
						suma+=m[i][j];
				}
			}
		 return suma;
	 }

	 public static int sumaImpares(int[][]m) {
		 int suma=0;
			for(int i=0;i<m.length;i++) {
				for(int j=0;j<m[0].length;j++) {
					if(m[i][j]%2!=0)
						suma+=m[i][j];
				}
			}
		 return suma;
	 }
	 
	 public static int sumaDiagonal(int[][]m) {
		 int suma=0;
			for(int i=0;i<m.length;i++) {
				for(int j=0;j<m[0].length;j++) {
					if(i==j)
						suma+=m[i][j];
				}
			} 
		 return suma;
	 }
	 
	 public static void convierteTriangularSuperior(int [][]m) {
			for(int i=0;i<m.length;i++) {
				for(int j=0;j<m[0].length;j++) {
					if(i<j)
						m[i][j]=0;
				}
			}
	 }
	 
	 public static int filaSumaMayor(int [][]m) {
		 int sumaFilas[]=new int[m.length];
		 int suma=0;
		 for(int i=0;i<m.length;i++) {
				for(int j=0;j<m[0].length;j++) {
					suma+=m[i][j];
				}
				sumaFilas[i]=suma;
				suma=0;
		 }
		 System.out.println(Arrays.toString(sumaFilas));
		 //Elemento mayor de un array
		 int mayor=sumaFilas[0];
		 int posicion=0;
		 for (int i=0;i<sumaFilas.length; i++) {
			if(sumaFilas[i]>mayor) {
				mayor=sumaFilas[i];
				posicion=i;
			}
		 }
		 return posicion;
	 }

}
