package actividades;

public class Direccion {
	private String nombreCalle;
	private String numeroPortal;
	private int numeroPiso;
	private int numeroPuerta;
	private int codigoPostal;
	
	//constructor por defecto
	public Direccion(){
		this.nombreCalle="";
		this.numeroPortal="";
		this.numeroPiso=0;
		this.numeroPuerta=0;
		this.codigoPostal=0;
	}

	//constructor con todos los parámetros
	public Direccion(String nombreCalle, String numeroPortal, int numeroPiso, int numeroPuerta, int codigoPostal) {
		this.nombreCalle = nombreCalle;
		this.numeroPortal = numeroPortal;
		this.numeroPiso = 0;
		this.numeroPuerta = 0;
		this.codigoPostal = codigoPostal;
	}

	//getters y setters
	public String getNombreCalle() {
		return nombreCalle;
	}

	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}

	public String getNumeroPortal() {
		return numeroPortal;
	}

	public void setNumeroPortal(String numeroPortal) {
		this.numeroPortal = numeroPortal;
	}

	public int getNumeroPiso() {
		return numeroPiso;
	}

	public void setNumeroPiso(int numeroPiso) {
		this.numeroPiso = numeroPiso;
	}

	public int getNumeroPuerta() {
		return numeroPuerta;
	}

	public void setNumeroPuerta(int numeroPuerta) {
		this.numeroPuerta = numeroPuerta;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	//toString
	@Override
	public String toString() {
		return "Direccion [nombreCalle=" + nombreCalle + ", numeroPortal=" + numeroPortal + ", numeroPiso=" + numeroPiso
				+ ", numeroPuerta=" + numeroPuerta + ", codigoPostal=" + codigoPostal + "]";
	}
	
	public static void main(String[]args) {
		Direccion direccion=new Direccion("Isaac Albéniz","122A",2,4,45638);
		System.out.println(direccion);
	}
}
