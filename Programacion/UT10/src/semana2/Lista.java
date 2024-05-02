package semana2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 2, 12, 5, 6, 11, 13);
		
		// Imprimir Streams
		System.out.println();
		list.forEach(i->System.out.println(i));
		System.out.println();
		// Si los dos i son lo mismo
		list.forEach(System.out::println);
		
		// Contar los numeros pares de la lista
		int cont=0;
		for (Integer integer : list) {
			if (integer%2==0) {
				cont++;
			}
		}
		System.out.println();
		System.out.println(cont);
		System.out.println();
		
		// Contar con Streams
		long contador = list.stream().filter(i->i%2==0).count();
		System.out.println(contador);
		System.out.println();
		
		// Crear lista nueva con números pares
		List<Integer> nueva = new ArrayList<Integer>();
		nueva=list.stream().filter(n->n%2==0).toList();
		System.out.println(nueva);
		
		// Acumulador con Streams
		int suma=0;
		suma=list.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();
		System.out.println("La suma es "+suma);
		
		// Media
		double media=list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println(media);
		System.out.println();
		
		// Menores de 10
		boolean menor = list.stream().anyMatch(n->n<10);
		if (menor) {
			System.out.println("Hay un menor de 10");
		} else {
			System.out.println("No hay un menor de 10");
		}
		
		
//		List<Integer> pares = new ArrayList<>();
//		int contPares=0;
//		int sumPares=0;
//		boolean menor=false;
//		for (Integer i : list) {
//			if (i % 2 == 0) {
//				contPares++;
//				sumPares+=i;
//				pares.add(i);
//			}
//			if (i < 10) {
//				menor=true;
//			}
//		}
//		System.out.println("La lista de los pares es: ");
//		for (Integer num : pares) {
//			System.out.print(num+" ");
//		}
//		System.out.println("\nEl número de pares: "+contPares);
//		System.out.println("La suma de los pares: "+sumPares);
//		if (menor) {
//			System.out.println("Hay algún entero menor que 10");
//		}
//		
	}
}
