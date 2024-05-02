package examenManu;

public class Estadisticas {
	// Variables propias de la clase
	private String dni;
	private int goles;
	private int asistencias;
	private int tarjetas;
	private int premios;
	
	// Constructor predefinido
	public Estadisticas() {
		this.dni = "";
		this.goles = 0;
		this.asistencias = 0;
		this.tarjetas = 0;
		this.premios = 0;
	}

	// Constructor con todos los parametros
	public Estadisticas(String dni, int goles, int asistencias, int tarjetas, int premios) {
		this.dni = dni;
		this.goles = goles;
		this.asistencias = asistencias;
		this.tarjetas = tarjetas;
		this.premios = premios;
	}

	// Getters y Setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public int getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}

	public int getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(int tarjetas) {
		this.tarjetas = tarjetas;
	}

	public int getPremios() {
		return premios;
	}

	public void setPremios(int premios) {
		this.premios = premios;
	}

	// toString
	@Override
	public String toString() {
		return "DNI: "+dni+"\nGoles: "+goles+"\nAsistencias: "+asistencias+"\nPremios: "+premios;
	}
	
	
}