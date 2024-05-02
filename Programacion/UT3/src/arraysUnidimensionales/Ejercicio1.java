package arraysUnidimensionales;


public class Ejercicio1 {
	
    public static void main(String[] args) {
        int[] numerosAleatorios = new int[20];
        for (int i=0;i<20;i++) {
            int numeroAleatorio =(int)(Math.random()*50)+1;
            numerosAleatorios[i]=numeroAleatorio;
        }
        System.out.println("Números generados en orden inverso:");
        for (int i=19;i>=0;i--) 
            System.out.print(numerosAleatorios[i]+" ");
    }
}

