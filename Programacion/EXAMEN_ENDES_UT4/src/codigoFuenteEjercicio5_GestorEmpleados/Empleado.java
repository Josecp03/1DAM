package codigoFuenteEjercicio5_GestorEmpleados;
/**
 * Clase Empleado que representa la información y las operaciones de un empleado.
 * <p>
 * Esta clase proporciona métodos para establecer y obtener los detalles de un empleado 
 * como su nombre, apellido, edad, salario, departamento, id, direccion, telefono y email.
 * </p>
 * 
 * @author José Corrchano Pardo
 * @version 1.0
 */
public class Empleado {

	/**
	 * Nombre del empleado, del tipo 'String'
	 */
	private String nombre;
	
	/**
	 * Apellido del empleado, del tipo 'String'
	 */
	private String apellido;
	
	/**
	 * Salario del empleado, del tipo 'double'
	 */
	private double salario;
	
	/**
	 * Departamento del empleado, del tipo 'String'
	 */
	private String departamento;
	
	/**
	 * Obtiene el nombre del empleado.
	 * @return		El nombre del empleado, del tipo 'String'
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtiene el apellido del empleado.
	 * @return		El apellido del empleado, del tipo 'String'
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Obtiene el salario del empleado.
	 * @return		El salario del empleado, del tipo 'double'
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * Obtiene el departamento del empleado.
	 * @return		El departamento del empleado, del tipo 'String'
	 */
	public String getDepartamento() {
		return departamento;
	}

}
