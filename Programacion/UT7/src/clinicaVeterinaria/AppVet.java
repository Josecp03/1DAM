package clinicaVeterinaria;

import java.util.ArrayList;
import java.util.Scanner;

public class AppVet {

	private ArrayList<Cliente>clientes;
	
	public AppVet() {
		this.clientes = new ArrayList<Cliente>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public static void main(String[] args) {
		AppVet app=new AppVet();//reservo memoria para el AL
		Scanner sc=new Scanner(System.in);
		int opcion=0;
		/////////////////////////////////////////////////////
		Vacuna v=new Vacuna("Leishmania","1 enero","Phizer",80);
		Vacuna v2=new Vacuna("Antirrábica", "1 febrero", "Astra Zeneca", 50);
		//Animales
		Perro p=new Perro(2, 15, "Border Collie", "hembra", "Lori", "12232", false);
		Gato g=new Gato(2, 5, "Rag Doll", "macho", "León", true);
		Gato g2=new Gato(2, 2, "Rag doll", "hembra", "Tina", false);
		Perro p2=new Perro(13, 12, "Pastor Alemán", "hembra", "Berta", "3424", false);
		Perro p3=new Perro(2, 13, "Border Collie", "macho", "Cooper", "3435", true);
		
		//Vacunas
		g.getLibroVacunacion().add(v2);
		g2.getLibroVacunacion().add(v2);
		p.getLibroVacunacion().add(v2);
		p.getLibroVacunacion().add(v);
		p2.getLibroVacunacion().add(v2);
		p3.getLibroVacunacion().add(v);
		p3.getLibroVacunacion().add(v2);

		Cliente m=new Cliente("Luis", "1234", "luis@ribera.es", "lasdfah");
		m.getMascotas().add(p);
		m.getMascotas().add(g);
		Cliente m2=new Cliente("Carlos", "4321", "carlos@ribera.es", "gvousv");
		m2.getMascotas().add(g2);
		m2.getMascotas().add(p2);
		m2.getMascotas().add(p3);
		//Cargar los clientes en el AL
		app.getClientes().add(m);
		app.getClientes().add(m2);
		/////////////////////////////////////////////////////
		do {
			menu();
			opcion=sc.nextInt();
			switch(opcion) {
			case 1: //altaCliente
				break;
			case 2:
				System.out.println("DNI");
				String dniPedido=sc.next();
				app.atenderCliente(dniPedido);
				break;
			case 3:
				//Dado un cliente, dar de alta una mascota
				//Preguntar si es gato, perro o conejo y pedir
				//los valores
				//Insertar en el AL
				System.out.println("Introduzca el nombre del cliente: ");
				String nombre=sc.next();
				break;
			case 4:
				//Para cada cliente, contar cúantos animales tiene de
				//cada tipo.
				app.contarAnimales();
				break;
			case 5:
				//Mostrar los nombres de todos los perros de la clínica y
				//si tienen el seguro obligatorio o no
				app.mostrarPerros();
				break;
			case 6:
				//Mostrar todos los gatos obesos de la clinica
				app.mostrarGatosObesos();
				break;
			case 7:
				//Buscar y mostrar los animales de una detemrinada
				//raza dada por el usuario
				String raza="";
				System.out.println("Introduzca el tipo de raza: ");
				sc.nextLine();
				raza=sc.nextLine();
				app.buscarPorRaza(raza);
				break;
			}
		}while(opcion!=8);
		sc.close();
	}

	private void buscarPorRaza(String raza) {
		System.out.println("Los animales de la raza "+raza+" son: ");
		for (Cliente c : this.getClientes()) {
			for (Animal a : c.getMascotas()) {
					if (a.getRaza().equals(raza)) {
						System.out.println(a.getNombre());
					}
			}
		}
		
	}

	private void mostrarGatosObesos() {
		System.out.println("Los gatos con obesidad son: ");
		for (Cliente c : this.getClientes()) {
			for (Animal a : c.getMascotas()) {
				if (a instanceof Gato) {
					if(((Gato)a).isObsesidad())
						System.out.println(a.getNombre());
				}	
			}
		}
		
	}

	private void mostrarPerros() {
		for (Cliente c : this.getClientes()) {
			for (Animal a : c.getMascotas()) {
				if (a instanceof Perro) {
					if(((Perro)a).isSeguro())
						System.out.println(a.getNombre()+" tiene seguro");
					else
						System.out.println(a.getNombre()+" no tiene seguro");
				}	
			}
		}
	}

	private void contarAnimales() {
		int contPerro,contGato,contConejo;
		for (Cliente c : this.getClientes()) {
			contPerro=0;
			contGato=0;
			contConejo=0;
			System.out.println(c.getNombre()+" tiene: ");
			for (Animal a : c.getMascotas()) {
				if(a instanceof Perro) {}
					contPerro++;
				if(a instanceof Gato)
					contGato++;
				if(a instanceof Conejo)
					contConejo++;
			}
			System.out.println(contPerro+" perros");
			System.out.println(contGato+" gatos");
			System.out.println(contConejo+" conejos");
		}
		
	}

	private void atenderCliente(String dni) {
		double suma=0;
		for (Cliente c : this.getClientes()) {
			if(c.getDni().equals(dni)) {
				System.out.print(c.getNombre()+" tiene una suma total de vacunas de ");
				//Mascotas del cliente
				for (Animal a : c.getMascotas()) {
					//Sumar el precio de todas las vacunas
					for (Vacuna vac : a.getLibroVacunacion()) {
						suma=suma+vac.getPrecio();
					}
				}
			}
		}
		System.out.println(suma);
	}

	private static void menu() {
		System.out.println("\n1. Alta cliente");
		System.out.println("2. Atender Cliente");
		System.out.println("3. Insertar Mascota");
		System.out.println("4. Contar animales");
		System.out.println("5. Mostrar perros");
		System.out.println("6. Mostrar gatos obseos");
		System.out.println("7. Buscar por raza");
		System.out.println("8. Salir");
		System.out.println("Elige una opción: ");
	}

}
