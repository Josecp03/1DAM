package codigoFuenteEjercicio5_GestorEmpleados;
/**
 * Clase principal que ejecute la aplicación.
 * <p>
 * Esta clase contiene métodos en el que se crean instancias de la clase Empleado y se crean métodos
 * para mostrar sus detalles
 * </p>
 * 
 * @author José Corrochano Pardo
 * @version 1.0
 */
public class GestorEmpleados {

    /**
     * Constante en la que se guarda la bonificación, dle tipo 'double'
     */
    private static final double BONIFICACION = 0.1;

    /**
     * Método para procesar el Empleado
     * @param empleado Variable empleado donde se guardan todos los parámetros utilizados en el método
     */
	public void procesarEmpleado(Empleado empleado) {
		
		// Calcular el salario anual
        double salarioAnual = empleado.getSalario() * 12;  
        
        // Calcular la bonficación
        double bonificacion = empleado.getSalario() * BONIFICACION;
        
        // Imprimir los detalles del empleado
        imprimirDetallesEmpleado(empleado.getNombre(), empleado.getApellido(), salarioAnual, bonificacion, empleado.getDepartamento());
        
        // Calcular el salario total del empleado
        double salarioTotal = empleado.getSalario() * 12 + bonificacion;
        
        // Imprimir el salario total del empleado
        System.out.println("Salario Total Anual: " + salarioTotal);
    }

    /**
     * Método para imprimir los detalles del empleado
     * 
     * @param nombre		
     * @param apellido
     * @param salario
     * @param bonificacion
     * @param departamento
     */
    public void imprimirDetallesEmpleado(String nombre, String apellido, double salario, double bonificacion, String departamento) {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Salario Anual: " + salario);
        System.out.println("Bonificación: " + bonificacion);
        System.out.println("Departamento: " + departamento);
    }

    /**
     * Método pata calcular los incrementos del salario
     * 
     * @param s
     * @param años
     * @return   Incremeneto del salario, del tipo 'double'
     */
    public double calcularIncrementoSalario(double s, int años) {
        double incremento = s * 0.05 * años;  
        return s + incremento;
    }
    
    /**
     * Método para calcular las vacaciones
     *  
     * @param años
     * @return	Base de las vacaciones, del tipo 'int'
     */
    public int calcularVacaciones(int años) {
        int base = 20;
        if (años > 10) {
            return base + 5;  
        }
        return base;
    }
}
