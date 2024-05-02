package metodos;

import java.util.Scanner;

public class cifraMenor {

	public static void main(String[] args) {
		// Realiza un programa que calcule la menor cifra de un número introducido
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int n=sc.nextInt();
		digitoMenor(n);
		sc.close();
	}
	
	private static void digitoMenor(int n) {
		n=Math.abs(n);
        int menorCifra=9;
        while(n>0){
            int digito=n%10;
            if (digito<menorCifra) {
                menorCifra=digito;
            }
            n=n/10;
        }
        System.out.println("La cifra menor es: "+menorCifra);
	}

}
