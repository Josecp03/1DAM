package ejercicioGestioNAparcamiento;

public abstract class Vehiculo {
	
	// Atributos
	protected String matricula;
	protected String color;
	protected String marca;
	protected String modelo;
	
	// Constructor con todos los parámetros
	public Vehiculo(String matricula, String color, String marca, String modelo) {
		this.matricula = matricula;
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	// Constructor por defecto
	public Vehiculo() {
		this.matricula = "";
		this.color = "";
		this.marca = "";
		this.modelo = "";
	}
	
	// Getters y Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
