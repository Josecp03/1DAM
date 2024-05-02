package examenFruteria;

public abstract class Persona {

	// Aributos
	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected String direccion;
	
	// Constructor con todos los parámetros
	public Persona(String dni, String nombre, String apellidos, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}
	
	// Constructor por defecto
	public Persona() {
		this.dni = "";
		this.nombre = "";
		this.apellidos = "";
		this.direccion = "";
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
		
}
