package ejercicioGeometria;

public class Circulo extends Figura{
	
	//Atributos
	private double radio;

	//Constructores
	//Constructor con todos los parámetros
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}
	
	//Constructor por defceto
	public Circulo() {
		super();
		this.radio = 0;
	}

	//Getters y Setters
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	//toString
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	//Equals
	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return this.getRadio()==other.getRadio() && this.getColor().equalsIgnoreCase(other.getColor());		
	}
	
	//Métodos
	//Método area
	public double area() {
		return 2*Math.PI*Math.pow(radio, 2);
	}
				
	//Método perímetro
	public double perimetro() {
		return 2*Math.PI*radio;
	}
	
	//Prueba Unitaria
	public static void main(String[] args) {
		Circulo c=new Circulo("verde",4);
		Circulo c2=new Circulo("verde",3);
		if(c.equals(c2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son distintos");
		}
		System.out.println(c.area());
		System.out.println(c.perimetro());
	}
	
}
