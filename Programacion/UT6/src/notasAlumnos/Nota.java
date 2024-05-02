package notasAlumnos;

public class Nota {
	private String modulo;
	private double calificacion;
	
	//constructor por defecto
	public Nota() {
		this.modulo="";
		this.calificacion=0;
	}

	//constructor con 2 parámetros
	public Nota(String modulo, double calificación) {
		this.modulo = modulo;
		this.calificacion = calificación;
	}

	//getters y setters
	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public double getCalificación() {
		return calificacion;
	}

	public void setCalificación(double calificación) {
		this.calificacion = calificación;
	}

	//toString
	@Override
	public String toString() {
		return "Módulo:"+modulo+"=> "+calificacion;
	}
	
	public static void main(String[] args) {
		Nota n=new Nota();
		n.setModulo("Programación");
		System.out.println(n);
		n.setCalificación(9);
		System.out.println(n);
		Nota m=new Nota("BBDD", 7.5);
		System.out.println(m);
	}
	
	
	

}
