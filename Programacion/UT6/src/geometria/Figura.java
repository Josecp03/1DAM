package geometria;

public abstract class Figura {
	protected String color;

	//constructor por parámetros
	public Figura(String color) {
		this.color = color;
	}
	
	//constructor por defecto
	public Figura() {
		this.color="";
	}

	//getters y setters
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

	//Generate hascode and equals (Borrar hascode)(Este está modificado)
	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		return this.getColor().equalsIgnoreCase(other.getColor());
	}
	
	//Método área
	public double area() {
		return 0;
	}
	
	//Método perímetro
	public double perimetro(){
		return 0;
	}
}
