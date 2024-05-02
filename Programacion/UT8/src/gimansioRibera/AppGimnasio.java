package gimansioRibera;

import java.util.Scanner;

public class AppGimnasio {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Usuario");
		String usuario=sc.next();
		System.out.println("Contraseña");
		String codigo=sc.next();
		
		
		if(usuario.equalsIgnoreCase("monitor")) {
			Monitor m=new Monitor(codigo,"José","","");
			m.cargaActividades();
			System.out.println("Monitor: "+m.getNombre()+" "+m.getApellidos());
			m.imprimirPlazasActividades();;
		} else {
			System.out.println("Error!");
		}
		sc.close();
	}
}
