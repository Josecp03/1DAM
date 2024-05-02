package ejercicioPendientes23;

import java.util.Scanner;

public class AppGimnasio {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Monitor m=new Monitor();
		m.cargaActividades();
		
		System.out.println("Usuario");
		String usuario=sc.nextLine();
		System.out.println("Contraseña");
		int contraseña=sc.nextInt();
		
		if(usuario.equalsIgnoreCase("monitor")) {
			for (ActividadReservada a : m.getActividades() ) {
				if(a.getCodigoMonitor()==contraseña)
					System.out.println(a.getNumMaxParticipantes()-a.getNumParticipantes()+" plazas disponibles "+a.getNombreActividad()+" a las "+a.getHora());
			}
		}
		sc.close();
	}

}
