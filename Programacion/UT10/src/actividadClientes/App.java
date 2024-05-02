package actividadClientes;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class App {

	// Atributos
	ArrayList<Cliente>clientes;

	// Constructor
	public App() {			
		this.clientes = new ArrayList<Cliente>();
	}

	// Getters y Setters
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	// ToString
	@Override
	public String toString() {
		return "App [clientes=" + clientes + "]";
	}

	public static void main(String[] args) {
		App app = new App();
		app.cargarCliente();
		app.mostrarClientes();
		
	}

	// Método para parsear los artistas
	private void parsearCliente(JSONObject c) {
		String nombre = (String)c.get("nombre");
		long edad = (long)c.get("edad");
		String ciudad = (String)c.get("ciudad");
		
		JSONArray comprasJson = (JSONArray) c.get("compras");
		ArrayList<Producto> listaCompras = new ArrayList<>();
	    for (Object compraObj : comprasJson) {
	        JSONObject compraJson = (JSONObject) compraObj;
	        String nombreP = (String) compraJson.get("nombreP");
	        double precio = (double) compraJson.get("precio");
	        long cantidad = (long) compraJson.get("cantidad");
	        listaCompras.add(new Producto(nombreP, precio, cantidad));
	    }
	    this.getClientes().add(new Cliente(nombre, edad, ciudad, listaCompras));
	}

		
	// Método para cargar los artistas
	private void cargarCliente() {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("clientes.json"));
			// Convertir obj en JSONObject
			JSONArray actJson =(JSONArray) obj;
			actJson.forEach(c -> parsearCliente((JSONObject)c));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// Método para mostrar la información de los clientes y sus compras
	public void mostrarClientes() {
		double suma = 0;
	    for (Cliente c : this.getClientes()) {
	        System.out.println("Cliente: "+c.getNombre());
	        suma=0;
	        for (Producto compra : c.getCompras()) {
	        	System.out.println("\t-"+compra.getNombre()+" "+compra.getPrecio()+"€ ("+compra.getCantidad()+" unidad/es)");
	            suma+=(compra.getCantidad()*compra.getPrecio());
	        }
	        System.out.println("Total: "+suma+"€\n");
	    }
	}

}
