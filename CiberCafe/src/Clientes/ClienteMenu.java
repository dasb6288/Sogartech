package Clientes;
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
import javax.swing.border.LineBorder;

import BDD.BD_Login;
import Modelos.Cliente;
import Modelos.Conexion;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;

public class ClienteMenu extends JFrame {

	private final JPanel contentPane = new Fondo();
	private JTextField txtTiempoConexion;
	private JLabel lblUsuario, lblTiempoConexion;
	private JButton btnRealizarPedido, btnCerrar;
	private int id_conexion;

	public ClienteMenu(BD_Login bd, Cliente cliente, Conexion conexion) {
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
		
		btnCerrar = new JButton("Cerrar sesi\u00F3n");
		btnCerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				LocalDateTime hora_fin=LocalDateTime.now();
				id_conexion=bd.recupera_id(conexion);
				//System.out.println(id_conexion);
				int resp=bd.cerrar_sesion(id_conexion, hora_fin);
				//System.out.println(resp);
				dispose();
			}
		});
		btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCerrar.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnCerrar.setForeground(new Color(255, 255, 255));
		btnCerrar.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnCerrar.setBackground(new Color(153, 0, 102));
		btnCerrar.setBounds(320, 243, 180, 40);
		contentPane.add(btnCerrar);
		
		lblUsuario = new JLabel(cliente.getNombre()+" "+cliente.getApellidos());
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 35));
		lblUsuario.setBackground(Color.WHITE);
		lblUsuario.setBounds(26, 11, 618, 40);
		contentPane.add(lblUsuario);
		
		btnRealizarPedido = new JButton("Realizar Pedido");
		btnRealizarPedido.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				ClienteRealizarPedido vClienteRealizarPedido=new ClienteRealizarPedido(bd, cliente, conexion);
				vClienteRealizarPedido.setLocationRelativeTo(null);
				vClienteRealizarPedido.setVisible(true);
			}
		});
		btnRealizarPedido.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRealizarPedido.setForeground(Color.WHITE);
		btnRealizarPedido.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnRealizarPedido.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnRealizarPedido.setBackground(new Color(153, 0, 102));
		btnRealizarPedido.setBounds(320, 192, 180, 40);
		contentPane.add(btnRealizarPedido);
		
		txtTiempoConexion = new JTextField();
		txtTiempoConexion.setBounds(654, 29, 160, 20);
		contentPane.add(txtTiempoConexion);
		txtTiempoConexion.setColumns(10);
		
		lblTiempoConexion = new JLabel("Tiempo de conexi\u00F3n:");
		lblTiempoConexion.setForeground(new Color(255, 255, 255));
		lblTiempoConexion.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblTiempoConexion.setBounds(654, 11, 160, 14);
		contentPane.add(lblTiempoConexion);
	}
}
