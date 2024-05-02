package practica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static login frame1;
	private JTextField TextUsuario;
	private JTextField TextContraseña;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 = new login();
					frame1.setVisible(true);
					ventana.frame2= new ventana();
					ventana.frame2.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 360);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(82, 81, 85));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Usuario = new JLabel("Usuario:");
		Usuario.setForeground(new Color(255, 255, 255));
		Usuario.setBackground(new Color(255, 255, 255));
		Usuario.setFont(new Font("Sylfaen", Font.BOLD, 18));
		Usuario.setBounds(144, 92, 107, 23);
		contentPane.add(Usuario);
		
		JLabel Contraseña = new JLabel("Clave:");
		Contraseña.setForeground(new Color(255, 255, 255));
		Contraseña.setFont(new Font("Sylfaen", Font.BOLD, 18));
		Contraseña.setBounds(144, 147, 107, 30);
		contentPane.add(Contraseña);
		
		TextUsuario = new JTextField();
		TextUsuario.setFont(new Font("Tahoma", Font.ITALIC, 15));
		TextUsuario.setBackground(new Color(183, 183, 183));
		TextUsuario.setBounds(281, 89, 189, 23);
		contentPane.add(TextUsuario);
		TextUsuario.setColumns(10);
		
		TextContraseña = new JTextField();
		TextContraseña.setFont(new Font("Tahoma", Font.ITALIC, 15));
		TextContraseña.setBackground(new Color(183, 183, 183));
		TextContraseña.setColumns(10);
		TextContraseña.setBounds(281, 148, 189, 23);
		contentPane.add(TextContraseña);
		
		JButton BotonEntrar = new JButton("Entrar");
		BotonEntrar.setVerticalAlignment(SwingConstants.TOP);
		BotonEntrar.setBackground(new Color(192, 192, 192));
		BotonEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String TextoUsuario = TextUsuario.getText();
				String TextoContraseña = TextContraseña.getText();
				
				if(TextoUsuario.equalsIgnoreCase("admin") && TextoContraseña.equalsIgnoreCase("admin")) {
					frame1.setVisible(false);
					ventana.frame2.setVisible(true);
				}else {
			        JOptionPane.showMessageDialog(null, "Datos incorrectos", ":(", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		BotonEntrar.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		BotonEntrar.setBounds(247, 225, 121, 23);
		contentPane.add(BotonEntrar);
	}
}