package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;


public class Actividad {

	private JFrame frame;
	private JTextField Textn1;
	private JTextField Textn2;
	private JLabel salida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad window = new Actividad();
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
	public Actividad() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 253);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Labeln1 = new JLabel("Número 1:");
		Labeln1.setBounds(10, 11, 66, 14);
		frame.getContentPane().add(Labeln1);
		
		JLabel Labeln2 = new JLabel("Número 2:");
		Labeln2.setBounds(10, 36, 66, 14);
		frame.getContentPane().add(Labeln2);
		
		Textn1 = new JTextField();
		Textn1.setBounds(86, 8, 86, 20);
		frame.getContentPane().add(Textn1);
		Textn1.setColumns(10);
		
		Textn2 = new JTextField();
		Textn2.setBounds(86, 33, 86, 20);
		frame.getContentPane().add(Textn2);
		Textn2.setColumns(10);
		
		JButton sumar = new JButton("Dividir");
		sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero1=Double.parseDouble(Textn1.getText());
				double numero2=Double.parseDouble(Textn2.getText());
				
				double division=numero1/numero2;
				
				salida.setText(String.format("%f",division));
			}
		});
		sumar.setBounds(10, 64, 89, 23);
		frame.getContentPane().add(sumar);
		
		JButton limpiar = new JButton("Limpiar");
		limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Textn1.setText(" ");
				Textn2.setText(" ");
				
				salida.setText("Resultado");
			}
		});
		limpiar.setBounds(114, 64, 89, 23);
		frame.getContentPane().add(limpiar);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 98, 414, 105);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		salida = new JLabel("RESULTADO");
		salida.setBackground(new Color(192, 192, 192));
		salida.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 26));
		salida.setHorizontalAlignment(SwingConstants.CENTER);
		salida.setBounds(10, 11, 394, 83);
		panel.add(salida);
	}
}