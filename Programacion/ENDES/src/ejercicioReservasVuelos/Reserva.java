package ejercicioReservasVuelos;

public class Reserva {

	// Atributos
	private String origen;
	private String destino;
	private String fechaSalida;
	private String clase;
	private int numPasajeros;
		
	// Constructor con todos los parámetros
	public Reserva(String origen, String destino, String fechaSalida, String clase, int numPasajeros) {
		this.origen = origen;
		this.destino = destino;
		this.fechaSalida = fechaSalida;
		this.clase = clase;
		this.numPasajeros = numPasajeros;
	}
	
	// Constructor por defecto
	public Reserva() {
		this.origen = "";
		this.destino = "";
		this.fechaSalida = "";
		this.clase = "";
		this.numPasajeros = 0;
	}

	// Getters y Setters
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
	
}
