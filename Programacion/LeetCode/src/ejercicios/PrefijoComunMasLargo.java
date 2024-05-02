package ejercicios;

import java.util.Arrays;

public class PrefijoComunMasLargo {

	public static void main(String[] args) {
		String nombres[]= {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(nombres));
	}

	public static String longestCommonPrefix (String[] strs) {
		
		System.out.println(Arrays.toString(strs));
		return"";
		
//        for (int i=0;i<strs[0].length();i++) {
//            char currentChar=strs[0].charAt(i);
//            for (int j=1;j<strs.length;j++) 
//                if (i==strs[j].length() || strs[j].charAt(i)!=currentChar) 
//                    return strs[0].substring(0,i);
//        }
//        return strs[0];
	}
}
