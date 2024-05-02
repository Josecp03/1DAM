package examenFruteria;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class BD {

	private static BD miInstancia = null;
	private static boolean permitirInstanciaNueva;
	private Connection conn;
	private Statement stmt;
	private String cadenaConexion; //driver@servidor:puerto:sid
	private String usuario;
	private String pass;
	
	public BD() throws Exception {
		if (!permitirInstanciaNueva) {
			throw new Exception("No se puede crear otro objeto. Usa getInstance");
		}
	}
	
	public static BD getInstance() {
		
		if (miInstancia == null) {
			permitirInstanciaNueva = true;
			try {
				miInstancia = new BD();
			} catch (Exception e) {
				e.printStackTrace();
			}
			permitirInstanciaNueva = false;
		}
		
		return miInstancia;
	}
	
	public Connection getConn() {
		return conn;
	}
	
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	public Statement getStmt() {
		return stmt;
	}
	
	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}
	
	public String getCadenaConexion() {
		return cadenaConexion;
	}
	
	public void setCadenaConexion(String cadenaConexion) {
		this.cadenaConexion = cadenaConexion;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public ResultSet consultaBD(String consulta) {
		ResultSet rset = null;
		
		try {
			this.conn = DriverManager.getConnection(this.getCadenaConexion(), this.getUsuario(), this.getPass());
			this.stmt = conn.createStatement();
			rset = stmt.executeQuery(consulta);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rset;
		
	}
	
	public void cerrarConsulta() {
		try {
			this.stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void cargarParametros(String fichero) {
		
		try {
			Scanner entrada = new Scanner(new File(fichero));
			String cadena;
			cadena = entrada.nextLine();
			this.cadenaConexion = cadena.split("-")[0];
			this.usuario = cadena.split("-")[1];
			this.pass = cadena.split("-")[2];
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Empleado>cargaEmpleados(){
		
		ArrayList<Empleado>empleados = new ArrayList<Empleado>();
		try {
			BD.getInstance().cargarParametros("configTienda.txt");
			ResultSet rset = BD.getInstance().consultaBD("select * from persona");
			while (rset.next()) {
				empleados.add(new Empleado(rset.getString(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getInt(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empleados;
		
	}
	
	public static void main(String[] args) {
        BD bd = BD.getInstance();
        
        ArrayList<Empleado> empleados = bd.cargaEmpleados();
        
        for (Empleado empleado : empleados) {
			System.out.println(empleado);
		}
	}
		
}
