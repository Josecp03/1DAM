package matrices;

public class SumaMatrices {

	public static void main(String[] args) {
		int[][]matriz1=new int[3][4];
		int[][]matriz2=new int[3][4];
		int[][]matrizSuma=new int[3][4];
		generarNumerosAleatorios(matriz1);
		generarNumerosAleatorios(matriz2);
		sumarMatrices(matriz1, matriz2, matrizSuma);
		mostrarResultado(matriz1,matriz2,matrizSuma);
	}
	
	private static void mostrarResultado(int[][] matriz1, int[][] matriz2, int[][] matrizSuma) {
		mostrarMatriz(matriz1);
		System.out.println("	    +");
		mostrarMatriz(matriz2);
		System.out.println("	    =");
		mostrarMatriz(matrizSuma);
	}

	private static void generarNumerosAleatorios(int[][] matriz) {
		for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) 
            	matriz[i][j]=(int)(Math.random()*30)+1;
        }
    }
	
	private static void sumarMatrices(int[][] matriz1, int[][] matriz2, int[][] matrizSuma) {
		for (int i=0;i<matrizSuma.length;i++) {
            for (int j=0;j<matrizSuma[i].length;j++) 
            	matrizSuma[i][j]=matriz1[i][j]+matriz2[i][j];
        }
	}
	
	public static void mostrarMatriz(int[][] matriz) {
		for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) 
                System.out.print(matriz[i][j]+"	");
            System.out.println();
        }
	}

}
