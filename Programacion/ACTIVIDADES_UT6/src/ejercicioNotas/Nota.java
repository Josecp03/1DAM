package ejercicioNotas;

public class Nota {

	//Atributos
	private String modulo;
	private double nota;
	
	//Constructores
	//Constructor con todos los parámetros
	public Nota(String modulo, double nota) {
		this.modulo = modulo;
		this.nota = nota;
	}

	//Constructor por defecto
	public Nota() {
		this.modulo = "";
		this.nota = 0;
	}

	//Getters y Setters
	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	//toString
	@Override
	public String toString() {
		return "Módulo:"+modulo+"=> "+nota;
	}
	
	//Prueba Unitaria
	public static void main(String[] args) {
		Nota n=new Nota("Programación",10);
		System.out.println(n);
	}
	
}
