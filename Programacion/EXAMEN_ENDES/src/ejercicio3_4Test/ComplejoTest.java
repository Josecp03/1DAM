package ejercicio3_4Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ejercicio3_4.Complejo;

class ComplejoTest {
	
	/**
	 * TEST SUMA
	 */
	@Test
    public void testSuma() {
        Complejo c1 = new Complejo(3, 5);
        Complejo c2 = new Complejo(4, 8);
        Complejo valorEsperado = new Complejo(7, 13);
        
        c1.suma(c2);
        
        assertEquals(valorEsperado.getReal(), c1.getReal(), 0); 
        assertEquals(valorEsperado.getImaginaria(), c1.getImaginaria(), 0); 
    }

	/**
	 * TEST MULTIPLICACIÓN
	 */
	@Test
	void testMultiplicacion() {
		Complejo c1 = new Complejo(3, 5);
        Complejo c2 = new Complejo(4, 8);
        Complejo valorEsperado = new Complejo(-28, 44);
        
        c1.multiplicacion(c2);
        
        assertEquals(valorEsperado.getReal(), c1.getReal(), 0); 
        assertEquals(valorEsperado.getImaginaria(), c1.getImaginaria(), 0); 
	}
	
	/**
	 * TEST EQUALS
	 */
	@Test
	void testEqualsComplejo() {
		Complejo c1 = new Complejo(3, 5);
        Complejo c2 = new Complejo(3, 5);
        assertEquals(c1.equals(c2), true);
	}

}



