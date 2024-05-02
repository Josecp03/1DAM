package testPrueba;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pruebas.Calculadora;

class CalculadoraTest {
	
	Calculadora calc= new Calculadora(0,0);
	Calculadora calc2= calc;
	 

	@Test
	void testSuma() {
		double valorEsperado=30;
		Calculadora calc=new Calculadora(20,10);
		double resultado=calc.suma();
		assertEquals(valorEsperado, resultado,0);
	}

	@Test
	void testResta() {
		double valorEsperado=10;
		Calculadora calc=new Calculadora(20,10);
		double resultado=calc.resta();
		assertEquals(valorEsperado, resultado,0);
	}

	@Test
	void testMultiplicar() {
		double valorEsperado=200;
		Calculadora calc=new Calculadora(20,10);
		double resultado=calc.multiplicar();
		assertEquals(valorEsperado, resultado,0);
	}

	@Test
	void testDividir() {
		double valorEsperado=2;
		Calculadora calc=new Calculadora(20,10);
		double resultado=calc.dividir();
		assertEquals(valorEsperado, resultado,0);
	}
	
	@Test
	void testDividir1() {
		double valorEsperado=2;
		Calculadora calc=new Calculadora(20,0);
		double resultado=calc.dividir();
		assertEquals(valorEsperado, resultado,0);
	}

}
