package actividadArtista;

public class Artista {

	//Atributos
	private String nombre;
	private long edad;
	private String pais;
	private long oyentes;
	private String canciones;
	
	// Constructor con todos los parámetros
	public Artista(String nombre, long edad, String pais, long oyentes, String canciones) {
		this.nombre = nombre;
		this.edad = edad;
		this.pais = pais;
		this.oyentes = oyentes;
		this.canciones = canciones;
	}

	// Constructor por defecto
	public Artista() {
		this.nombre = "";
		this.edad = 0;
		this.pais = "";
		this.oyentes = 0;
		this.canciones = "";
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getEdad() {
		return edad;
	}

	public void setEdad(long edad) {
		this.edad = edad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public long getOyentes() {
		return oyentes;
	}

	public void setOyentes(long oyentes) {
		this.oyentes = oyentes;
	}

	public String getCanciones() {
		return canciones;
	}

	public void setCanciones(String canciones) {
		this.canciones = canciones;
	}

	// ToString
	@Override
	public String toString() {
		return nombre+"("+pais+") || "+edad+" años || "+oyentes+"M de oyentes mensuales en Spotify || Canciones = ["+canciones+"]";
	}
	
	// Prueba Unitaria
	public static void main(String[] args) {
		Artista a = new Artista ("Mora", 27, "Puerto Rico", 20, "Desaparecer, Calentón, 512");
		System.out.println(a);
	}
	
	
}