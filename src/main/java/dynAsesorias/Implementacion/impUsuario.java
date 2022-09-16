package dynAsesorias.Implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dynAsesorias.conexion.ConexionMySql;
import dynAsesorias.interfaces.iUsuario;
import dynAsesorias.modelo.Usuario;

public class impUsuario implements iUsuario {

	//variable conexion en null
	private Connection cn = null;
	
	//crea conexion DAO
	public impUsuario() {
		cn = ConexionMySql.getConn();
	}

	@Override
	public void create(Usuario user) {	
	  String sql = "insert into usuarios (usuario, password, tipo) values ('" + user.getUsuario() +  "', '" + user.getPassword() + "', '" +   user.getTipo() + "')";
	  
	  try {
		  Statement stm = cn.createStatement();
		  stm.execute(sql);
		  stm.close();
	  } catch (SQLException e) {
		  e.printStackTrace();
	  }  
	  System.out.println("***Se ha creado un nuevo Usuario***");	  
	}
	
	
	@Override
	public List<Usuario> readAll() {
		
		String sql = "select idusuarios, usuario, password, tipo from usuarios";
		ArrayList<Usuario> user = new ArrayList<Usuario>();		
		
		
		try {
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				user.add(new Usuario(rs.getInt("idusuarios"),
						rs.getString("usuario"),						
						rs.getString("password"),						 
						rs.getString("tipo")));
			}
			rs.close();
			stm.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return user ;
	}
	
	
	
	//read
	@Override
	public Usuario read(int idusuarios) {

		Usuario useri = new Usuario();

		String sql = "select idusuarios, usuario, password, tipo from usuarios where idusuarios = " + idusuarios;

		try {
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			if (rs.next()) {

				useri.setIdusuarios(rs.getInt("idusuarios"));
				useri.setUsuario(rs.getString("usuario"));
				useri.setPassword(rs.getString("password"));
				useri.setTipo(rs.getString("tipo"));
			}
			
			rs.close();
			stm.close();			

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD en read(id)");
			e.printStackTrace();

		}

		return useri;

	}

	//update
	@Override
	public void update(Usuario user) {
		String sql = "update usuarios set usuario='" + user.getUsuario() + "', password='" + user.getPassword()
				+ "', tipo='" + user.getTipo() + "' WHERE idusuarios=" + user.getIdusuarios();
		System.out.println("sql :" + sql);

		try {
			Statement stm = cn.createStatement();
			stm.execute(sql);
			stm.close();

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD en update");
			e.printStackTrace();
		}

		System.out.println("***Se ha actualizado Usuario***");
	}

	@Override
	public List<Usuario> read() {
		// TODO Auto-generated method stub
		return null;
	}	
}
