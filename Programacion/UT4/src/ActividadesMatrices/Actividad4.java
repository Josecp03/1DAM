package ActividadesMatrices;

public class Actividad4 {
    
	public static void main(String[] args) {
        // Ejemplo de matriz A
        int[][] matrizA = {
            {3, 4, 4, 2},
            {2, 1, 1, 0},
            {7, 1, 2, 3}
        };
        
        // Llamar al método para obtener el vector de sumas
        int[] resultados = sumaColumnasMatriz(matrizA);
        
        // Mostrar el vector de sumas
        for (int i = 0; i < resultados.length; i++) {
            System.out.print(resultados[i] + " ");
        }
    }
    
    // Método para sumar las columnas de una matriz y devolver un vector con las sumas
    public static int[] sumaColumnasMatriz(int[][] matriz) {
        int numFilas = matriz.length;
        int numColumnas = matriz[0].length;
        
        // Inicializar un vector de sumas con ceros
        int[] sumas = new int[numColumnas];
        
        // Recorrer cada columna y sumar sus elementos
        for (int j = 0; j < numColumnas; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < numFilas; i++) {
                sumaColumna += matriz[i][j];
            }
            sumas[j] = sumaColumna;
        }
        
        return sumas;
    }
}

