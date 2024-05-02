package json;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AppActores {

	// Atributos
	private ArrayList<Actor>actores;
	
	// Constructor
	public AppActores() {
		this.actores = new ArrayList<Actor>();
	}

	// Getters y Setters
	public ArrayList<Actor> getActores() {
		return actores;
	}

	public void setActores(ArrayList<Actor> actores) {
		this.actores = actores;
	}
 
	public static void main(String[] args) {
		AppActores app = new AppActores();// AL de actores
		app.cargarActores();
		System.out.println(app.getActores());
		app.actoresPorPais();
	}

	private void actoresPorPais() {
		
	}

	private void cargarActores() {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("actores.json"));
			// Convertir obj en JSONObject
			JSONArray actJson =(JSONArray) obj;
			//lenguajes.forEach(l->parsearLenguaje((JSONObject)l));
			actJson.forEach(a -> parsearActores((JSONObject)a));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void parsearActores(JSONObject a) {
		String nombre=(String)a.get("first_name");
		String apellidos=(String)a.get("last_name");
		String edad=(String)a.get("age");
		String peliculas=(String)a.get("movies");
		String pais=(String)a.get("country");
		this.getActores().add(new Actor(nombre, apellidos, edad, peliculas, pais));
	}

}
