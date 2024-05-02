package Marzo7;

public class arraysSuma {

	// Main
	public static void main(String[] args) {
		int numeros[] = {3, 2, 4};
		int target = 6;
		metodo(numeros,target);
	}

	private static void metodo(int[] numeros, int target) {
		for (int i = 0; i < numeros.length-1; i++) {
			if (numeros[i]+numeros[i+1]==target) {
				System.out.println("["+i+","+(i+1)+"]");
			}
		}
		
	}
}
