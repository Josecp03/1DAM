package examenGestionAparcamientos;

import java.io.Serializable;

public abstract class Vehiculo implements Valida,Serializable{

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

	// To String
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo
				+ "]";
	}
	
	// Método válida
	@Override
	public boolean valida(String cadena) {
		return cadena.matches("^[0-9]{4}-[A-Z]{3}$");
	}
	
	// Método Calcular Precio Aparcamiento
	public double calcularPrecioAparcamiento(int dias) {
		if(this instanceof Coche) {
			return 10*dias;
		} 
		else if(this instanceof Moto) {
			return 5*dias;
		}
		else if(this instanceof Furgoneta) {
			return 15*dias;
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Coche c=new Coche();
		Moto m=new Moto();
		Furgoneta f=new Furgoneta();
		System.out.println(c.calcularPrecioAparcamiento(1));
		System.out.println(m.calcularPrecioAparcamiento(1));
		System.out.println(f.calcularPrecioAparcamiento(1));
	}
}
