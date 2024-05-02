package matrices;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas
		relleno con números aleatorios entre 1 y 100. A continuación, crea un método llamado
		diagonal que recibe como parámetro esa matriz y que muestra los números de la diagonal
		que van desde la esquina superior izquierda a la esquina inferior derecha, así como el
		máximo, el mínimo y la media de los números que hay en esa diagonal.*/
		/*
		4	4	1	10	10	7	3	10	2	3
		10	4	3	10	6	6	9	7	7	9
		10	7	4	3	9	7	10	6	6	3
		2	6	6	6	2	6	8	2	7	3
		3	9	5	9	9	8	5	9	9	8
		8	5	8	9	10	3	10	10	10	1
		1	9	4	1	2	8	10	8	4	10
		5	10	3	5	9	2	6	9	9	9
		2	8	9	4	10	9	4	10	5	10
		2	8	9	9	6	6	1	2	10	9
	 	
	 	Diagonal desde la esquina superior izquierda a la esquina inferior derceha:
	 	4	4	4	6	9	3	10	9	5	9
	 	Máximo: 10
	 	Mínimo: 3
	 	Media: 6.3
		*/
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
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "	");
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
