package ejercicios;

public class Palindrome {

	public static void main(String[] args) {
		int x=121;
		if(isPalindrome(x)) {
			System.out.println("Es palindromo");
		}
		else
			System.out.println("No es palindormo");
		
	}
	
	public static boolean isPalindrome (int x) {
		 String numeroStr=Integer.toString(x);
	     StringBuilder numeroInvertido=new StringBuilder(numeroStr);
	     numeroInvertido.reverse(); 
	     return numeroInvertido.toString().equals(numeroStr);
	}

}
