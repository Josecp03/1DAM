package semana2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumerosStream {

	public static void main(String[] args) {
		List<Integer>numeros=Arrays.asList(2,3,4,5,6,7);
		
		// Crear una nueva lista con los cuadrados
		List<Integer> nueva = new ArrayList<Integer>();
		nueva=numeros.stream().map(x->x*x).toList();
		System.out.println(nueva);
		
		// Contar cúantos números hay mayores o iguales a 4
		long cont = numeros.stream().filter(n->n>=4).count();
		System.out.println(cont);
		
		// Media
		double media = numeros.stream().mapToInt(i->i.intValue()).average().getAsDouble();
		System.out.println(media);
		
		// Suma total
		int suma = numeros.stream().mapToInt(i->i.intValue()).sum();
		System.out.println(suma);
		
		// Comprobar si todos son menores que 10
		if(numeros.stream().allMatch(i->i<10)) {
			System.out.println("Todos son menores de 10");
		} else {
			System.out.println("No todos son menores de 10");
		}
		
	}

}
