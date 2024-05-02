package semana2;

import java.util.Arrays;
import java.util.List;

public class Strings {

	public static void main(String[] args) {
		List<String>nombre=Arrays.asList("Juan","Ana","Carmen","Diego");
		
		nombre.forEach(System.out::println);
		nombre.forEach(n->System.out.print(n+" "));
		System.out.println();
		
		// Nombres que empiezan por a
		System.out.println();
		nombre.stream().filter(n->n.startsWith("A")).map(s->s.toUpperCase()).forEach(System.out::println);
		System.out.println();
		
		nombre.stream().sorted().forEach(System.out::println);
		
		List<String>nueva=nombre.stream().filter(n->n.endsWith("a") || n.endsWith("o")).toList();
		System.out.println();
		System.out.println(nueva);
		
		
		
		
	}
}
