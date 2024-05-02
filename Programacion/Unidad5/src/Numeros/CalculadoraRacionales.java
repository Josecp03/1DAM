package Numeros;

public class CalculadoraRacionales {

	public static void main(String[] args) {
		Racional r=new Racional(1,2);
		Racional s=new Racional(1,4);
		System.out.println(r+" * "+s+" = "+r.producto(s));
		System.out.println(r+" : "+s+" = "+r.division(s));
		System.out.println(r+" - "+s+" = "+r.resta(s));
		

	}

}
