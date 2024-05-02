
public static void main(String[] args) throws FileNotFoundException {
		PrintWriter salida=new PrintWriter(new File("correosDAM.txt"));
		CorreosDAM app =new CorreosDAM();
		Scanner entrada=new Scanner(new File("dam.csv"));
		String cadena;
		String[]linea;
		String nombreCompleto;//ape1 ape2,nombre
		
		while(entrada.hasNext()) {
			cadena=entrada.nextLine();
			//System.out.println(cadena);
			linea=cadena.split(";");
			nombreCompleto=linea[0].trim().toLowerCase();
			//System.out.println(nombreCompleto);
			
			//quital tildes
			nombreCompleto=app.quitarTildes(nombreCompleto);
			//System.out.println(nombreCompleto);
			
			//nombre.ape1ape2
			nombreCompleto=app.formatoCorreo(nombreCompleto);
			//System.out.println(nombreCompleto);
			
			//añadir correo a un AL de Strings
			app.getListaCorreo().add(nombreCompleto+"@riberadeltajo.es");
		}
		
		//System.out.println(app.getListaCorreo());
		
		for (String s : app.getListaCorreo()) {
			salida.println(s);
		}
		
		//Siempre hay que poner esto, porque sino generaría un txt vacío
		salida.flush();
		salida.close();
		entrada.close();
	}