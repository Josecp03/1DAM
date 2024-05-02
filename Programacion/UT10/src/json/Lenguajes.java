package json;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Lenguajes {

	public static void main(String[] args) {
		
		int min = 2024;
		int fecha = 0;
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("lenguajes.json"));
			// Convertir obj en JSONObject
			JSONArray lenguajes =(JSONArray)obj;
			//lenguajes.forEach(l->parsearLenguaje((JSONObject)l));
			for (Object o : lenguajes) {
				fecha=Integer.parseInt(parsearLenguaje((JSONObject)o));
				if (fecha<min) {
					min = fecha;
				}
			}
			System.out.println("El lenguaje más antiguo es de: "+min);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static String parsearLenguaje(JSONObject l) {
		// Extraer los datos del objeto JSON
		String nombre = (String)l.get("name");
		String fecha = (String)l.get("publish_date");
		String descripcion = (String)l.get("description");
		System.out.println(nombre+" "+fecha);
		return fecha;
	} 

}
