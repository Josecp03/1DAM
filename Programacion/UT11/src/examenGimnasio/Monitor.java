package examenGimnasio;

import java.util.ArrayList;

public class Monitor extends Persona{

	// Atributos
	private int codigoMonitor;
	private String clave;
	private ArrayList<Clase>clasesImpartidas;
	private double extraClases;
	private double extraAlumnos;
	public static final double BASE = 1200;
	
	// Constructor con todos los parámetros
	public Monitor(String dni, String nommbre, String apellidos, String correo, int codigoMonitor, String clave,
			ArrayList<Clase> clasesImpartidas, double extraClases, double extraAlumnos) {
		super(dni, nommbre, apellidos, correo);
		this.codigoMonitor = codigoMonitor;
		this.clave = clave;
		this.clasesImpartidas = clasesImpartidas;
		this.extraClases = extraClases;
		this.extraAlumnos = extraAlumnos;
	}
	
	// Constructor con todos los parámetros menos el AL
	public Monitor(String dni, String nommbre, String apellidos, String correo, int codigoMonitor, String clave,
			 double extraClases, double extraAlumnos) {
		super(dni, nommbre, apellidos, correo);
		this.codigoMonitor = codigoMonitor;
		this.clave = clave;
		this.clasesImpartidas = new ArrayList<Clase>();
		this.extraClases = extraClases;
		this.extraAlumnos = extraAlumnos;
	}

	// Constructor por defecto
	public Monitor() {
		super();
		this.codigoMonitor = 0;
		this.clave = "";
		this.clasesImpartidas = new ArrayList<Clase>();
		this.extraClases = 0;
		this.extraAlumnos = 0;
	}
	
	// Getters y Setters
	public int getCodigoMonitor() {
		return codigoMonitor;
	}
	
	public void setCodigoMonitor(int codigoMonitor) {
		this.codigoMonitor = codigoMonitor;
	}
	
	public String getClave() {
		return clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public ArrayList<Clase> getClasesImpartidas() {
		return clasesImpartidas;
	}
	
	public void setClasesImpartidas(ArrayList<Clase> clasesImpartidas) {
		this.clasesImpartidas = clasesImpartidas;
	}
	
	public double getExtraClases() {
		return extraClases;
	}
	
	public void setExtraClases(double extraClases) {
		this.extraClases = extraClases;
	}
	
	public double getExtraAlumnos() {
		return extraAlumnos;
	}
	
	public void setExtraAlumnos(double extraAlumnos) {
		this.extraAlumnos = extraAlumnos;
	}
	
	public static double getBase() {
		return BASE;
	}

	// ToString
	@Override
	public String toString() {
		return "Monitor [codigoMonitor=" + codigoMonitor + ", clave=" + clave + ", clasesImpartidas=" + clasesImpartidas
				+ ", extraClases=" + extraClases + ", extraAlumnos=" + extraAlumnos + ", dni=" + dni + ", nommbre="
				+ nommbre + ", apellidos=" + apellidos + ", correo=" + correo + "]";
	}
	
}
