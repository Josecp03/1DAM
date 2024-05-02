package ejerciciosString;

public class resumen {

	public static void main(String[] args) {
		// indexOf --> Devuelve la posición del String donde se encuentra la cadena que le pases
		String cadena="hola que tal";
		System.out.println(cadena.indexOf("tal"));
		
		// replace --> Remplaza el segundo caracter que le pasas por el primero
		String cadena2="cucu";
		System.out.println(cadena2.replace("u", "o"));
		
		// startsWith --> Devuelve true o false si la cadena empieza por el caracter que le pases
		String cadena3="hola";
		System.out.println(cadena3.startsWith("h"));
		
		// endsWith --> Devuelve true o false si la cadena termina por el caracter que le pases
		String cadena4="olas";
		System.out.println(cadena4.endsWith("s"));
		
		// trim --> Eliminar espacios a la derecha e izquierda de la cadena pero no entre palabras
		String cadena5=" hola que tal ";
		System.out.println(cadena5);
		System.out.println(cadena5.trim());
		
		// substring --> Devuelve un string dentro del string indicando las posiciones del nuevo string
		String cadena6="José Corrochano";
		System.out.println(cadena6.substring(5,cadena6.length()));
		
		// charAt --> Devuelve el caracter que hay en la posicion indicada
		String cadena7="Hola";
		System.out.println(cadena7.charAt(3));

	}

}
