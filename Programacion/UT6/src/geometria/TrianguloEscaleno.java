package geometria;

public class TrianguloEscaleno extends Figura{
	private int a;
	private int b;
	private int c;
	
	public TrianguloEscaleno(String color, int a, int b, int c) {
		super(color);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public TrianguloEscaleno() {
		this.a=0;
		this.b=0;
		this.c=0;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "TrianguloEscaleno [a=" + a + ", b=" + b + ", c=" + c + ", color=" + color + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		TrianguloEscaleno other = (TrianguloEscaleno) obj;
		return this.getA()==other.getA() && this.getB()==other.getB() && this.getC()==other.getC() && this.getColor().equalsIgnoreCase(other.getColor());
	}
	
	public double area() {
		int s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	public double perimetro() {
		return a+b+c;
	}
	
	
	
}
