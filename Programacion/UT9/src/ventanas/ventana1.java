package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static ventana1 frame1;
	private JTextField texto1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 = new ventana1();
					frame1.setVisible(true);
					ventana2.frame2=new ventana2();
					ventana2.frame2.setVisible(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Introduce un texto");
		label1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label1.setBounds(52, 63, 204, 14);
		contentPane.add(label1);
		
		texto1 = new JTextField();
		texto1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		texto1.setBounds(232, 62, 158, 20);
		contentPane.add(texto1);
		texto1.setColumns(10);
		
		JButton boton1 = new JButton("Entrar");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.setVisible(false);
				ventana2.frame2.setVisible(true);
				System.out.println(texto1.getText());
				if (!texto1.getText().equals("")) {
					ventana2.frame2.getTexto2().setText(texto1.getText());
				}
				else
					ventana2.frame2.getTexto2().setText("Escribe algo en la ventana 1");
			}
		});
		boton1.setBounds(170, 149, 89, 23);
		contentPane.add(boton1);
	}
}
