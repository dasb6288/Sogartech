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

public class EmpleGestionarClientes extends JFrame {

	private final JPanel contentPane = new Fondo();
	JButton btnHome;
	ImageIcon home, iconHome;

	public EmpleGestionarClientes() {
		setForeground(new Color(0, 0, 204));
		setBackground(new Color(0, 0, 204));
		setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 18));
		setTitle("CiberCaf\u00E9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 500);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGestionClientes = new JLabel("Gestionar clientes");
		lblGestionClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionClientes.setForeground(Color.WHITE);
		lblGestionClientes.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 35));
		lblGestionClientes.setBackground(Color.WHITE);
		lblGestionClientes.setBounds(10, 11, 804, 40);
		contentPane.add(lblGestionClientes);
		
		JButton btnDarAlta = new JButton("Dar de alta");
		btnDarAlta.setForeground(Color.WHITE);
		btnDarAlta.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnDarAlta.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnDarAlta.setBackground(new Color(153, 0, 102));
		btnDarAlta.setBounds(320, 192, 180, 40);
		contentPane.add(btnDarAlta);
		
		btnHome = new JButton("");		
		btnHome.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setBounds(770, 410, 44, 40);
		btnHome.setBackground(new Color(153, 0, 102));
		contentPane.add(btnHome);
		home = new ImageIcon(getClass().getResource("/img/home.png"));
		iconHome=new ImageIcon(home.getImage().getScaledInstance(btnHome.getWidth(), btnHome.getHeight(), Image.SCALE_DEFAULT));
		btnHome.setIcon(iconHome);
		
		JButton btnInfoClientes = new JButton("Informaci\u00F3n clientes");
		btnInfoClientes.setForeground(Color.WHITE);
		btnInfoClientes.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 15));
		btnInfoClientes.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnInfoClientes.setBackground(new Color(153, 0, 102));
		btnInfoClientes.setBounds(320, 243, 180, 40);
		contentPane.add(btnInfoClientes);
	}
}
