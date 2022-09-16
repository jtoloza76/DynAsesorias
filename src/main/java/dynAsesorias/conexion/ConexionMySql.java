package dynAsesorias.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySql {

	private static Connection conn = null;
	
	private ConexionMySql() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dynasesorias","root","");
			
			if (conn != null) {
				System.out.println("Conexion correcta");
			} else {
				System.out.println("Fallo la conexion");
			}
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConn() {
		
		if (conn == null) {
			
			new ConexionMySql();
		}
		return conn;
	}
	
}
