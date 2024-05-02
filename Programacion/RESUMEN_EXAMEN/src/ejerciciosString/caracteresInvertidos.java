package ejerciciosString;

public class caracteresInvertidos {

	public static void main(String[] args) {
		String cadena="hola";
		for (int i = cadena.length()-1; i >= 0; i--) {
			System.out.print(cadena.charAt(i));
		}
	}

}
