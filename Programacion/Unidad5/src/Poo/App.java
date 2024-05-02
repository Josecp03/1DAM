package Poo;

public class App {

	public static void main(String[] args) {
		//Crear un alumno
		Alumno a=new Alumno("1111111H", "Lucía", "López", "Hita", 19, "Plaza del Pan", "666666666");
		System.out.println(a);//Hace autimáticamente el toString
		a.setEdad(20);//Modificar edad
		System.out.println("La edad de "+a.getNombre()+" es "+a.getEdad());//Comprobamos que se modifica
		a.setNombre(a.getNombre().toUpperCase());//Para modifiicar el nombre para ponerlo en mayúsculas
		System.out.println(a.getNombre());//Comprobamos que se ha puesto en mayúsculas
		
		//Otro objeto
		Alumno b=new Alumno();
		System.out.println(b);//Se rellenan los datos con los defaults 
		b.setNombre("Juan");
		b.setApellido1("Carrión");
		b.setEdad(24);
		System.out.println(b);//Solamente se completan los atributos que he especificado
		
		//Alumno mayor
		if(a.getEdad()>b.getEdad())
			System.out.println(a.getNombre()+" es mayor");
		else
			System.out.println(b.getNombre()+" es mayor");
	}

}
