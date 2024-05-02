package json;

public class Actor {

	// Atributos
	private String nombre;
	private String apellido;
	private String edad;
	private String peliculas;
	private String pais;
	
	// Constructor con todos los parámetros
	public Actor(String nombre, String apellido, String edad, String peliculas, String pais) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.peliculas = peliculas;
		this.pais = pais;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(String peliculas) {
		this.peliculas = peliculas;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	// ToString
	@Override
	public String toString() {
		return "Actor [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", peliculas=" + peliculas
				+ ", pais=" + pais + "]";
	}
	
	
	
	
}
