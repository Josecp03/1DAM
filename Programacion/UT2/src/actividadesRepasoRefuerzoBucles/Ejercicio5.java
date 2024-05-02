package actividadesRepasoRefuerzoBucles;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*Escriba un programa en Java que genere la siguiente serie: 5,10,15,20,25,30… El
		programa preguntará primero cuantos términos se quieren mostrar y después
		mostrará la serie correspondiente*/
		Scanner teclado=new Scanner(System.in);
		int contadorNumeros=0;
		System.out.println("¿Cuántos números quieres mostrar? ");
		int n=teclado.nextInt();
		for (int i=5;contadorNumeros<n;i+=5) {
			System.out.print(i+" ");
			contadorNumeros++;
		}
		teclado.close();
	}
}
