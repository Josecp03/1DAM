package actividadClientes;

public class Producto {

	// Atributos
	private String nombre;
	private double precio;
	private long cantidad;
	
	// Constructor con todos los parámetros
	public Producto(String nombre, double precio, long cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	// Constructor por defecto
	public Producto() {
		this.nombre = "";
		this.precio = 0;
		this.cantidad = 0;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	// ToString
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
}
