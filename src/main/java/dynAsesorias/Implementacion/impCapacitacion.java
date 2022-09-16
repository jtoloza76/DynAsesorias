package dynAsesorias.Implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import dynAsesorias.conexion.ConexionMySql;
import dynAsesorias.interfaces.iCapacitacion;
import dynAsesorias.modelo.Capacitacion;

public class impCapacitacion implements iCapacitacion {
	
	//variable conexion en null
	private Connection cn = null;
	
	//crea conexion DAO
	public impCapacitacion() {
		cn = ConexionMySql.getConn();
	}

	@Override
	public void create(Capacitacion capa) {	
	  String sql = "insert into capacitaciones (nombreCurso, nombreDocente, fechaInicio, fechaTermino, precio) values ('" + capa.getNombreCurso() +  "', '" + capa.getNombreDocente() + "', '" +   capa.getFechaInicio() + "','" + capa.getFechaTermino() + "','" + capa.getPrecio() + "')";
	  
	  try {
		  Statement stm = cn.createStatement();
		  stm.execute(sql);
		  stm.close();
	  } catch (SQLException e) {
		  e.printStackTrace();
	  }
	      
	  	  
	  System.out.println("***Se ha creado una nueva capacitacion***");	
	  
	}
	
	
	
	@Override
	public List<Capacitacion> readAll() {
	/*	
		ArrayList<Capacitacion> regCapacitacion = new ArrayList<Capacitacion>();		
		regCapacitacion.add(new Capacitacion("Manejo de Extintores", "Andrea Gonzalez", "01-10-2022", "01-11-2022", "$1.300.000.-"));
		regCapacitacion.add(new Capacitacion("Manejo manual de cargas", "Fernando Araya", "01-11-2022", "01-12-2022", "$2.000.000.-"));
		regCapacitacion.add(new Capacitacion("Comites Paritarios", "Claudio Diaz", "15-11-2022", "16-11-2022", "$1.000.000.-"));		
		regCapacitacion.add(new Capacitacion("Brigadas de emergencias", "Francisca Gutierrez", "05-10-2022", "06-10-2022", "$1.000.000.-"));
		regCapacitacion.add(new Capacitacion("Primeros Auxilios", "Maria Barra", "20-10-2022", "20-10-2022", "$3.000.000.-"));
		return regCapacitacion ;
	*/
		String sql = "select nombreCurso, nombreDocente, fechaInicio, fechaTermino, precio from capacitaciones";
		ArrayList<Capacitacion> capa = new ArrayList<Capacitacion>();		
		
		
		try {
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				capa.add(new Capacitacion(rs.getString("nombreCurso"), 
						rs.getString("nombreDocente"),
						rs.getString("fechaInicio"), 
						rs.getString("fechaTermino"), 
						rs.getString("precio")));
			}
			rs.close();
			stm.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		
		return capa ;
		
		
		
	}
/*
	@Override
	public void create() {	
	  	  
	  System.out.println("... Creando nueva capacitacion... ");	
		
	}
*/	
}
