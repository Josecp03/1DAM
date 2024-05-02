package Poo;

public class Password {
	
	//Atributos
	private int longitud;
	private String contraseña;
	
	//Constructor por defecto
	public Password() {
		this.contraseña="";
		this.longitud=8;
	}

	//Getters y Setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	//toString
	@Override
	public String toString() {
		return "Password [contraseña=" + contraseña + "]";
	}

	
	public void generarPassword(String cadena) {
		this.contraseña=cadena.substring(0,2).toUpperCase()+cadena.substring(2)+(int)(1+Math.random()*99);
	}
	
	public boolean esCorrecta() {
		return this.contraseña.matches("[A-Z]{2}[a-zA-Z]{4}[0-9]{2}");
	}
	
}
