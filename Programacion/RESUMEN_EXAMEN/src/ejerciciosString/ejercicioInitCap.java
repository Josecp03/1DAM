package ejerciciosString;

public class ejercicioInitCap {

	public static void main(String[] args) {
		String cadena="josé";
		System.out.println(cadena.substring(0,1).toUpperCase()+cadena.substring(1,cadena.length()).toLowerCase());
	}

}
