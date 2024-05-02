package texto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploLectura2 {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("numeros.txt");
		Scanner entrada=new Scanner(f);
		int suma=0;
		String num="";

		while(entrada.hasNext()) {
			num=entrada.next();
			System.out.println(num);
			suma+=Integer.parseInt(num);
		}
		
		System.out.println("Suma = "+suma);
		
		//Cerrar Scanner
		entrada.close();
	}

}
