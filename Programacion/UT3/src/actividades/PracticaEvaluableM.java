package actividades;

import java.util.Scanner;

public class PracticaEvaluableM {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n1,n2;
		String opcion;
		do {
            System.out.print("Ingrese el primer número entero positivo: ");
            n1=sc.nextInt();
            System.out.print("Ingrese el segundo número entero positivo: ");
            n2=sc.nextInt();
        } while (!correctos(n1, n2));
		sc.nextLine();
		do {
			mostrarmenu();
			opcion=sc.nextLine();
			switch (opcion) {
			case "a":
				sonamigos(n1,n2);
				break;
			case "b":
				contarprimos(n1,n2);
				break;
			case "c":
				mostrarcifras(n1);
				mostrarcifras2(n1);
				break;
			case "d":
				sumacifras(n2);
				break;
			}
		} while (!opcion.equals("e"));
		sc.close();
	}

	private static void mostrarmenu() {
		System.out.println();
		System.out.println("a) ¿Son números amigos?");
		System.out.println("b) ¿Cuántos primos hay entre ambos?");
		System.out.println("c) Imprimir las cifras de a");
		System.out.println("d) Sumar las cifras de b");
		System.out.println("e) Salir");
	}
	
	private static void sonamigos(int n1, int n2) {
		int sumaDivisoresN1=0;
		int sumaDivisoresN2=0;
		for (int i=1;i<n1;i++) {
			if (n1%i==0)
				sumaDivisoresN1+=i;
		}
		for (int j=1;j<n2;j++) {
			if (n2%j==0)
				sumaDivisoresN2+=j;
		}
		if (sumaDivisoresN1==n2 && sumaDivisoresN2==n1)
			System.out.println(n1+" y "+n2+" son números amigos");
		else
			System.out.println(n1+" y "+n2+" NO son números amigos");
	}
	
	public static boolean esprimo(int n){
		for (int i=2;i<=n/2;i++){
		if (n%i==0)
			return false;
		}
		return true;	
	}
	
	private static void contarprimos(int n1, int n2) {
		int contadorPrimos=0;
		for (int i=n1;i<=n2;i++) {
			if (esprimo(i))
				contadorPrimos++;
		}
		System.out.println("Hay "+contadorPrimos+" números primos entre "+n1+" y "+n2);
	}
	
	private static void mostrarcifras(int n1) {
		int divisor=1;
		while (n1/divisor>=10)
			divisor*=10;
		System.out.println("Las cifras de "+n1+" son: ");
		while (divisor>0) {
			int cifra=n1/divisor;
			System.out.print(cifra+" ");
			n1%=divisor;
			divisor/=10;
		}
		System.out.println();
	}
	
	private static void sumacifras(int n2) {
		int sumaCifrasN2=0;
		int auxN2=n2;
		while (auxN2>0) {
			int cifraN2=auxN2%10;
			sumaCifrasN2+=cifraN2;
			auxN2/=10;
		}
		System.out.println("La suma de cifras de "+n2+" es de "+sumaCifrasN2);
	}
	
	private static boolean correctos(int n1, int n2) {
		if (n1!=n2 && n1>0 && n2>0)
			return true;
		else {
			System.err.println("Los números deben ser diferentes, enteros y positivos. Inténtalo de nuevo.");
			return false;
		}
	}
	
	private static void mostrarcifras2(int n1) {
		String cifrasS="";
		boolean primerDigito=true;
		int cifras;
		while(n1!=0){
			cifras=n1%10;
			n1=n1/10;
			if (primerDigito) {
				cifrasS=cifras+cifrasS;
				primerDigito=false;
			} else
				cifrasS=cifras+" / "+cifrasS;
		}
		System.out.println(cifrasS);
	}

}
