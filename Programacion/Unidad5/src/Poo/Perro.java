package Poo;

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
		this.nombre = nombre;
		this.raza="";
		this.edad=0;
		this.sobrepeso=false;
		this.id="";
	}
	
	//Constructor con nombre,raza y edad
	public Perro(String nombre, String raza, int edad) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.sobrepeso=false;
		if(nombre.length()>2 && this.raza.length()>3)
			this.id=(int)(1+Math.random()*20)+nombre.substring(0,2)+raza.substring(0,2);
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
		return "Nombre: "+nombre+"\n"+"Raza: "+raza+"\n"+"Edad: "+edad+"\n" ;	
	}
	
//	public void extraerPerro() {
//		//this.nombre
//		String[] nombres={"Max","Luna","Rocky","Bella","Charlie"};
//		int indiceNombres=(int)(Math.random()*5);
//		this.nombre=nombres[indiceNombres];
//		//this.raza
//		String[] razas={"Labrador Retriever","Pastor Alemán","Bulldog Francés","Golden Retriever","Chihuahua"};
//		int indiceRazas=(int)(Math.random()*5);
//		this.raza=razas[indiceRazas];
//		//this.id
//		int numeroAleatorio=(int)(1+Math.random()*20);
//		String letrasNombre=this.nombre.substring(0,2);
//		String letrasRaza=this.raza.substring(0,3);
//		this.id=numeroAleatorio+letrasNombre+letrasRaza.toUpperCase();
//		//this.edad
//		this.edad=(int)(1+Math.random()*15);
//		//this.sobrepeso
//		this.sobrepeso=Math.random()<0.5;
//	}
	
}
