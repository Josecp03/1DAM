package actividades;

public class Persona {
	private String nombre;
	private String apellidos;
	private Direccion direccion;
	
	//constructor por defecto
	public Persona() {
		this.nombre="";
		this.apellidos="";
		this.direccion=new Direccion();;
	}

	//constructor con todos los parámetros
	public Persona(String nombre, String apellidos, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public static void main(String[]args) {
		Direccion d=new Direccion("Plaza del Pan","Portal 1",1,2,45600);
		Persona p=new Persona("Luisa","Pozo",d);
		System.out.println(p);
		p.setApellidos("Perez");
		System.out.println(p);
		System.out.println(p.getNombre());
		System.out.println(p.getDireccion().getNombreCalle());
		System.out.println(p.getDireccion().getNumeroPiso());
		p.getDireccion().setNumeroPiso(9);
		System.out.println(p.getDireccion().getNumeroPiso());
	}
	
}
