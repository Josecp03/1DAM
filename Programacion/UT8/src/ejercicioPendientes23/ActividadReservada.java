package ejercicioPendientes23;

public class ActividadReservada {
	
	//Atributos
	private String nombreActividad;
	private String hora;
	private int codigoMonitor;
	private int nMax;
	private int nParticipantes;
	
	//Constructores
	//Constructor con todos los parámetros
	public ActividadReservada(String nombreActividad, String hora, int codigoMonitor, int numMaxParticipantes,
			int numParticipantes) {
		this.nombreActividad = nombreActividad;
		this.hora = hora;
		this.codigoMonitor = codigoMonitor;
		this.nMax = numMaxParticipantes;
		this.nParticipantes = numParticipantes;
	}
	
	//Constructor por defecto
	public ActividadReservada() {
		this.nombreActividad = "";
		this.hora = "";
		this.codigoMonitor = 0;
		this.nMax = 0;
		this.nParticipantes = 0;
	}

	//Getters y Setters
	public String getNombreActividad() {
		return nombreActividad;
	}

	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getCodigoMonitor() {
		return codigoMonitor;
	}

	public void setCodigoMonitor(int codigoMonitor) {
		this.codigoMonitor = codigoMonitor;
	}

	public int getNumMaxParticipantes() {
		return nMax;
	}

	public void setNumMaxParticipantes(int numMaxParticipantes) {
		this.nMax = numMaxParticipantes;
	}

	public int getNumParticipantes() {
		return nParticipantes;
	}

	public void setNumParticipantes(int numParticipantes) {
		this.nParticipantes = numParticipantes;
	}

	//toString
	@Override
	public String toString() {
		return "ActividadReservada [nombreActividad=" + nombreActividad + ", hora=" + hora + ", codigoMonitor="
				+ codigoMonitor + ", numMaxParticipantes=" + nMax + ", numParticipantes="
				+ nParticipantes + "]";
	}
	
}
