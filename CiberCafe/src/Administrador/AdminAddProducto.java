package Administrador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import img.Fondo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;
import javax.swing.JCheckBox;

public class AdminAddProducto extends JFrame {

	private final JPanel contentPane = new Fondo();
	JButton btnHome;
	ImageIcon home, iconHome;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDni;
	private JTextField textField;

	public AdminAddProducto() {
		setForeground(new Color(0, 0, 204));
		setBackground(new Color(0, 0, 204));
		setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 18));
		setTitle("CiberCaf\u00E9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 500);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddProducto = new JLabel("A\u00F1adir producto");
		lblAddProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddProducto.setForeground(Color.WHITE);
		lblAddProducto.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 35));
		lblAddProducto.setBackground(Color.WHITE);
		lblAddProducto.setBounds(10, 11, 804, 40);
		contentPane.add(lblAddProducto);
		
		btnHome = new JButton("");		
		btnHome.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setBounds(770, 410, 44, 40);
		btnHome.setBackground(new Color(153, 0, 102));
		contentPane.add(btnHome);
		home = new ImageIcon(getClass().getResource("/img/home.png"));
		iconHome=new ImageIcon(home.getImage().getScaledInstance(btnHome.getWidth(), btnHome.getHeight(), Image.SCALE_DEFAULT));
		btnHome.setIcon(iconHome);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblNombre.setBackground(Color.WHITE);
		lblNombre.setBounds(120, 82, 160, 30);
		contentPane.add(lblNombre);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setForeground(Color.WHITE);
		lblPrecio.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblPrecio.setBackground(Color.WHITE);
		lblPrecio.setBounds(120, 123, 160, 30);
		contentPane.add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblCantidad.setBackground(Color.WHITE);
		lblCantidad.setBounds(120, 164, 160, 30);
		contentPane.add(lblCantidad);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(290, 82, 400, 28);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(290, 123, 400, 28);
		contentPane.add(txtApellidos);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(290, 164, 400, 28);
		contentPane.add(txtDni);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setForeground(Color.WHITE);
		btnAgregar.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnAgregar.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnAgregar.setBackground(new Color(153, 0, 102));
		btnAgregar.setBounds(331, 276, 162, 30);
		contentPane.add(btnAgregar);
		
		JLabel lblFoto = new JLabel("Imagen:");
		lblFoto.setForeground(Color.WHITE);
		lblFoto.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblFoto.setBackground(Color.WHITE);
		lblFoto.setBounds(120, 205, 160, 30);
		contentPane.add(lblFoto);
		
		JButton btnFoto = new JButton("Selecciona imagen");
		btnFoto.setBounds(500, 212, 190, 23);
		contentPane.add(btnFoto);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(290, 209, 200, 28);
		contentPane.add(textField);
	}
}
