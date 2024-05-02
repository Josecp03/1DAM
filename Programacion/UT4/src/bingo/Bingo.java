package bingo;

import java.util.Scanner;

public class Bingo {
	
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Los jugadores que van a participar son:");
        System.out.println("******************************************");
        String[] jugadores=new String[2];
        int[][] boletos=new int[2][5];
        // Solicita los nombres de los jugadores y genera boletos
        for (int i=0;i<2;i++) {
            jugadores[i]=sc.nextLine();
            boletos[i]=getBoleto();
            System.out.println("El jugador "+jugadores[i]+" con alias "+getAlias(jugadores[i])+" tiene el boleto "+arrayToString(boletos[i]));
        }
        System.out.println("******************************************");
        boolean juegoActivo=true;
        // Inicia el juego de Bingo
        while (juegoActivo){
            double rand=Math.random();
            int bola=(int)(rand*20)+1;
            System.out.println("	SALE EL NÚMERO: "+bola);
            // Verifica si la bola coincide con algún número en los boletos
            for (int i=0;i<2;i++) {
                for (int j=0;j<boletos[i].length;j++) {
                    int index=buscarNumero(bola, boletos[i]);
                    if (index!=-1) {
                        boletos[i][index]=0;
                        System.out.println("El número está en el boleto de "+getAlias(jugadores[i]));
                        System.out.println(getAlias(jugadores[i])+" "+arrayToString(boletos[i]));
                        // Verifica si el jugador ha ganado
                        if (esGanador(boletos[i])) {
                            System.out.println(jugadores[i]+" GANA!!!");
                            juegoActivo=false;
                        }
                    }
                }
            }
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Cierra el scanner
        sc.close();
    }

    // Genera un boleto aleatorio
    private static int[] getBoleto() {
        int[] boleto=new int[5];

        for (int i=0;i<5;i++)
            boleto[i]=(int)(Math.random()*20)+1;
        return boleto;
    }

    // Genera un alias para un jugador
    private static String getAlias(String nombre) {
        String alias="J"+nombre.substring(0,3)+(int)(Math.random()*101);
        return alias;
    }

    // Convierte un array en una cadena de texto
    private static String arrayToString(int[] array) {
        StringBuilder sb=new StringBuilder("[");
        for (int i=0;i<array.length;i++) {
            if (i>0)
                sb.append(", ");
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    // Busca un número en el boleto
    private static int buscarNumero(int numero, int[] boleto) {
        for (int i=0;i<boleto.length;i++) {
            if (boleto[i]==numero) 
                return i;
        }
        return -1;
    }

    // Verifica si un jugador ha ganado
    private static boolean esGanador(int[] boleto) {
        for (int i=0;i<boleto.length;i++) {
            if (boleto[i]!=0) 
                return false;
        }
        return true;
    }
}


