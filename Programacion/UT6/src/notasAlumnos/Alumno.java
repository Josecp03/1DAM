       package notasAlumnos;

import java.util.Arrays;

public class Alumno {
	private String nombre;
	private String apellidos;
	private int edad;
	private Nota[]notas;
	
	//constructor por defecto
	//inicializa variables y reserva memoria
	public Alumno() {
		this.nombre="";
		this.apellidos="";
		this.edad=0;
		this.notas=new Nota[7];
		for (int i=0;i<notas.length;i++) {
			notas[i]=new Nota();
		}
	}
	
	//constructor con todos los parámetros
	public Alumno(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.notas= new Nota[7];
		for (int i = 0; i < notas.length; i++) {
			notas[i]=new Nota();
		}
	}
	
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Nota[] getNotas() {
		return notas;
	}

	public void setNotas(Nota[] notas) {
		this.notas = notas;
	}
	
	//toString
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", notas="
				+ Arrays.toString(notas) + "]";
	}
	
	public void imprimirNotas() {
		System.out.println("El alumno/a "+this.getNombre()+" tiene las siguientes notas: ");
		for (int i=0;i<this.notas.length;i++) {
			System.out.println(this.notas[i]);
		}
	}

	

}
