package bingo;

import java.util.Random;
import java.util.Scanner;

public class barcos {
    public static void main(String[] args) {
    	// Genera un boleto aleatorio con barcos (B) y agua (A)
        String boleto=generarBoletoAleatorio();
        int intentosUsuario=6;
        int barcosRestantes=4;
        System.out.println("¡Bienvenido al juego de los barcos!");
        // Imprime el boleto inicial
        imprimirBoleto(boleto);
        Scanner sc=new Scanner(System.in);

        while (intentosUsuario>0 && barcosRestantes>0) {
            System.out.print("Ingresa un número (0-9): ");
            int numero=sc.nextInt();
            if (numero>=0 && numero<=9) {
                if (boleto.charAt(numero)=='A') 
                    System.out.println("Agua!");
                else if (boleto.charAt(numero)=='B') {
                    System.out.println("Hundido!");
                    // Reemplaza el barco hundido en el boleto
                    boleto = reemplazarBarcoHundido(boleto, numero);
                    imprimirBoleto(boleto);
                    barcosRestantes--;
                }
                intentosUsuario--;
            } else 
                System.out.println("Número fuera de rango. Debe ser entre 0 y 9.");
        }
        if (barcosRestantes==0) 
            System.out.println("¡Felicidades! Has ganado. Has hundido todos los barcos.");
        else 
            System.out.println("Lo siento, has agotado tus intentos. La máquina gana.");
        sc.close();
    }

    // Genera un boleto aleatorio con barcos (B) y agua (A)
    public static String generarBoletoAleatorio() {
        Random random=new Random();
        StringBuilder boleto = new StringBuilder(10);
        // Inicialmente, generamos 4 barcos 'B' y 6 aguas 'A'.
        for (int i=0;i<4;i++) 
            boleto.append('B');
        for (int i=0;i<6;i++) 
            boleto.append('A');
        // Luego, mezclamos aleatoriamente las posiciones de los barcos y el agua.
        for (int i=0;i<10;i++) {
            int randomIndex=random.nextInt(10);
            char temp=boleto.charAt(i);
            boleto.setCharAt(i,boleto.charAt(randomIndex));
            boleto.setCharAt(randomIndex,temp);
        }
        return boleto.toString();
    }

    // Imprime el estado actual del boleto
    public static void imprimirBoleto(String boleto) {
        System.out.println("Estado actual del boleto:");
        for (int i=0;i< boleto.length();i++) 
            System.out.print(boleto.charAt(i)+" ");
        System.out.println();
    }

    // Reemplaza un barco hundido en el boleto
    public static String reemplazarBarcoHundido(String boleto, int posicion) {
        char[] boletoArray=boleto.toCharArray();
        boletoArray[posicion]='B';
        return new String(boletoArray);
    }
}
