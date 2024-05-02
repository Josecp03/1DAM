package actividadArtista;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalLong;
import java.util.stream.Collectors;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class App {

	// Atributos
	private ArrayList<Artista>artistas;
	
	// Constructor
	public App() {
		this.artistas = new ArrayList<Artista>();
	}
	
	// Getters y Setters
	public ArrayList<Artista> getArtistas() {
		return artistas;
	}
	
	public void setArtistas(ArrayList<Artista> artistas) {
		this.artistas = artistas;
	}

	// Main
	public static void main(String[] args) {
		App app = new App();
		app.cargarArtistas();
		app.mostrarArtsitas();
		app.sumarOyentesMensuales();
		app.artistasMayores();
		app.audiencia();
		app.artistasPorPais();
	}
	
	// Método para mostrar los artistas
	private void mostrarArtsitas() {
		System.out.println("Los artistas son:\n");
		for (Artista a : this.getArtistas()) {
			System.out.println("\t-"+a);
		}
	}

	// Método para parsear los artistas
	private void parsearArtistas(JSONObject a) {
	    String nombre = (String)a.get("nombre");
	    long edad = (long)a.get("edad");
	    String pais = (String)a.get("pais");
	    long oyentes = (long)a.get("oyentes");
	    String canciones = (String)a.get("canciones");
	    this.getArtistas().add(new Artista(nombre, edad, pais, oyentes, canciones));
	}

	
	// Método para cargar los artistas
	private void cargarArtistas() {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("artistas.json"));
			// Convertir obj en JSONObject
			JSONArray actJson =(JSONArray) obj;
			actJson.forEach(a -> parsearArtistas((JSONObject)a));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// Método para agrupar por países
	private void artistasPorPais() {
		int cont=0;
		System.out.println("\nArtistas agrupados por países:");
		List<String>paises=this.getArtistas().stream().map(a->a.getPais()).distinct().toList();
		for (String p : paises) {
			cont=0;
			System.out.println("\n"+p+")\n");
			for (Artista a : this.getArtistas()) {
				if (a.getPais().equals(p)) {
					cont++;
					System.out.println("\t-"+a.getNombre());
				}
			}
			System.out.println("Total = "+cont);
		}
	}
	
	// Método para calcular el total de oyentes mensuales
    private void sumarOyentesMensuales() {
        long totalOyentes = this.getArtistas().stream().mapToLong(Artista::getOyentes).sum();
        System.out.println("\n"+totalOyentes+"M de oyentes mensuales en Spotify totales");
    }
    
    // Método para contar artistas por encima de los 30 años
    private void artistasMayores() {
        long artistasMayores = this.getArtistas().stream().filter(a ->a.getEdad() > 30).count();
        System.out.println("Hay "+artistasMayores+" artistas por encima de los 30 años");
    }
    
    // Método para mostrar los artistas con mayor y menor audiencia mensual en Spotify
    private void audiencia() {
    	 long maxOyentes = this.getArtistas().stream().mapToLong(Artista::getOyentes).max().getAsLong();
    	 System.out.println("La mayor media de oyentes mensuales es de "+maxOyentes+"M");
    	 long minOyentes = this.getArtistas().stream().mapToLong(Artista::getOyentes).min().getAsLong();
    	 System.out.println("La menor media de oyentes mensuales es de "+minOyentes+"M"); 
    }

}
