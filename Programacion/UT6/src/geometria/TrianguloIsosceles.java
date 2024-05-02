package geometria;

import java.util.Objects;

public class TrianguloIsosceles extends Figura {
	private int ladosIguales;
	private int ladoDistinto;
	
	public TrianguloIsosceles(String color, int ladosIguales, int ladoDistinto) {
		super(color);
		this.ladosIguales = ladosIguales;
		this.ladoDistinto = ladoDistinto;
	}

	public TrianguloIsosceles() {
		this.ladosIguales=0;
		this.ladoDistinto=0;
	}

	public int getLadosIguales() {
		return ladosIguales;
	}

	public void setLadosIguales(int ladosIguales) {
		this.ladosIguales = ladosIguales;
	}

	public int getLadoDistinto() {
		return ladoDistinto;
	}

	public void setLadoDistinto(int ladoDistinto) {
		this.ladoDistinto = ladoDistinto;
	}

	@Override
	public String toString() {
		return "TrianguloIsosceles [ladosIguales=" + ladosIguales + ", ladoDistinto=" + ladoDistinto + ", color="
				+ color + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ladoDistinto, ladosIguales);
	}

	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		TrianguloIsosceles other = (TrianguloIsosceles) obj;
		return this.getLadoDistinto()==other.getLadoDistinto() && this.getColor().equalsIgnoreCase(other.getColor()) && this.getLadosIguales()==other.getLadosIguales();
	}
	
	public double area() {
		return (ladoDistinto*(Math.sqrt(Math.pow(ladosIguales, 2)-(Math.pow(ladoDistinto, 2)/4))))/2;
	}
	
	public double perimetro() {
		return (2*ladosIguales)+ladoDistinto;
	}
	
	
	
}
