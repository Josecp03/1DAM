package herencia2;

public class Perro extends Animal{
	private boolean seguro;
	
	//constructor por defecto
	public Perro() {
		super();
		this.seguro=false;
	}

	//constructor con todos los parámetros
	public Perro(String nombre, String chip, String raza, int nPatas, String color, String sonido, boolean seguro) {
		super(nombre, chip, raza, nPatas, color, sonido);
		this.seguro = seguro;
	}

	//getters y setters
	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}
	
	public boolean isSeguro() {
	    return seguro;
	}
	
	public String emitirSonido() {
		return "Gua Gua";
	}
	
}
