package codigoFuenteEjercicio6_CalculadoraGeometria;

/**
 * Clase CalculadoraCuadrado que representa las operaciones de un cuadrado.
 * 
 * @author José Corrcohano Pardo
 * @version 1.0
 */
public class CalculadoraCuadrado {

	/**
	 * Método para calcular el área de un cuadrado
	 * 
	 * @param lado
	 * @return	El área de un cuadrado, del tipo 'double'
	 */
	public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

	/**
	 * Método para calcular el volumen de un cuadrado
	 * 
	 * @param lado
	 * @return	Volumen de un cuadrado, del tipo 'double'
	 */
    public static double calcularVolumenCuadrado(double lado) {
        double resultado = lado * lado * lado;
        return resultado;
    }

}
