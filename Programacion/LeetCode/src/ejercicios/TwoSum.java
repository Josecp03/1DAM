package ejercicios;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int array[]={2,15,11,7};
		System.out.println(Arrays.toString(twoSum(array,9)));
	}

	public static int[] twoSum(int[] nums, int target) {
		int uno=0;
		int dos=0;
		//int posiciones[]=new int[2];
		for(int i=0;i<nums.length;i++) {
			for (int j=i+1;j<nums.length;j++){
				if (nums[i]+nums[j]==target) {
					uno=i;
					dos=j;
				}
			}
		}
		return new int[] {uno,dos};
		//posiciones[0]=uno;
		//posiciones[1]=dos;
		//return posiciones;
	}

	
	
	
	
	

}
