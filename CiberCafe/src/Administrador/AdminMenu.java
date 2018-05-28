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

public class AdminMenu extends JFrame {

	private final JPanel contentPane = new Fondo();
	private JButton btnCerrar, btnGestionEmple, btnGestionAlmacen;
	private JLabel lblAdmin;

	public AdminMenu(BD_Login bd, Empleado empleado, Conexion conexion) {
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
		btnCerrar.setBounds(320, 267, 180, 40);
		contentPane.add(btnCerrar);
		
		lblAdmin = new JLabel(empleado.getNombre()+" "+empleado.getApellidos());		
		lblAdmin.setForeground(Color.WHITE);
		lblAdmin.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 35));
		lblAdmin.setBackground(Color.WHITE);
		lblAdmin.setBounds(26, 11, 788, 40);
		contentPane.add(lblAdmin);
		
		btnGestionEmple = new JButton("Gestionar empleados");
		btnGestionEmple.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGestionEmple.setForeground(Color.WHITE);
		btnGestionEmple.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 15));
		btnGestionEmple.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnGestionEmple.setBackground(new Color(153, 0, 102));
		btnGestionEmple.setBounds(320, 165, 180, 40);
		contentPane.add(btnGestionEmple);
		
		btnGestionAlmacen = new JButton("Gestionar almac\u00E9n");
		btnGestionAlmacen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGestionAlmacen.setForeground(Color.WHITE);
		btnGestionAlmacen.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnGestionAlmacen.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnGestionAlmacen.setBackground(new Color(153, 0, 102));
		btnGestionAlmacen.setBounds(320, 216, 180, 40);
		contentPane.add(btnGestionAlmacen);
	}
}
