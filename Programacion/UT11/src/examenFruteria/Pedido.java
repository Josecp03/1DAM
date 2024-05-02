package examenFruteria;

public class Pedido {

	// Atributos
	private int codigoPedido;
	private String dniCliente;
	private double descuento;
	private int turno;
	
	// Constructor con todos los parámetros
	public Pedido(int codigoPedido, String dniCliente, double descuento, int turno) {
		this.codigoPedido = codigoPedido;
		this.dniCliente = dniCliente;
		this.descuento = descuento;
		this.turno = turno;
	}
	
	// Constructor por defecto
	public Pedido() {
		this.codigoPedido = 0;
		this.dniCliente = "";
		this.descuento = 0;
		this.turno = 0;
	}

	// Getters y Setters
	public int getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	// ToString
	@Override
	public String toString() {
		return "Pedido [codigoPedido=" + codigoPedido + ", dniCliente=" + dniCliente + ", descuento=" + descuento
				+ ", turno=" + turno + "]";
	}
	
}
