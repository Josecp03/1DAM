package clasesJavaTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clasesJava.CCuenta;

class CCuentaTest {

	@Test
	void testIngresar() {
		double valorEsperado = 1000; 
        CCuenta cuenta = new CCuenta();
        try {
            cuenta.ingresar(1000);
            double resultado = cuenta.estado();
            assertEquals(valorEsperado, resultado, 0);
        } catch (Exception e) {
            fail("Excepción inesperada: " + e.getMessage());
        }
	}

	@Test
	void testRetirar() {
		double valorEsperado = 0; 
        CCuenta cuenta = new CCuenta();
        try {
            cuenta.retirar(1000);
            double resultado = cuenta.estado();
            assertEquals(valorEsperado, resultado, 0);
        } catch (Exception e) {
            assertEquals("No hay suficiente saldo", e.getMessage());
        }
	}
	
	@Test
	void testIngresarRetirar() {
		double valorEsperado = 1500; 
        CCuenta cuenta = new CCuenta();
        try {
        	cuenta.ingresar(2500);
        	cuenta.retirar(1000);
        	double resultado = cuenta.estado();
        	assertEquals(valorEsperado, resultado, 0);
        } catch (Exception e) {
        	fail("Excepción inesperada: " + e.getMessage());
        }
	}

}

