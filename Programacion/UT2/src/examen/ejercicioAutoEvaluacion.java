package examen;

import java.util.Scanner;

public class ejercicioAutoEvaluacion {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca su nombre:");
		String nombre=sc.nextLine();
		System.out.println("Bienvenido, "+nombre);
		System.out.println("Introduzca su año de nacimiento: ");
		int anoNacimiento=sc.nextInt();
		int edad=2023-anoNacimiento;
		System.out.println("Tienes "+edad+" años");
		if (edad>18)
			System.out.println("Eres mayor de edad");
		else if(edad<18)
			System.out.println("Eres menor de edad");
		else
			System.out.println("Tienes 18 años?");
		System.out.println("1. Pedir al usuario un numero y mostrar el dia de la semana");
		System.out.println("2. Pedir al usuario que nos de 6 notas y calcular la media");
		System.out.println("3. Pedir al usuario un numero y mostrar los impares que hay desde 1 hasta el numero");
		System.out.println("4. Pedir al usuario un numero y sumar los pares hasta el numero");
		int opcion;
		do {
			System.out.println("Introduzca una opción (1-4):");
			opcion=sc.nextInt();
		} while (opcion<1 && opcion<4);
		switch (opcion) {
			case 1:
				int numeroDia;
				do {
				System.out.println("Introduzca un número: ");
				numeroDia=sc.nextInt();
				}while (numeroDia<1 && numeroDia>7);
				switch (numeroDia) {
					case 1:
						System.out.println("Lunes");
						break;
					case 2:
						System.out.println("Martes");
						break;
					case 3:
						System.out.println("Miércoles");
						break;
					case 4:
						System.out.println("Jueves");
						break;
					case 5:
						System.out.println("Viernes");
						break;
					case 6:
						System.out.println("Sábado");
						break;
					case 7:
						System.out.println("Domingo");
						break;
				}
				break;
			case 2:
				int sumaNotas=0;
				for (int i=1;i<=6;i++) {
					System.out.println("Introduzca la nota "+i+": ");
					int nota=sc.nextInt();
					sumaNotas+=nota;
				}
				float media=(float)sumaNotas/6;
				System.out.println("La media de las notas es "+media);
				break;
			case 3:
				int contadorImpares=0;
				System.out.println("Introduzca un número: ");
				int numeroMaxImpares=sc.nextInt();
				for (int i=1;i<=numeroMaxImpares;i++) {
					if (i%2!=0)
						contadorImpares++;
				}
				System.out.println("Hay "+contadorImpares+" impares entre 1 y "+numeroMaxImpares);
				break;
			case 4:
				int sumaPares=0;
				System.out.println("Introduzca un número: ");
				int numeroMaxPares=sc.nextInt();
				for (int i=1;i<=numeroMaxPares;i++) {
					if (i%2==0)
						sumaPares+=i;
				}
				System.out.println("La suma de los pares entre 1 y "+numeroMaxPares+" es "+sumaPares);
		}
		sc.close();
	}

}
