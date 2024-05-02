package bingo;

import java.util.Scanner;

public class MatricesD {
	
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean salir=false;
        int opcion;
        System.out.print("Ingrese el número de filas (mayor que 1 y menor que 10): ");
        int nFilas=sc.nextInt();
        System.out.print("Ingrese el número de columnas (mayor que 1 y menor que 10): ");
        int nCol=sc.nextInt();
        if (nFilas<=1 || nFilas>=10 || nCol<=1 || nCol>=10) {
            System.out.println("Las dimensiones de la matriz no son válidas.");
            salir=true; 
        }
        int[][] matriz=new int[nFilas][nCol];
        while (!salir) {
        	mostrarmenu();
            System.out.print("Seleccione una opción: ");
            opcion=sc.nextInt();
            switch (opcion) {
                case 1:
                    generarMatriz(matriz);
                    break;
                case 2:
                    imprimeMatriz(matriz);
                    break;
                case 3:
                    System.out.print("Ingrese un número para buscar en la matriz: ");
                    int numeroBuscar=sc.nextInt();
                    buscarMatriz(numeroBuscar, matriz);
                    break;
                case 4:
                    System.out.println("Fila con la mayor suma de elementos: "+filaSumaMayor(matriz));
                    break;
                case 5:
                    System.out.println("¿Es una matriz cuadrada? "+esCuadrada(matriz));
                    break;
                case 6:
                    System.out.println("Suma de números pares en la matriz: "+sumaPares(matriz));
                    break;
                case 7:
                    System.out.println("Suma de números impares en la matriz: "+sumaImPares(matriz));
                    break;
                case 8:
                    System.out.println("Suma de la diagonal principal: "+sumaDiagonal(matriz));
                    break;
                case 9:
                	System.out.println("Convirtiendo la matriz a triangular superior...");
                    if (esCuadrada(matriz)) {
                        convierteTriangularSuperior(matriz);
                        System.out.println("Matriz triangular superior:");
                        imprimeMatriz(matriz);
                    } else {
                        System.out.println("La matriz no es cuadrada, no se puede triangularizar.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    salir=true; 
                    break;
                default:
                    System.out.println("Opción no válida. Intentelo de nuevo.");
                    break;
            }
        }
        sc.close();
    }

	private static void mostrarmenu() {
		 System.out.println("\nMenú:");
	     System.out.println("1. Generar matriz");
	     System.out.println("2. Imprimir matriz");
	     System.out.println("3. Buscar número en la matriz");
	     System.out.println("4. Fila con la mayor suma de elementos");
	     System.out.println("5. ¿Es una matriz cuadrada?");
	     System.out.println("6. Suma de números pares en la matriz");
	     System.out.println("7. Suma de números impares en la matriz");
	     System.out.println("8. Suma de la diagonal principal");
	     System.out.println("9. Convertir a matriz triangular superior");
	     System.out.println("0. Salir");
	
	     System.out.print("Seleccione una opción: ");
		}
	
	// Método para generar una matriz con números aleatorios entre 0 y 20
	static void generarMatriz(int[][] m) {
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[0].length; j++) 
				m[i][j]=(int)(Math.random()*21); 
	    }
	}
	
	// Método para imprimir una matriz por pantalla
	static void imprimeMatriz(int[][] m) {
		System.out.println("Matriz:");
		for (int i=0;i<m.length;i++) {
	        for (int j=0;j<m[0].length;j++) 
	            System.out.print(m[i][j]+" ");
	        System.out.println();
	    }
	}
	
	// Método para buscar un número en la matriz e imprimir su posición y frecuencia
	static void buscarMatriz(int numero, int[][] m) {
		int frecuencia=0;
	    boolean encontrado=false;
	    for (int i=0;i<m.length;i++) {
	    	for (int j=0;j<m[0].length;j++) {
	    		if (m[i][j]==numero) {
	    			System.out.println("Número encontrado en la posición ("+i+", "+j+")");
	                frecuencia++;
	                encontrado=true;
	            }
	        }
	    }
	    if (!encontrado) 
	    	System.out.println("Número no encontrado en la matriz.");
	    else 
	    	System.out.println("El número "+numero+" aparece "+frecuencia+" veces en la matriz.");
	}
	
	// Método para encontrar la fila con la mayor suma de elementos
	static int filaSumaMayor(int[][] m) {
		int maxSuma=Integer.MIN_VALUE;
	    int filaMaxSuma=-1;
	    for (int i=0;i<m.length;i++) {
	    	int sumaFila=0;
	        for (int j=0;j<m[0].length;j++) 
	        	sumaFila+=m[i][j];
	        if (sumaFila>maxSuma) {
	        	maxSuma=sumaFila;
	        	filaMaxSuma=i;
	        }
	    }
	    return filaMaxSuma;
	}
	
	// Método para verificar si una matriz es cuadrada
	static boolean esCuadrada(int[][] m) {
		return m.length==m[0].length;
	}
	
	// Método para calcular la suma de los números pares en la matriz
	static int sumaPares(int[][] m) {
	    int suma=0;
	    for (int i=0;i<m.length;i++) {
	        for (int j=0;j<m[0].length;j++) {
	            if (m[i][j]%2==0) 
	                suma+=m[i][j];
	        }
	    }
	    return suma;
	}
	
	// Método para calcular la suma de los números impares en la matriz
	static int sumaImPares(int[][] m) {
	    int suma=0;
	    for (int i=0;i<m.length;i++) {
	        for (int j=0;j<m[0].length;j++) {
	            if (m[i][j] % 2 != 0) 
	                suma+=m[i][j];
	        }
	    }
	    return suma;
	}
	
	// Método para calcular la suma de los elementos de la diagonal principal
	static int sumaDiagonal(int[][] m) {
		int suma=0;
	    for (int i=0;i<m.length;i++) 
	    	suma+=m[i][i];
	    return suma;
	}
	
	// Método para convertir la matriz en triangular superior
	static void convierteTriangularSuperior(int[][] m) {
        if (esCuadrada(m)) {
            for (int i=0;i<m.length;i++) {
                for (int j=i+1;j<m[0].length;j++) 
                    m[i][j]=0;
            }
            System.out.println("Matriz convertida a triangular superior.");
        } else 
            System.out.println("La matriz no es cuadrada, no se puede triangularizar.");
    }
	
}
	
