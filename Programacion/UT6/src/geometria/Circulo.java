package geometria;

public class Circulo extends Figura {
	private double radio;

	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}
	
	public Circulo() {
		super();
		this.radio=0;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double area() {
		return Math.PI*Math.pow(radio, 2);
	}
	
	public double perimetro() {
		return 2*Math.PI*radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", color=" + color + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return this.getRadio()==other.getRadio() && this.getColor().equalsIgnoreCase(other.getColor());
	}
	
	public static void main(String[]args) {
		Circulo c=new Circulo("verde",4);
		Circulo p=new Circulo("verde",3);
		if(c.equals(p))
			System.out.println("Son iguales");
		else
			System.out.println("Son diferentes");
		System.out.println(c.area());
		System.out.println(c.perimetro());
	}
	
}
