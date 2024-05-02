package juegoBarcos;

import java.util.Arrays;

public class Boleto {
	private char[] b;
	private int longitud;

	//constructor con un parámetro para la longitud del array
	public Boleto(int longitud) {
		this.longitud = longitud;
		this.b=new char[longitud];
		for(int i=0;i<longitud;i++) {
			b[i]='A';
		}
	}
	
	//getters y setters
	public char[] getB() {
		return b;
	}

	public void setB(char[] b) {
		this.b = b;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	//Método rellenar boletos
	public void rellenarBoleto(){
		int posicionBarco1=(int)(Math.random()*longitud);
		int posicionBarco2=0;
		do {
			posicionBarco2=(int)(Math.random()*longitud);
		}while(posicionBarco2==posicionBarco1);
		b[posicionBarco1]='B';
		b[posicionBarco2]='B';
	}
	
	public void imprimirBoleto(){
		System.out.println(Arrays.toString(b));
	}
	

	public static void main(String[]args) {
		Boleto boleto=new Boleto(6);
		boleto.rellenarBoleto();
		boleto.imprimirBoleto();
		
	}
	
	
	
}
