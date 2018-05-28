package Empleados;

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
import Modelos.Conexion;
import Modelos.Empleado;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;

public class EmpleMenu extends JFrame {

	private final JPanel contentPane = new Fondo();
	private JLabel lblEmpleado;
	private JButton btnCerrar, btnGestionClientes, btnInfoSala, btnRealizarCobro;

	public EmpleMenu(BD_Login bd, Empleado empleado, Conexion conexion) {
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
			public void mouseClicked(MouseEvent e) {
				LocalDateTime hora_fin=LocalDateTime.now();
				int id_conexion=bd.recupera_id(conexion);
				//System.out.println(id_conexion);
				int filas=bd.cerrar_sesion(id_conexion, hora_fin);
				//System.out.println(filas);
				dispose();
			}
		});
		btnCerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCerrar.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnCerrar.setForeground(new Color(255, 255, 255));
		btnCerrar.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnCerrar.setBackground(new Color(153, 0, 102));
		btnCerrar.setBounds(320, 318, 180, 40);
		contentPane.add(btnCerrar);
		
		lblEmpleado = new JLabel(empleado.getNombre()+" "+empleado.getApellidos());
		lblEmpleado.setForeground(Color.WHITE);
		lblEmpleado.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 35));
		lblEmpleado.setBackground(Color.WHITE);
		lblEmpleado.setBounds(26, 11, 788, 40);
		contentPane.add(lblEmpleado);
		
		btnGestionClientes = new JButton("Gestionar clientes");
		btnGestionClientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGestionClientes.setForeground(Color.WHITE);
		btnGestionClientes.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnGestionClientes.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnGestionClientes.setBackground(new Color(153, 0, 102));
		btnGestionClientes.setBounds(320, 165, 180, 40);
		contentPane.add(btnGestionClientes);
		
		btnInfoSala = new JButton("Informaci\u00F3n sala");
		btnInfoSala.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnInfoSala.setForeground(Color.WHITE);
		btnInfoSala.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnInfoSala.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnInfoSala.setBackground(new Color(153, 0, 102));
		btnInfoSala.setBounds(320, 216, 180, 40);
		contentPane.add(btnInfoSala);
		
		btnRealizarCobro = new JButton("Realizar Cobro");
		btnRealizarCobro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRealizarCobro.setForeground(Color.WHITE);
		btnRealizarCobro.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnRealizarCobro.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnRealizarCobro.setBackground(new Color(153, 0, 102));
		btnRealizarCobro.setBounds(320, 267, 180, 40);
		contentPane.add(btnRealizarCobro);
	}
}
