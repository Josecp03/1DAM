package videoClub;

public class Cliente {
	private String nombre;
	private Alquiler[]alquileres;
	private int posicion;
	
	//constructor por defecto
	public Cliente() {
		this.nombre="";
		this.alquileres=new Alquiler[5];
		this.posicion=0;
	}
	
	//constructor con el nombre
	public Cliente(String nombre) {
		this.nombre = nombre;
		this.alquileres=new Alquiler[5];
		this.posicion=0;
	}

	//constructor con todos los parámetros
	public Cliente(String nombre, Alquiler[] alquileres, int posicion) {
		super();
		this.nombre = nombre;
		this.alquileres = alquileres;
		this.posicion = posicion;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Alquiler[] getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(Alquiler[] alquileres) {
		this.alquileres = alquileres;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	public void nuevoAlquiler(Alquiler a) {
		if(this.posicion<5) {
			this.alquileres[posicion]=a;
			this.posicion++;
		}
	}
	
	public void informeAlquiler() {
		//Para cada alquiler el tipo del dvd y el número de días
		int tipo=0;
		double suma=0;
		double eurosDVD=0;
		int puntos=this.getPosicion();
		System.out.println("TICKET para "+this.getNombre()+" :");
		for(int i=0; i<this.getPosicion();i++) {
			tipo=this.getAlquileres()[i].getDvd().getTipo();
			switch (tipo) {
			case DVD.NORMAL:
				eurosDVD=2*this.getAlquileres()[i].getTiempo();
				break;
			case DVD.INFANTIL:
				eurosDVD=1.5*this.getAlquileres()[i].getTiempo();
				break;
			case DVD.NOVEDAD:
				if(this.getAlquileres()[i].getTiempo()>1)
					puntos++;
				eurosDVD=3*this.getAlquileres()[i].getTiempo();
				break;
			}
			System.out.println("\t "+this.getAlquileres()[i].getDvd().getNombre()+"\t "+eurosDVD+"€");
			suma+=eurosDVD;
		}

		System.out.println("Importe total: "+suma+"€");
		System.out.println("Puntos: "+puntos);
		
	}
	
	public static void main(String[]args) {
		DVD casablanca=new DVD("Casablanca",DVD.NORMAL);
		DVD mulan=new DVD("Mulan", DVD.INFANTIL);
		Alquiler a1=new Alquiler(casablanca,3);
		Alquiler a2=new Alquiler(mulan,2);
		Cliente maria=new Cliente("María");
		maria.nuevoAlquiler(a1);
		maria.nuevoAlquiler(a2);
		maria.informeAlquiler();
//		System.out.println("Posicion "+maria.getPosicion());
//		System.out.println("Alquileres "+Arrays.toString(maria.getAlquileres()));
//		System.out.println(maria.getAlquileres()[0].getDvd().getNombre());
//		System.out.println(maria.getAlquileres()[0].getDvd().getTipo());
	}
	
}	

