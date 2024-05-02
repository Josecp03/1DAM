package examenGestionAparcamientos;

public class Coche extends Vehiculo{

	// Atributos
	private int numPuertas;

	// Constructor con todos los parámetros
	public Coche(String matricula, String color, String marca, String modelo, int numPuertas) {
		super(matricula, color, marca, modelo);
		this.numPuertas = numPuertas;
	}
	
	// Constructor por defecto
	public Coche() {
		super();
		this.numPuertas = 0;
	}

	// Getters y Setters
	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	// ToString
	@Override
	public String toString() {
		return "Coche [numPuertas=" + numPuertas + ", matricula=" + matricula + ", color=" + color + ", marca=" + marca
				+ ", modelo=" + modelo + "]";
	}
	
	
}
