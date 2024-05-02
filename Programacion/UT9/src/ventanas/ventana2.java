package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static ventana2 frame2;
	private JTextField texto2;
	
	// Getters y Setters de texto2
	public JTextField getTexto2() {
		return texto2;
	}

	public void setTexto2(JTextField texto2) {
		this.texto2 = texto2;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana2 frame2 = new ventana2();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		texto2 = new JTextField();
		texto2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		texto2.setEditable(false);
		texto2.setBounds(144, 62, 166, 45);
		contentPane.add(texto2);
		texto2.setColumns(10);
		
		JButton boton2 = new JButton("Volver a ventana1");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.setVisible(false);
				ventana1.frame1.setVisible(true);
			}
		});
		boton2.setBounds(144, 183, 149, 23);
		contentPane.add(boton2);
	}

}
