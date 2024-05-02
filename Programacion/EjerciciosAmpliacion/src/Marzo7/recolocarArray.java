package Marzo7;

import java.util.Arrays;

public class recolocarArray {

	public static void main(String[] args) {
		int val=2;
		int nums[] = {0, 1, 2, 2, 3, 0, 4, 2};
		metodo(nums, val);
		System.out.println(Arrays.toString(nums));
	}

	private static void metodo(int[] nums, int val) {
		int temporal;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]==val) {
				nums[i]=0;
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < (nums.length - i); j++) {
	            if (nums[j - 1] < nums[j]) {
	                temporal = nums[j - 1];
	                nums[j - 1] = nums[j];
	                nums[j] = temporal;
	            }
	        }
		}
		
	}

}
