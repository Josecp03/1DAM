package ejercicioProveedoresPiezas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Utilidades {

	public ArrayList<Pieza> leerPiezas(String filename) throws IOException {
        ArrayList<Pieza> p = new ArrayList<Pieza>();
        String cadena;
        String[] linea;
        try {
        	Scanner entrada=new Scanner(new File(filename));
        	entrada.nextLine();
        	while(entrada.hasNext()) {
        		cadena=entrada.nextLine();
        		linea=cadena.split(";");
        		p.add(new Pieza(Integer.parseInt(linea[0]), linea[1], Integer.parseInt(linea[2]), Double.parseDouble(linea[3])));
        	}
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
			e.printStackTrace();
		}
        return p;// Devuelve el AL con las 
    }
	
	public ArrayList<Proveedor> leerProveedor(String filename) throws IOException {
        ArrayList<Proveedor> p = new ArrayList<Proveedor>();
        String cadena;
        String[] linea;
        try {
        	Scanner entrada=new Scanner(new File(filename));
        	entrada.nextLine();
        	while(entrada.hasNext()) {
        		cadena=entrada.nextLine();
        		linea=cadena.split(";");
        		p.add(new Proveedor(Integer.parseInt(linea[0]), linea[1], linea[2]));
        	}
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
			e.printStackTrace();
		}
        return p;// Devuelve el AL con las 
    }

   public static void main(String[] args) throws IOException {
	   Utilidades u=new Utilidades();
	   System.out.println(u.leerPiezas("piezas.csv"));
	   System.out.println(u.leerProveedor("proveedor.csv"));
   }
   
}
