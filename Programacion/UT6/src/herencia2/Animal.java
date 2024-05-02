package herencia2;

//superClase
public class Animal {
	protected String nombre;
	protected String chip;
	protected String raza;
	protected int nPatas;
	protected String color;
	protected String sonido;
	
	
	
	//constructor por defecto
	public Animal() {
		this.nombre = "";
		this.chip = "";
		this.raza = "";
		this.nPatas = 0;
		this.color = "";
		this.sonido = "";
	}

	//constructor con todos los parámetros
	public Animal(String nombre, String chip, String raza, int nPatas, String color, String sonido) {
		this.nombre = nombre;
		this.chip = chip;
		this.raza = raza;
		this.nPatas = nPatas;
		this.color = color;
		this.sonido = sonido;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getnPatas() {
		return nPatas;
	}

	public void setnPatas(int nPatas) {
		this.nPatas = nPatas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	//toString
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", chip=" + chip + ", raza=" + raza + ", nPatas=" + nPatas + ", color="
				+ color + ", sonido=" + sonido + "]";
	}
	
	//Método emitirSonido
	public String emitirSonido() {
		return "";
	}
	
	
}
