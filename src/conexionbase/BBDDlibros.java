package conexionbase;


import getsetvariables.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import clases.Libros;
import conexionbase.Conexionbase;

public class BBDDlibros {
	private static Statement s;
	private static Connection c;
	private static ResultSet reg;
	
	public static boolean nuevapelicula (LibrosGetSets lb, Conexionbase bd){
		String cadena="INSERT INTO libros VALUES('" + lb.getNombrelibro() + "'," +lb.getPrecioAlquiler()+","+ lb.getImgLibro()+",'"+ lb.getDisponibilidad() +"','"+ lb.getPrestadoA()+"',"+lb.getDiasDeDevolucion()+","+lb.getRetrasoDias()+")"; 	
		
		try{
		c=bd.getConexion();
		s=c.createStatement();
		int numFilas = s.executeUpdate(cadena);
		s.close();
		
		if (numFilas==0){
			System.out.println("El usuario no se ha insertado");
			return false;
		}else{
			System.out.println("el usuario se dio de alta correctamente");
			return true;
		}
		
		}
		catch ( SQLException e){
			System.out.println("El usuario no se ha insertado");
			System.out.println(e.getErrorCode()+" - "+e.getMessage());
			return false;
		}
		
	}
}
