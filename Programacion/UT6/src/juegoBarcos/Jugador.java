package juegoBarcos;



public class Jugador {
	private String nombre;
	private int edad;
	private String nick;
	private Boleto boleto;
	
	//constructor con los parámetros nombre y edad
	public Jugador(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		generarNick();
		this.boleto=new Boleto(6);
	}

	private void generarNick() {
		String tresLetrasNombre="";
		if(nombre.length()>=3) {
			tresLetrasNombre=nombre.substring(0,3);
		}else {
			tresLetrasNombre=nombre;
		}
		this.nick="Jugador_"+tresLetrasNombre+edad;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public Boleto getBoleto() {
		return boleto;
	}

	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}

	//toString
	@Override
	public String toString() {
		return "El jugador "+nick+" tiene el boleto"+boleto;
	}
	
	public static void main(String[]args) {
		Jugador jugador=new Jugador("Mar",25);
		System.out.println(jugador.toString());
	}
	
	
	
	
	
	
}
