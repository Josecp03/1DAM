package ejercicioBoletinNotas;

public class Profesor extends Persona{

	// Atributos
	private String titulacion;

	// Constructor con todos los parámetros
	public Profesor(int codigo, String dni, String nombre, String apellidos, String titulacion) {
		super(codigo, dni, nombre, apellidos);
		this.titulacion = titulacion;
	}

	// Constructor por defceto
	public Profesor() {
		super();
		this.titulacion = "";
	}

	// Getters y Setters
	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	// ToString
	@Override
	public String toString() {
		return "Profesor [titulacion=" + titulacion + ", codigo=" + codigo + ", dni=" + dni + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + "]";
	}
	
	
	
	
	
	
}
