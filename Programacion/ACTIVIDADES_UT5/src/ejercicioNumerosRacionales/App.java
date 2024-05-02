package ejercicioNumerosRacionales;

public class App {

	public static void main(String[] args) {
		//Crear dos relacionales
		Racional n1=new Racional(3, 5);
		Racional n2=new Racional(8, 5);
		Racional n3=new Racional(1, 3);

		//Suma
		System.out.println("\n"+n1+" + "+n3+" = "+n1.suma(n3)+"\n");
		
		//Resta
		System.out.println(n1+" - "+n2+" = "+n1.resta(n2)+"\n");
		
		//Producto
		System.out.println(n1+" * "+n2+" = "+n1.producto(n2)+"\n");
		
		//Division
		System.out.println(n1+" : "+n3+" = "+n1.division(n3));
	}

}
