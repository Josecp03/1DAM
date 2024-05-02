package ejercicioGeometria;

public abstract class Figura {
	
	//Atributos
	protected String color;

	//Constructor con todos los parámetros
	public Figura(String color) {
		this.color = color;
	}
	
	//Constructor por defecto
	public Figura() {
		this.color = "";
	}

	//Getters y Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//toString
	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}

	//Equals
	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		return this.getColor().equalsIgnoreCase(other.getColor());
	}

	//Métodos
	//Método area
	public double area() {
		return 0;
	}
			
	//Método perímetro
	public double perimetro() {
		return 0;
	}
		
}
