package examenFruteria;

public class Cliente extends Persona {
	
	// Atributos
	private String metodoPago;

	// Constructor con todos los parámetros
	public Cliente(String dni, String nombre, String apellidos, String direccion, String metodoPago) {
		super(dni, nombre, apellidos, direccion);
		this.metodoPago = metodoPago;
	}
	
	// Constructor con todos los parámetros
	public Cliente() {
		super();
		this.metodoPago = "";
	}

	// Getters y Setters
	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	// ToString
	@Override
	public String toString() {
		return "Cliente [metodoPago=" + metodoPago + ", dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", direccion=" + direccion + "]";
	}
	
}
