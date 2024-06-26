package taller;

public class Coche extends Vehiculo {
	private String color;
	private int nPuertas;
	private double km;
	
	public Coche(String matricula, String marca, String modelo, String color, int nPuertas , double km) {
		super(matricula, marca, modelo);
		this.color = color;
		this.nPuertas = nPuertas;
		this.km = km;
	}
	public Coche() {
		super();
		this.color ="";
		this.nPuertas = 0;
		this.km = 0;
	}
	
	public double getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getnPuertas() {
		return nPuertas;
	}
	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}
	@Override
	public String toString() {
		return "Coche [color=" + color + ", nPuertas=" + nPuertas + ", km=" + km + "]";
	}
	
}
