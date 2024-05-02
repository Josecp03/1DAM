package ejercicioBoletinNotas;

public class Persona {

	// Atributos
	protected int codigo;
	protected String dni;
	protected String nombre;
	protected String apellidos;
	
	// Constructor con todos los parámetros
	public Persona(int codigo, String dni, String nombre, String apellidos) {
		this.codigo = codigo;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	// Constructor por defecto
	public Persona() {
		this.codigo = 0;
		this.dni = "";
		this.nombre = "";
		this.apellidos = "";
	}

	// Getters y Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

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

	// ToString
	@Override
	public String toString() {
		return "Persona [codigo=" + codigo + ", dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	
}
