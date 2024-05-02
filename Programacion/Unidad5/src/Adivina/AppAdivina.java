package Adivina;


public class AppAdivina {

	public static void main(String[] args) {
		Adivina a=new Adivina();
		String cad;
		cad=a.imprimirSinVocales();
		a.setAux(cad);
		System.out.println("LA PALABRA QUE TIENES QUE ADIVINAR ES: "+a.getAux());
		






	}

}
