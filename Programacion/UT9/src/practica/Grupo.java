package practica;

public class Grupo {

	// Atributos
	private int codigo;
	private String nombre;
	private int año;
	private String tipo;
	
	// Constructor con todos los parámetros
	public Grupo(int codigo, String nombre, int año, String tipo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.año = año;
		this.tipo = tipo;
	}
	
	// Constructor por defecto
	public Grupo() {
		this.codigo = 0;
		this.nombre = "";
		this.año = 0;
		this.tipo = "";
	}

	// Getters y Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
		
}
