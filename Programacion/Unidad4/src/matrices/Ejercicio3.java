package matrices;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*Realizar un programa que Java que rellene dos matrices de números enteros de 3x4 
		con números aleatorios entre 1 y 30. Después calculará la matriz suma (también
		de 3x4) que será la suma elemento a elemento de las dos anteriores y por último
		mostrará las tres matrices según la salida adjunta.
		La salida será similar a (recuerda que son números aleatorios y los valores pueden
		cambiar):*/
		/*
		4	16	22	1		21	25	27	11		25	41	49	12
		5	20	1	22	+	28	29	15	10	=	33	49	16	32
		20	14	29	9		3	19	4	22		23	33	33	31
		*/
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
