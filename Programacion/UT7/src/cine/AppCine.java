package cine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AppCine {
	private ArrayList<Pelicula> peliculas;
	
	public AppCine() {
		this.peliculas=new ArrayList<Pelicula>();
	}

	//getters y setters
	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	
	public void cargarPeliculas(String fichero) throws FileNotFoundException{
		Scanner entrada=new Scanner(new File(fichero));
		String linea[];
		String cadena;
		entrada.nextLine();
		while(entrada.hasNext()) {
			cadena=entrada.nextLine();
			linea=cadena.split(";");
			this.getPeliculas().add(new Pelicula(Integer.parseInt(linea[0]), linea[1], linea[2], linea[3]));
		}
		
	}//cargar películas
	public static void main(String[] args) throws FileNotFoundException {
		AppCine app=new AppCine();
		app.cargarPeliculas("cine.csv");
		Scanner teclado=new Scanner(System.in);
		int opcion=0;
		do {
			app.menu();
			opcion=teclado.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Año: ");
				int a=teclado.nextInt();
				teclado.nextLine();
				System.out.println("Director: ");
				String dir=teclado.nextLine();
				System.out.println("Género: ");
				String gen=teclado.nextLine();
				System.out.println("Título: ");
				String tit=teclado.nextLine();
				app.nuevaPelicula(a,dir,gen,tit);
				break;
			case 2: 
				teclado.nextLine();
				System.out.println("Título: ");
				String ti=teclado.nextLine();
				app.borrarPelicula(ti);
				break;
			case 3:
				app.mostrarPeliculas();
				break;
			case 4:
				teclado.nextLine();
				System.out.println("Género: ");
				String genBusc=teclado.nextLine();
				app.buscarGenero(genBusc);
				break;
			case 5:
				System.out.println("Adiós");
				break;
			}
			
		}while(opcion!=5);
		teclado.close();
	}

	private void buscarGenero(String genBusc) {
		for (Pelicula p : this.getPeliculas()) {
			if(p.getGenero().equalsIgnoreCase(genBusc)) {
				p.mostrarPelicula();
			}
		}
	}

	private void borrarPelicula(String ti) {
		for(int i=0;i<this.getPeliculas().size();i++){
			if(this.getPeliculas().get(i).getNombre().equals(ti)) {
				this.getPeliculas().remove(i);
			}
		}
	}

	private void nuevaPelicula(int a, String dir, String gen, String tit) {
		this.getPeliculas().add(new Pelicula(a,dir,gen,tit));
	}

	private void mostrarPeliculas() {
		for(Pelicula p: this.getPeliculas()) {
			p.mostrarPelicula();
		}
	}

	private void menu() {
		System.out.println("1. Añadir película");
		System.out.println("2. Borrar película");
		System.out.println("3. Mostrar película");
		System.out.println("4. Buscar por género");
		System.out.println("5. Salir");
	}
	
}
