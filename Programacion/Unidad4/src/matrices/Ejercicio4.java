package matrices;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*Implementa el método sumaColumnasMatriz que recibe como parámetro una matriz y
		retorna como resultado un vector cuyos componentes son la suma de cada columna de la
		matriz. Por ejemplo, dada la matriz A:*/
		/*
		3	4	4	2
		2	1	1	0
		7	1	2	3
		
		El método debe retornar este array:
		12	6	7	5
		*/
		int[][]matriz=new int[3][4];
		int[]sumaColumnas=new int[4];
		generarNumerosAleatorios(matriz);
		mostrarMatriz(matriz);
		System.out.println("	    =");		
		sumarColumnas(matriz, sumaColumnas);
	}
	
	private static void generarNumerosAleatorios(int[][] matriz) {
		for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) 
            	matriz[i][j]=(int)(Math.random()*30)+1;
        }
    }
	
	public static void mostrarMatriz(int[][] matriz) {
		for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) 
                System.out.print(matriz[i][j]+"	");
            System.out.println();
        }
	}
	
	private static void sumarColumnas(int[][] matriz, int[] sumaColumnas) {
		for (int i=0;i<matriz[0].length; i++) {
	        int suma=0;
	        for (int j=0;j< matriz.length;j++) {
	            // Sumamos el elemento actual de la columna
	            suma+=matriz[j][i];
	        }
	        // Almacenamos la suma de la columna actual en el vector
	        sumaColumnas[i]=suma;
	        System.out.print(sumaColumnas[i]+"	");
	    }
	}

}
