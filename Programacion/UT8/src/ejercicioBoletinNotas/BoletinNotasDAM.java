package ejercicioBoletinNotas;


import java.util.ArrayList;
import java.util.Scanner;



import java.io.*;

public class BoletinNotasDAM {
	private ArrayList<Alumno>dam;
	
	public BoletinNotasDAM() {
		this.dam=new ArrayList<>();
	}
	
	public void cargaInicial()  {
		try {
			Scanner entrada= new Scanner(new File("Alumnos.csv"));
			String linea[];
			String cadena;
			while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				linea=cadena.split(";");
					this.getDam().add(new Alumno(Integer.parseInt(linea[0]), linea[1], linea[2], linea[3]));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Alumno> getDam() {
		return dam;
	}

	public void setDam(ArrayList<Alumno> dam) {
		this.dam = dam;
	}

	public void generarBoletines(){
		for(Alumno a: this.getDam()) {
			PrintWriter salida;
			double suma=0;
			try {
				salida = new PrintWriter(new File("boletines/Boletin "+a.getNombre()+" "+a.getApellidos()+".txt"));
				salida.println("IES RIBERA DEL TAJO*");
				salida.println(a.getNombre()+" "+a.getApellidos()+"\n");
				for(Nota n: a.getNotas()) {
					salida.println("\t"+n);
					suma+=n.getNota();
				}
				salida.println("La nota media es: "+(suma/a.getNotas().size()));
				salida.flush();
				salida.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	
	

	public static void main(String[] args) {
		BoletinNotasDAM app=new BoletinNotasDAM();
		app.cargaInicial();
		Scanner sc=new Scanner(System.in);
		int opcion=0;
		do {
			app.menu();
			opcion=sc.nextInt();
		
			switch(opcion) {
			
			case 1:
				for(Alumno a: app.getDam()) {
					a.cargarNotas("matricula.csv");
				}
				
				break;
			case 2:
				app.generarBoletines();
				break;
			case 3:
				System.out.println("FIN");
				break;
			}
		}while(opcion!=3);
		
	}
	


	public void menu() {
		System.out.println("1. Leer notas");
		System.out.println("2. Imprimir boletines");
		System.out.println("3. Salir");
		System.out.println("Elige una opción: ");
	}
}
