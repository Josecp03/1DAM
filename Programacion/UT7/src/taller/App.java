package taller;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	public ArrayList<Coche> cargarCoches(String fichero) throws FileNotFoundException{
		Scanner entrada=new Scanner(new File(fichero));
		ArrayList<Coche>coches=new ArrayList<Coche>();
		String linea[];
		String cadena;
		entrada.nextLine();
		while(entrada.hasNext()) {
			cadena=entrada.nextLine();
			linea=cadena.split(";");
			coches.add(new Coche(linea[0], linea[1], linea[2], linea[3], Integer.parseInt(linea[4]), Double.parseDouble(linea[5])));
		}
		
		
		
		return coches;
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		App a=new App();
		ArrayList<Coche>coches=new ArrayList<Coche>();
		coches=a.cargarCoches("coches.csv");
		
		//Listar las matriculas de todos los coches
		System.out.println("****************************** LISTA DE COCHES ******************************");
		for (Coche c : coches) {
			System.out.println(c.getMatricula());
		}
		System.out.println();
		//Número de coches de 5 puertas
		System.out.println("***************************** COCHES 5 PUERTAS ******************************");
		int cont=0;
		for(Coche c:coches) {
			if(c.getnPuertas()==5)
				cont++;
		}
		System.out.println("Número de coches con 5 puertas: "+cont+"\n");
		
		//Matricula, marca y modelo de los coches negros
		System.out.println("******************************* COCHES NEGROS *******************************");
	    for (Coche c : coches) {
			if(c.getColor().equalsIgnoreCase("negro"))
				System.out.println("Matrícula: "+c.getMatricula()+", Marca: "+c.getMarca()+", Modelo: "+c.getModelo());
		}
	    System.out.println();
	    
	    //El coche con mayor número de Km (objeto)
	    System.out.println("******************************** COCHES < KM ********************************");
	    double max=0;
	    Coche c=new Coche();
	    for(Coche co: coches) {
	    	if(co.getKm()>max) {
	    		c=co;
	    		max=co.getKm();
	    	}
	    }
	    System.out.println("El coche con mayor km: ");
	    System.out.println("\t "+c+"\n");
	    
	    //Matrícula del coche con menor número de km
	    System.out.println("******************************** COCHES < KM ********************************");
	    double min=coches.get(0).getKm();
	    String matricula="";
	    for (Coche co : coches) {
			if(co.getKm()<min) {
				min=co.getKm();
				matricula=co.getMatricula();
			}
		}
	    System.out.println("El coche con menor km: ");
	    System.out.println("\t "+matricula+"\n");

		//Guardar en otro AL los coches de 3 puertas y borralos de coches
	    System.out.println("******************************* GUARDAR COCHES *******************************");
//	    for(Coche co:coches) {
//	    	if(co.getnPuertas()==3) {
//	    		coches.remove(co);
//	    	}
//	    }
	    
	    ArrayList<Coche>coches3puertas=new ArrayList<Coche>();
	    for (int i=0;i< coches.size(); i++) {
			if(coches.get(i).getnPuertas()==3) {
				coches3puertas.add(coches.remove(i));
				i--;
			}
		}
	    
	    for (Coche co : coches3puertas) {
			System.out.println(co);
	    }
		//Matrículas que tengan F
		for (Coche co : coches3puertas) {
			if(co.getMatricula().contains("F"))
				System.out.println(co.getMatricula());
		}
	    
	}
}
