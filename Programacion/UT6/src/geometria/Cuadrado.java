package geometria;

public class Cuadrado extends Figura {
	private int lado;

	public Cuadrado(String color, int lado) {
		super(color);
		this.lado = lado;
	}
	
	public Cuadrado() {
		this.lado=0;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", color=" + color + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Cuadrado other = (Cuadrado) obj;
		return this.getLado()==other.getLado() && this.getColor().equalsIgnoreCase(other.getColor());
	}
	
	public double area() {
		return Math.pow(lado, 2);
	}
	
	public double perimetro() {
		return 4*lado;
	}
	
}
