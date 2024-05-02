package com.examen.ut3Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.examen.ut3.ClienteElectricidad;

class ClienteElectricidadTest {

	// Test 1
	@Test
	void testCalcularTotalFactura1() {
		ClienteElectricidad cli=new ClienteElectricidad("", true, 0, 0);
		cli.calcularTotalFactura();
		double valorEsperado=0;
		double resultado=cli.getTotalFactura();
		assertEquals(valorEsperado, resultado,0.1);
	}
	
	// Test 2
	@Test
	void testCalcularTotalFactura2() {
		ClienteElectricidad cli=new ClienteElectricidad("", false, 200, 7);
		cli.calcularTotalFactura();
		double valorEsperado=40.18;
		double resultado=cli.getTotalFactura();
		assertEquals(valorEsperado, resultado,0.1);
	}
	
	// Test 3 
	@Test
	void testCalcularTotalFactura3() { 
		ClienteElectricidad cli=new ClienteElectricidad("", false, 200, 15);
		cli.calcularTotalFactura();
		double valorEsperado=38.95;
		double resultado=cli.getTotalFactura();
		assertEquals(valorEsperado, resultado,0.1);
	}

	// Test 4
	@Test
	void testCalcularTotalFactura4() {
		ClienteElectricidad cli=new ClienteElectricidad("", false, 300, 7);
		cli.calcularTotalFactura();
		double valorEsperado=57.477000000000004;
		double resultado=cli.getTotalFactura();
		assertEquals(valorEsperado, resultado,0.1);
	}
	
	// Test 5
	@Test
	void testCalcularTotalFactura5() {
		ClienteElectricidad cli=new ClienteElectricidad("", false, 300, 15);
		cli.calcularTotalFactura();
		double valorEsperado=55.71750000000001;
		double resultado=cli.getTotalFactura();
		assertEquals(valorEsperado, resultado,0.1);
	}
	


}
