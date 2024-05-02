package ejercicioPendientes23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Monitor extends Persona{

	//Atributos
	private ArrayList<ActividadReservada>actividades;

	//Constructores
	//Constructor con todos los parámetros
	public Monitor(int codigo, String nombre, String apellidos, String email,
			ArrayList<ActividadReservada> actividades) {
		super(codigo, nombre, apellidos, email);
		this.actividades = new ArrayList<ActividadReservada>();
	}

	//Constructor por defecto
	public Monitor() {
		super();
		this.actividades = new ArrayList<ActividadReservada>();
	}

	//Getters y Setters
	public ArrayList<ActividadReservada> getActividades() {
		return actividades;
	}

	public void setActividades(ArrayList<ActividadReservada> actividades) {
		this.actividades = actividades;
	}

	//toString
	@Override
	public String toString() {
		return "Monitor [actividades=" + actividades + "]";
	}
	
	//Métodos
	public void cargaActividades() {
		String cadena;
        String[] linea;
        try {
        	Scanner entrada=new Scanner(new File("reservaPendientes.csv"));
        	entrada.nextLine();
        	while(entrada.hasNext()) {
        		cadena=entrada.nextLine();
        		linea=cadena.split(";");
        		this.getActividades().add(new ActividadReservada(linea[0], linea[1], Integer.parseInt(linea[2]), Integer.parseInt(linea[3]), Integer.parseInt(linea[4])));
        	}
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
			e.printStackTrace();
		}
	}

	//Prueba Unitaria
	public static void main(String[] args) {
		Monitor m=new Monitor();
		m.cargaActividades();
		System.out.println("Las actividades impartidas el monitor de código 100 son:");
		for (ActividadReservada a : m.getActividades() ) {
			if(a.getCodigoMonitor()==100)
				System.out.println(a.getNombreActividad()+" a las "+a.getHora()+" tiene "+a.getNumParticipantes()+" participantes");
		}
		
	}
	
	
}
