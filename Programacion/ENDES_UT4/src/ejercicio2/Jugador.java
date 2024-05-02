package ejercicio2;

/**
 * Clase Jugador que representa la información y las operaciones de un jugador.
 * 
 * <p>
 * Esta clase proporciona métodos para establecer y obtener los detalles de un jugador
 * como su nombre y puntuación.
 * </p>
 * 
 * @author josec
 * @version 1.0
 */
public class Jugador {
	
	/**
	 * Nombre del jugador, del tipo 'String'
	 */
    private String nombre;
    
    /**
     * Puntuación del jugador, dle tipo 'int'
     */
    private int puntuacion;

    /**
     * Constructor para crear un nuevo jugador con nombre, y una
     * puntuación por defecto de 0.
     * 
     * @param nombre
     */
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntuacion = 0;
    }

    /**
     * Este método suma a la puntuación del jugador los puntos pasados
     * como parámetro en el método. 
     * 
     * @param puntos que hay que sumar a la puntuación del jugador
     */
    public void incrementarPuntuacion(int puntos) {
        this.puntuacion += puntos;
    }

    /**
     * Obtiene el nombre del jugador.
     *
     * @return El nombre del jugador, del tipo 'String'.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la puntuación del jugador.
     *
     * @return La puntuación del jugador, del tipo 'int'.
     */
    public int getPuntuacion() {
        return puntuacion;
    }
}
