package ejercicioNotas;

import java.util.Arrays;

public class Alumno {
	
	//Atributos
	private String nombre;
	private String apellidos;
	private int edad;
	private Nota[]notas;
	
	//Constructores
	//Constructor con todos los parámetros
	public Alumno(String nombre, String apellidos, int edad, Nota[] notas) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.notas = notas;
	}
	
	//Constructor por defecto
	public Alumno() {
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
		this.notas=new Nota[7];
		for (int i = 0; i < notas.length; i++) {
			notas[i]=new Nota();
		}
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Nota[] getNotas() {
		return notas;
	}

	public void setNotas(Nota[] notas) {
		this.notas = notas;
	}

	//toString
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", notas="
				+ Arrays.toString(notas) + "]";
	}
	
	
	
	
}
