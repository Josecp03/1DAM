package arraysUnidimensionales;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Realizar un programa en Java que genere 20 números aleatorios entre 1 y 50 y los
		muestre en orden inverso a como hayan sido generados. Es decir, el primero que
		se muestra será el último que fue generado aleatoriamente.
		Primero generaremos los 20 número almacenándolos en un array de enteros y
		después los mostraremos desde el último al primero.
		Para generar un número aleatorio entre 1 y 50 emplearemos el método random( )
		de la clase Math.
		El resultado debe ser similar a (ten en cuenta que los números cambiarán, pues
		son aleatorios):
		Los 20 números parecidos son:
		1	9	19	24	7	18	1	7	13	24	19	7	17	16	24	16	18	23	16	8	
		*/
        int[] numerosAleatorios=new int[20];
        generarNumerosAleatorios(numerosAleatorios);
        mostrarArrayOriginal(numerosAleatorios);
        System.out.println();
        mostrarArrayInverso(numerosAleatorios);
	}
	
	private static void generarNumerosAleatorios(int[] numerosAleatorios) {
        for (int i=0;i<numerosAleatorios.length;i++) 
            numerosAleatorios[i]=(int)(Math.random()*50)+ 1;
        
    }

    private static void mostrarArrayOriginal(int[] numerosAleatorios) {
    	System.out.print("Array original: ");
        for (int i=0;i<numerosAleatorios.length;i++) 
            System.out.print(numerosAleatorios[i]+" ");
    }

    private static void mostrarArrayInverso(int[] numerosAleatorios) {
    	System.out.print("Array invertido: ");
        for (int i=numerosAleatorios.length-1;i>=0;i--) 
            System.out.print(numerosAleatorios[i]+" ");
        
    }
    
}
