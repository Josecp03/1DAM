package Clinica;

public class Profesional extends Persona {

	// Atributos
	private String especialidad;
	private int turno;
	int MAÑANA=0;
	int TARDE=1;
	int GUADIA=2;
	
	// Constructor con todos los parámetros
	public Profesional(String dni, String nombre, String apellidos, String telefono, String especialidad, int turno) {
		super(dni, nombre, apellidos, telefono);
		this.especialidad = especialidad;
		this.turno = turno;
	}
	
	// Constructor por defecto
	public Profesional() {
		super();
		this.especialidad = "";
		this.turno = 1;
	}

	// Getters y Setters
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
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
		return "Profesional [especialidad=" + especialidad + ", turno=" + turno + ", getDni()=" + getDni()
				+ ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getTelefono()="
				+ getTelefono() + "]";
	}
	
}
