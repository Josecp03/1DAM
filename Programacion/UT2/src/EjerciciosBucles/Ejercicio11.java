package EjerciciosBucles;

public class Ejercicio11 {

	public static void main(String[] args) {
		// Diseñar un programa que muestre el producto de los 10 primeros números impares.
		int productoImpares=1;
		for (int i=1;i<=20;i+=2) {
			productoImpares*=i;
		}
		System.out.println("El producto de los 10 primeros impares es: "+productoImpares);
	}
}
