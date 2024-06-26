package examenGimnasio;

public class Cliente extends Persona{
	
	// Atributos
	private String metodoPago;
	private double cuota;
	
	// Constructor con todos los parámetros
	public Cliente(String dni, String nommbre, String apellidos, String correo, String metodoPago, double cuota) {
		super(dni, nommbre, apellidos, correo);
		this.metodoPago = metodoPago;
		this.cuota = cuota;
	}
	
	// Constructor por defecto
	public Cliente() {
		super();
		this.metodoPago = "";
		this.cuota = 0;
	}

	// Getters y Setters
	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	// ToString
	@Override
	public String toString() {
		return "Cliente [metodoPago=" + metodoPago + ", cuota=" + cuota + ", dni=" + dni + ", nommbre=" + nommbre
				+ ", apellidos=" + apellidos + ", correo=" + correo + "]";
	}

}
