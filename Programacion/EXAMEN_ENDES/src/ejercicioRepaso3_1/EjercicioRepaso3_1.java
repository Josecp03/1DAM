/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioRepaso3_1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EjercicioRepaso3_1 {

    // Tarifas base entre ciudades
    private static final double TAL_MAD = 15.75;
    private static final double TAL_BCN = 58.50;
    private static final double MAD_BCN = 45.25;

    public static void main(String[] args) {
        
        // Ejemplo de uso
        double tarifa = calcularTarifa("TAL", "MAD", LocalDate.now().plusDays(10), 23);
        System.out.println("La tarifa es: " + tarifa + " euros");
        
        /*
         * CLASES DE EQUIVALENCIA
         */
        // Caso de prueba 1
        double tarifa2 = calcularTarifa("TAL", "MAD", LocalDate.now().plusDays(10), 0);
        System.out.println("Caso de prueba 1: " + tarifa2 + " euros");

        // Caso de prueba 2
        double tarifa3 = calcularTarifa("TAL", "BCN", LocalDate.now().plusDays(10), 123);
        System.out.println("Caso de prueba 2: " + tarifa3 + " euros");

        // Caso de prueba 3
        double tarifa4 = calcularTarifa("MAD", "BCN", LocalDate.now().plusDays(10), 999);
        System.out.println("Caso de prueba 3: " + tarifa4 + " euros");

        /*
         * VALORES LÍMITE
         */
        // Caso de prueba 4
        double tarifa5 = calcularTarifa("MAD", "BCN", LocalDate.now().plusDays(6), 24);
        System.out.println("Caso de prueba 4: " + tarifa5 + " euros");

        // Caso de prueba 5
        double tarifa6 = calcularTarifa("MAD", "BCN", LocalDate.now().plusDays(7), 25);
        System.out.println("Caso de prueba 5: " + tarifa6 + " euros");

        // Caso de prueba 6
        double tarifa7 = calcularTarifa("MAD", "BCN", LocalDate.now().plusDays(25), 40);
        System.out.println("Caso de prueba 6: " + tarifa7 + " euros");

        // Caso de prueba 7
        double tarifa8 = calcularTarifa("MAD", "BCN", LocalDate.now().plusDays(30), 65);
        System.out.println("Caso de prueba 7: " + tarifa8 + " euros");
        
        // Caso de prueba 8
        double tarifa9 = calcularTarifa("TAL", "MAD", LocalDate.now().plusDays(31), 66);
        System.out.println("Caso de prueba 8: " + tarifa9 + " euros");

        /*
         * PRUEBAS DE CAJA BLANCA
         */

        // Caso de prueba 9
        double tarifa10 = calcularTarifa("MAD", "TAL", LocalDate.now().plusDays(10), 66);
        System.out.println("Caso de prueba 9: " + tarifa10 + " euros");

        // Caso de prueba 10
        double tarifa11 = calcularTarifa("BCN", "MAD", LocalDate.now().plusDays(40), 18);
        System.out.println("Caso de prueba 10: " + tarifa11 + " euros");

        // Caso de prueba 11
        double tarifa12 = calcularTarifa("MAD", "ALM", LocalDate.now().plusDays(25), 40);
        System.out.println("Caso de prueba 11: " + tarifa12 + " euros");

    }

    public static double calcularTarifa(String ciudadOrigen, String ciudadDestino, LocalDate fecha, int edad) {
        double tarifaBase = obtenerTarifaBase(ciudadOrigen, ciudadDestino);
        long diasAntelacion = ChronoUnit.DAYS.between(LocalDate.now(), fecha);
        double descuentoAntelacion = calcularDescuentoPorAntelacion(diasAntelacion);
        double descuentoEdad = calcularDescuentoPorEdad(edad);

        double descuentoTotal = 1 - (descuentoAntelacion + descuentoEdad);
        return tarifaBase * descuentoTotal;
    }

    private static double obtenerTarifaBase(String origen, String destino) {
        if (origen.equals("TAL") && destino.equals("MAD") || origen.equals("MAD") && destino.equals("TAL")) {
            return TAL_MAD;
        } else if (origen.equals("TAL") && destino.equals("BCN") || origen.equals("BCN") && destino.equals("TAL")) {
            return TAL_BCN;
        } else if (origen.equals("MAD") && destino.equals("BCN") || origen.equals("BCN") && destino.equals("MAD")) {
            return MAD_BCN;
        }
        return 0; // En caso de que no sea un trayecto válido
    }

    private static double calcularDescuentoPorAntelacion(long dias) {
        if (dias > 30) {
            return 0.25;
        } else if (dias > 7) {
            return 0.15;
        }
        return 0;
    }

    private static double calcularDescuentoPorEdad(int edad) {
        if (edad < 25) {
            return 0.30;
        } else if (edad > 65) {
            return 0.40;
        }
        return 0;
    }
}

