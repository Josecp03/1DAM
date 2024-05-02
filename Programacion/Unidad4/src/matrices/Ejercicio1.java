package matrices;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Realizar un programa en Java que rellene una matríz de 3 x 4 por filas colocando
		números consecutivos en cada posición de la tabla. Una vez rellenada la tabla la
		tiene que mostrar en pantalla por filas (con forma de matriz).
		
		La solución debe ser:*/
		/*
		1	2	3	4
		5	6	7	8
		9	10	11	12 
		*/
		// Declaramos la matriz
        int[][]matriz=new int[3][4];
        rellenaratriz(matriz);
        mostrarMatriz(matriz);
	}

	private static void rellenaratriz(int[][] matriz) {
		for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) 
                matriz[i][j] =i*4+j+1;
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
