package herencia2;

public class Gato extends Animal{

	public Gato(String nombre, String chip, String raza, int nPatas, String color, String sonido) {
		super(nombre, chip, raza, nPatas, color, sonido);
		
	}
	
	public Gato() {
		super();
	}
	
	
	public String emitirSonido() {
		return "Miau Miau";
	}
	
}
