package examenManu;

import java.io.Serializable;

public abstract class Persona implements Valida, Serializable{
	// Variables propias de la clase
	protected String nombre;
	protected String apes;
	protected String dni;
	protected int edad;
	
	// Constructor predefinido
	public Persona() {
		super();
		this.nombre = "";
		this.apes = "";
		this.dni = "";
		this.edad = 0;
	}

	// Constructor con todos los parametros
	public Persona(String nombre, String apes, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.apes = apes;
		this.dni = dni;
		this.edad = edad;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApes() {
		return apes;
	}

	public void setApes(String apes) {
		this.apes = apes;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apes=" + apes + ", dni=" + dni + ", edad=" + edad + "]";
	}
	
	// Metodo para validar el dni
	public boolean val(String cadena) {
		return cadena.matches("^[0-9]{8}+[A-Z]{1}+$");
	}
}