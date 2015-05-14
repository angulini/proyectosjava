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
		String cadena="INSERT INTO seguimientolibros VALUES('" + lb.getNombrelibro() + "','" +lb.getPrecioAlquiler()+"','"+ lb.getImgLibro()+"','"+ lb.getDisponibilidad() +"','"+ lb.getPrestadoA()+"','"+lb.getDiasDeDevolucion()+"','"+lb.getRetrasoDias()+"')"; 	
		
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
	public static LibrosGetSets  buscarLibro (LibrosGetSets lb, Conexionbase bd){
		String cadena="select nombrelibro,precioAlquiler,imgLibro,disponibilidad,prestadoA,diasDeDevolucion,retrasoDias from seguimientolibros where nombrelibro='"+ lb.getNombrelibro()+"'"; 	
		
		try{
		c=bd.getConexion();
		s=c.createStatement();
		reg=s.executeQuery(cadena);
		
		
		if(reg.next()){
			String nombredelibro = reg.getString(1);
			String precioDelAlquiler = reg.getString(2);
			String imgdeLibro = reg.getString(3);
			String disponibilidadDeLibro = reg.getString(4);
			String libroPrestadoA = reg.getString(5);
			String diasDDevolucion = reg.getString(6);
			String retrasoDeDias = reg.getString(7);
			//System.out.println(nombredelibro+"\n"+precioDelAlquiler+"\n"+imgdeLibro+"\n"+disponibilidadDeLibro+"\n"+libroPrestadoA+"\n"+diasDDevolucion+"\n"+retrasoDeDias);
			lb = new LibrosGetSets(nombredelibro, precioDelAlquiler, imgdeLibro, disponibilidadDeLibro, libroPrestadoA, diasDDevolucion, retrasoDeDias);
			return lb;
		}else{
		
			s.close();
			return null;
		}
		
		}
		catch ( SQLException e){
			System.out.println("El usuario no se ha insertado");
			System.out.println(e.getErrorCode()+" - "+e.getMessage());
			
			return null;
		}
		
	}
}
