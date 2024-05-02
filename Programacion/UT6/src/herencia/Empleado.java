package herencia;

public class Empleado extends Trabajador{
	//Atributos propios de empleado
	private double impuestos;
	private double sueldo;
	private static final int PAGAS=14;
	
	//constructor por defcto Source/Generate constructors from SuperClass
	public Empleado() {
		super();//constructor por defecto de la superClase
		this.sueldo=0;
		this.impuestos=0;
	}
	
	// Source/Generate using fields (Cambiar barra de arriba)
	public Empleado(String nombre, String apellidos, String dni, String direccion, double sueldo) {
		super(nombre, apellidos, dni, direccion);
		this.impuestos = 0.3*sueldo;//cambiamos impuestos porque nos lo dice así el ejercicio
		this.sueldo = sueldo;
	}

	//getters y setters
	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	//toString (Seleccionamos también el segundo cuadro)
	@Override
	public String toString() {
		return "Empleado [impuestos=" + impuestos + ", sueldo=" + sueldo + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", dni=" + dni + ", direccion=" + direccion + "]";
	}
	
	public double calcularPaga() {
		return((this.sueldo-this.impuestos)/PAGAS);
	}
	
	
	
}
