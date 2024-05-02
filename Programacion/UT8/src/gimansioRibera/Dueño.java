package gimansioRibera;

public class Dueño extends Persona{

	// Atributos
	private String telefono;

	// Constructor con todos los parámetros
	public Dueño(String codigo, String nombre, String apellidos, String correo, String telefono) {
		super(codigo, nombre, apellidos, correo);
		this.telefono = telefono;
	}
	
	// Constructor por defecto
	public Dueño() {
		super();
		this.telefono = "";
	}

	// Getters y Setters
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	// To String
	@Override
	public String toString() {
		return "Dueño [telefono=" + telefono + ", codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", correo=" + correo + "]";
	}

	
	
	
	
	
	
}
