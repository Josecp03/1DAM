package ActividadesMatrices;

import java.util.Random;

public class Actividad5 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][5];
        llenarMatrizAleatoriamente(matriz);
        totales(matriz);
    }

    public static void llenarMatrizAleatoriamente(int[][] matriz) {
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(101); // Números aleatorios entre 0 y 100
            }
        }
    }

    public static void totales(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Calcular sumas parciales de filas
        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                sumaFila += matriz[i][j];
            }
            matriz[i][columnas - 1] = sumaFila; // Guardar la suma en la última columna
        }

        // Calcular sumas parciales de columnas y la suma total
        int sumaTotal = 0;
        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < filas; i++) {
                sumaColumna += matriz[i][j];
            }
            matriz[filas - 1][j] = sumaColumna; // Guardar la suma en la última fila
            sumaTotal += sumaColumna;
        }

        matriz[filas - 1][columnas - 1] = sumaTotal; // Guardar la suma total en la esquina inferior derecha

        // Mostrar la matriz con las sumas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
