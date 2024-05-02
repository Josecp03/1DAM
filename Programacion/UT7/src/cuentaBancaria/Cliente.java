package cuentaBancaria;

import java.util.ArrayList;

public class Cliente {
	
	//Atributos
	private String codigoCliente;
	private String dni;
	private String nombre;
	private String apellidos;
	private ArrayList<Cuenta> cuentas;
	
	//Constructores
	//Constructor con todos los parámetros
	public Cliente(String codigoCliente, String dni, String nombre, String apellidos, ArrayList<Cuenta> cuentas) {
		this.codigoCliente = codigoCliente;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cuentas = cuentas;
	}
	
	//Constructor con todos los parámetros menos el AL
	public Cliente(String codigoCliente, String dni, String nombre, String apellidos) {
		this.codigoCliente = codigoCliente;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cuentas = new ArrayList<>();
	}

	//Getters y Setters
	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	//toString
	@Override
	public String toString() {
		return nombre+" "+apellidos+"\n\tcodigoCliente: "+codigoCliente+"\n\tdni: "+dni;
	}
	
	//Método mostrar cuentas
	public void mostrarCuentas() {
        for (Cuenta cuenta : cuentas) {
            System.out.println("\t"+cuenta.getCuenta()+" "+cuenta.getSaldo()+"€");
        }
	}
	
	//Método totalCuentas
	public double totalCuentas() {
		double sumaSueldos=0;
		for (Cuenta cuenta : cuentas) {
            sumaSueldos+=cuenta.getSaldo();
        }
		return sumaSueldos;
	}
	
	//Prueba Unitaria
	public static void main(String[] args) {
		Cuenta c1=new Cuenta("ES234211", "Nomina", "B123", "A123", 1000);
		Cuenta c2=new Cuenta("ES234212", "Ahorro", "B123", "A125", 10000);
		Cliente cli=new Cliente("B124", "11111J", "Marta", "López");
		cli.getCuentas().add(c1);
		cli.getCuentas().add(c2);
		System.out.println(cli);
		System.out.println("\nCuentas Bancarias: ");
		cli.mostrarCuentas();
		System.out.println("TOTAL: "+cli.totalCuentas()+"€");
	}
	
	
	
}
