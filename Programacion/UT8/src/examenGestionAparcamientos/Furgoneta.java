package examenGestionAparcamientos;

public class Furgoneta extends Vehiculo{

	// Atributos
	private int capacidad;

	// Constructor con todos los parámetros
	public Furgoneta(String matricula, String color, String marca, String modelo, int capacidad) {
		super(matricula, color, marca, modelo);
		this.capacidad = capacidad;
	}
	
	// Constructor por defecto
	public Furgoneta() {
		super();
		this.capacidad = 0;
	}

	// Getters y Setters
	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	// ToString
	@Override
	public String toString() {
		return "Furgoneta [capacidad=" + capacidad + ", matricula=" + matricula + ", color=" + color + ", marca="
				+ marca + ", modelo=" + modelo + "]";
	}
	
}
