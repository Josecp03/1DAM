/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoFuenteEjercicio6_CalculadoraGeometria;

import static codigoFuenteEjercicio6_CalculadoraGeometria.CalculadoraCirculo.calcularAreaCirculo;
import static codigoFuenteEjercicio6_CalculadoraGeometria.CalculadoraCuadrado.calcularAreaCuadrado;
import static codigoFuenteEjercicio6_CalculadoraGeometria.CalculadoraCuadrado.calcularVolumenCuadrado;

/** 
 * Clase principal que ejecuta la aplicación.
 * <p>
 * Esta clase contiene el método main, que es el punto de entrada de la aplicación.
 * </p>
 * @author José Corrochano Pardo
 * @version 1.0
 */
public class UsoCalculadoraGeometria {
    
	/**
	 * El punto de entrada principal del programa.
	 * <p>
	 * No devuelve ningún valor ya que su tipo de retorno es 'void'.
	 * </p>
	 * 
	 * @param args	Argumentos de línea de comandos (no utilizados), del tipo 'String[]'
	 */
	public static void main(String[] args) {
		
		// Inicializar el radio
        double radio = 5;
        
        // Inicializar el lado
        double lado = 10;
        
        // Imprimir por pantalla el área del círculo
        System.out.println("Área del círculo: " + calcularAreaCirculo(radio));
        
        // Imprimir por pantalla el área del cuadrado
        System.out.println("Área del cuadrado: " + calcularAreaCuadrado(lado));
        
        // Imprimir por pantalla el volmen del cuadrado
        System.out.println("Volumen del cuadrado: " + calcularVolumenCuadrado(lado));
    }
    
}
