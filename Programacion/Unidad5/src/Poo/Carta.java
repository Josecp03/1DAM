package Poo;

public class Carta {
	private int numero;
	private String palo;
	
	//Constructor por defecto
	public Carta() {
		this.numero=0;
		this.palo="";
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
		return numero +" de "+palo;
	}
	
	public void extraerCarta() {
		//this.numero=numeroAleatorio entre 1 y 12 !=8,9
		int numeroAleatorio=0;
		do {
			numeroAleatorio=(int)(1+Math.random()*12);
		}while(numeroAleatorio==8 || numeroAleatorio==9);
		//this.palo="bastos","copas","espadas","oros"
		String palo[]={"bastos","copas","espadas","oros"};
		int indice=0;
		this.numero=numeroAleatorio;
		indice=(int)(Math.random()*4);
		this.palo=palo[indice];
	}
	
	

}
