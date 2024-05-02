package DadosExamen;

import java.util.Arrays;
import java.util.Scanner;

public class JuegosDados2021 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String j1="",j2="";
		int contador1=0;
		int contador2=0;
		int contadorJugadas=0;
		do {
			System.out.println("Jugador1: Introduce el nick");
			j1=sc.nextLine();
		}while(!nickCorrecto(j1));
		do {
			System.out.println("Jugador2: Introduce el nick");
			j2=sc.nextLine();
		}while(!nickCorrecto(j2));
		int[]resultado1=new int[5];
		int[]resultado2=new int[5];
		Dado d=new Dado();
		for(int i=0;i<5;i++) {
			d.lanzarDado();
			resultado1[i]=d.getNcara();
			d.lanzarDado();
			resultado2[i]=d.getNcara();
		}
		System.out.println(j1+" tiene "+Arrays.toString(resultado1));
		System.out.println(j2+" tiene "+Arrays.toString(resultado2));
		System.out.println("*****************Comienza el juego*****************");
		do {
			for(int i=0;i<resultado1.length;i++){
				int resultadoDado=d.getNcara();
				System.out.println("Dado: "+resultadoDado);
				if(resultadoDado==resultado1[i]) {
					System.out.println("	"+j1+" coincide con el resultado del lanzamiento "+i);
					contador1++;
				}
				if(resultadoDado==resultado2[i]) {
					System.out.println("	"+j2+" coincide con el resultado del lanzamiento "+i);
					contador2++;
				}
			}
			contadorJugadas++;
		} while(contadorJugadas==5);
		mostrarResultado(j1,contador1,j2,contador2);
		sc.close();
	}
	
	private static boolean nickCorrecto(String jugador) {
		return jugador.matches("^J[A-Z]{3}[0-9]");
	}
	
	private static void mostrarResultado(String j1, int contador1, String j2, int contador2) {
		if (contador1>contador2)
			System.out.println("Gana "+j1+" con aciertos="+contador1);
		else if(contador2>contador1)
			System.out.println("Gana "+j2+" con aciertos="+contador2);
		else
			System.out.println("Empatan "+j1+" y "+j2+" con los mismos aciertos");
	}

}
