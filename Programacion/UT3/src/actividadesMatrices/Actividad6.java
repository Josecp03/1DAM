package actividadesMatrices;

import java.util.Random;

public class Actividad6 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        // Llena la matriz con números aleatorios entre 1 y 100
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }

        // Muestra la matriz completa
        System.out.println("Matriz completa:");
        imprimirMatriz(matriz);

        // Llama al método diagonal y muestra los resultados
        diagonal(matriz);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%3d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void diagonal(int[][] matriz) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        System.out.println("\nDiagonal:");
        for (int i = 0; i < 10; i++) {
            int valor = matriz[i][i];
            System.out.print(valor + " ");
            if (valor > max) {
                max = valor;
            }
            if (valor < min) {
                min = valor;
            }
            sum += valor;
        }

        double media = (double) sum / 10;

        System.out.println("\nMáximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Media: " + media);
    }
}

