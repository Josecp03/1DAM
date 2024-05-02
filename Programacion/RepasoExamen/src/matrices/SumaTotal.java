package matrices;

public class SumaTotal {

	public static void main(String[] args) {
		int[][] matriz = new int[4][5];
        generarNumerosAleatorios(matriz);
        totales(matriz);
	}
	
	private static void generarNumerosAleatorios(int[][] matriz) {
		for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) 
            	matriz[i][j]=(int)(Math.random()*20)+1;
        }
    }

    public static void totales(int[][] matriz) {
        int sumaTotal = 0;
        // Mostrar la matriz y calcular sumas parciales de filas
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[0].length;j++) 
                System.out.print(matriz[i][j]+"	");
            // Calcular la suma de la fila e imprimir el resultado
            int sumaFila=0;
            for (int j=0;j<matriz[0].length;j++) 
                sumaFila+=matriz[i][j];
            System.out.println("|"+sumaFila);
            sumaTotal+=sumaFila;
        }
        System.out.println("__________________________________________");
        // Calcular e imprimir las sumas parciales de columnas
        for (int j=0;j<matriz[0].length;j++) {
            int sumaColumna=0;
            for (int i=0;i<matriz.length;i++) 
                sumaColumna+=matriz[i][j];
            System.out.print(sumaColumna+"	");
        }
        System.out.println("TOTAL:"+sumaTotal);
    }

}
