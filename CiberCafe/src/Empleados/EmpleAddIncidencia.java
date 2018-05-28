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
import java.awt.Image;

import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;
import javax.swing.JCheckBox;

public class EmpleAddIncidencia extends JFrame {

	private final JPanel contentPane = new Fondo();
	JButton btnHome;
	ImageIcon home, iconHome;
	private JTextField txtNumOrdenador;
	private JTextField txtDescripcion;

	public EmpleAddIncidencia() {
		setForeground(new Color(0, 0, 204));
		setBackground(new Color(0, 0, 204));
		setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 18));
		setTitle("CiberCaf\u00E9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 500);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddincidencia = new JLabel("A\u00F1adir incidencia");
		lblAddincidencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddincidencia.setForeground(Color.WHITE);
		lblAddincidencia.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 35));
		lblAddincidencia.setBackground(Color.WHITE);
		lblAddincidencia.setBounds(10, 11, 804, 40);
		contentPane.add(lblAddincidencia);
		
		btnHome = new JButton("");		
		btnHome.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setBounds(770, 410, 44, 40);
		btnHome.setBackground(new Color(153, 0, 102));
		contentPane.add(btnHome);
		home = new ImageIcon(getClass().getResource("/img/home.png"));
		iconHome=new ImageIcon(home.getImage().getScaledInstance(btnHome.getWidth(), btnHome.getHeight(), Image.SCALE_DEFAULT));
		btnHome.setIcon(iconHome);
		
		JLabel lblNumOrdenador = new JLabel("N\u00FAmero ordenador:");
		lblNumOrdenador.setForeground(Color.WHITE);
		lblNumOrdenador.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblNumOrdenador.setBackground(Color.WHITE);
		lblNumOrdenador.setBounds(120, 82, 220, 30);
		contentPane.add(lblNumOrdenador);
		
		JLabel lblDescripcion = new JLabel("Descripci\u00F3n:");
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblDescripcion.setBackground(Color.WHITE);
		lblDescripcion.setBounds(120, 123, 220, 30);
		contentPane.add(lblDescripcion);
		
		txtNumOrdenador = new JTextField();
		txtNumOrdenador.setBounds(505, 86, 185, 28);
		contentPane.add(txtNumOrdenador);
		txtNumOrdenador.setColumns(10);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(120, 164, 570, 60);
		contentPane.add(txtDescripcion);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setForeground(Color.WHITE);
		btnAgregar.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnAgregar.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnAgregar.setBackground(new Color(153, 0, 102));
		btnAgregar.setBounds(332, 294, 160, 30);
		contentPane.add(btnAgregar);
	}
}
