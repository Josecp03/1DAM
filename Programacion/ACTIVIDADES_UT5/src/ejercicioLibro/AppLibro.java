package ejercicioLibro;

public class AppLibro {

	public static void main(String[] args) {
		
		//Definir dos objetos de la clase Libro
		Libro libro1=new Libro("978-1-5678-9123-4","Sombras en la Oscuridad","Marta Sánchez",325);
		Libro libro2=new Libro("978-2-3456-7890-1","El Jardín Secreto","Alejandro García",240);
		
		//Mostrar por pantalla los dos libros
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		//Indicar cuál de los 2 tiene más páginas
		if(libro1.getNumPaginas()>libro2.getNumPaginas())
			System.out.println(libro1.getTitulo()+" tiene más páginas que "+libro2.getTitulo());
		else
			System.out.println(libro2.getTitulo()+" tiene más páginas que "+libro1.getTitulo());
	}

}
