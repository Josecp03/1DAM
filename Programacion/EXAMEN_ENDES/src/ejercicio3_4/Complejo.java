/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3_4;

/**
 * Clase que modela un número complejo y permite realizar operaciones básicas
 * como la suma, multiplicación y comparación de números complejos.
 */
public class Complejo {

    private double real; // Parte real del número complejo
    private double imaginaria; // Parte imaginaria del número complejo

    /**
     * Constructor por defecto. Inicializa el número complejo a (0,0).
     */
    public Complejo() {
        this(0, 0); // Llama al constructor con parámetros
    }

    /**
     * Constructor que inicializa el número complejo con valores específicos
     * para sus partes real e imaginaria.
     *
     * @param real Valor inicial para la parte real del número complejo.
     * @param imaginaria Valor inicial para la parte imaginaria del número
     * complejo.
     */
    public Complejo(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    /**
     * Retorna el valor de la parte imaginaria del número complejo.
     *
     * @return El valor de la parte imaginaria.
     */
    public double getImaginaria() {
        return imaginaria;
    }

    /**
     * Establece un nuevo valor para la parte imaginaria del número complejo.
     *
     * @param imaginaria El nuevo valor para la parte imaginaria.
     */
    public void setImaginaria(double imaginaria) {
        this.imaginaria = imaginaria;
    }

    /**
     * Retorna el valor de la parte real del número complejo.
     *
     * @return El valor de la parte real.
     */
    public double getReal() {
        return real;
    }

    /**
     * Establece un nuevo valor para la parte real del número complejo.
     *
     * @param real El nuevo valor para la parte real.
     */
    public void setReal(double real) {
        this.real = real;
    }

    /**
     * Suma a este número complejo el valor de otro número complejo.
     *
     * @param c El número complejo a sumar.
     */
    public void suma(Complejo c) {
        this.real += c.real;
        this.imaginaria += c.imaginaria;
    }

    /**
     * Multiplica este número complejo por otro número complejo.
     *
     * @param c El número complejo con el que se multiplica.
     */
    public void multiplicacion(Complejo c) {
        double tempReal = this.real * c.real - this.imaginaria * c.imaginaria;
        this.imaginaria = this.real * c.imaginaria + this.imaginaria * c.real;
        this.real = tempReal;
    }

    /**
     * Compara este número complejo con otro para determinar si son iguales. Dos
     * números complejos son iguales si y solo si sus partes real e imaginaria
     * son iguales respectivamente.
     *
     * @param c El número complejo a comparar.
     * @return true si ambos números complejos son iguales, false en caso
     * contrario.
     */
    public boolean equals(Complejo c) {
        return this.real == c.real && this.imaginaria == c.imaginaria;
    }

	@Override
	public String toString() {
		return "Complejo [real=" + real + ", imaginaria=" + imaginaria + "]";
	}
    
    public static void main(String[] args) {
    	Complejo c1=new Complejo(3,5);
		Complejo c2=new Complejo(4,8);
		Complejo valorEsperado=new Complejo(7,13);
		c1.suma(c2);
		System.out.println(c1);
	}
    
}
