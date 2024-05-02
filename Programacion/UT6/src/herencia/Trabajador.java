package herencia;

//superclase
public class Trabajador {
	
	protected String nombre;
	protected String apellidos;
	protected String dni;
	protected String direccion;
	
	//constructor por defecto
	public Trabajador() {
		this.nombre = "2";
		this.apellidos = "";
		this.dni = "";
		this.direccion = "";
	}
	
	//constructor con todos los parámetros
	public Trabajador(String nombre, String apellidos, String dni, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
	}

	//getters y setters
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	//toString
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", direccion=" + direccion
				+ "]";
	}

	//Método para calcular la paga
	public double calcularPaga() {
		return 0;
	}
	
}
