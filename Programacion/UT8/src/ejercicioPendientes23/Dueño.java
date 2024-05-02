package ejercicioPendientes23;

public class Dueño extends Persona{
	
	//Atributos
	private String telefono;

	//Constructores
	//Constructor con todos los parámetros
	public Dueño(int codigo, String nombre, String apellidos, String email, String telefono) {
		super(codigo, nombre, apellidos, email);
		this.telefono = telefono;
	}
	
	//Constructor por defecto
	public Dueño() {
		super();
		this.telefono = "";
	}

	//Getters y Setters
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	//toString
	@Override
	public String toString() {
		return "Dueño [telefono=" + telefono + "]";
	}
	
}
