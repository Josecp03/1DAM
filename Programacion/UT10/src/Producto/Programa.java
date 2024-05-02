package Producto;

import java.util.ArrayList;
import java.util.List;

public class Programa {
	private ArrayList<Producto>productos;
	
	public Programa() {
		this.productos=new ArrayList<Producto>();
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public static void main(String[] args) {
		Programa p=new Programa();
		
		p.getProductos().add(new Producto("1", "HP Laptop", 0.5, 2500, "portátil"));
		p.getProductos().add(new Producto("2","Teclado logitech",0.15,25,"teclado"));
		p.getProductos().add(new Producto("3", "Raton logitech", 0.25, 15, "ratón"));
		p.getProductos().add(new Producto("4", "Samsung Galaxy Note 20", 0.1, 1000, "telefono"));
		p.getProductos().add(new Producto("5", "Iphone 7", 0.1, 1000, "telefono"));
		p.getProductos().add(new Producto("6", "Disco SSD", 0.2, 300, "disco"));
		
		System.out.println("1) Nombre de los productos vendidos");
		p.getProductos().stream().forEach(n->System.out.println(n.getNombre()));
		
		System.out.println("\n2) Cuantos productos hay que empiecen por H");
		long cont = p.getProductos().stream().filter(prod->prod.getNombre().startsWith("H")).count();
		System.out.println(cont);
		
		System.out.println("\n3) Productos vendidos de más de 1000€");
		p.getProductos().stream().filter(n->n.getPrecio()>=1000).forEach(n->System.out.println(n.getNombre()));
		
		System.out.println("\n4) Nombre, peso y precio de los productos que pesan menos de 0.5");
		p.getProductos().stream().filter(n->n.getPeso()<0.5).forEach(n->System.out.println(n.getNombre()+" "+n.getPeso()+" "+n.getPrecio()));
		
		System.out.println("\n5) Total de los productos vendidos");
		double suma = p.getProductos().stream().mapToDouble(n->n.getPrecio()).sum();
		System.out.println("Total: "+suma+"€");
		
		System.out.println("\n6) Lista nueva con los telefonos vendidos");
		List<Producto> nueva = p.getProductos().stream().filter(n->n.getCategoria().equals("telefono")).toList();
		nueva.forEach(System.out::println);
		
		System.out.println("\n7) Lista de precios de los productos de más de 500€");
		List<Double> precios = p.getProductos().stream().filter(n->n.getPrecio()>500).map(n->n.getPrecio()).toList();
		precios.forEach(System.out::println);
		
		System.out.println("\n8) Precio del producto vendido más caro");
		double max = p.getProductos().stream().mapToDouble(n->n.getPrecio()).max().getAsDouble();
		System.out.println(max+"€");
		
		System.out.println("\n9) Precio del producto vendido más barato");
		double min = p.getProductos().stream().mapToDouble(n->n.getPrecio()).min().getAsDouble();
		System.out.println(min+"€");
		
		System.out.println("\n10) Nombres de productos en mayúsculas de menos de 100€ y menos de 0,5 kg");
		p.getProductos().stream().filter(n->n.getPrecio()<100 && n.getPeso()<0.5).forEach(n->System.out.println(n.getNombre().toUpperCase()));
	}
}
