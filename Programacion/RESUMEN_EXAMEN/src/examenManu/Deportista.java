package examenManu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Deportista extends Persona {
	// Variables propias de la clase
	private int federado; // 1 es que si, 0, esque no
	private int numero;
	private int codEntrenador;
	private ArrayList<Estadisticas> est;

	// Constructor predefinido
	public Deportista() {
		super();
		this.federado = 0;
		this.numero = 0;
		this.codEntrenador = 0;
		this.est = new ArrayList<Estadisticas>();
	}

	// Constructor con todos los parametros
	public Deportista(String nombre, String apes, String dni, int edad, int federado, int numero, int codEntrenador) {
		super(nombre, apes, dni, edad);
		this.federado = federado;
		this.numero = numero;
		this.codEntrenador = codEntrenador;
		this.est = new ArrayList<Estadisticas>();
	}

	// Getters y Setters
	public int getFederado() {
		return federado;
	}

	public void setFederado(int federado) {
		this.federado = federado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCodEntrenador() {
		return codEntrenador;
	}

	public void setCodEntrenador(int codEntrenador) {
		this.codEntrenador = codEntrenador;
	}

	public ArrayList<Estadisticas> getEst() {
		return est;
	}

	public void setEst(ArrayList<Estadisticas> est) {
		this.est = est;
	}

	// toString
	@Override
	public String toString() {
		return "Deportista [federado=" + federado + ", numero=" + numero + ", nombre=" + nombre + ", apes=" + apes
				+ ", dni=" + dni + ", edad=" + edad + "]";
	}

	// Metodo para cargar las estadisticas
	public void cargarEstadisticas(String filename) {
		try {
			Scanner entrada = new Scanner(new File(filename));
			entrada.nextLine();
			while (entrada.hasNext()) {
				String cadena = entrada.nextLine();
				String[] linea = cadena.split(";");

				String dni = linea[0];
				int goles = Integer.parseInt(linea[1]);
				int asis = Integer.parseInt(linea[2]);
				int tarjetas = Integer.parseInt(linea[3]);
				int premios = Integer.parseInt(linea[4]);

				this.getEst().add(new Estadisticas(dni, goles, asis, tarjetas, premios));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Metodo para seleccionar las estadisticas de cada jugador
	public ArrayList<Estadisticas> seleccionarEst(String dni){
		ArrayList<Estadisticas> es1 = new ArrayList<Estadisticas>();
		for (Estadisticas estadisticas : this.getEst()) {
			if(estadisticas.getDni().equals(dni)) {
				es1.add(estadisticas);
			}
		}
		return es1;
	}
}