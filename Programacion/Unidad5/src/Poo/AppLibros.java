package Poo;

public class AppLibros {

	public static void main(String[] args) {
		Libro l1=new Libro();
		Libro l2=new Libro();
		l1.generarLibro();
		l2.generarLibro();
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		numeroPaginasMayor(l1,l2);
	}

	private static void numeroPaginasMayor(Libro l1, Libro l2) {
		if (l1.getNumeroPaginas()>l2.getNumeroPaginas())
			System.out.println(l1.getTitulo()+" tiene más número páginas que "+l2.getTitulo());
		else
			System.out.println(l2.getTitulo()+" tiene más número de páginas que "+l1.getTitulo());
	}

}
