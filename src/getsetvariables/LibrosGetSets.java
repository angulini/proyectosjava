package getsetvariables;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.event.ChangeListener;
import javax.swing.text.Caret;
import javax.swing.text.JTextComponent;

public class LibrosGetSets  {
	private String nombrelibro;
	private String precioAlquiler;
	private String imgLibro;
	private String disponibilidad;
	private String prestadoA;
	private String diasDeDevolucion;
	private String retrasoDias;
	public String getNombrelibro() {
		return nombrelibro;
	}
	public void setNombrelibro(String nombrelibro) {
		this.nombrelibro = nombrelibro;
	}
	public String getPrecioAlquiler() {
		return precioAlquiler;
	}
	public void setPrecioAlquiler(String precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}
	public String getImgLibro() {
		return imgLibro;
	}
	public void setImgLibro(String imgLibro) {
		this.imgLibro = imgLibro;
	}
	public String getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public String getPrestadoA() {
		return prestadoA;
	}
	public void setPrestadoA(String prestadoA) {
		this.prestadoA = prestadoA;
	}
	public String getDiasDeDevolucion() {
		return diasDeDevolucion;
	}
	public void setDiasDeDevolucion(String diasDeDevolucion) {
		this.diasDeDevolucion = diasDeDevolucion;
	}
	public String getRetrasoDias() {
		return retrasoDias;
	}
	public void setRetrasoDias(String retrasoDias) {
		this.retrasoDias = retrasoDias;
	}
	public LibrosGetSets(String nombrelibro, String precioAlquiler,
			String imgLibro, String disponibilidad, String prestadoA,
			String diasDeDevolucion, String retrasoDias) {
		super();
		this.nombrelibro = nombrelibro;
		this.precioAlquiler = precioAlquiler;
		this.imgLibro = imgLibro;
		this.disponibilidad = disponibilidad;
		this.prestadoA = prestadoA;
		this.diasDeDevolucion = diasDeDevolucion;
		this.retrasoDias = retrasoDias;
	}
	@Override
	public String toString() {
		return "LibrosGetSets [nombrelibro=" + nombrelibro
				+ ", precioAlquiler=" + precioAlquiler + ", imgLibro="
				+ imgLibro + ", disponibilidad=" + disponibilidad
				+ ", prestadoA=" + prestadoA + ", diasDeDevolucion="
				+ diasDeDevolucion + ", retrasoDias=" + retrasoDias + "]";
	}
	
	
	
}
