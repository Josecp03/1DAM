package busqueda;

import java.util.Arrays;

public class BusquedaLineal {

	public static void main(String[] args) {
		int array[]= {10,50,30,70,80,60,20,90,40};
		int elemento=10;
		//System.out.println("Encontrado en la posición "+busquedaLineal(array,elemento));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		//System.out.println("Encontrado en la posición "+busquedaBinariaRecursiva(array,elemento,0,array.length-1));
		System.out.println("Encontrado en la posición "+busquedaBinaria(array,elemento,0,array.length-1));
		
	}

//	private static int busquedaLineal(int[] array, int elemento) {
//		for(int i=0;i<array.length;i++) {
//			if(array[i]==elemento)
//				return i;
//		}
//		return -1;
//	}
	
	public static int busquedaBinariaRecursiva(int array[],int elemento, int l, int h) {
		 int m=(l+h)/2;
		 if(l>h)
			 return -1;
		 if (array[m]==elemento)
			 return m;
		 else {
			 if (array[m]<elemento)
				 return busquedaBinariaRecursiva(array, elemento,m+1,h);
			 else
				 return busquedaBinariaRecursiva(array, elemento,l,m-1);
		 }
	}
	
	public static int busquedaBinaria(int array[], int elemento, int l, int h) {
	    int m=0;
	    while (l<=h) {
	        m=(l+h)/2;
	        if (array[m]==elemento) {
	            return m;
	        } else {
	            if (array[m]<elemento)
	                l=m+1;
	            else
	                h=m-1;
	        }
	    }
	    return -1;
	}

}
