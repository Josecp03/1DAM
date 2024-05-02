package videoClub;

public class Alquiler {
	private DVD dvd;
	private int tiempo;
	
	//constructor con parámeetros
	public Alquiler(DVD dvd, int tiempo) {
		this.dvd = dvd;
		this.tiempo = tiempo;
	}
	
	//constructor por defecto
	public Alquiler() {
		this.dvd=new DVD();
		this.tiempo=0;
	}

	//getters y setters
	public DVD getDvd() {
		return dvd;
	}

	public void setDvd(DVD dvd) {
		this.dvd = dvd;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	//toString
	@Override
	public String toString() {
		return "Alquiler [dvd=" + dvd + ", tiempo=" + tiempo + "]";
	}
	
	public static void main(String[] args) {
		DVD mulan=new DVD ("Mulan",DVD.INFANTIL);
		Alquiler a=new Alquiler(mulan,3);
		System.out.println(a);
	}
	
}
