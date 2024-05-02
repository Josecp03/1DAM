package Poo;

import java.util.Scanner;

public class AppCartas {

	public static void main(String[] args) {
		Carta c1=new Carta();
		Carta c2=new Carta();
		Scanner sc=new Scanner(System.in);
		int total1=0;
		int total2=0;
		String continuar1;
		String continuar2;
		do {
			c1.extraerCarta();
			System.out.println(c1);
			total1+=c1.getNumero();
			System.out.println("Sumo jugador 1: "+total1);
			System.out.println("¿Quieres seguir jugando?S/N");
			continuar1=sc.nextLine();	
		}while(total1<21 && !continuar1.equals("N"));
		do {
			c2.extraerCarta();
			System.out.println(c2);
			total2+=c2.getNumero();
			System.out.println("Sumo jugador 2: "+total2);
			System.out.println("¿Quieres seguir jugando?S/N");
			continuar2=sc.nextLine();	
		}while(total2<21 && !continuar2.equals("N"));
		if (total1>21 && total2>21)
			System.out.println("No ha ganado ninguno");
		else if(total1==21 && total2==21)
			System.out.println("Han empatado");
		else {
			int diferencia1=Math.abs(21-total1);
            int diferencia2=Math.abs(21-total2);
            if (total1>21 || (diferencia1<diferencia2 && total1 <=21 && total1>0)) {
                System.out.println("Gana el jugador 2");
            } else if (total2>21 || (total1>0)) {
                System.out.println("Gana el jugador 1");
            }
		}
		sc.close();
	}

}
