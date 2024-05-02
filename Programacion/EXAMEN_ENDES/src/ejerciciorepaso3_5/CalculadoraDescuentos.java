/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorepaso3_5;

/**
 * Clase que representa una calculadora de descuentos para productos.
 */
public class CalculadoraDescuentos {

    /**
     * Calcula el descuento a aplicar a un producto en función de su precio base
     * y el tipo de cliente.
     *
     * @param precioBase el precio base del producto.
     * @param tipoCliente el tipo de cliente (1 para cliente regular, 2 para
     * cliente VIP).
     * @return el descuento a aplicar al producto. Si el tipo de cliente no es
     * válido, devuelve -1.
     */
    public double calcularDescuento(double precioBase, int tipoCliente) {
        double descuento = 0;
        if (tipoCliente == 1) {
            if (precioBase >= 100 && precioBase <= 500) {
                descuento = precioBase * 0.1; // Descuento del 10% para clientes regulares en el rango de precios 100-500
            } else if (precioBase > 500) {
                descuento = precioBase * 0.15; // Descuento del 15% para clientes regulares en el rango de precios mayor a 500
            }
        } else if (tipoCliente == 2) {
            if (precioBase >= 200) {
                descuento = precioBase * 0.2; // Descuento del 20% para clientes VIP en el rango de precios mayor o igual a 200
            }
        }
        return descuento;
    }
    
    public static void main(String[] args) {
    	CalculadoraDescuentos c=new CalculadoraDescuentos();  			
    	/**
		 * PRUEBAS DE CUBRIMIENTO
		 */
    	// Caso de prueba 1
    	System.out.println("Caso 1: "+c.calcularDescuento(200, 1));
    	
    	// Caso de prueba 2
    	System.out.println("Caso 2: "+c.calcularDescuento(600, 1));
    	
    	// Caso de prueba 3
    	System.out.println("Caso 3: "+c.calcularDescuento(300, 2));
    	
    	// Caso de prueba 4
    	System.out.println("Caso 4: "+c.calcularDescuento(100, 3));
    	System.out.println();
    	
    	/**
		 * PRUEBAS DE CONDICIONES
		 */
    	// Caso de prueba 1
    	System.out.println("Caso 1: "+c.calcularDescuento(200, 1));
    	
    	// Caso de prueba 2
    	System.out.println("Caso 2: "+c.calcularDescuento(600, 1));
    	
    	// Caso de prueba 3
    	System.out.println("Caso 3: "+c.calcularDescuento(300, 2));
    	
	}
}
