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
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmpleVerIncidencias extends JFrame {

	private final JPanel contentPane = new Fondo();
	JButton btnHome;
	ImageIcon home, iconHome;
	private JTable table;
	private JTextField txtNumOrdenador;

	public EmpleVerIncidencias() {
		setForeground(new Color(0, 0, 204));
		setBackground(new Color(0, 0, 204));
		setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 18));
		setTitle("CiberCaf\u00E9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 500);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVerIncidencias = new JLabel("Ver incidencias");
		lblVerIncidencias.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerIncidencias.setForeground(Color.WHITE);
		lblVerIncidencias.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 35));
		lblVerIncidencias.setBackground(Color.WHITE);
		lblVerIncidencias.setBounds(10, 11, 804, 40);
		contentPane.add(lblVerIncidencias);
		
		JLabel lblNumOrdenador = new JLabel("N\u00FAmero ordenador:");
		lblNumOrdenador.setForeground(Color.WHITE);
		lblNumOrdenador.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblNumOrdenador.setBackground(Color.WHITE);
		lblNumOrdenador.setBounds(120, 82, 220, 30);
		contentPane.add(lblNumOrdenador);
		
		txtNumOrdenador = new JTextField();
		txtNumOrdenador.setBounds(505, 86, 185, 28);
		contentPane.add(txtNumOrdenador);
		txtNumOrdenador.setColumns(10);
		
		btnHome = new JButton("");		
		btnHome.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setBounds(770, 410, 44, 40);
		btnHome.setBackground(new Color(153, 0, 102));
		contentPane.add(btnHome);
		home = new ImageIcon(getClass().getResource("/img/home.png"));
		iconHome=new ImageIcon(home.getImage().getScaledInstance(btnHome.getWidth(), btnHome.getHeight(), Image.SCALE_DEFAULT));
		btnHome.setIcon(iconHome);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 140, 804, 180);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 784, 158);
		scrollPane.getViewport().setBackground(Color.WHITE);
		panel.add(scrollPane);
		
		table = new JTable();		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"001", "breve descripción de la avería", "06/05/2018", "08/05/2018"},
				{"002", "breve descripción de la avería", "08/05/2018", null},
			},
			new String[] {
				"ID Incidencia", "Descripci\u00F3n", "Fecha aver\u00EDa", "Fecha arreglo"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(70);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(SwingConstants.CENTER);
		table.getColumnModel().getColumn(0).setCellRenderer(tcr);
		table.getColumnModel().getColumn(1).setCellRenderer(tcr);
		table.getColumnModel().getColumn(2).setCellRenderer(tcr);
		table.getColumnModel().getColumn(3).setCellRenderer(tcr);
		scrollPane.setViewportView(table);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnModificar.setBorder(new LineBorder(new Color(255, 102, 0), 3));
		btnModificar.setBackground(new Color(255, 153, 0));
		btnModificar.setBounds(331, 361, 162, 30);
		contentPane.add(btnModificar);
	}
}
