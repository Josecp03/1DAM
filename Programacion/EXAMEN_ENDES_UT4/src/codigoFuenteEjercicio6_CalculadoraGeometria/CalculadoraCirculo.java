package codigoFuenteEjercicio6_CalculadoraGeometria;

/**
 * Clase CalculadoraCirculo que representa las operaciones de un cículo.
 * 
 * @author José Corrcohano Pardo
 * @version 1.0
 */
public class CalculadoraCirculo {

	/**
	 * Método para calcular el área de un círculo
	 * 
	 * @param radio
	 * @return	El área del círculo, del tipo 'double'
	 */
	public static double calcularAreaCirculo(double radio) {
        double resultado = Math.PI * radio * radio;
        return resultado;
    }
	
	
}
