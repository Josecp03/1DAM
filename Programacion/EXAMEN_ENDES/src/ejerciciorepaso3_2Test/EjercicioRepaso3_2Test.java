package ejerciciorepaso3_2Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejerciciorepaso3_2.EjercicioRepaso3_2;

class EjercicioRepaso3_2Test {

	/**
	 * Test Calcular Cantidad Solicitada
	 */
	// Test 1 = (Entradas = 1000, 700), (Salida esperada = 1000)
	@Test
	void testCalcular_cantidad_solicitada1() {
		EjercicioRepaso3_2 ej = new EjercicioRepaso3_2();
		double entrada1=1000;
		double entrada2=700;
		double valorEsperado=1000;
		double resultado=ej.calcular_cantidad_solicitada(entrada1,entrada2);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	// Test 2 = (Entradas = 4000, 700), (Salida esperada = 3000)
	@Test
	void testCalcular_cantidad_solicitada2() {
		EjercicioRepaso3_2 ej = new EjercicioRepaso3_2();
		double entrada1=4000;
		double entrada2=700;
		double valorEsperado=3000;
		double resultado=ej.calcular_cantidad_solicitada(entrada1,entrada2);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	// Test 3 = (Entradas = 10000, 1500), (Salida esperada = 9000)
	@Test
	void testCalcular_cantidad_solicitada3() {
		EjercicioRepaso3_2 ej = new EjercicioRepaso3_2();
		double entrada1=10000;
		double entrada2=1500;
		double valorEsperado=9000;
		double resultado=ej.calcular_cantidad_solicitada(entrada1,entrada2);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	// Test 4 = (Entradas = -25, 1500), (Salida esperada = 0)
	@Test
	void testCalcular_cantidad_solicitada4() {
		EjercicioRepaso3_2 ej = new EjercicioRepaso3_2();
		double entrada1=-25;
		double entrada2=1500;
		double valorEsperado=0;
		double resultado=ej.calcular_cantidad_solicitada(entrada1,entrada2);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	// Test 5 = (Entradas = 1000, -1000), (Salida esperada = 0)
	@Test
	void testCalcular_cantidad_solicitada5() {
		EjercicioRepaso3_2 ej = new EjercicioRepaso3_2();
		double entrada1=1000;
		double entrada2=-1000;
		double valorEsperado=0;
		double resultado=ej.calcular_cantidad_solicitada(entrada1,entrada2);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	// Test 6 = (Entradas = 18000, 1700), (Salida esperada = 1500)
	@Test
	void testCalcular_cantidad_solicitada6() {
		EjercicioRepaso3_2 ej = new EjercicioRepaso3_2();
		double entrada1=18000;
		double entrada2=1700;
		double valorEsperado=15000;
		double resultado=ej.calcular_cantidad_solicitada(entrada1,entrada2);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	
	/**
	 * Test Calcular Interés Préstamo
	 */
	// Test 1 = (Entrada = 3500), (Salida esperada = 6)
	@Test
	void testCalcular_interes_prestamo1() {
		EjercicioRepaso3_2 ej = new EjercicioRepaso3_2();
		double entrada=3500;
		double valorEsperado=6;
		double resultado=ej.calcular_interes_prestamo(entrada);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	// Test 2 = (Entrada = 4000), (Salida esperada = 6)
	@Test
	void testCalcular_interes_prestamo2() {
		EjercicioRepaso3_2 ej = new EjercicioRepaso3_2();
		double entrada=4000;
		double valorEsperado=6;
		double resultado=ej.calcular_interes_prestamo(entrada);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	// Test 3 = (Entrada = 7900), (Salida esperada = 12)
	@Test
	void testCalcular_interes_prestamo3() {
		EjercicioRepaso3_2 ej = new EjercicioRepaso3_2();
		double entrada=7999;
		double valorEsperado=12;
		double resultado=ej.calcular_interes_prestamo(entrada);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	// Test 4 = (Entrada = 15000), (Salida esperada = 22.5)
	@Test
	void testCalcular_interes_prestamo4() {
		EjercicioRepaso3_2 ej = new EjercicioRepaso3_2();
		double entrada=15000;
		double valorEsperado=22.5;
		double resultado=ej.calcular_interes_prestamo(entrada);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	// Test 5 = (Entrada = 8001), (Salida esperada = 13.5)
	@Test
	void testCalcular_interes_prestamo5() {
		EjercicioRepaso3_2 ej = new EjercicioRepaso3_2();
		double entrada=8001;
		double valorEsperado=13.5;
		double resultado=ej.calcular_interes_prestamo(entrada);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	// Test 6 = (Entrada = -8001), (Salida esperada = 0)
	@Test
	void testCalcular_interes_prestamo6() {
		EjercicioRepaso3_2 ej = new EjercicioRepaso3_2();
		double entrada=-8001;
		double valorEsperado=0;
		double resultado=ej.calcular_interes_prestamo(entrada);
		assertEquals(valorEsperado, resultado, 0);
	}

}
