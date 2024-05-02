package examenGestionAparcamientos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Aparcamiento {
	
	// Atributos
	private ArrayList<Conductor>conductores;
	private ArrayList<Cliente>clientesaparcamiento;
	
	// Constructor con todos los parámetros
	public Aparcamiento(ArrayList<Conductor> conductores, ArrayList<Cliente> clientesaparcamiento) {
		this.conductores = conductores;
		this.clientesaparcamiento = clientesaparcamiento;
	}
	
	// Constructor por defecto
	public Aparcamiento() {
		this.conductores = new ArrayList<Conductor>();
		this.clientesaparcamiento = new ArrayList<Cliente>();
	}

	// Getters y Setters
	public ArrayList<Conductor> getConductores() {
		return conductores;
	}

	public void setConductores(ArrayList<Conductor> conductores) {
		this.conductores = conductores;
	}

	public ArrayList<Cliente> getClientesaparcamiento() {
		return clientesaparcamiento;
	}

	public void setClientesaparcamiento(ArrayList<Cliente> clientesaparcamiento) {
		this.clientesaparcamiento = clientesaparcamiento;
	}	

	// ToString
	@Override
	public String toString() {
		return "Aparcamiento [conductores=" + conductores + "]";
	}

	public static void main(String[] args) {
		Aparcamiento app=new Aparcamiento();
		Scanner sc=new Scanner(System.in);
		int opcion=0;
		do {
			app.menu();
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				app.leerConductores();
				break;
			case 2:
				app.darAltaCliente();
				break;
			case 3:
				app.guardarCliente();
				break;
			case 4:
				app.leerClientes();
				break;
			case 5:
				app.generarTickets();
				break;
			case 6:
				app.imprimirTurno();
				break;
			case 0:
				
				break;
			}
		} while (opcion!=0);
		sc.close();
	}

	private void imprimirTurno() {
        for (Conductor cond : this.getConductores()) {
			for (Cliente cli : this.getClientesaparcamiento()) {
				if(cond.getTurno() == 1 && cli.getHoraLlegada() >=8 && cli.getHoraLlegada()<=15) {
					System.out.println("Turno 1");
					System.out.println("El conductor "+cond.getNombre()+" "+cond.getApellidos()+" llevará al cliente "+cli.getNombre()+" "+cli.getApellidos()+ " con el vehículo "+cli.getVehiculo().getMatricula()+" marca= "+cli.getVehiculo().getMarca()+ " modelo= "+cli.getVehiculo().getModelo());
				} else if (cond.getTurno() == 2 && cli.getHoraLlegada() >= 16 && cli.getHoraLlegada()<=24) {
					System.out.println("Turno 2");
					System.out.println("El conductor "+cond.getNombre()+" "+cond.getApellidos()+" llevará al cliente "+cli.getNombre()+" "+cli.getApellidos()+ " con el vehículo "+cli.getVehiculo().getMatricula()+" marca= "+cli.getVehiculo().getMarca()+ " modelo= "+cli.getVehiculo().getModelo());
				} else if (cond.getTurno() == 3 && cli.getHoraLlegada()>= 1 && cli.getHoraLlegada()<= 8) {
					System.out.println("Turno 3");
					System.out.println("El conductor "+cond.getNombre()+" "+cond.getApellidos()+" llevará al cliente "+cli.getNombre()+" "+cli.getApellidos()+ " con el vehículo "+cli.getVehiculo().getMatricula()+" marca= "+cli.getVehiculo().getMarca()+ " modelo= "+cli.getVehiculo().getModelo());
				}
				
			}
		}
	}

	private void generarTickets() {
		for(Cliente cli: this.getClientesaparcamiento()) {
			PrintWriter salida;
			try {
				salida = new PrintWriter(new File("Ticket "+cli.getNombre()+" "+cli.getApellidos()+".txt"));
				salida.println(cli.getNombre()+" paga "+cli.getVehiculo().calcularPrecioAparcamiento(cli.getDiasEstancia())+"€");
				salida.flush();
				salida.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void leerClientes() {
		try {
			System.out.println("Se inicializará de nuevo el array de clientes perdiendo los datos anteriores que no haya guardado");
			this.setClientesaparcamiento(new ArrayList<Cliente>());
			FileInputStream fi=new FileInputStream("clientes.par");
			ObjectInputStream entrada=new ObjectInputStream(fi);
			
			Cliente c=null;
			while(entrada!=null) {
				try {
					c=(Cliente)entrada.readObject();
					this.getClientesaparcamiento().add(c);
				} catch (Exception e){
					entrada=null;
				}
			}
			for (Cliente cli : this.getClientesaparcamiento()) {
				System.out.println(cli.getNombre());
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	private void guardarCliente() {
		try {
			FileOutputStream fo=new FileOutputStream("clientes.par");
			ObjectOutputStream salida=new ObjectOutputStream(fo);
			for(Cliente c : this.getClientesaparcamiento()) {
				salida.writeObject(c);
			}
			salida.close();
			fo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void darAltaCliente() {
		Scanner sc=new Scanner(System.in);
		Cliente cli=new Cliente();
		Coche c=new Coche();
		do {
			System.out.println("Introduzca su dni: ");
			cli.setDni(sc.nextLine());
		} while (!cli.valida(cli.getDni()));
		System.out.println("Introduzca su nombre: ");
		cli.setNombre(sc.nextLine());
		System.out.println("Introduzca sus apellidos: ");
		cli.setApellidos(sc.nextLine());
		System.out.println("Introduzca su edad: ");
		cli.setEdad(sc.nextInt());
		System.out.println("Introduzca su dirección: ");
		cli.setDireccion(sc.nextLine());
		sc.nextLine();
		System.out.println("Introduzca su email: ");
		cli.setEmail(sc.nextLine());
		System.out.println("Introduzca la hora de llegada: ");
		cli.setHoraLlegada(sc.nextInt());
		System.out.println("Introduzca los dias de estancia: ");
		cli.setDiasEstancia(sc.nextInt());
		System.out.println("¿Qué tipo de vehículo es?");
		if (sc.next().equals("Coche")) {
			sc.nextLine();
			do {
				System.out.println("Introduzca la matrícula: ");
				c.setMatricula(sc.nextLine());
			} while (!c.valida(c.getMatricula()));
			System.out.println("Introduzca el color: ");
			c.setMatricula(sc.nextLine());
			System.out.println("Introduzca la marca: ");
			c.setMarca(sc.nextLine());
			System.out.println("Introduzca el modelo: ");
			c.setModelo(sc.nextLine());
			System.out.println("Introduzca el número de puertas: ");
			c.setNumPuertas(sc.nextInt());
			cli.setVehiculo(c);
		}
		this.getClientesaparcamiento().add(cli);
	}

	private void leerConductores() {
		try {
        	String cadena;
            String[] linea;
        	Scanner entrada=new Scanner(new File("conductor.csv"));
        	entrada.nextLine(); // Se salta la primera línea
        	while(entrada.hasNext()) {
        		cadena=entrada.nextLine();
        		linea=cadena.split(";");
        		this.getConductores().add(new Conductor(Integer.parseInt(linea[0]),Integer.parseInt(linea[1]),linea[2],linea[3],linea[4],Integer.parseInt(linea[5]),linea[6],linea[7]));
        	}
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
			e.printStackTrace();
		}
	}

	private void menu() {
		System.out.println("\n1) Leer conductores");
		System.out.println("2) Dar de alta cliente");
		System.out.println("3) Guardar clientes");
		System.out.println("4) Leer Clientes");
		System.out.println("5) Generar Tickets");
		System.out.println("6) Imprimir turno de entrega");
		System.out.println("0) Salir");
		System.out.println("Opción: ");
	}

}
