package conexion;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pagina {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jardineria","jardineria");
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery("select codigocliente, nombrecliente, apellidocontacto, telefono from clientes");
			PrintWriter salida;
			try {
				salida = new PrintWriter(new File("index.html"));
				salida.print("<html><head><link rel=\"stylesheet\" type=\"text/css\" href=\"estilos/estilos.css\"></head><body><header><h1>Clientes</h1></header><table><th>Código</th><th>Nombre</th><th>Apellidos</th><th>Telefono</th>");
				salida.print("<tr>");
				while(rset.next()) {
					salida.print("<td>"+rset.getString(1)+"</td>"+"<td>"+rset.getString(2)+"</td>"+"<td>"+rset.getString(3)+"</td>"+"<td>"+rset.getString(4)+"</td>"+"<tr>");
				}
				salida.print("</table></body></html>");
				salida.flush();
				salida.close();
				System.out.println("Index creado correctamente");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
