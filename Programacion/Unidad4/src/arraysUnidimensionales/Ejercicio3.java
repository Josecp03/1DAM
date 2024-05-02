package arraysUnidimensionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*Realizar un programa que pide al usuario la temperatura de los 7 días de la
		semana y después muestra la temperatura media de la semana y los días en los que
		la temperatura ha estado por encima de la media y los días que ha estado por
		debajo de ella.
		El resultado debe ser similar al que aparece en la figura:*/
		/*Dame la temperatura del lunes: 20
		Dame la temperaura del martes: 30
		Dame la temperatura del miércoles: 25
		Dame la temperatura del jueves: 23
		Dame la temperatura del viernes: 25
		Dame la temperatura del sábado: 32
		Dame la temperaura del domingo: 17
		La temperatura media es: 24.571428
		La temperatura del martes (30.0) está por encima de la media.
		La temperautura del miércoles (25.0) está por encima de la media.
		La temperatura del viernes (25.0) está por encima de la media.
		La temperaura del sábado (32.0) está por encima de la media.
		La temperatura del lunes (20.0) está por debajo de la media.
		La temperaura del jueves (23.0) está por debajo de la media.
		La temperatura del domingo (17.0) está por debajo de la media.*/
		Scanner sc=new Scanner(System.in);
        double[] temperaturas=new double[7];
        double sumaTemperaturas=0;
        String[] diasSemana={"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
        for (int i=0;i<7;i++) {
            System.out.print("Dame la temperatura del "+diasSemana[i]+": ");
            temperaturas[i]=sc.nextDouble();
            sumaTemperaturas+=temperaturas[i];
        }
        double temperaturaMedia=sumaTemperaturas/7;
        System.out.println("La temperatura media es: "+temperaturaMedia);
        temperaturasPorEncimaDebajo(diasSemana,temperaturas,temperaturaMedia);
        sc.close();
	}

	private static void temperaturasPorEncimaDebajo(String[] diasSemana, double[] temperaturas, double temperaturaMedia) {
		for (int i=0;i<7;i++) {
            String dia=diasSemana[i];
            double temperatura=temperaturas[i];
            String relacionConMedia="";
            if (temperatura>temperaturaMedia) 
                relacionConMedia="por encima de la media";
            else if (temperatura<temperaturaMedia) 
                relacionConMedia="por debajo de la media";
            else 
                relacionConMedia="igual a la media";
            System.out.println("La temperatura del "+dia+" ("+temperatura+") está "+relacionConMedia+".");
        }
		
	}

}
