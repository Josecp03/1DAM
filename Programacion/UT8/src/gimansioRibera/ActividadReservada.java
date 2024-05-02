package gimansioRibera;

public class ActividadReservada {
	
	// Atributos
	private String nombre;
	private double hora;
	private String codigoMonitor;
	private int nMax;
	private int nPar;
	
	// Constructor con todos los parámetros
	public ActividadReservada(String nombre, double hora, String codigoMonitor, int nMax, int nPar) {
		this.nombre = nombre;
		this.hora = hora;
		this.codigoMonitor = codigoMonitor;
		this.nMax = nMax;
		this.nPar = nPar;
	}
	
	// Constructor por defecto
	public ActividadReservada() {
		this.nombre = "";
		this.hora = 0;
		this.codigoMonitor = "";
		this.nMax = 0;
		this.nPar = 0;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getHora() {
		return hora;
	}

	public void setHora(double hora) {
		this.hora = hora;
	}

	public String getCodigoMonitor() {
		return codigoMonitor;
	}

	public void setCodigoMonitor(String codigoMonitor) {
		this.codigoMonitor = codigoMonitor;
	}

	public int getnMax() {
		return nMax;
	}

	public void setnMax(int nMax) {
		this.nMax = nMax;
	}

	public int getnPar() {
		return nPar;
	}

	public void setnPar(int nPar) {
		this.nPar = nPar;
	}

	// To String
	@Override
	public String toString() {
		return "ActividadReservada [nombre=" + nombre + ", hora=" + hora + ", codigoMonitor=" + codigoMonitor
				+ ", nMax=" + nMax + ", nPar=" + nPar + "]";
	}
	
	

}
