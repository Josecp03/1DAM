package gimansioRibera;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Monitor extends Persona{

	// Atributos
	private ArrayList<ActividadReservada>listaActividades;

	// Constructor por defecto
	public Monitor() {
		super();
		this.listaActividades = new ArrayList<ActividadReservada>();
	}
	
	// Constructor con todos los parámetros menos el AL
	public Monitor(String codigo, String nombre, String apellidos, String correo) {
		super(codigo, nombre, apellidos, correo);
		this.listaActividades = new ArrayList<ActividadReservada>();
	}

	// Constructor con todos los parámetros
	public Monitor(String codigo, String nombre, String apellidos, String correo,
			ArrayList<ActividadReservada> listaActividades) {
		super(codigo, nombre, apellidos, correo);
		this.listaActividades = listaActividades;
	}

	// Getters y Setters
	public ArrayList<ActividadReservada> getListaActividades() {
		return listaActividades;
	}

	public void setListaActividades(ArrayList<ActividadReservada> listaActividades) {
		this.listaActividades = listaActividades;
	}

	// To String
	@Override
	public String toString() {
		return "Monitor [listaActividades=" + listaActividades + ", codigo=" + codigo + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", correo=" + correo + "]";
	}
	
	// Método Imprimir Actividades
	public void imprimirActividades() {
		System.out.println("Las actividades impartidas por el monitor "+this.getCodigo()+" son :");
		for (ActividadReservada a : this.getListaActividades()) {
			System.out.println(a.getNombre()+" a las "+a.getHora()+" tiene "+a.getnPar()+" participantes");
		}
	}
	
	// Método Imprimir Actividades
	public void imprimirPlazasActividades() {
		for (ActividadReservada a : this.getListaActividades()) {
			System.out.println(a.getnMax()-a.getnPar()+" plazas disponibles para "+a.getNombre()+" a las "+a.getHora());
		}
	}
	
	// Método Cargar Actividades
	public void cargaActividades() {
		String cadena;
        String[] linea;
        try {
        	Scanner entrada=new Scanner(new File("reservaPendientes.csv"));
        	entrada.nextLine();
        	while(entrada.hasNext()) {
        		cadena=entrada.nextLine();
        		linea=cadena.split(";");
        		if (linea[2].equals(this.getCodigo())) {
        			this.getListaActividades().add(new ActividadReservada(linea[0], Double.parseDouble(linea[1]), linea[2], Integer.parseInt(linea[3]), Integer.parseInt(linea[4])));
        		}
        	}
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Monitor m=new Monitor("500", "Olivia", "Fernández", "olivia@gmail.com");
		m.cargaActividades();
		m.imprimirActividades();
		
		
		
	}
	
	
}
