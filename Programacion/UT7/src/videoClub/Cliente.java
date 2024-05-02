package videoClub;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private ArrayList<Alquiler>alquilerCliente;
	
	
	//constructor por defecto
	public Cliente() {
		this.nombre="";
		this.alquilerCliente=new ArrayList<Alquiler>();
	}
	
	//constructor con el nombre
	public Cliente(String nombre) {
		this.nombre = nombre;
		this.alquilerCliente=new ArrayList<Alquiler>();
	}

	//constructor con todos los parámetros
	public Cliente(String nombre, ArrayList<Alquiler> alquilerCliente) {
		super();
		this.nombre = nombre;
		this.alquilerCliente = alquilerCliente;
	}

	//getters y setters
	
	
	public void nuevoAlquiler(Alquiler a) {
		this.getAlquilerCliente().add(a);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Alquiler> getAlquilerCliente() {
		return alquilerCliente;
	}

	public void setAlquilerCliente(ArrayList<Alquiler> alquilerCliente) {
		this.alquilerCliente = alquilerCliente;
	}

	public void informeAlquiler() {
		//Para cada alquiler el tipo del dvd y el número de días
		int tipo=0;
		double suma=0;
		double eurosDVD=0;
		int puntos=this.getAlquilerCliente().size();//Tamaño del AL
		for(Alquiler a: this.getAlquilerCliente()) {
			tipo=a.getDvd().getTipo();
			switch (tipo) {
			case DVD.NORMAL:
				eurosDVD=2*a.getTiempo();
				break;
			case DVD.INFANTIL:
				eurosDVD=1.5*a.getTiempo();
				break;
			case DVD.NOVEDAD:
				if(a.getTiempo()>1)
					puntos++;
				eurosDVD=3*a.getTiempo();
				break;
			}
			System.out.println("\t "+a.getDvd().getNombre()+" "+eurosDVD+"€");
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

