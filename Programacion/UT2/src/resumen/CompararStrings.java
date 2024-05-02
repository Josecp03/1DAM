package resumen;

import java.util.Scanner;

public class CompararStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String usuarioCorrecto="root";
        String contraseñaCorrecta="1234";
        int intentosMaximos=3;
        int intentos=0;
        boolean accesoPermitido=false;
        while (intentos<intentosMaximos && !accesoPermitido) {
            System.out.print("Ingrese su nombre de usuario: ");
            String usuario=sc.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String contraseña=sc.nextLine();
            if (usuario.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta)) {
                System.out.println("Bienvenido al sistema.");
                accesoPermitido=true;
            } else {
                System.err.println("Datos incorrectos. Intento fallido.");
                if (intentos<intentosMaximos-1)
                    System.out.println("Por favor, intente nuevamente.");
                else 
                    System.err.println("Ha superado el número de intentos permitido.");
            }
            intentos++;
        }
        sc.close();
	}
}
