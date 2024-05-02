package practica;

public class Cancion {

	// Atributos
	private int codigo;
	private String disco;
	private String nombre;
	private int duracion;
	
	// Constructor con todos los parámetros
	public Cancion(int codigo, String disco, String nombre, int duracion) {
		this.codigo = codigo;
		this.disco = disco;
		this.nombre = nombre;
		this.duracion = duracion;
	}
	
	// Constructor por defecto
	public Cancion() {
		this.codigo = 0;
		this.disco = "";
		this.nombre = "";
		this.duracion = 0;
	}

	// Getters y Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDisco() {
		return disco;
	}

	public void setDisco(String disco) {
		this.disco = disco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

}
