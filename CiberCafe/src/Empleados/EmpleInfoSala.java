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

public class EmpleInfoSala extends JFrame {

	private final JPanel contentPane = new Fondo();
	JButton btnHome;
	ImageIcon home, iconHome;
	private JTable table;

	public EmpleInfoSala() {
		setForeground(new Color(0, 0, 204));
		setBackground(new Color(0, 0, 204));
		setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 18));
		setTitle("CiberCaf\u00E9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 500);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInfoSala = new JLabel("Informaci\u00F3n Sala");
		lblInfoSala.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfoSala.setForeground(Color.WHITE);
		lblInfoSala.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 35));
		lblInfoSala.setBackground(Color.WHITE);
		lblInfoSala.setBounds(10, 11, 804, 40);
		contentPane.add(lblInfoSala);
		
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
		panel.setBounds(10, 62, 804, 240);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 784, 218);
		panel.add(scrollPane);
		
		table = new JTable();		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"001", "SI"},
				{"002", "SI"},
				{"003", "SI"},
				{"004", "NO"},
				{"005", "NO"},
				{"006", "NO"},
				{"007", "SI"},
				{"008", "SI"},
				{"009", "NO"},
				{"010", "SI"},
				{"011", "NO"},
				{"012", "SI"},
				{"013", "NO"},
				{"014", "SI"},
				{"015", "SI"},
			},
			new String[] {
				"N\u00FAmero de ordenador", "Conectado"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(150);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(SwingConstants.CENTER);
		table.getColumnModel().getColumn(0).setCellRenderer(tcr);
		table.getColumnModel().getColumn(1).setCellRenderer(tcr);
		scrollPane.setViewportView(table);
		
		JButton btnAddIncidencia = new JButton("A\u00F1adir incidencia");
		btnAddIncidencia.setForeground(Color.WHITE);
		btnAddIncidencia.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnAddIncidencia.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnAddIncidencia.setBackground(new Color(204, 0, 51));
		btnAddIncidencia.setBounds(313, 313, 199, 30);
		contentPane.add(btnAddIncidencia);
		
		JButton btnVerIncidencias = new JButton("Ver incidencias");
		btnVerIncidencias.setForeground(Color.WHITE);
		btnVerIncidencias.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnVerIncidencias.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnVerIncidencias.setBackground(new Color(204, 0, 51));
		btnVerIncidencias.setBounds(313, 354, 199, 30);
		contentPane.add(btnVerIncidencias);
	}
}
