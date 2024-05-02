package generador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CorreosDAM {
	private ArrayList<String>listaCorreo;
	
	public CorreosDAM() {
		this.listaCorreo = new ArrayList<String>();
	}

	public ArrayList<String> getListaCorreo() {
		return listaCorreo;
	}

	public void setListaCorreo(ArrayList<String> listaCorreo) {
		this.listaCorreo = listaCorreo;
	}

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

	private String formatoCorreo(String nombreCompleto) {
		//nombre.ape1.ape2
		String nombre=nombreCompleto.split(",")[1].trim();
		nombre=nombre.replace(" ","");
		String apellidos=nombreCompleto.split(",")[0].trim().replace(" ", "");
		return nombre+"."+apellidos;
	}

	private String quitarTildes(String nombreCompleto) {
		if(nombreCompleto.contains("á"))
			nombreCompleto=nombreCompleto.replaceAll("á", "a");

		if(nombreCompleto.contains("é"))
			nombreCompleto=nombreCompleto.replaceAll("é", "e");
		
		if(nombreCompleto.contains("í"))
			nombreCompleto=nombreCompleto.replaceAll("í", "i");
		
		if(nombreCompleto.contains("ó"))
			nombreCompleto=nombreCompleto.replaceAll("ó", "o");
		
		if(nombreCompleto.contains("ú"))
			nombreCompleto=nombreCompleto.replaceAll("ú", "u");
		return nombreCompleto;
	}

}
