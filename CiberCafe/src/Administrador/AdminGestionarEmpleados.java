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

public class AdminGestionarEmpleados extends JFrame {

	private final JPanel contentPane = new Fondo();
	JButton btnHome;
	ImageIcon home, iconHome;

	public AdminGestionarEmpleados() {
		setForeground(new Color(0, 0, 204));
		setBackground(new Color(0, 0, 204));
		setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 18));
		setTitle("CiberCaf\u00E9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 500);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGestionEmple = new JLabel("Gestionar empleados");
		lblGestionEmple.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionEmple.setForeground(Color.WHITE);
		lblGestionEmple.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 35));
		lblGestionEmple.setBackground(Color.WHITE);
		lblGestionEmple.setBounds(10, 11, 804, 40);
		contentPane.add(lblGestionEmple);
		
		JButton btnDarDeAlta = new JButton("Dar de alta");
		btnDarDeAlta.setForeground(Color.WHITE);
		btnDarDeAlta.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnDarDeAlta.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnDarDeAlta.setBackground(new Color(153, 0, 102));
		btnDarDeAlta.setBounds(320, 192, 180, 40);
		contentPane.add(btnDarDeAlta);
		
		btnHome = new JButton("");		
		btnHome.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setBounds(770, 410, 44, 40);
		btnHome.setBackground(new Color(153, 0, 102));
		contentPane.add(btnHome);
		home = new ImageIcon(getClass().getResource("/img/home.png"));
		iconHome=new ImageIcon(home.getImage().getScaledInstance(btnHome.getWidth(), btnHome.getHeight(), Image.SCALE_DEFAULT));
		btnHome.setIcon(iconHome);
		
		JButton btnInfoEmpleados = new JButton("Informaci\u00F3n empleados");
		btnInfoEmpleados.setForeground(Color.WHITE);
		btnInfoEmpleados.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 14));
		btnInfoEmpleados.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnInfoEmpleados.setBackground(new Color(153, 0, 102));
		btnInfoEmpleados.setBounds(320, 243, 180, 40);
		contentPane.add(btnInfoEmpleados);
	}
}
