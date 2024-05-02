/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciorepaso3_2;

/**
 *
 * @author luism
 */
public class EjercicioRepaso3_2 {

    //La clase devolverá los datos de un préstamo hipotecario

    private String titular_prestamo;
    private double cantidad_solicitada;
    private double ingresos_mensuales;
    private double cantidad_ofertada;
    private double interes_prestamo;

    public EjercicioRepaso3_2() {
    }

    public EjercicioRepaso3_2(String titular_prestamo, double cantidad_solicitada, double ingresos_mensuales) {
        this.titular_prestamo = titular_prestamo;
        this.cantidad_solicitada = cantidad_solicitada;
        this.ingresos_mensuales = ingresos_mensuales;
    }

    public String getTitular_prestamo() {
        return titular_prestamo;
    }

    public void setTitular_prestamo(String titular_prestamo) {
        this.titular_prestamo = titular_prestamo;
    }

    public double getCantidad_solicitada() {
        return cantidad_solicitada;
    }

    public void setCantidad_solicitada(double cantidad_solicitada) {
        this.cantidad_solicitada = cantidad_solicitada;
    }

    public double getIngresos_mensuales() {
        return ingresos_mensuales;
    }

    public void setIngresos_mensuales(double ingresos_mensuales) {
        this.ingresos_mensuales = ingresos_mensuales;
    }

    public double getCantidad_ofertada() {
        return cantidad_ofertada;
    }

    public void setCantidad_ofertada(double cantidad_ofertada) {
        this.cantidad_ofertada = cantidad_ofertada;
    }

    public double getInteres() {
        return interes_prestamo;
    }

    public void setInteres(double interes_prestamo) {
        this.interes_prestamo = interes_prestamo;
    }

    //Este método calculará la cantidad ofertada por la entidad para el préstamo solicitado
    public double calcular_cantidad_solicitada(double cantidad_solicitada, double ingresos) {

        double cantidad_calculada = 0;

        if (ingresos <= 0) {
            cantidad_calculada = 0;
        } else if (ingresos > 0 && ingresos <= 900) {
            if (cantidad_solicitada > 3000) {
                cantidad_calculada = 3000;
            } else {
                cantidad_calculada = cantidad_solicitada;
            }
        } else if (ingresos > 900 && ingresos < 1500) {
            if (cantidad_solicitada > 9000) {
                cantidad_calculada = 9000;
            } else {
                cantidad_calculada = cantidad_solicitada;
            }
        } else if (ingresos >= 1500) {
            if (cantidad_solicitada > 15000) {
                cantidad_calculada = 15000;
            } else {
                cantidad_calculada = cantidad_solicitada;
            }
        }
        return cantidad_calculada;
    }

    //Este método calculará el interés asociado al préstamo
    public double calcular_interes_prestamo(double cantidad_solicitada) {

        double interes_calculado = 0;
        double cantidad_intermedia = cantidad_solicitada;
        //int ciclos = ((int) (cantidad_solicitada)) + 1;

        do {
            interes_calculado += 1.5;
            cantidad_intermedia -= 1000;
        } while (cantidad_intermedia >= 0);

        return interes_calculado;
    }
    
    // Main del programa para realizar los casos de prueba
    public static void main(String[] args) {
    	EjercicioRepaso3_2 ej=new EjercicioRepaso3_2();
    	/**
    	 * VALORES LÍMITE
    	 */
    	/**
    	 * Calcular Cantidad Solicitada
    	 */
    	// Caso de Prueba 1
    	System.out.println("Caso 1: "+ej.calcular_cantidad_solicitada(2999, 899));
    	
    	// Caso de Prueba 2
    	System.out.println("Caso 2: "+ej.calcular_cantidad_solicitada(3000, 900));
    	
    	// Caso de Prueba 3
    	System.out.println("Caso 3: "+ej.calcular_cantidad_solicitada(3001, 901));
    	
    	// Caso de Prueba 4
    	System.out.println("Caso 4: "+ej.calcular_cantidad_solicitada(8999, 1499));
    	
    	// Caso de Prueba 5
    	System.out.println("Caso 5: "+ej.calcular_cantidad_solicitada(9000, 1500));
    	
    	// Caso de Prueba 6
    	System.out.println("Caso 6: "+ej.calcular_cantidad_solicitada(9001, 1501));
    	
    	// Caso de Prueba 7
    	System.out.println("Caso 7: "+ej.calcular_cantidad_solicitada(14999, -1));
    	
    	// Caso de Prueba 8
    	System.out.println("Caso 8: "+ej.calcular_cantidad_solicitada(15000, 0));
    	
    	// Caso de Prueba 9
    	System.out.println("Caso 8: "+ej.calcular_cantidad_solicitada(15001, 9999));
    	System.out.println();
    	
    	/**
    	 * Calcular Interés Préstamo
    	 */
    	
    	// Caso de Prueba 1
    	System.out.println("Caso 1: "+ej.calcular_interes_prestamo(999));
    	
    	// Caso de Prueba 2
    	System.out.println("Caso 2: "+ej.calcular_interes_prestamo(1000));
    	
    	// Caso de Prueba 3
    	System.out.println("Caso 3: "+ej.calcular_interes_prestamo(1001));
    	
    	// Caso de Prueba 4
    	System.out.println("Caso 4: "+ej.calcular_interes_prestamo(-1));
    	
    	// Caso de Prueba 5
    	System.out.println("Caso 5: "+ej.calcular_interes_prestamo(0));
    	
    	// Caso de Prueba 6
    	System.out.println("Caso 6: "+ej.calcular_interes_prestamo(9999));
    	System.out.println();
    	
    	/**
    	 * CONDICIONES
    	 */
    	/**
    	 * Calcular Cantidad Solicitada
    	 */
    	// Caso de Prueba 1
    	System.out.println("Caso 1: "+ej.calcular_cantidad_solicitada(3000, 0));
    	
    	// Caso de Prueba 2
    	System.out.println("Caso 2: "+ej.calcular_cantidad_solicitada(4000, 400));
    	
    	// Caso de Prueba 3
    	System.out.println("Caso 3: "+ej.calcular_cantidad_solicitada(2000, 400));
    	
    	// Caso de Prueba 4
    	System.out.println("Caso 4: "+ej.calcular_cantidad_solicitada(10000, 1000));
    	
    	// Caso de Prueba 5
    	System.out.println("Caso 5: "+ej.calcular_cantidad_solicitada(8000, 1000));
    	
    	// Caso de Prueba 6
    	System.out.println("Caso 6: "+ej.calcular_cantidad_solicitada(20000, 1500));
    	
    	// Caso de Prueba 7
    	System.out.println("Caso 7: "+ej.calcular_cantidad_solicitada(10000, 1500));
    	System.out.println();
    	
    	/**
    	 * DEPURACIÓN
    	 */
    	// Caso de prueba 1
    	ej.calcular_cantidad_solicitada(1000, 700);
    	
    	// Caso de prueba 2
    	ej.calcular_cantidad_solicitada(1000, -1000);
    	
    	// Caso de prueba 1
    	ej.calcular_cantidad_solicitada(18000, 1700);
    	
    	
	}

    
}
