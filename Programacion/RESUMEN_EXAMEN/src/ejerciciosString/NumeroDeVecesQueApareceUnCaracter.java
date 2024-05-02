package ejerciciosString;

public class NumeroDeVecesQueApareceUnCaracter {

	public static void main(String[] args) {
		String cadena="hola que tal estas";
		int contA=0;
		int contE=0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A') {
	            contA++;
	        } else if(cadena.charAt(i) == 'e' || cadena.charAt(i) == 'E') {
	        	contE++;
	        }
		}
		System.out.println("A--> "+contA);
		System.out.println("E--> "+contE);
	}

}
