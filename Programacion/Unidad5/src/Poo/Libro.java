package Poo;

public class Libro {
	private String ISBN;
	private String Titulo;
	private String Autor;
	private int NumeroPaginas;
	
	//Constructor por defecto
	public Libro() {
		this.ISBN="";
		this.Titulo="";
		this.Autor="";
		this.NumeroPaginas=0;
	}

	//Getters and Setters
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getNumeroPaginas() {
		return NumeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		NumeroPaginas = numeroPaginas;
	}

	//toString
	@Override
	public String toString() {
		return "El libro "+this.Titulo+" con ISBN "+this.ISBN+" creado por "+this.Autor+" tiene "+this.NumeroPaginas+" páginas";
	}
	
	public void generarLibro() {
		//this.Titulo
		String[]titulos={"Cincuenta sombras de Grey","Twilight","El código Da Vinci","El alquimista","Crepúsculo rojo"};
		int indice=(int)(Math.random()*5);
		this.Titulo=titulos[indice];
		//this.ISBN
		String[]isbns={"978-1-234567-89-0","978-3-456789-12-3","978-9-876543-21-0","978-5-432109-87-6","978-0-987654-32-1"};
		this.ISBN=isbns[indice];
		//this.Autor
		String[]autores={"E.L. James","Stephenie Meyer","Dan Brown","Paulo Coelho","Guillermo del Toro"};
		this.Autor=autores[indice];
		//this.NumeroPaginas
		int[]paginas={514,498,590,208,608};
		this.NumeroPaginas=paginas[indice];
	}
	
	
	
}
