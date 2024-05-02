package aactrBuclesCondiciones;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*Diseñar un programa que muestre el producto de los 10 primeros números impares.*/
		int productoImpares=1;
		for (int i=1;i<=19;i++) {
			if (i%2!=0)
				productoImpares*=i;
		}
		System.out.println("El producto de los 10 primero números impares es "+productoImpares);
	}

}
