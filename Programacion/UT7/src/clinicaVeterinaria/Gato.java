package clinicaVeterinaria;

import java.util.ArrayList;

public class Gato extends Animal{
	private boolean obsesidad;

	public Gato(int edad, double peso, String raza, String sexo, String nombre, ArrayList<Vacuna> libroVacunacion,
			boolean obsesidad) {
		super(edad, peso, raza, sexo, nombre, libroVacunacion);
		this.obsesidad = obsesidad;
	}

	public Gato(int edad, double peso, String raza, String sexo, String nombre, boolean obsesidad) {
		super(edad, peso, raza, sexo, nombre);
		this.obsesidad = obsesidad;
	}
	
	public Gato() {
		super();
		this.obsesidad = false;
	}

	public boolean isObsesidad() {
		return obsesidad;
	}

	public void setObsesidad(boolean obsesidad) {
		this.obsesidad = obsesidad;
	}

	@Override
	public String toString() {
		return "Gato [obsesidad=" + obsesidad + ", peso=" + peso + ", raza=" + raza + ", nombre=" + nombre
				+ ", libroVacunacion=" + libroVacunacion + "]";
	}
	
	
}
