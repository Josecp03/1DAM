package practica;

import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class ventana extends JFrame {

	// Atributos
	private ArrayList<Grupo>grupos;
	private ArrayList<Cancion>canciones;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static ventana frame2;
	private JTextField textField;
	private JTextArea textArea;
	
	// Constructor con todos los parámetros
	public ventana(ArrayList<Grupo> grupos, ArrayList<Cancion> canciones) throws HeadlessException {
		this.grupos = grupos;
		this.canciones = canciones;
	}
	
	/**
	 * Create the frame.
	 */
	public ventana() {
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 755, 488);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(82, 81, 85));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMostrarGrupos = new JButton("Mostrar Grupos");
		btnMostrarGrupos.setVerticalAlignment(SwingConstants.TOP);
		btnMostrarGrupos.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		btnMostrarGrupos.setBackground(new Color(192, 192, 192));
		btnMostrarGrupos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				grupos.clear();
                cargarGrupos();
                mostrarGrupos();
			}
		});
		btnMostrarGrupos.setBounds(63, 110, 139, 23);
		contentPane.add(btnMostrarGrupos);
		
		JLabel lblNewLabel = new JLabel("Código de grupo");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setBounds(63, 162, 139, 20);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField.setForeground(new Color(0, 0, 0));
		textField.setBackground(new Color(183, 183, 183));
		textField.setBounds(63, 198, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Ver canciones");
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canciones.clear();
				cargarCanciones();
				String codigo= textField.getText();
				if (codigo.isEmpty()){
					mostrarCanciones();
				}else {
					if (codigo.equals("1") || codigo.equals("2") || codigo.equals("3") || codigo.equals("4") || codigo.equals("5")) {
						mostrarCancionesGrupo(Integer.parseInt(codigo));
					} else {
				        JOptionPane.showMessageDialog(null, "Código incorrecto", ":(", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnNewButton.setBounds(63, 255, 139, 23);
		contentPane.add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Sylfaen", Font.ITALIC, 13));
		textArea.setBackground(new Color(192, 192, 192));
		textArea.setBounds(298, 75, 384, 349);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("Grupos y Canciones");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD, 20));
		lblNewLabel_1.setBounds(410, 29, 181, 25);
		contentPane.add(lblNewLabel_1);
		
		// Inicializo los AL
		this.grupos = new ArrayList<Grupo>();
		this.canciones = new ArrayList<Cancion>();
	}
	
	// Getters y Setters
	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(ArrayList<Grupo> grupos) {
		this.grupos = grupos;
	}

	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}
	
	// Cargar grupos
	private void cargarGrupos() {
		try {
        	String cadena;
            String[] linea;
        	Scanner entrada=new Scanner(new File("grupos.csv"));
        	entrada.nextLine(); // Se salta la primera línea
        	while(entrada.hasNext()) {
        		cadena=entrada.nextLine();
        		linea=cadena.split(";");
        		this.getGrupos().add(new Grupo(Integer.parseInt(linea[0]),linea[1],Integer.parseInt(linea[2]),linea[3]));
        	}
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
			e.printStackTrace();
		}
		
	}
	
	// Mostrar Grupos
	private void mostrarGrupos() {
		textArea.setText("");
		String cadena="\n   Todos los grupos:\n";
		int i=1;
		for (Grupo g : this.getGrupos()) {
			cadena+="\n\t"+i+". "+g.getNombre();
			i++;
		}
		textArea.setText(cadena);
	}

	// Cargar canciones
	private void cargarCanciones() {
		try {
        	String cadena;
            String[] linea;
        	Scanner entrada=new Scanner(new File("canciones.csv"));
        	entrada.nextLine(); // Se salta la primera línea
        	while(entrada.hasNext()) {
        		cadena=entrada.nextLine();
        		linea=cadena.split(";");
        		this.getCanciones().add(new Cancion(Integer.parseInt(linea[0]),linea[1],linea[2],Integer.parseInt(linea[3])));
        	}
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
			e.printStackTrace();
		}
	}

	private void mostrarCanciones() {
		String cadena="\n   Todas las canciones:\n";
		int i=1;
		for (Cancion c : this.getCanciones()) {
				cadena+="\n\t"+i+". "+c.getNombre();
				i++;
		}
		textArea.setText(cadena);
	}
	
	private void mostrarCancionesGrupo(int cod) {
		String cadena="\n   Las canciones del grupo "+cod+" son:\n";
		int i=1;
		for (Cancion c : this.getCanciones()) {
			if(cod==c.getCodigo()) {
				cadena+="\n\t"+i+". "+c.getNombre();
				i++;
			}
		}
		textArea.setText(cadena);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 = new ventana();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
