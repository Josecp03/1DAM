package matrices;

public class Diagonal {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
        generarNumerosAleatorios(matriz);
        mostrarMatriz(matriz);
        diagonal(matriz);
	}
	
	// Método para llenar la matriz con números aleatorios entre 1 y 100
		private static void generarNumerosAleatorios(int[][] matriz) {
			for (int i=0;i<matriz.length;i++) {
	            for (int j=0;j<matriz[i].length;j++) 
	            	matriz[i][j]=(int)(Math.random()*100)+1;
	        }
	    }

	    // Método para mostrar la matriz por pantalla
	    private static void mostrarMatriz(int[][] matriz) {
	        for (int i=0;i<matriz.length; i++) {
	            for (int j=0;j<matriz[i].length;j++) {
	                System.out.print(matriz[i][j]+"	");
	            }
	            System.out.println();
	        }
	    }

	    // Método para mostrar la diagonal, máximo, mínimo y media de la diagonal
	    private static void diagonal(int[][] matriz) {
	    	System.out.println();
	        System.out.println("Diagonal desde la esquina superior izquierda a la esquina inferior derecha:");
	        int suma=0;
	        int maximo=matriz[0][0];
	        int minimo=matriz[0][0];
	        for (int i=0;i<matriz.length;i++) {
	            int elemento=matriz[i][i];
	            System.out.print(elemento+"	");
	            suma+=elemento;
	            if (elemento>maximo) 
	                maximo=elemento;
	            if (elemento<minimo) 
	                minimo=elemento;
	        }
	        double media=(double)suma/matriz.length;
	        System.out.println();
	        System.out.println("Máximo: "+maximo);
	        System.out.println("Mínimo: "+minimo);
	        System.out.println("Media: "+media);
	    }

}
