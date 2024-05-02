package geometria;

public class TrianguloEquilatero extends Figura {
	private int longitudLadosIguales;

	public TrianguloEquilatero(String color, int longitudLadosIguales) {
		super(color);
		this.longitudLadosIguales = longitudLadosIguales;
	}
	
	public TrianguloEquilatero() {
		this.longitudLadosIguales=0;
	}

	public int getLongitudLadosIguales() {
		return longitudLadosIguales;
	}

	public void setLongitudLadosIguales(int longitudLadosIguales) {
		this.longitudLadosIguales = longitudLadosIguales;
	}

	@Override
	public String toString() {
		return "TrianguloEquilatero [longitudLadosIguales=" + longitudLadosIguales + ", color=" + color + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		TrianguloEquilatero other = (TrianguloEquilatero) obj;
		return this.getLongitudLadosIguales()==other.getLongitudLadosIguales() && this.getColor().equalsIgnoreCase(other.getColor());
	}
	
	public double area() {
		return (Math.sqrt(3)/4)*Math.pow(longitudLadosIguales, 2);
	}
	
	public double perimetro() {
		return 3*longitudLadosIguales;
	}
	
}
