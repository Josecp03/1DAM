package matrices;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*Crea un programa Java que tenga un método public static void totales( int [][]m) que
		recibe como parámetro una matriz formada por 4 filas y 5 columnas que debes rellenar
		con números aleatorios en el programa principal. El método mostrará las sumas parciales
		de filas y columnas igual que si de una hoja de cálculo se tratara. La suma total debe
		aparecer en la esquina inferior derecha.*/
		/*
		14	1	6	8	11	|40
		8	2	5	13	10	|38
		12	3	19	11	16	|61
		7	7	12	8	18	|52
		_______________________
		41	13	42	40	55	TOTAL:191
		*/
		int[][] matriz = new int[4][5];
        generarNumerosAleatorios(matriz);
        totales(matriz);
		
	}
	
	// Método para rellenar la matriz con números aleatorios
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
