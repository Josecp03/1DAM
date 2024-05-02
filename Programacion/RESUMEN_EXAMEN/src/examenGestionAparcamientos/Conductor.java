package examenGestionAparcamientos;

public class Conductor extends Persona{

	// Atributos
	private int codigo;
	private int turno;
	
	// Constructor con todos los parámetros
	public Conductor(int codigo, int turno, String dni, String nombre, String apellidos, int edad, String direccion, String email) {
		super(dni, nombre, apellidos, edad, direccion, email);
		this.codigo = codigo;
		this.turno = turno;
	}
	
	// Constructor por defecto
	public Conductor() {
		super();
		this.codigo = 0;
		this.turno = 1;
	}

	// Getters y Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	// ToString
	@Override
	public String toString() {
		return "Conductor [codigo=" + codigo + ", turno=" + turno + ", dni=" + dni + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", edad=" + edad + ", direccion=" + direccion + ", email=" + email + "]";
	}
	
	
}
