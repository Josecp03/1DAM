package matricula;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class AppDAM {
	private LinkedList<Alumno> preinscritos;
	private LinkedList<Alumno> matriculados;
	
	public AppDAM(LinkedList<Alumno> preinscritos, LinkedList<Alumno> matriculados) {
		this.preinscritos = preinscritos;
		this.matriculados = matriculados;
	}
	
	public AppDAM() {
		this.preinscritos =new LinkedList<Alumno>();
		this.matriculados =new LinkedList<Alumno>();
	}
	
	public LinkedList<Alumno> getPreinscritos() {
		return preinscritos;
	}

	public void setPreinscritos(LinkedList<Alumno> preinscritos) {
		this.preinscritos = preinscritos;
	}

	public LinkedList<Alumno> getMatriculados() {
		return matriculados;
	}

	public void setMatriculados(LinkedList<Alumno> matriculados) {
		this.matriculados = matriculados;
	}

	public void cargarAlumnos(String fichero) throws FileNotFoundException{
		Scanner entrada=new Scanner(new File(fichero));
		String linea[];
		String cadena;
		entrada.nextLine();
		while(entrada.hasNext()) {
			cadena=entrada.nextLine();
			linea=cadena.split(";");
			this.getPreinscritos().add(new Alumno(linea[0], linea[1], linea[2], linea[3]));
		}
		
	}//cargar alumnos
	
	public static void main(String[] args) throws FileNotFoundException {
		AppDAM app=new AppDAM();//reservar memoria para las dos listas
		app.cargarAlumnos("alumnos.csv");
		Scanner sc=new Scanner(System.in);
		int opcion=0;
		do {
			menu();
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				//Matricular alumnos: Borrar el 1º de inscritos y añadir el último en matriculados
				app.matricularAlumnos();
				break;
			case 2: 
				//Borrar matrícula dado DNI
				System.out.println("Introduzca el dni: ");
				String dni=sc.next();
				app.borrarMatriculado(dni);
				break;
			case 3:
				app.verUltimo();
				//Mostrar último matriculado
				break;
			case 4:
				//Mostrar matriculados
				app.mostrarMatriculados();
				break;
			case 5:
				System.out.println("Adiós");
				break;
			}
		}while(opcion!=5);
		sc.close();
		
	}

	private void borrarMatriculado(String dni) {
//		//forEach
//		for(Alumno a: this.getMatriculados())
//			if(a.getDni().equals(dni))
//				this.getMatriculados().remove(a);
//		
		//for
		for(int i=0; i<this.getMatriculados().size();i++)
			if(this.getMatriculados().get(i).getDni().equals(dni))
				this.getMatriculados().remove(i);
	}

	private void verUltimo() {
		if(this.getMatriculados().size()>0)
			this.getMatriculados().getLast().mostrarAlumno();	
		else
			System.out.println("No hay alumnos matriculados");
	}

	private void matricularAlumnos() {
		if(this.getPreinscritos().size()>0){
			this.getMatriculados().addLast(this.getPreinscritos().removeFirst());
		}else {
			System.out.println("No hay alumnos para matricular");
		}
	}

	private void mostrarMatriculados() {
		for (Alumno a : this.getMatriculados()) {
			a.mostrarAlumno();
		}	
	}

	private static void menu() {
		System.out.println();
		System.out.println("1) Matricular alumno");
		System.out.println("2) Borrar alumno matriculado con dni");
		System.out.println("3) Mostrar útimo alumno matriculado");
		System.out.println("4) Mostrar alumnos matriculados");
		System.out.println("5) Salir");
		System.out.println();
	}

}
