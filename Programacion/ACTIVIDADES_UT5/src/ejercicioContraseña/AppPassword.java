package ejercicioContraseña;

import java.util.Scanner;

public class AppPassword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String cadena1="";
		String cadena2="";
		//Definir dos objetos de las clase Password
		Password contraseña1=new Password();
		Password contraseña2=new Password();
		
		//Generar las dos contraseñas con longitud 6
		//Contraseña 1
		do {
			System.out.println("Introduzca la primera cadena(longitud=6): ");
			cadena1=sc.nextLine();
		}while(cadena1.length()!=6);
		contraseña1.generarContraseña(cadena1);
		//Contraseña 2
		do {
			System.out.println("Introduzca la segunda cadena(longitud=6): ");
			cadena2=sc.nextLine();
		}while(cadena2.length()!=6);
		contraseña2.generarContraseña(cadena2);
		
		//Mostrar las dos contraseñas
		System.out.println("La primera contraseña es: "+contraseña1.getContraseña());
		System.out.println("La segunda contraseña es: "+contraseña2.getContraseña());
		
		//Longitud de las contraseñas
		System.out.println("La longitud de "+contraseña1.getContraseña()+" es de "+contraseña1.getLongitud());
		System.out.println("La longitud de "+contraseña2.getContraseña()+" es de "+contraseña2.getLongitud());
		
		//¿Son iguales?
		if(contraseña1.getContraseña().equals(contraseña2.getContraseña()))
			System.out.println(contraseña1.getContraseña()+" y "+contraseña2.getContraseña()+" son iguales");
		else
			System.out.println(contraseña1.getContraseña()+" y "+contraseña2.getContraseña()+" son distintas");
		
		//Cerrar scanner
		sc.close();
	}

}
