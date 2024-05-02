package cine;

public class Pelicula {
	private int anio;
	private String director;
	private String genero;
	private String nombre;
	
	public Pelicula(int anio, String director, String genero, String nombre) {
		this.anio = anio;
		this.director = director;
		this.genero = genero;
		this.nombre = nombre;
	}
	
	public Pelicula() {
		this.anio=0;
		this.director="";
		this.genero="";
		this.nombre="";
	}

	//getters y setters
	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void mostrarPelicula() {
		System.out.println(this.nombre+" "+this.getDirector());
	}
}
