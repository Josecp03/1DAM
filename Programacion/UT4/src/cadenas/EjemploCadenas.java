package cadenas;

public class EjemploCadenas {

	public static void main(String[] args) {
		String palabra="Hola";
		String pass=new String("DFADf_jfdf123*");
		//Letras que componen el String
		for(int i=0; i<palabra.length();i++) 
			System.out.println(palabra.charAt(i));//palabra[i]
		//Sustituir un caracter por otro
		palabra=palabra.replace('o','a');
		System.out.println(palabra);
		//Subcadenas
		palabra="murciélago";
		String subpalabra=palabra.substring(3);
		System.out.println(subpalabra);
		subpalabra=palabra.substring(3,6);//3 a 5
		System.out.println(subpalabra);
		
		//Contiene un substring
		if(pass.contains("_"))
			System.out.println("Contiene_");
		//Todo en mayúscula
		System.out.println(palabra.toUpperCase());
		if(palabra.equalsIgnoreCase("murciélago"))
			System.out.println("Es igual independientemente de mayusculas y minusculas");
	}

}
