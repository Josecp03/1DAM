package ejercicioNumerosRacionales;

public class Racional {
	
	//Atributos
	private int numerador;
	private int denominador;
	
	//Constructores
	//Constructor con todos los parámetros
	public Racional(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	//Constructor por defecto
	public Racional() {
		this.numerador = 0;
		this.denominador = 0;
	}

	//Getters y Setters
	public double getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public double getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	//toString
	@Override
	public String toString() {
		return numerador+"/"+denominador;
	}
	
	//Métodos
	//Método suma
	public Racional suma(Racional n) {
		int numerador=0;
		int denominador=0;
		if(this.denominador==n.denominador) {
			numerador=this.numerador+n.denominador;
			denominador=this.denominador;
			return new Racional(numerador,denominador);
		}
		else {
			numerador=(this.numerador*n.denominador)+(this.denominador*n.numerador);
			denominador=this.denominador*n.denominador;
			return new Racional(numerador,denominador);
		}
	}
	
	//Método resta
	public Racional resta(Racional n) {
		int numerador=0;
		int denominador=0;
		if(this.denominador==n.denominador) {
			numerador=this.numerador-n.denominador;
			denominador=this.denominador;
			return new Racional(numerador,denominador);
		}
		else {
			numerador=(this.numerador*n.denominador)-(this.denominador*n.numerador);
			denominador=this.denominador*n.denominador;
			return new Racional(numerador,denominador);
		}
	}
	
	//Método producto
	public Racional producto(Racional n) {
		int numerador=0;
		int denominador=0;
		numerador=this.numerador*n.numerador;
		denominador=this.denominador*n.denominador;
		return new Racional(numerador,denominador);
	}
	
	//Método division
	public Racional division(Racional n) {
		int numerador=0;
		int denominador=0;
		numerador=this.numerador*n.denominador;
		denominador=this.denominador*n.numerador;
		return new Racional(numerador,denominador);
	}
	
	//Pruebas Unitarias
	public static void main(String[] args) {
		//Prueba toString
		Racional n1=new Racional(3, 5);
		Racional n2=new Racional(8, 5);
		Racional n3=new Racional(1, 3);
		System.out.println(n1+"\n");
		
		//Prueba suma
		System.out.println(n1+" + "+n2+" = "+n1.suma(n2));
		System.out.println(n1+" + "+n3+" = "+n1.suma(n3)+"\n");
		
		//Prueba suma
		System.out.println(n1+" - "+n3+" = "+n1.resta(n3));
		System.out.println(n1+" - "+n2+" = "+n1.resta(n2)+"\n");
		
		//Prueba producto
		System.out.println(n1+" * "+n2+" = "+n1.producto(n2)+"\n");
			
		//Prueba division
		System.out.println(n1+" : "+n3+" = "+n1.division(n3));
	}
	
}
