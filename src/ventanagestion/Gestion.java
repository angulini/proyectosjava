package ventanagestion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;

public class Gestion {

	private JFrame frame;
	private JTextField textField;

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
		
		textField = new JTextField();
		textField.setBounds(191, 77, 137, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblBuscarLibro = new JLabel("buscar libro por nombre");
		lblBuscarLibro.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuscarLibro.setBounds(33, 80, 122, 14);
		frame.getContentPane().add(lblBuscarLibro);
		
		JButton btnBuscar = new JButton("buscar");
		btnBuscar.setBounds(352, 76, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(33, 108, 408, 196);
		frame.getContentPane().add(textArea);
		
		JPanel panel = new JPanel();
		panel.setBounds(441, 108, 146, 129);
		frame.getContentPane().add(panel);
	}
}
