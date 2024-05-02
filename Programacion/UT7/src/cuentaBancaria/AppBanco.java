package cuentaBancaria;

import java.util.ArrayList;
import java.util.Scanner;

public class AppBanco {
	private ArrayList<Cliente> clientes;
	
	public AppBanco() {
		this.clientes=new ArrayList<Cliente>();
	}
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public static void main(String[] args) {
		Cuenta c1=new Cuenta("ES234211", "Nomina", "B123", "A123", 1000);
		Cuenta c2=new Cuenta("ES234212", "Ahorro", "B123", "A125", 10000);
		Cliente cli=new Cliente("B123", "123H", "Francisco", "Álvarez");
		cli.getCuentas().add(c1);
		cli.getCuentas().add(c2);
		Cuenta c3=new Cuenta("ES234211", "Ahorro Boda", "B124", "A128", 14200);
		Cuenta c4=new Cuenta("ES234212", "Compartida", "B124", "A129", 17000);
		Cliente cli2=new Cliente("B124", "11111J", "Marta", "López", new ArrayList<>());
		cli2.getCuentas().add(c4);
		cli2.getCuentas().add(c3);
		////////////////////////////////////////////////////
		AppBanco app=new AppBanco();
		app.getClientes().add(cli);
		app.getClientes().add(cli2);
		int opcion=0;
		Scanner teclado=new Scanner(System.in);
		do {
			app.menu();
			opcion=teclado.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Introduzca el DNI: ");
				String dni=teclado.next();
				teclado.nextLine();
				System.out.println("Introduzca el nombre: ");
				String nombre=teclado.nextLine();
				System.out.println("Introduzca los apellidos");
				String apellidos=teclado.nextLine();
				app.nuevoCliente(dni,nombre,apellidos);
				break;
			case 2:
				app.mostarClientes();
				break;
			case 3:
				System.out.println("Codigo cliente:");
				String codigo=teclado.next();
				app.accesoCliente(codigo);
				break;
			}
		}while(opcion!=4);
		teclado.close();
	}

	private void nuevoCliente(String dni, String nombre, String apellidos) {
		String codigo="B"+(int)(Math.random()*999);		
		this.getClientes().add(new Cliente(codigo,dni,nombre,apellidos));
	}

	private void accesoCliente(String codigo) {
		boolean clienteEncontrado = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCodigoCliente().equals(codigo)) {
                clienteEncontrado = true;
                System.out.println("Cuentas del cliente " + cliente.getNombre() + " " + cliente.getApellidos() + ":");
                cliente.mostrarCuentas();
                System.out.println("Saldo total del cliente: " + cliente.totalCuentas() + "€");
            }
        }
        if (!clienteEncontrado) {
            System.out.println("Cliente no encontrado.");
        }
	}

	private void mostarClientes() {
		for(Cliente cli: this.getClientes()) {
			System.out.println(cli);
		}
	}
	
	private void menu() {
		System.out.println("1. Alta cliente");
		System.out.println("2. Mostrar clientes");
		System.out.println("3. Acceso cliente");
		System.out.println("4. Salir");
	}

}
