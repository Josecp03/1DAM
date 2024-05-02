package examenGimnasio;

public class Gerente extends Persona {

	// Atributos
	private String telefono;

	// Constructor con todos los parámetros
	public Gerente(String dni, String nommbre, String apellidos, String correo, String telefono) {
		super(dni, nommbre, apellidos, correo);
		this.telefono = telefono;
	}
	
	// Constructor por defecto
	public Gerente() {
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

	// ToString
	@Override
	public String toString() {
		return "Gerente [telefono=" + telefono + ", dni=" + dni + ", nommbre=" + nommbre + ", apellidos=" + apellidos
				+ ", correo=" + correo + "]";
	}
	
}