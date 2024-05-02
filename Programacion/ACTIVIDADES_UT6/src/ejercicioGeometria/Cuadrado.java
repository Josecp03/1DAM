package ejercicioGeometria;

public class Cuadrado extends Figura{

	//Atributos
	private double lado;

	//Constructores
	//Constructor con todos los parámetros
	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}
	
	//Consructor por defecto
	public Cuadrado() {
		super();
		this.lado = 0;
	}

	//Getters y Setters
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	//toString
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	//Equals
	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Cuadrado other = (Cuadrado) obj;
		return this.getLado()==other.getLado() && this.getColor().equalsIgnoreCase(other.getColor());
	}

	//Métodos
	//Método área
	public double area() {
		return lado*lado;
	}
	
	//Método perímetro
	public double perimetro() {
		return 4*lado;
	}
	
	//Prueba Unitaria
	public static void main(String[] args) {
		Cuadrado c=new Cuadrado("Azul", 20);
		Cuadrado c2=new Cuadrado("azul", 20);
		if(c.equals(c2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son distintos");
		}
		System.out.println(c.area());
		System.out.println(c.perimetro());
	}
	
}
