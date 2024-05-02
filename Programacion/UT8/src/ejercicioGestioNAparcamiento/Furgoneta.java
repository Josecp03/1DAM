package ejercicioGestioNAparcamiento;

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

	// Getters y Settres
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
	
	// Prueba Unitaria
	public static void main(String[] args) {
		Coche c=new Coche("2865HDG", "Gris", "Opel", "Corsa", 4);
		Moto m=new Moto("87373SJK", "Rojo", "BMW", "1.2GT", "", 2627, "");
		Furgoneta f=new Furgoneta("846684HJ", "Azul", "Mercedes", "F1", 400);
		System.out.println(c);
		System.out.println(m);
		System.out.println(f);
	}
}
