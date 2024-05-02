package ejercicioPerro;

public class Principal {

	public static void main(String[] args) {
		
		//Definir dos objetos de la clase Perro
		Perro perro1=new Perro("Tobby","Pastor Alemán",10);
		Perro perro2=new Perro("Hera","BullDog",4);
		
		//Mostrar los perros
		System.out.println(perro1.toString());
		System.out.println(perro2.toString());
		
		//Mostrar ID de los perros
		System.out.println("La ID de "+perro1.getNombre()+" es "+perro1.getId());
		System.out.println("La ID de "+perro2.getNombre()+" es "+perro2.getId());
		
		//¿Qué perro es mayor?
		if(perro1.getEdad()>perro2.getEdad())
			System.out.println(perro1.getNombre()+" es mayor que "+perro2.getNombre());
		else
			System.out.println(perro2.getNombre()+" es mayor que "+perro1.getNombre());
		
		//¿Los perros tienen sobrepeso?
		//Perro 1
		if(perro1.isSobrepeso())
			System.out.println(perro1.getNombre()+" tiene sobrepeso");
		else
			System.out.println(perro1.getNombre()+" no tiene sobrepeso");
		//Perro 2
		if(perro2.isSobrepeso())
			System.out.println(perro2.getNombre()+" tiene sobrepeso");
		else
			System.out.println(perro2.getNombre()+" no tiene sobrepeso");
		
		//Longitud del nombre
		System.out.println(perro1.getNombre()+" tiene "+perro1.getNombre().length()+" palabras de longitud en su nombre");
		System.out.println(perro2.getNombre()+" tiene "+perro2.getNombre().length()+" palabras de longitud en su nombre");
	}

}
