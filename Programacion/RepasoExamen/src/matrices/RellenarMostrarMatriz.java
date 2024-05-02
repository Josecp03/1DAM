package matrices;

public class RellenarMostrarMatriz {

	public static void main(String[] args) {
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
