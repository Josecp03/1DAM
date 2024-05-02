package actividadesMatrices;

import java.util.Random;

public class Actividad3 {
    public static void main(String[] args) {
        // Tamaño de las matrices
        int filas = 3;
        int columnas = 4;

        // Crear matrices
        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] matrizSuma = new int[filas][columnas];

        // Llenar las matrices con números aleatorios entre 1 y 30
        llenarMatrizAleatoriamente(matriz1);
        llenarMatrizAleatoriamente(matriz2);

        // Calcular la matriz suma
        calcularMatrizSuma(matriz1, matriz2, matrizSuma);

        // Mostrar las matrices
        System.out.println("Matriz 1:");
        mostrarMatriz(matriz1);

        System.out.println("Matriz 2:");
        mostrarMatriz(matriz2);

        System.out.println("Matriz Suma:");
        mostrarMatriz(matrizSuma);
    }

    // Llenar una matriz con números aleatorios entre 1 y 30
    public static void llenarMatrizAleatoriamente(int[][] matriz) {
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rand.nextInt(30) + 1;
            }
        }
    }

    // Calcular la matriz suma
    public static void calcularMatrizSuma(int[][] matriz1, int[][] matriz2, int[][] matrizSuma) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
    }

    // Mostrar una matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
