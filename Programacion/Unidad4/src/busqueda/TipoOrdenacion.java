package busqueda;

import java.util.Arrays;

public class TipoOrdenacion {

	public static void main(String[] args) {
		//int array[]={3,60,1,34,23,0,66,90};
		int array[]={60,1,0,3,34,23,66,90};
		//intercambia(array,2,5);
		//System.out.println(Arrays.toString(array));
		ordenacionBurbuja(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void intercambia(int array[], int a, int b){
		int aux=0;
		aux=array[a];
		array[a]=array[b];
		array[b]=aux;
	}
	
	public static void ordenacionBurbuja(int array[]) {
		for (int i=0;i<array.length;i++) {
			for (int j=0;j<array.length-1;j++) {
				if (array[j]>array[j+1]) {
					intercambia(array,j,j+1);
				}
			}
		}
	}
}
