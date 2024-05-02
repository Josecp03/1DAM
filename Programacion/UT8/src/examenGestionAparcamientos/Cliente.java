package examenGestionAparcamientos;

public class Cliente extends Persona{

	// Atributos
	private int horaLlegada;
	private int diasEstancia;
	private Vehiculo vehiculo;
	
	// Constructor con todos los parámetros
	public Cliente(String dni, String nombre, String apellidos, int edad, String direccion, String email,
			int horaLlegada, int diasEstancia, Vehiculo vehiculo) {
		super(dni, nombre, apellidos, edad, direccion, email);
		this.horaLlegada = horaLlegada;
		this.diasEstancia = diasEstancia;
		this.vehiculo = vehiculo;
	}
	
	// Constructor por defecto
	public Cliente() {
		super();
		this.horaLlegada = 0;
		this.diasEstancia = 0;
		this.vehiculo = null;
	}

	// Getters y Setters
	public int getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(int horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public int getDiasEstancia() {
		return diasEstancia;
	}

	public void setDiasEstancia(int diasEstancia) {
		this.diasEstancia = diasEstancia;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	// ToString
	@Override
	public String toString() {
		return "Cliente [horaLlegada=" + horaLlegada + ", diasEstancia=" + diasEstancia + ", vehiculo=" + vehiculo
				+ ", dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", direccion="
				+ direccion + ", email=" + email + "]";
	}
	
}
