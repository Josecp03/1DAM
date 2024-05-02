package ejercicios;

public class Number_Of_1_bits {

	public static void main(String[] args) {
		int n=00000000000000000000000000001011;
		System.out.println(NumberOf1Bits(n));

	}

	public static int NumberOf1Bits(int num) {
		return Integer.bitCount(num);
	}

}
