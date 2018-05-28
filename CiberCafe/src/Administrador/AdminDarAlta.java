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

public class AdminDarAlta extends JFrame {

	private final JPanel contentPane = new Fondo();
	JButton btnHome;
	ImageIcon home, iconHome;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDni;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtCargo;

	public AdminDarAlta() {
		setForeground(new Color(0, 0, 204));
		setBackground(new Color(0, 0, 204));
		setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 18));
		setTitle("CiberCaf\u00E9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 500);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDarAltaEmple = new JLabel("Dar de alta Empleado");
		lblDarAltaEmple.setHorizontalAlignment(SwingConstants.CENTER);
		lblDarAltaEmple.setForeground(Color.WHITE);
		lblDarAltaEmple.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 35));
		lblDarAltaEmple.setBackground(Color.WHITE);
		lblDarAltaEmple.setBounds(10, 11, 804, 40);
		contentPane.add(lblDarAltaEmple);
		
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
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setForeground(Color.WHITE);
		lblApellidos.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblApellidos.setBackground(Color.WHITE);
		lblApellidos.setBounds(120, 123, 160, 30);
		contentPane.add(lblApellidos);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setForeground(Color.WHITE);
		lblDni.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblDni.setBackground(Color.WHITE);
		lblDni.setBounds(120, 164, 160, 30);
		contentPane.add(lblDni);
		
		JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
		lblTelefono.setForeground(Color.WHITE);
		lblTelefono.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblTelefono.setBackground(Color.WHITE);
		lblTelefono.setBounds(120, 205, 160, 30);
		contentPane.add(lblTelefono);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setForeground(Color.WHITE);
		lblCorreo.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblCorreo.setBackground(Color.WHITE);
		lblCorreo.setBounds(120, 246, 160, 30);
		contentPane.add(lblCorreo);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setForeground(Color.WHITE);
		lblCargo.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblCargo.setBackground(Color.WHITE);
		lblCargo.setBounds(120, 287, 160, 30);
		contentPane.add(lblCargo);
		
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
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(290, 205, 400, 28);
		contentPane.add(txtTelefono);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(290, 246, 400, 28);
		contentPane.add(txtCorreo);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setForeground(Color.WHITE);
		btnAgregar.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnAgregar.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnAgregar.setBackground(new Color(153, 0, 102));
		btnAgregar.setBounds(326, 349, 155, 30);
		contentPane.add(btnAgregar);
		
		txtCargo = new JTextField();
		txtCargo.setColumns(10);
		txtCargo.setBounds(290, 287, 400, 28);
		contentPane.add(txtCargo);
	}
}
