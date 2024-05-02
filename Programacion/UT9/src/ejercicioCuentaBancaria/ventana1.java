package ejercicioCuentaBancaria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ventana1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana1 frame = new ventana1();
					frame.setVisible(true);
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
		setBounds(100, 100, 708, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Ingresar un Cuenta");
		btnNewButton.setBounds(50, 32, 153, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sacar dinero de la cuenta");
		btnNewButton_1.setBounds(229, 32, 180, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Transferencia de cuenta a tarjeta");
		btnNewButton_2.setBounds(433, 32, 232, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Ingresar en tarjeta");
		btnNewButton_3.setBounds(50, 83, 153, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Sacar dinero de la tarjeta");
		btnNewButton_4.setBounds(229, 83, 180, 23);
		contentPane.add(btnNewButton_4);
		
		textField = new JTextField();
		textField.setToolTipText("0");
		textField.setBounds(172, 169, 217, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Saldo cuenta");
		lblNewLabel.setBounds(50, 172, 112, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Saldo tarjeta");
		lblNewLabel_1.setBounds(50, 208, 112, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 205, 217, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Salir");
		btnNewButton_5.setBounds(507, 204, 89, 23);
		contentPane.add(btnNewButton_5);
	}

}
