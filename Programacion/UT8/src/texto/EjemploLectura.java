package texto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploLectura {
	
	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("numeros.txt");
		Scanner entrada=new Scanner(f);
		int suma=0;
		int n=0;
		
		while(entrada.hasNext()) {
			n=entrada.nextInt();
			System.out.println(n);
			suma+=n;
		}
		System.out.println("Suma = "+suma);
		
		//Cerrar Scanner
		entrada.close();
	}
}
