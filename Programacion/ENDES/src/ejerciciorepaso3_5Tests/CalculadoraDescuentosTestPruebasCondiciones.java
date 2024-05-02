package ejerciciorepaso3_5Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pruebas.Calculadora;
import ejerciciorepaso3_5.CalculadoraDescuentos;

class CalculadoraDescuentosTestPruebasCondiciones {

	/**
	 * PRUEBAS AUTOMATIZADAS DE LAS PRUEBAS DE CONDICIONES
	 */
	// Test 1
	@Test
	void testCalcularDescuento() {
		double entrada1=200;
		int entrada2=1;
		double valorEsperado=20;
		CalculadoraDescuentos calc=new CalculadoraDescuentos();
		double resultado=calc.calcularDescuento(entrada1, entrada2);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	// Test 2
	@Test
	void testCalcularDescuento2() {
		double entrada1=600;
		int entrada2=1;
		double valorEsperado=90;
		CalculadoraDescuentos calc=new CalculadoraDescuentos();
		double resultado=calc.calcularDescuento(entrada1, entrada2);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	// Test 3
	@Test
	void testCalcularDescuento3() {
		double entrada1=300;
		int entrada2=2;
		double valorEsperado=60;
		CalculadoraDescuentos calc=new CalculadoraDescuentos();
		double resultado=calc.calcularDescuento(entrada1, entrada2);
		assertEquals(valorEsperado, resultado, 0);
	}

}
