package Poo;

public class AppPerro {

	public static void main(String[] args) {
		
		//Perro 1
		Perro p1=new Perro("Cooper");
		p1.setRaza("Border Collie");
		p1.setEdad(2);
		p1.setSobrepeso(true);
		System.out.println(p1);
		
		//Perro 2
		Perro p2=new Perro("Lori","Mastín",12);
		System.out.println(p2);
		
		System.out.println("El id del segundo perro es "+p2.getId());
		
		//Qué perro es mayor
		if(p1.getEdad()>p2.getEdad())
			System.out.println(p1.getNombre()+" es mayor que "+p2.getNombre());
		else
			System.out.println(p2.getNombre()+" es mayor que "+p1.getNombre());
		
		//¿Tiene sobrepeso?
		if(p1.isSobrepeso())
			System.out.println(p1.getNombre()+" tiene sobrepeso");
		if(p2.isSobrepeso())
			System.out.println(p2.getNombre()+" tiene sobrepeso");
		
		//Longitud nombre
		System.out.println(p1.getNombre()+" tiene un total de "+p1.getNombre().length()+" carcateres");
		System.out.println(p2.getNombre()+" tiene un total de "+p2.getNombre().length()+" carcateres");	
	}
	
}
