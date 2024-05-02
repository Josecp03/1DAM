package ejercicio1;

/**
 * Clase Persona que representa la información y las operaciones de una persona
 * <p>
 * Esta clase proporciona métodos para obtener los detalles de una persona
 * como su nombre y edad.
 * </p>
 * 
 * @author josec
 * @version 1.0
 */
public class Persona {
	
	/**
	 * Nombre de la persona, del tipo 'String'.
	 */
    private String nombre;
    
    /**
     * Edad de la persona, dle tipo 'int'.
     */
    private int edad;

    /**
     * Constructor para crear una nueva persona con nombre y edad.
     * 
     * @param nombre	Nombre de la persona, del tipo 'String'.
     * @param edad		Edad de la persona, del tipo 'int'.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Obtiene el nombre de la persona.
     * 
     * @return El nombre de la persona, del tipo 'String'.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     * 
     * @return La edad de la persona, del tipo 'int'.
     */
    public int getEdad() {
        return edad;
    }
}
