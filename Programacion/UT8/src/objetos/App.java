package objetos;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		App app=new App();
		Agenda a=new Agenda();
		a.cargarAgenda("agenda.bin");
		int opcion=0;
		Scanner sc=new Scanner(System.in);
		do {
			app.menu();
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				a.imprimirAgenda();
				break;
			case 2:
				System.out.println("Nombre");
				sc.nextLine();
				String nombre=sc.nextLine();
				System.out.println("Direccion");
				String dir=sc.nextLine();
				System.out.println("Teléfono");
				String tel=sc.nextLine();
				System.out.println("Correo");
				String cor=sc.nextLine();
				a.addContacto(new Contacto(nombre, tel, dir, cor));
				break;
			case 3:
				System.out.println("Nombre");
				String nom=sc.nextLine();
				a.eliminarContacto(nom);
				break;
			case 4:
				a.guardarAgenda("agenda.bin");
				break;
			}
		}while(opcion!=4);
		
		sc.close();
	}
	
	public void menu() {
		System.out.println("1) Imprimir agenda");
		System.out.println("2) Añadir contacto");
		System.out.println("3) Eliminar contacto");
		System.out.println("4) Salir");// Guardar además de salir
		System.out.println("5) Elige una opción: ");
	}
}
