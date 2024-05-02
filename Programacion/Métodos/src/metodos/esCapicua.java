package metodos;

import java.util.Scanner;

public class esCapicua {

	public static void main(String[] args) {
		// Haz un programa Java que pida un número por teclado y diga si es capicúa
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int n=sc.nextInt();
		Capicua(n);
		sc.close();
	}

	private static void Capicua(int n) {
		int numeroOriginal=n;
        int numeroInvertido=0;
        while (n>0) {
            int digito=n%10;
            numeroInvertido=numeroInvertido*10+digito;
            n=n/10;
        }
        if (numeroOriginal==numeroInvertido) 
            System.out.println(numeroOriginal+" es un número capicúa.");
        else 
            System.out.println(numeroOriginal+" NO es un número capicúa.");
	}

}
