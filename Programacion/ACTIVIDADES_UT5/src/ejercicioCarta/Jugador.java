package ejercicioCarta;

public class Jugador {
	
	//Atributos
	private String nombre;
	private Carta carta;
	
	//Constructores
	//Constructor con todos los parámetros
	public Jugador(String nombre, Carta carta) {		
		this.nombre = nombre;
		this.carta = carta;
	}
	
	//Constructor por defecto
	public Jugador() {		
		this.nombre = "";
		this.carta = new Carta();
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carta getCarta() {
		return carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}

	//Prueba Unitaria
	public static void main(String[] args) {
		//Creamos dos cartas
		Carta c1 = new Carta();
		Carta c2 = new Carta();
				
		//Creamos dos jugadores
		Jugador j1 = new Jugador("Paco",c1);
		Jugador j2 = new Jugador("Pepe",c2);
		
		//Generamos dos cartas
		c1.extraerCarta();
		c2.extraerCarta();
				
		//Imprimimos por pantalla las cartas de cada jugador
		System.out.println(j1.getNombre()+" tiene un "+j1.getCarta());
		System.out.println(j2.getNombre()+" tiene un "+j2.getCarta());
	}
}
