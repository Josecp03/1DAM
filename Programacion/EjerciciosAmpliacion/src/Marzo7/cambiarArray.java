package Marzo7;

import java.util.Arrays;

public class cambiarArray {

	public static void main(String[] args) {
		//int nums[] = {1, 2, 3, 4};
		//int nums[] = {1, 1, 1, 1, 1};
		int nums[] = {3, 1, 2, 10, 1};
		metodo(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void metodo(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i-1] + nums[i];
		}
	}

	
}
