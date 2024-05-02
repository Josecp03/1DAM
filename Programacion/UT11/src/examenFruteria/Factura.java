package examenFruteria;

import java.io.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Factura implements Impuestos, Serializable{

	// Atributos
	private String codigoFactura;
	private int codigoPedido;
	private String dniCliente;
	private ArrayList<ProductoPedido>productosPedidos;
	private double total;
	
	// Constructor con todos los parámetros
	public Factura(String codigoFactura, int codigoPedido, String dniCliente, ArrayList<ProductoPedido> productosPedidos,
			double total) {
		this.codigoFactura = codigoFactura;
		this.codigoPedido = codigoPedido;
		this.dniCliente = dniCliente;
		this.productosPedidos = productosPedidos;
		this.total = total;
	}
	
	// Constructor con todos los parámetros menos el AL
	public Factura(String codigoFactura, int codigoPedido, String dniCliente, double total) {
		this.codigoFactura = codigoFactura;
		this.codigoPedido = codigoPedido;
		this.dniCliente = dniCliente;
		this.productosPedidos = new ArrayList<ProductoPedido>();
		this.total = total;
	}
	
	// Constructor por defecto
	public Factura() {
		this.codigoFactura = "";
		this.codigoPedido = 0;
		this.dniCliente = "";
		this.productosPedidos = new ArrayList<ProductoPedido>();
		this.total = 0;
	}

	// Getters y Setters
	public String getCodigoFactura() {
		return codigoFactura;
	}

	public void setCodigoFactura(String codigoFactura) {
		this.codigoFactura = codigoFactura;
	}

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

	public ArrayList<ProductoPedido> getProductosPedidos() {
		return productosPedidos;
	}

	public void setProductosPedidos(ArrayList<ProductoPedido> productosPedidos) {
		this.productosPedidos = productosPedidos;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	// ToString
	@Override
	public String toString() {
		return "Factura [codigoFactura=" + codigoFactura + ", codigoPedido=" + codigoPedido + ", dniCliente="
				+ dniCliente + ", productosPedidos=" + productosPedidos + ", total=" + total + "]";
	}

	// Método de la interfaz impuestos para calcular el IVA reducido
	@Override
	public double ivaReducido() {
		return this.totalSinIVA()*0.04;
	}

	// Método de la interfaz impuestos para calcular el total sin IVA
	@Override
	public double totalSinIVA() {
		
		// Inicializar suma
		double suma = 0;
		
		for (ProductoPedido p : this.getProductosPedidos()) {
			suma += p.getPrecioKg()*p.getKg();
		}
		
		return suma;
	}
	
	// Método para cargar los productos
	public ArrayList<ProductoPedido> cargarProductos() {
		
		ArrayList<ProductoPedido> productosPedidos = new ArrayList<ProductoPedido>();
		
		try {
        	String cadena;
            String[] linea;
        	Scanner entrada=new Scanner(new File("ProductosPedidos.csv"));
        	entrada.nextLine(); // Se salta la primera línea
        	while(entrada.hasNext()) {
        		cadena=entrada.nextLine();
        		linea=cadena.split(";");
        		productosPedidos.add(new ProductoPedido(Integer.parseInt(linea[0]),Integer.parseInt(linea[1]),linea[2],linea[3],linea[4],Double.parseDouble(linea[5]),Double.parseDouble(linea[6])));
        	}
        	
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
			e.printStackTrace();
		}
		
    	return productosPedidos;
		
	}
	
	public static void main(String[] args) {
		Factura f = new Factura();
		f.setProductosPedidos(f.cargarProductos());
		System.out.println(f.totalSinIVA());
		System.out.println(f.ivaReducido());
		for (ProductoPedido p : f.getProductosPedidos()) {
			System.out.println(p);
		}
	}
	
}
