package actividadClientes;

import java.util.ArrayList;

public class Cliente {

	// Atributos
	private String nombre;
	private long edad;
	private String ciudad;
	private ArrayList<Producto>compras;
	
	// Constructor con todos los parámetros
	public Cliente(String nombre, long edad, String ciudad, ArrayList<Producto> compras) {
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
		this.compras = compras;
	}
	
	// Constructor con todos los parámetros menos el AL
	public Cliente(String nombre, long edad, String ciudad) {
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
		this.compras = new ArrayList<Producto>();
	}
	
	// Constructor por defecto
	public Cliente() {
		this.nombre = "";
		this.edad = 0;
		this.ciudad = "";
		this.compras = new ArrayList<Producto>();
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getEdad() {
		return edad;
	}

	public void setEdad(long edad) {
		this.edad = edad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public ArrayList<Producto> getCompras() {
		return compras;
	}

	public void setCompras(ArrayList<Producto> compras) {
		this.compras = compras;
	}

	// ToString
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + ", ciudad=" + ciudad + ", compras=" + compras + "]";
	}
	
}
