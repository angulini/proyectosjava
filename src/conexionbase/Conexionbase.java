package conexionbase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexionbase {
	private String base;
	private String usuario;
	private String pass;
	private String url;
	private Connection c;
	
	
	
	public Conexionbase(String bbdd){		
		base=bbdd;
		usuario="root";
		pass="";
		url="jdbc:mysql://localhost/"+base;
	}
	
	public void abrir(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException e){
			System.out.println(e.getMessage());
		}
		try{
		 	c=DriverManager.getConnection(url,usuario,pass);
		}
		catch (SQLException e ){
			System.out.println(e.getMessage());
		}
	
	}	
	

	public void cerrar(){
		try{
			c.close();
		}
		catch (SQLException e){
			System.out.println(e.getMessage());
			
		}
	}
	
	public Connection getConexion(){
		return c;
	}
}
