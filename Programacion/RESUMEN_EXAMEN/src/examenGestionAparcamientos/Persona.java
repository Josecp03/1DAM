package examenGestionAparcamientos;

import java.io.Serializable;

public abstract class Persona implements Valida,Serializable{

	// Atributos
	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	protected String direccion;
	protected String email;
	
	// Constructor con todos los parámetros
	public Persona(String dni, String nombre, String apellidos, int edad, String direccion, String email) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.direccion = direccion;
		this.email = email;
	}
	
	// Constructor por defecto
	public Persona() {
		this.dni = "";
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
		this.direccion = "";
		this.email = "";
	}

	// Getters y Setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

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
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	// ToString
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", direccion=" + direccion + ", email=" + email + "]";
	}
	
	// Método válida
	@Override
	public boolean valida(String cadena) {
		String nif=cadena.substring(0,8);
		int posicionLetra=Integer.parseInt(nif)%23;
		String[]letras={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		String letra=letras[posicionLetra];
		return cadena.matches("[0-9]{8}"+letra);
	}
	
	public static void main(String[] args) {
		String cadena="04864688G";
		String nif=cadena.substring(0,8);
		System.out.println(nif);
		int posicionLetra=Integer.parseInt(nif)%23;
		System.out.println(posicionLetra);
		String[]letras={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		String letra=letras[posicionLetra];
		System.out.println(letra);
	}
}
