package resumen;

import java.util.Scanner;

public class numeroAleatorio {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int máximo=20;
		int nSecreto=(int)(Math.random()*máximo)+1; //Se multiplica el valor random por el máximo, y se suma 1 para que el mínimo sea 1 y no 0 
		int n;
		do {
			System.out.println("Introduzca un número: ");
			n=sc.nextInt();
			if (n<nSecreto)
				System.out.println("El número secreto es mayor");
			else if(n>nSecreto)
				System.out.println("El número secreto es menor");
		} while(n!=nSecreto);
		System.out.println("Has acertado el número!");
		sc.close();
	}

}
