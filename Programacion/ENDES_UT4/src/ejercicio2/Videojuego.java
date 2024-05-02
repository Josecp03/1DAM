package ejercicio2;

/**
 * Clase Videojuego que representa la información y las operaciones de un videojuego.
 * 
 * <p>
 * Esta clase proporciona métodos para establecer y obtener los detalles de un videojuego
 * como su título y jugador.
 * </p>
 * 
 * @author josec
 * @version 1.0
 */
public class Videojuego {
	
	/**
     * Título del videojuego, del tipo 'String'.
     */
    private String titulo;
    
    /**
     * Jugador del videojuego, del tipo 'Jugador'.
     * 
     * @link Jugador
     */
    private Jugador jugador;

    /**
     * Constructor para crear un nuevo videojuego con el título y 
     * el jugador por defecti tiene el valor null.
     *
     * @param id     Identificación del empleado, del tipo 'int'.
     * @param nombre Nombre del empleado, del tipo 'String'.
     * @param salario Salario del empleado, del tipo 'double'.
     */
    public Videojuego(String titulo) {
        this.titulo = titulo;
        this.jugador = null;
    }

    public void asignarJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public String getTitulo() {
        return titulo;
    }

    public Jugador getJugador() {
        return jugador;
    }
}
