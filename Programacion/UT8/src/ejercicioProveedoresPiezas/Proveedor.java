package ejercicioProveedoresPiezas;

public class Proveedor {

	//Atributos
	private int codProveedor;
	private String nombreProveedor;
	private String localidad;
	
	//Constructor con todos los parámetros
	public Proveedor(int codProveedor, String nombreProveedor, String localidad) {
		this.codProveedor = codProveedor;
		this.nombreProveedor = nombreProveedor;
		this.localidad = localidad;
	}

	//Getters y Setters
	public int getCodProveedor() {
		return codProveedor;
	}

	public void setCodProveedor(int codProveedor) {
		this.codProveedor = codProveedor;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	//toString
	@Override
	public String toString() {
		return "Proveedor [codProveedor=" + codProveedor + ", nombreProveedor=" + nombreProveedor + ", localidad="
				+ localidad + "]";
	}
	
	
	
}
