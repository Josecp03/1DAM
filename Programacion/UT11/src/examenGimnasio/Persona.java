package examenGimnasio;

public class Persona {

	// Atributos
	protected String dni;
	protected String nommbre;
	protected String apellidos;
	protected String correo;
	
	// Constructor con todos los parámetros
	public Persona(String dni, String nommbre, String apellidos, String correo) {
		this.dni = dni;
		this.nommbre = nommbre;
		this.apellidos = apellidos;
		this.correo = correo;
	}
	
	// Constructor por defecto
	public Persona() {
		this.dni = "";
		this.nommbre = "";
		this.apellidos = "";
		this.correo = "";
	}

	// Getters y Setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNommbre() {
		return nommbre;
	}

	public void setNommbre(String nommbre) {
		this.nommbre = nommbre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
