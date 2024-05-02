
package clasesJava;

/**
 * Clase Main para ejecutar operaciones básicas en una cuenta bancaria.
 * Incluye un ejemplo de uso de la clase CCuenta.
 */
public class Main {

    /**
     * Método principal para ejecutar la aplicación.
     *
     * @param args Argumentos de línea de comandos (no utilizados) 
     */
    public static void main(String[] args) throws Exception {
        CCuenta miCuenta;
        double saldoActual;

        miCuenta = new CCuenta("Juan López", "1000-2365-85-123456789", 2500, 0);
        try {
            miCuenta.retirar(-2300);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(-1695);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("Fallo al ingresar");
        }
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);
        System.out.println();
        
        /*
         * 
         * ############### CASOS DE PRUEBA ###############
         * 
         */
  
        /*
         * 
         * ################## INGRESAR ###################
         * 
         */
        
        /*
         * Cantidad negativa
         */
        try {
            miCuenta.ingresar(-2300);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        /*
         * Cantidad positiva
         */
        miCuenta.ingresar(1000);
        System.out.println("1000 ==> "+miCuenta.estado()+"\n");
        
        /*
         * ################## RETIRAR ###################
         */
        
        /*
         * Cantidad negativa
         */
        try {
            miCuenta.retirar(-1000);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        /*
         * Estado < Cantidad
         */
        try {
            miCuenta.retirar(5000);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        /*
         * Cantidad adecuada
         */
        miCuenta.retirar(1000);
        System.out.println("1000 ==> "+miCuenta.estado()+"\n");
        
        /*
         * ############# INGRESAR Y RETIRAR #############
         */
        // Caso de prueba 1: Ingresar y luego retirar una cantidad válida
        try {
            System.out.println("Saldo inicial: " + miCuenta.estado());
            
            miCuenta.ingresar(500.0);
            System.out.println("Ingreso exitoso. Nuevo saldo: " + miCuenta.estado());

            miCuenta.retirar(300.0);
            System.out.println("Retiro exitoso. Nuevo saldo: " + miCuenta.estado());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
        
        // Caso de prueba 2: Intentar retirar más de lo ingresado
        try {
            System.out.println("Saldo inicial: " + miCuenta.estado());
            
            miCuenta.ingresar(200.0);
            System.out.println("Ingreso exitoso. Nuevo saldo: " + miCuenta.estado());

            miCuenta.retirar(500.0);
            System.out.println("Retiro exitoso. Nuevo saldo: " + miCuenta.estado());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
        
        // Caso de prueba 3: Intentar ingresar una cantidad negativa y luego retirar
        try {
            System.out.println("Saldo inicial: " + miCuenta.estado());
            
            miCuenta.ingresar(-100.0);
            System.out.println("Ingreso exitoso. Nuevo saldo: " + miCuenta.estado());

            miCuenta.retirar(50.0);
            System.out.println("Retiro exitoso. Nuevo saldo: " + miCuenta.estado());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
