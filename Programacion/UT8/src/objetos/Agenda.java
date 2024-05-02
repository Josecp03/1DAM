package objetos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Agenda {

	// Atributos
	private ArrayList<Contacto>agenda;

	// Constructor por defecto
	public Agenda() {
		this.agenda = new ArrayList<Contacto>();
	}

	// Getters y Setters
	public ArrayList<Contacto> getAgenda() {
		return agenda;
	}

	public void setAgenda(ArrayList<Contacto> agenda) {
		this.agenda = agenda;
	}
	
	// Método Cargar Agenda = Leer los contactos del fichero
	public void cargarAgenda(String filename) {
		try {
			FileInputStream fi=new FileInputStream(filename);
			ObjectInputStream entrada=new ObjectInputStream(fi);
			
			Contacto c=null;
			while(entrada!=null) {
				try {
					c=(Contacto)entrada.readObject();
					this.getAgenda().add(c);
				} catch (Exception e){
					entrada=null;
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	// 
	public void imprimirAgenda() {
		for(Contacto c: this.getAgenda()) {
			System.out.println(c.getNombre()+" "+c.getTelefono());
		}
	}
	
	//
	public void eliminarContacto(String name) {
		for (int i = 0; i < this.getAgenda().size(); i++) {
			if(this.getAgenda().get(i).getNombre().equalsIgnoreCase(name)) {
				this.getAgenda().remove(i);
			}
		}
	}
	
	// Método Guardar Agenda = Guardar los contactos del AL en el fichero
	public void guardarAgenda(String filename) {
		// Escribir --> out
		try {
			FileOutputStream fo=new FileOutputStream(filename);
			ObjectOutputStream salida=new ObjectOutputStream(fo);
			for(Contacto c : this.getAgenda()) {
				salida.writeObject(c);// Escribimos los objetos en el fichero
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// Método Añadir Contacto
	public void addContacto(Contacto c) {
		this.getAgenda().add(c);
	}
	
	// Prueba Unitaria
	public static void main(String[] args) {
		Agenda a=new Agenda();
//		a.getAgenda().add(new Contacto("Mamá", "308307", "Av, Madrid", "hola@gmail.com"));
//		a.getAgenda().add(new Contacto("Juan", "304807", "C/ Mayor", "juan@gmail.com"));
//		a.getAgenda().add(new Contacto("Marta", "3286207", "Plaza Pan", "marta@gmail.com"));
//		a.guardarAgenda("agenda.bin");
		a.cargarAgenda("agenda.bin");
		a.imprimirAgenda();
		a.addContacto(new Contacto("Juan", "836084", "C/ Mayor", "juan@gmail.com"));
		a.addContacto(new Contacto("Jaime", "836084", "C/ Mayor", "jaime@gmail.com"));
		a.imprimirAgenda();
		a.eliminarContacto("Juan");
		a.imprimirAgenda();
		a.guardarAgenda("agenda.bin");
	}
}
