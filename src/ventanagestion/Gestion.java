package ventanagestion;

import getsetvariables.LibrosGetSets;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;


import java.awt.Color;

import javax.swing.border.LineBorder;

import conexionbase.BBDDlibros;
import conexionbase.Conexionbase;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;

public class Gestion {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
	String nombrelibro;
	String precioAlquiler;
	String imgLibro;
	String disponibilidad;
	String prestadoA;
	String diasDeDevolucion;
	String retrasoDias;
	LibrosGetSets lb;
	Conexionbase conexionbase = new Conexionbase("libros");
	private JTextField textField_8;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestion window = new Gestion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gestion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1144, 632);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JInternalFrame internalFrame = new JInternalFrame("register new book");
		internalFrame.setOpaque(true);
		internalFrame.setVisible(false);
		try {
			internalFrame.setClosed(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JInternalFrame internalFrame_1 = new JInternalFrame("New JInternalFrame");
		internalFrame_1.setBounds(449, 304, 632, 299);
		frame.getContentPane().add(internalFrame_1);
		internalFrame_1.getContentPane().setLayout(null);
		
		textField_8 = new JTextField();
		textField_8.setBounds(197, 87, 200, 50);
		internalFrame_1.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNombreDelLibro = new JLabel("nombre del libro");
		lblNombreDelLibro.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreDelLibro.setBounds(41, 105, 112, 14);
		internalFrame_1.getContentPane().add(lblNombreDelLibro);
		
		JButton btnDeleteBook_1 = new JButton("delete book");
		btnDeleteBook_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeleteBook_1.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		btnDeleteBook_1.setBounds(436, 94, 170, 37);
		internalFrame_1.getContentPane().add(btnDeleteBook_1);
		internalFrame_1.setVisible(true);
		
		internalFrame.setClosable(true);
		internalFrame.setResizable(true);
		internalFrame.setMaximizable(true);
		internalFrame.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		
		internalFrame.setBounds(449, 557, 632, 417);
		
		frame.getContentPane().add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_1.setBounds(237, 29, 136, 27);
		internalFrame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_2.setColumns(10);
		textField_2.setBounds(237, 67, 136, 27);
		internalFrame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_3.setColumns(10);
		textField_3.setBounds(237, 100, 136, 27);
		internalFrame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_4.setColumns(10);
		textField_4.setBounds(237, 133, 136, 27);
		internalFrame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_5.setColumns(10);
		textField_5.setBounds(237, 168, 136, 27);
		internalFrame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_6.setColumns(10);
		textField_6.setBounds(237, 201, 136, 27);
		internalFrame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textField_7.setColumns(10);
		textField_7.setBounds(237, 234, 136, 27);
		internalFrame.getContentPane().add(textField_7);
		
		JButton btnRegister = new JButton("register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String nombredelibro = textField_1.getText();
				String preciodeAlquiler = textField_2.getText();
				String imgdeLibro = textField_3.getText();
				String disponibilidaddellibro = textField_4.getText();
				String libroprestadoA = textField_5.getText();
				String diasDDevolucion = textField_6.getText();
				String retrasodeDias = textField_7.getText();
				
				lb = new LibrosGetSets(nombredelibro, preciodeAlquiler, imgdeLibro, disponibilidaddellibro, libroprestadoA, diasDDevolucion, retrasodeDias);
				conexionbase.abrir();
				BBDDlibros.nuevapelicula(lb, conexionbase);
				conexionbase.cerrar();
			}
		});
		btnRegister.setBorder(new LineBorder(new Color(0, 255, 0), 2, true));
		btnRegister.setBounds(237, 301, 136, 50);
		internalFrame.getContentPane().add(btnRegister);
		
		JLabel lblTitleBook = new JLabel("title book :");
		lblTitleBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleBook.setBounds(89, 29, 90, 27);
		internalFrame.getContentPane().add(lblTitleBook);
		
		JLabel lblPrecioAlquiler = new JLabel("precio alquiler :");
		lblPrecioAlquiler.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecioAlquiler.setBounds(89, 67, 90, 27);
		internalFrame.getContentPane().add(lblPrecioAlquiler);
		
		JLabel lblImagenDelLibro = new JLabel("imagen del libro:");
		lblImagenDelLibro.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagenDelLibro.setBounds(91, 100, 88, 27);
		internalFrame.getContentPane().add(lblImagenDelLibro);
		
		JLabel lblDisponibilidad = new JLabel("disponibilidad :");
		lblDisponibilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisponibilidad.setBounds(89, 133, 90, 27);
		internalFrame.getContentPane().add(lblDisponibilidad);
		
		JLabel lblPrestadoA = new JLabel("prestado a :");
		lblPrestadoA.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrestadoA.setBounds(89, 168, 90, 27);
		internalFrame.getContentPane().add(lblPrestadoA);
		
		JLabel lblDiasADevolver = new JLabel("dias a devolver :");
		lblDiasADevolver.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiasADevolver.setBounds(91, 201, 90, 27);
		internalFrame.getContentPane().add(lblDiasADevolver);
		
		JLabel lblDiasDeRetraso = new JLabel("dias de retraso :");
		lblDiasDeRetraso.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiasDeRetraso.setBounds(91, 234, 90, 27);
		internalFrame.getContentPane().add(lblDiasDeRetraso);
		
		
		textField = new JTextField();
		textField.setBounds(191, 77, 137, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblBuscarLibro = new JLabel("buscar libro por nombre");
		lblBuscarLibro.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuscarLibro.setBounds(33, 80, 122, 14);
		frame.getContentPane().add(lblBuscarLibro);
		
			JTextArea textArea = new JTextArea();
		textArea.setBounds(33, 108, 408, 196);
		frame.getContentPane().add(textArea);
		JButton btnBuscar = new JButton("buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombredeLibro = textField.getText();
				
				lb = new LibrosGetSets(nombredeLibro, "", "", "", "", "", "");
				
				conexionbase.abrir();
				lb=BBDDlibros.buscarLibro(lb, conexionbase);
				
				textArea.setText(lb.getNombrelibro()+"  "+lb.getPrecioAlquiler()+"  "+ lb.getImgLibro()+ "  "+ lb.getDisponibilidad()+ "  " + lb.getPrestadoA()+ "" + lb.getDiasDeDevolucion()+ " " + lb.getRetrasoDias()  );
				conexionbase.cerrar();
				
			}
		});
		btnBuscar.setBounds(352, 76, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
	
		
		JPanel panel = new JPanel();
		panel.setBounds(33, 304, 408, 190);
		frame.getContentPane().add(panel);
		
		JButton btnRigisterBook = new JButton("rigister book");
		btnRigisterBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				internalFrame.setVisible(true);
			}
		});
		btnRigisterBook.setBackground(new Color(0, 255, 255));
		btnRigisterBook.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		btnRigisterBook.setBounds(563, 108, 137, 36);
		frame.getContentPane().add(btnRigisterBook);
		
		JButton btnUpdateEstate = new JButton("update estate");
		btnUpdateEstate.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		btnUpdateEstate.setBounds(786, 108, 137, 36);
		frame.getContentPane().add(btnUpdateEstate);
		
		JButton btnDeleteBook = new JButton("delete book");
		btnDeleteBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnDeleteBook.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		btnDeleteBook.setBounds(563, 198, 137, 36);
		frame.getContentPane().add(btnDeleteBook);
		
		JButton btnUpdateDays = new JButton("update days");
		btnUpdateDays.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		btnUpdateDays.setBounds(786, 198, 137, 36);
		frame.getContentPane().add(btnUpdateDays);
		
		JButton btnUpdatePrice = new JButton("update price");
		btnUpdatePrice.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		btnUpdatePrice.setBounds(563, 307, 137, 36);
		frame.getContentPane().add(btnUpdatePrice);
		
		JButton btnDeleteRentedPerson = new JButton("delete rented person");
		btnDeleteRentedPerson.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		btnDeleteRentedPerson.setBounds(786, 307, 137, 36);
		frame.getContentPane().add(btnDeleteRentedPerson);
	}
}
