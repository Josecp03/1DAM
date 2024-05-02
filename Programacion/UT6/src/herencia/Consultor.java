package herencia;

public class Consultor extends Trabajador{
	private int horas;
	private double tarifa;
	
	//constructor por defecto
	public Consultor() {
		super();
		this.horas=0;
		this.tarifa=0;
	}

	//constructor con todos los parámetros
	public Consultor(String nombre, String apellidos, String dni, String direccion, int horas, double tarifa) {
		super(nombre, apellidos, dni, direccion);
		this.horas = horas;
		this.tarifa = tarifa;
	}

	//getters y setters
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	//toString
	@Override
	public String toString() {
		return "Consultor [horas=" + horas + ", tarifa=" + tarifa + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", dni=" + dni + ", direccion=" + direccion + "]";
	}

	//Método calcular Paga
	public double calcularPaga() {
		return this.horas*this.tarifa;
	}

	
	
	
	
}
