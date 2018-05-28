
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import img.Fondo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;

import Administrador.AdminMenu;
import BDD.BD_Login;
import Clientes.ClienteMenu;
import Empleados.EmpleMenu;
import Modelos.Cliente;
import Modelos.Conexion;
import Modelos.Empleado;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private final JPanel contentPane = new Fondo();
	private JTextField txtUsuario;
	private JPasswordField txtPass;
	private JLabel lblUsuario, lblPass;
	private JButton btnEntrar;

	public Login() {
		setResizable(false);
		setForeground(new Color(0, 0, 204));
		setBackground(new Color(0, 0, 204));
		setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 18));
		setTitle("CiberCaf\u00E9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 500);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 35));
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBackground(Color.WHITE);
		lblUsuario.setBounds(202, 156, 203, 40);
		contentPane.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Century Gothic", Font.BOLD, 18));
		txtUsuario.setBackground(new Color(255, 255, 255));
		txtUsuario.setBounds(428, 166, 203, 33);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblPass = new JLabel("Contrase\u00F1a");
		lblPass.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 35));
		lblPass.setForeground(Color.WHITE);
		lblPass.setBounds(202, 215, 216, 40);
		contentPane.add(lblPass);
		
		txtPass = new JPasswordField();
		txtPass.setBackground(new Color(255, 255, 255));
		txtPass.setFont(new Font("Century Gothic", Font.BOLD, 18));
		txtPass.setColumns(10);
		txtPass.setBounds(428, 225, 203, 33);
		contentPane.add(txtPass);
		
		btnEntrar = new JButton("Iniciar sesi\u00F3n");
		btnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BD_Login bd=new BD_Login("mysql-properties.xml");
				
				String usuario=txtUsuario.getText();
				String pass=txtPass.getText();
				
				Empleado empleado=bd.loginEmpleados(usuario, pass);
				if(empleado == null) {
					Cliente cliente=bd.loginClientes(usuario, pass);
					if(cliente == null) {
						JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos");
					}else {
						dispose();
						
						Conexion conexion=new Conexion(cliente.getDni());
						int resp=bd.iniciar_sesion(conexion);
						//System.out.println(resp);
						
						ClienteMenu vClienteMenu=new ClienteMenu(bd, cliente, conexion);
						vClienteMenu.setLocationRelativeTo(null);
						vClienteMenu.setVisible(true);
					}
				}else {
					dispose();
					if(empleado.getCargo().equalsIgnoreCase("administrador")) {
						Conexion conexion=new Conexion(empleado.getDni());
						int resp=bd.iniciar_sesion(conexion);
						//System.out.println(resp);
						
						AdminMenu vAdminMenu=new AdminMenu(bd, empleado, conexion);
						vAdminMenu.setLocationRelativeTo(null);
						vAdminMenu.setVisible(true);
					}else {
						Conexion conexion=new Conexion(empleado.getDni());
						int resp=bd.iniciar_sesion(conexion);
						//System.out.println(resp);
						
						EmpleMenu vEmpleMenu=new EmpleMenu(bd, empleado, conexion);
						vEmpleMenu.setLocationRelativeTo(null);
						vEmpleMenu.setVisible(true);
					}
				}

			}
		});
		btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntrar.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnEntrar.setForeground(new Color(255, 255, 255));
		btnEntrar.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		btnEntrar.setBackground(new Color(153, 0, 102));
		btnEntrar.setBounds(320, 290, 186, 40);
		contentPane.add(btnEntrar);
	}
	

		
				
		
	
}
