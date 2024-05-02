package ejercicioPerro;

public class Perro {
	
	//Atributos
	private String id;
	private String nombre;
	private String raza;
	private int edad;
	private boolean sobrepeso;
	
	//Constructores
	//Constructor con el nombre
	public Perro(String nombre) {
		this.id = "";
		this.nombre = nombre;
		this.raza = "";
		this.edad = 0;
		this.sobrepeso = false;
	}

	//Constructor con el nombre,raza y edad
	public Perro(String nombre, String raza, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.sobrepeso = false;
		if(nombre.length()>2 && raza.length()>3) 
			this.id=(int)(1+Math.random()*20)+nombre.substring(0,2)+raza.substring(0,3).toUpperCase();
		else
			this.id=(int)(1+Math.random()*20)+"p";
	}

	//Getters y Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isSobrepeso() {
		return sobrepeso;
	}

	public void setSobrepeso(boolean sobrepeso) {
		this.sobrepeso = sobrepeso;
	}

	//toString
	@Override
	public String toString() {
		return "Nombre: "+nombre+"\nRaza: "+raza+"\nEdad: "+edad+"\n";
	}
	
}
