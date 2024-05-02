package texto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaCsv {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner entrada=new Scanner(new File("numeros.csv"));
		String cadena="";//cada línea del fichero
		String[]linea;
		int sumaLinea=0;
		int sumaTotal=0;
		
		while(entrada.hasNext()) {
			cadena=entrada.nextLine();
			System.out.print(cadena);
			linea=cadena.split(";");//Separo por;
			sumaLinea=0;
			for (int i = 0; i < linea.length; i++) {
				sumaLinea+=Integer.parseInt(linea[i]);
			}
			System.out.print(" --> "+sumaLinea+"\n");
			sumaTotal+=sumaLinea;
		}
		System.out.println("Suma total = "+sumaTotal);
		
	}

}
