package ejercicioCarta;

public class Carta {
	
	//Atributos
	private int numero;
	private String palo;
	
	//Constructores
	//Constructor con todos los parámetros
	public Carta(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}
	
	//Constructor por defecto
	public Carta() {
		this.numero = 0;
		this.palo = "";
	}

	//Getters y Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	//toString
	@Override
	public String toString() {
		return numero+" de "+palo;
	}	
	
	//Método extraerCarta
	public void extraerCarta() {
		//Número de la carta
		this.numero=(int)(1+Math.random()*12);
		
		//Palo de la carta
		String[]palos={"bastos","copas","oros","espadas"};
		int indice=(int)(Math.random()*4);
		this.palo=palos[indice];
	}
	
	//Prueba Unitaria
	public static void main(String[] args) {
		Carta c=new Carta();
		c.extraerCarta();
		System.out.println(c);
	}
	
}
