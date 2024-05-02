package ejercicioPendientes23;

public abstract class Persona {
	
	//Atributos
	private int codigo;
	private String nombre;
	private String apellidos;
	private String email;
	
	//Constructores
	//Constructor con todos los parámetros
	public Persona(int codigo, String nombre, String apellidos, String email) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}
	
	//Constructor por defecto
	public Persona() {
		this.codigo = 0;
		this.nombre = "";
		this.apellidos = "";
		this.email = "";
	}

	//Getters y Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//toString
	@Override
	public String toString() {
		return "Persona [codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email
				+ "]";
	}
	
}
