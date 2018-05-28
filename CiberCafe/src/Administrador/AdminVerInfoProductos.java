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
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminVerInfoProductos extends JFrame {

	private final JPanel contentPane = new Fondo();
	JButton btnHome;
	ImageIcon home, iconHome;
	private JTable table;

	public AdminVerInfoProductos() {
		setForeground(new Color(0, 0, 204));
		setBackground(new Color(0, 0, 204));
		setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 18));
		setTitle("CiberCaf\u00E9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 500);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInfoProductos = new JLabel("Informaci\u00F3n Productos");
		lblInfoProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfoProductos.setForeground(Color.WHITE);
		lblInfoProductos.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 35));
		lblInfoProductos.setBackground(Color.WHITE);
		lblInfoProductos.setBounds(10, 11, 804, 40);
		contentPane.add(lblInfoProductos);
		
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
		panel.setBounds(10, 62, 804, 282);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 784, 260);
		scrollPane.getViewport().setBackground(Color.WHITE);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"CER01", "Cerveza Mahou", "20"},
				{"LAY01", "Patatas fritas Lays", "50"},
				{"MON01", "Monster", "30"},
				{"CAF01", "Caf\u00E9", "40"},
			},
			new String[] {
				"C\u00F3digo", "Nombre", "Cantidad"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(70);
		table.getColumnModel().getColumn(1).setPreferredWidth(70);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.setFont(new Font("Calisto MT", Font.PLAIN, 14));
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setViewportView(table);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnModificar.setBorder(new LineBorder(new Color(255, 102, 0), 3));
		btnModificar.setBackground(new Color(255, 153, 0));
		btnModificar.setBounds(210, 378, 155, 30);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnEliminar.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnEliminar.setBackground(new Color(204, 0, 51));
		btnEliminar.setBounds(460, 378, 155, 30);
		contentPane.add(btnEliminar);
	}
}
