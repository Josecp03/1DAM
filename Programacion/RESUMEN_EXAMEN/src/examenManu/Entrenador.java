package examenManu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Entrenador extends Persona{
	// Variables propias de la clase
	private ArrayList<Deportista> equipo;
	private int titulos;
	
	// Constructor predefinido
	public Entrenador() {
		super();
		this.equipo = new ArrayList<Deportista>();
		this.titulos = 0;
	}
	
	// Constructor con todos los parametros
	public Entrenador(String nombre, String apes, String dni, int edad, ArrayList<Deportista> equipo, int titulos) {
		super(nombre, apes, dni, edad);
		this.equipo = equipo;
		this.titulos = titulos;
	}

	// Getters y Setters
	public ArrayList<Deportista> getEquipo() {
		return equipo;
	}

	public void setEquipo(ArrayList<Deportista> equipo) {
		this.equipo = equipo;
	}

	public int getTitulos() {
		return titulos;
	}

	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}

	// toString
	@Override
	public String toString() {
		return "Entrenador [equipo=" + equipo + ", titulos=" + titulos + ", nombre=" + nombre + ", apes=" + apes
				+ ", dni=" + dni + ", edad=" + edad + "]";
	}
	
	// Metodo para cargar los Deportistas
	public void cargarDepor(String filename) {
		try {
			Scanner sc = new Scanner(new File(filename));
			sc.nextLine();
			while(sc.hasNext()) {
				String cadena = sc.nextLine();
				String [] linea = cadena.split(";");
				
				String nombre = linea[0];
				String ape = linea[1];
				String dni = linea[2];
				int edad = Integer.parseInt(linea[3]);
				int federado = Integer.parseInt(linea[4]);
				int numero = Integer.parseInt(linea[5]);
				int cod = Integer.parseInt(linea[6]);
				
				this.getEquipo().add(new Deportista(nombre, ape, dni, edad, federado, numero, cod));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Metodo para seleccionar los deportistas por Cod de Entrenador
	public ArrayList<Deportista> seleccionarDepor(int cod){
		ArrayList<Deportista> eq = new ArrayList<Deportista>();
		for (Deportista deportista : this.getEquipo()) {
			if(deportista.getCodEntrenador()==cod) {
				eq.add(deportista);
			}
		}
		return eq;
	}
}