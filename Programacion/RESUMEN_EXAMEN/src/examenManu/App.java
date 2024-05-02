package examenManu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	// Variables propias de la clase
	private ArrayList<Deportista> equipos;

	// Cosntructor predefinido
	public App() {
		this.equipos = new ArrayList<Deportista>();
	}

	// Getters ySetters
	public ArrayList<Deportista> getEquipos() {
		return equipos;
	}

	public void setEquipos(ArrayList<Deportista> equipos) {
		this.equipos = equipos;
	}

	// Metodo main
	public static void main(String[] args) {
		App app = new App();
		Scanner teclado = new Scanner(System.in);
		int cod = 0, op = 0;
		String user = "";
		app.cargarDepor("depor.bin");

		System.out.print("Tipo de Usuario: ");
		user = teclado.next();
		System.out.print("Digame el código del entrenador: ");
		cod = teclado.nextInt();

		if (user.equalsIgnoreCase("Entrenador")) {
			do {
				app.menu();
				op = teclado.nextInt();
				switch (op) {
				case 1: // Ver todos los deportistas
					for (Deportista dep3 : app.getEquipos()) {
						System.out.println(dep3.getDni()+", "+dep3.getNombre()+" "+dep3.getApes()+", Cod Entrenador: "+dep3.getCodEntrenador());
					}
					break;
				case 2: // Ver los deportistas de un entrenador
					System.out.println();
					System.out.println("Digame el código del entrenador: ");
					int cod2 = teclado.nextInt();
					for (Deportista dep2 : app.seleccionar(cod2)) {
						System.out.println(dep2.getDni()+", "+dep2.getNombre()+" "+dep2.getApes()+", Cod Entrenador: "+dep2.getCodEntrenador());
					}
					break;
				case 3: // Añadir un nuevo 
					System.out.println();
					System.out.println("*******************************");
					System.out.println("AÑADIR NUEVO DEPORTISTA: ");
					System.out.println();
					System.out.println("Digame su nombre: ");
					String nombre = teclado.next();
					System.out.println("Digame sus apellidos: ");
					String apes = teclado.next();
					System.out.println("Digame su edad: ");
					int edad = teclado.nextInt();
					System.out.println("Digame su dni: ");
					String dni = teclado.next();
					System.out.println("Digame si está federado: ");
					int fed = teclado.nextInt();
					System.out.println("Digame su número: ");
					int numero = teclado.nextInt();
					System.out.println("Digame el código del entrenardor: ");
					int codEn = teclado.nextInt();
					
					// Creamos el deportista
					Deportista d = new Deportista(nombre, apes, dni, edad, fed, numero, codEn);
					app.añadirDepor(d);
					app.guardarClientes("depor.bin");
					app.getEquipos().clear();
					app.cargarDepor("depor.bin");
					break;
				case 4: // Imprimir tickets de pago al mes
					for (Deportista de : app.getEquipos()) {
						app.imprimirPagos(de.getNombre()+de.getApes()+".txt", de);
					}
					break;
				case 5: // Opción para guardar todo
					app.cargarDepor("depor.bin");
					app.guardarClientes("depor.bin");
					break;
				default: // Opción no disponible
					System.out.println();
					System.out.println("LO SENTIMOS!!! Esa opción aún no está disponible");
					System.out.println();
					break;
				}
			} while (op != 5);
		}else if(user.equalsIgnoreCase("Deportista")) {
			int op3 = 0;
			do {
				app.menu3();
				op3 = teclado.nextInt();
				switch(op3) {
				case 1: // Ver las estadisticas de cada juagador
					Deportista prueba = new Deportista();
					prueba.cargarEstadisticas("esta.csv");
					System.out.println();
					System.out.print("Digame el dni del deportistas: ");
					String dni2 = teclado.next();
					System.out.println();
					System.out.println("Esatisticas del Deportistas con DNI: "+dni2);
					System.out.println();
					for (Estadisticas e : prueba.seleccionarEst(dni2)) {
						System.out.println(e);
					}
					break;
				case 2:
					break;
				case 3: // Sale directamente
					break;
				default: // Opción no disponible
					System.out.println();
					System.out.println("LO SENTIMOS!!! Esa opción aún no está disponible");
					System.out.println();
					break;
				}
			}while(op3!=3);
		}
		System.out.println();
		System.out.println("HA SALIDO DE LA APP");
		System.out.println("HASTA PRONTO");
	}
	
	// Metodo para el menu de los deportistas
	public void menu3() {
		System.out.println();
		System.out.println("******************************************");
		System.out.println("HAS ACCEDIDO COMO DEPORTISTA");
		System.out.println("******************************************");
		System.out.println();
		System.out.println("1º) Ver mis estadisticas");
		System.out.println("2º) ");
		System.out.println("3º) Salir");
		System.out.print("Opción elegida: ");
	}

	// Metodo del menu principal
	public void menu() {
		System.out.println("*******************************************");
		System.out.println("HA ACCEDIDO COMO ENTRENADOR:");
		System.out.println("*******************************************");
		System.out.println();
		System.out.println("1º) Ver todos los deportistas");
		System.out.println("2º) Ver los deportistas de un entrenador");
		System.out.println("3º) Añadir deportistas");
		System.out.println("4º) Ver cuanto pagan al mes");
		System.out.println("5º) Guardar y Salir");
		System.out.print("Opción elegida: ");
	}

	// Metodo para cargar los deportistas
	public void cargarDepor(String filename) {
		try {
			FileInputStream fi = new FileInputStream(filename);
			ObjectInputStream entrada = new ObjectInputStream(fi);
			Deportista c = null;
			while (entrada != null) {
				try {
					c = (Deportista) entrada.readObject();
					this.getEquipos().add(c);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					entrada = null;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Metodo para guardar los clientes
	public void guardarClientes(String filename) {
		try {
			FileOutputStream fo = new FileOutputStream(filename);
			ObjectOutputStream salida = new ObjectOutputStream(fo);
			for (Deportista deportista : this.getEquipos()) {
				salida.writeObject(deportista);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Seleccionar deportistas de un entrenador
	public ArrayList<Deportista> seleccionar(int cod) {
		ArrayList<Deportista> eq1 = new ArrayList<Deportista>();
		for (Deportista deportista : this.getEquipos()) {
			if (deportista.getCodEntrenador() == cod) {
				eq1.add(deportista);
			}
		}
		return eq1;
	}
	
	// Metodo para generar los tickets de pago al mes
	public void imprimirPagos(String filename, Deportista c) {
		double total = 0.0;
		try {
			PrintWriter salid = new PrintWriter(filename);
			salid.println("**************************");
			salid.println("CLUB WATERPOLO");
			salid.println("**************************");
			salid.println();
			salid.println("Factura del més");
			salid.println();
			salid.println("Nombre: "+c.getNombre()+" "+c.getApes()+"\nDNI: "+c.getDni()+"\n¿Federado? "+c.getFederado()+"\nEdad: "+c.getEdad());
			if(c.getFederado()==1) total+=15.00; // tasa dependiendo de estar federado o no
			else if(c.getFederado()==0) total+=3.00; // tasa dependiendo de estar federado o no
			if(c.getEdad()>12 && c.getEdad()<35) total+=6.00; // tasa dependiendo de su edad
			else if(c.getEdad()>=35) total+=8.00; // tasa dependiendo de su edad
			total+=20.00; // tasa fija
			salid.println();
			salid.println("Pago mensual: "+total+"€");
			salid.flush();
			salid.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Metodo para añadir un nuevo deportistas
	public void añadirDepor(Deportista d) {
		this.getEquipos().add(d);
	}
}