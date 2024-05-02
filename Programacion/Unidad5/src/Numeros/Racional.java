package Numeros;

public class Racional {
	
	private int numerador;
	private int denominador;
	
	//Constructor
	public Racional(int a,int b) {
		this.numerador=a;
		if(b!=0)
			this.denominador=b;
		else {
			System.out.println("No se puede poner b=0");
			this.denominador=1;
		}
	}
	
	
	//Getters y Setters
	public int getNumerador() {
		return numerador;
	}



	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}



	public int getDenominador() {
		return denominador;
	}



	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}


	//toString 
	public String toString() {
		return numerador+"/"+denominador;
	}
	
	public Racional producto(Racional  s) {
		int numeradorProducto=this.numerador*s.numerador;
		int denominadorProducto=this.denominador*s.denominador;
		return new Racional(numeradorProducto,denominadorProducto);
	}
	
	public Racional division(Racional s) {
		int numeradorDivision=this.numerador*s.denominador;
		int denominadorDivison=this.denominador*s.numerador;
		return new Racional(numeradorDivision,denominadorDivison);
	}
	
	public Racional suma(Racional s) {
		if (this.denominador==s.denominador) {
			int numeradorSuma=this.numerador+s.denominador;
			return new Racional(numeradorSuma,this.denominador);
		}else {
			int numeradorSuma=(this.numerador*s.denominador)+(s.numerador+this.denominador);
			int denominadorSuma=this.denominador*s.denominador;
			return new Racional(numeradorSuma,denominadorSuma);
		}
	}
	
	public Racional resta(Racional s) {
		if (this.denominador==s.denominador) {
			int numeradorSuma=this.numerador-s.denominador;
			return new Racional(numeradorSuma,this.denominador);
		}else {
			int numeradorSuma=(this.numerador*s.denominador)-(s.numerador+this.denominador);
			int denominadorSuma=this.denominador*s.denominador;
			return new Racional(numeradorSuma,denominadorSuma);
		}
	}
	
	public Racional simplificar () {
		while (this.numerador!=0) {
			int temp=this.denominador;
			this.denominador=this.numerador%this.denominador;
			this.numerador=temp;

		}
		int mcd=this.numerador;
		return new Racional(this.numerador/=mcd,this.denominador/=mcd);
	}
	
	public boolean esIgual(Racional s) {
		if(this.numerador==s.numerador && this.denominador==s.denominador)
			return true;
		else
			return false;
	}
	
	
	
	
}
