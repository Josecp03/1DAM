package ejercicioContraseña;

public class Password {
	
	//Atributos
	private int longitud;
	private String contraseña;
	
	//Constructor por defecto
	public Password() {
		this.longitud = 8;
		this.contraseña = "";
	}
	
	//Método generarPasword
	public void generarContraseña(String cadena) {
		this.contraseña=cadena.substring(0,2).toUpperCase()+cadena.substring(2,6)+(int)(1+Math.random()*99);
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
	
}
