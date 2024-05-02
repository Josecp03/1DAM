package ejercicioBoletinNotas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno extends Persona{

	// Atributos
	private ArrayList<Nota>notas;

	// Constructor con todos los parámetros
	public Alumno(int codigo, String dni, String nombre, String apellidos, ArrayList<Nota> notas) {
		super(codigo, dni, nombre, apellidos);
		this.notas = notas;
	}
	
	// Constructor con todos los parámetros menos el AL
	public Alumno(int codigo, String dni, String nombre, String apellidos) {
		super(codigo, dni, nombre, apellidos);
		this.notas = new ArrayList<Nota>();
	}
	
	// Constructor por defecto
	public Alumno() {
		super();
		this.notas = new ArrayList<Nota>();
	}

	// Getters y Setters
	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	// To String
	@Override
	public String toString() {
		return "Alumno [notas=" + notas + "]";
	}
	
	// Método Cargar Notas
	public void cargarNotas(String filename) {
        try {
        	String cadena;
            String[] linea;
        	Scanner entrada=new Scanner(new File(filename));
        	entrada.nextLine();
        	while(entrada.hasNext()) {
        		cadena=entrada.nextLine();
        		linea=cadena.split(";");
        		if (Integer.parseInt(linea[2])==this.getCodigo()) {
        			this.getNotas().add(new Nota(Integer.parseInt(linea[0]), linea[1], Integer.parseInt(linea[2]), Integer.parseInt(linea[3])));
        		}
        	}
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
			e.printStackTrace();
		}
	}
	
	// Prueba Unitaria
	public static void main(String[] args) {
		double suma=0;
		Alumno a=new Alumno(502, "", "Mario", "Lopez");
		a.cargarNotas("Alumnos.csv");
		System.out.println(a.getNombre()+" "+a.getApellidos()+" tiene las siguientes notas:");
		for (Nota n : a.getNotas()) {
			System.out.println("\t"+n);
			suma+=n.getNota();
		}
		System.out.println("La nota media es: "+suma/a.getNotas().size());
	}
	
	
	
	
}
