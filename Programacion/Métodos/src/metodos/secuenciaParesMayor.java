package metodos;

import java.util.Scanner;

public class secuenciaParesMayor {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numeroActual=0;
        int contadorPares=0;
        int mayorSecuencia=0;
        while (numeroActual!=-1) {
        	System.out.println("Dame un número ");
            numeroActual=sc.nextInt();
            if (numeroActual%2==0) 
                contadorPares++;
            else 
                contadorPares=0;
            if (contadorPares>mayorSecuencia) 
                mayorSecuencia=contadorPares;
        }
        System.out.println("La secuencia mayor de pares introducidos es: "+mayorSecuencia);
        sc.close();
    }
}