package ejercicioGestioNAparcamiento;

public class Moto extends Vehiculo {

	// Atributos
	private String tipo;
	private int cilindrada;
	private String carnet;
	
	// Constructor con todos los parámetros
	public Moto(String matricula, String color, String marca, String modelo, String tipo, int cilindrada,
			String carnet) {
		super(matricula, color, marca, modelo);
		this.tipo = tipo;
		this.cilindrada = cilindrada;
		this.carnet = carnet;
	}
	
	// Constructor por defceto
	public Moto() {
		super();
		this.tipo = "";
		this.cilindrada = 0;
		this.carnet = "";
	}

	// Getters y Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	// ToString
	@Override
	public String toString() {
		return "Moto [tipo=" + tipo + ", cilindrada=" + cilindrada + ", carnet=" + carnet + ", matricula=" + matricula
				+ ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + "]";
	}

}
