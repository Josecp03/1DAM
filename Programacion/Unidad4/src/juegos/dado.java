package juegos;

import java.util.Arrays;
import java.util.Scanner;

public class dado {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String j1,j2;
        do {
            System.out.print("Jugador1: Introduce el nick (JXXXN): ");
            j1=sc.nextLine();
        } while (!j1.matches("^J[A-Z]{3}[0-9]$"));

        int[] resultado1=new int[5];
        for (int i=0;i<resultado1.length;i++) 
            resultado1[i]=(int)(Math.random()*6)+1;
        do {
            System.out.print("Jugador2: Introduce el nick (JXXXN): ");
            j2=sc.nextLine();
        } while (!j2.matches("^J[A-Z]{3}[0-9]$"));
        int[] resultado2=new int[5];
        for (int i=0;i<resultado2.length;i++) 
            resultado2[i]=(int)(Math.random()*6)+1;
        System.out.println(j1+" tiene "+Arrays.toString(resultado1));
        System.out.println(j2+" tiene "+Arrays.toString(resultado2));
        System.out.println("*************Comienza el juego***************");
        int partidasGanadasJ1=0;
        int partidasGanadasJ2=0;
        for (int i=0;i<5;i++) {
            int dado=(int)(Math.random()*6)+1;
            System.out.println("Dado: "+dado);
            if (buscarEnResultado(dado, resultado1)) {
                System.out.println("	"+j1+" coincide con el resultado del lanzamiento "+(i+1));
                partidasGanadasJ1++;
            }
            if (buscarEnResultado(dado, resultado2)) {
                System.out.println("	"+j2+" coincide con el resultado del lanzamiento "+(i+1));
                partidasGanadasJ2++;
            }
        }
        System.out.print("Gana ");
        if (partidasGanadasJ1>partidasGanadasJ2) 
            System.out.print(j1);
        else if (partidasGanadasJ1<partidasGanadasJ2) 
            System.out.print(j2);
        else 
            System.out.print("Nadie");
        System.out.println(" con aciertos="+Math.max(partidasGanadasJ1, partidasGanadasJ2));
        sc.close();
    }

    private static boolean buscarEnResultado(int valor, int[] resultado) {
        for (int i=0;i<resultado.length;i++) {
            if (resultado[i]==valor) 
                return true;
        }
        return false;
    }

}

