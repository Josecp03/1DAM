package ejercicioProveedoresPiezas;

import java.util.ArrayList;
import java.io.*;

public class App {

	//Atributos
	private ArrayList<Pieza>piezas;
	private ArrayList<Proveedor>prov;
	
	//Constructor por defecto
	public App() {
		this.piezas=new ArrayList<Pieza>();
		this.prov=new ArrayList<Proveedor>();
	}
	
	//Getters y Setters
	public ArrayList<Pieza> getPiezas() {
		return piezas;
	}

	public void setPiezas(ArrayList<Pieza> piezas) {
		this.piezas = piezas;
	}

	public ArrayList<Proveedor> getProv() {
		return prov;
	}

	public void setProv(ArrayList<Proveedor> prov) {
		this.prov = prov;
	}

	public void generarFichero(String filename) {
		
		try {
			PrintWriter salida=new PrintWriter(new File(filename));
			
			for (Proveedor prov : this.getProv()) {
				salida.println(prov.getNombreProveedor()+" "+prov.getLocalidad()+" tiene:");
				
				for (Pieza pie : this.getPiezas()) {
					if(prov.getCodProveedor()==pie.getProveedor())
					salida.println("\t *"+pie.getNombrePieza().substring(0,1).toUpperCase()+pie.getNombrePieza().substring(1));
				}
			}
			salida.flush();
			salida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//Main
	public static void main(String[] args) throws IOException {
		App app=new App();
		Utilidades u=new Utilidades();
		app.setPiezas(u.leerPiezas("piezas.csv"));
		app.setProv(u.leerProveedor("proveedor.csv"));
		app.generarFichero("proveedoresPiezas.txt");
	}

}
