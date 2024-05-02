package actividadesRepasoRefuerzo;

import java.util.Scanner;

public class CálculoNómina {

	public static void main(String[] args) {
	System.out.println("********************************************");
	System.out.println("Cálculo de nómina	 				");
	System.out.println("************************************");
	System.out.println("1)Programador Junior");
	System.out.println("2)Programador senior");
	System.out.println("3)Jefe Proyecto");
	Scanner teclado=new Scanner(System.in);
	int numeroCargo=0;
	int numeroDias=0;
	int numeroCivil=0;
	boolean numeroValido=false;
	while (!numeroValido) {// Detectar si el valor introducido es un valor numérico
		System.out.println("Introduzca el cargo de empleado: ");
		if (teclado.hasNextInt()) {
			numeroCargo=teclado.nextInt();
			if (numeroCargo<=0 || numeroCargo>3) {// Detectar si n es número dsitinto de 1, 2 y 3
				System.err.println("Error! El número tiene que ser del 1 al 3");
			} else {
				numeroValido=true;
			}
		} else {
			System.err.println("Error! Introduzca un número");
			teclado.nextLine();
		}
	}
	teclado.nextLine();
	numeroValido=false;
	while (!numeroValido) {// Detectar si el valor introducido es un valor numérico
		System.out.println("¿Cuántos días ha estado de viaje visitando clientes? ");
		if (teclado.hasNextInt()) {
			numeroDias=teclado.nextInt();
			if (numeroDias>31) {// Detectar si n es número dsitinto de 1, 2 y 3
				System.err.println("Error! El número de días es demasaido grande");
			} else {
				numeroValido=true;
			}
		} else {
			System.err.println("Error! Introduzca un número");
			teclado.nextLine();
		}
	}
	teclado.nextLine();
	numeroValido=false;
	while (!numeroValido) {// Detectar si el valor introducido es un valor numérico
		System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
		if (teclado.hasNextInt()) {
			numeroCivil=teclado.nextInt();
			if (numeroCivil<=0 || numeroCivil >2) {// Detectar si n es número dsitinto de 1 o 2
				System.err.println("Error! El número tiene que ser 1 o 2");
			} else {
				numeroValido=true;
			}
		} else {
			System.err.println("Error! Introduzca un número");
			teclado.next();
		}
	}
	double sueldoBase=0;
	switch(numeroCargo) {
		case 1:
			sueldoBase=950;
			break;
		case 2:
			sueldoBase=1200;
			break;
		case 3:
			sueldoBase=1600;
			break;	
	}
	double porcentajeIRPF;
	if (numeroCivil==1) {
		porcentajeIRPF=25;
	} else {
		porcentajeIRPF=20;
	}
	double sueldoViajes= 30*numeroDias;
	double sueldoBruto=sueldoBase+sueldoViajes;
	double retencionIRPF=sueldoBruto*(porcentajeIRPF/100);
	double sueldoNeto= sueldoBruto-retencionIRPF;
	System.out.println("_________________________________________________");
	System.out.println("Sueldo base "+sueldoBase+"€");
	System.out.println("Dietas ("+numeroDias+" viajes): "+sueldoViajes+"€");
	System.out.println("_________________________________________________");
	System.out.println("Sueldo bruto "+sueldoBruto+"€");	
	System.out.println("Retención IRPF ("+porcentajeIRPF+"):"+retencionIRPF+"€");
	System.out.println("_________________________________________________");
	System.out.println("Sueldo neto: "+sueldoNeto+"€");
	teclado.close();
	}
}