package dynAsesorias.Implementacion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import dynAsesorias.conexion.ConexionMySql;
import dynAsesorias.interfaces.iContacto;
import dynAsesorias.modelo.Contacto;

public class impContacto implements iContacto {

	//variable conexion en null
	private Connection cn = null;
	
	//crea conexion DAO
	public impContacto() {
		cn = ConexionMySql.getConn();
	}
	
	@Override
	public void create(Contacto contacto) {	
		String sql = "insert into contactos (usuario, email, mensaje) values ('" + contacto.getUsuario() +  "', '" + contacto.getEmail() + "', '" +   contacto.getMensaje() + "')";
	  
		try {
			Statement stm = cn.createStatement();
			stm.execute(sql);
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	      	 
	  
		System.out.println("Contacto enviado!!");
	}	
}
