package arraysUnidimensionales;

public class Ejercicio4 {
	
    public static void main(String[] args) {
        // Bloque 1: Generar 5 números aleatorios sin repetición del 1 al 54
        int[] bloque1=new int[5];
        for(int i=0;i<5;i++) {
            int numero;
            do 
                numero =(int)(Math.random()*54)+1;
            while(contiene(bloque1,numero));
            bloque1[i]=numero;
        }
        // Bloque 2: Generar 1 número aleatorio del 0 al 9
        int bloque2=(int)(Math.random()*10);

        // Mostrar la apuesta válida
        System.out.print("Bloque 1: ");
        System.out.println();
        for (int i=0;i<5;i++) {
            System.out.print(bloque1[i]+" ");
        }
        System.out.println();
        System.out.println("Bloque 2: ");
        System.out.println(bloque2);

    }
    // Función para verificar si un número ya está en un array
    public static boolean contiene(int[] array, int numero) {
        for (int elemento : array) {
            if (elemento == numero) {
                return true;
            }
        }
        return false;
    }
}

