     package notasAlumnos;

import java.util.Scanner;

public class ClaseDAM {

	public static void main(String[] args) {
		int opcion=0;
		Scanner sc=new Scanner(System.in);
		Alumno a=new Alumno();
		do {
			System.out.println("1. Dar de alta");
			System.out.println("2. Asignar notas");
			System.out.println("3. Mostrar  número de suspensos del alumno");
			System.out.println("4. Calcular la nota media del alumno");
			System.out.println("5. Salir");
			System.out.println("Elige una opción");
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca el nombre: ");
				String nombre=sc.next();
				System.out.println("Introduzca el apellido: ");
				String apellido=sc.next();
				System.out.println("Introduzca la edad: ");
				int edad=sc.nextInt();
				a.setNombre(nombre);
				a.setApellidos(apellido);
				a.setEdad(edad);
				break;
			case 2:
				for(int i=0;i<a.getNotas().length;i++) {
					System.out.println("Modulo");
					String modulo=sc.next();
					System.out.println("Nota");
					double calificacion=sc.nextDouble();
					a.getNotas()[i].setModulo(modulo);
					a.getNotas()[i].setCalificación(calificacion);
				}
				a.imprimirNotas();
				System.out.println();
				break;
			case 3:
				int contadorSuspensos=0;
				for(int i=0;i<a.getNotas().length;i++) {
					if (a.getNotas()[i].getCalificación()<5)
						contadorSuspensos++;
				}
				System.out.println("El número de suspensos de "+a.getNombre()+" es de "+contadorSuspensos);
				System.out.println();
				break;
			case 4:
				double sumaNotas=0;
				for(int i=0;i<a.getNotas().length;i++) {
					sumaNotas+=a.getNotas()[i].getCalificación();
				}
				System.out.println("La media de "+a.getNombre()+" es de "+sumaNotas/7);
				System.out.println();
				break;
			case 5:
				System.out.println("Saliendo del programa");
				break;
			}
		} while (opcion!=5);
		sc.close();
	}
	
}
