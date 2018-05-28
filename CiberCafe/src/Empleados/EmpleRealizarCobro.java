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

public class EmpleRealizarCobro extends JFrame {

	private final JPanel contentPane = new Fondo();
	JButton btnHome;
	ImageIcon home, iconHome;
	private JTextField txtNumOrdenador;
	private JTextField txtDniCliente;

	public EmpleRealizarCobro() {
		setForeground(new Color(0, 0, 204));
		setBackground(new Color(0, 0, 204));
		setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 18));
		setTitle("CiberCaf\u00E9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 500);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRealizarCobro = new JLabel("Realizar cobro");
		lblRealizarCobro.setHorizontalAlignment(SwingConstants.CENTER);
		lblRealizarCobro.setForeground(Color.WHITE);
		lblRealizarCobro.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 35));
		lblRealizarCobro.setBackground(Color.WHITE);
		lblRealizarCobro.setBounds(10, 11, 804, 40);
		contentPane.add(lblRealizarCobro);
		
		btnHome = new JButton("");		
		btnHome.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setBounds(770, 410, 44, 40);
		btnHome.setBackground(new Color(153, 0, 102));
		contentPane.add(btnHome);
		home = new ImageIcon(getClass().getResource("/img/home.png"));
		iconHome=new ImageIcon(home.getImage().getScaledInstance(btnHome.getWidth(), btnHome.getHeight(), Image.SCALE_DEFAULT));
		btnHome.setIcon(iconHome);
		
		JLabel lblNumOrdenador = new JLabel("N\u00FAmero de ordenador:");
		lblNumOrdenador.setForeground(Color.WHITE);
		lblNumOrdenador.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblNumOrdenador.setBackground(Color.WHITE);
		lblNumOrdenador.setBounds(120, 82, 255, 30);
		contentPane.add(lblNumOrdenador);
		
		txtNumOrdenador = new JTextField();
		txtNumOrdenador.setBounds(413, 82, 255, 28);
		contentPane.add(txtNumOrdenador);
		txtNumOrdenador.setColumns(10);
		
		JLabel lblDniCliente = new JLabel("DNI cliente:");
		lblDniCliente.setForeground(Color.WHITE);
		lblDniCliente.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 20));
		lblDniCliente.setBackground(Color.WHITE);
		lblDniCliente.setBounds(120, 123, 255, 30);
		contentPane.add(lblDniCliente);
		
		txtDniCliente = new JTextField();
		txtDniCliente.setColumns(10);
		txtDniCliente.setBounds(413, 121, 255, 28);
		contentPane.add(txtDniCliente);
		
		JPanel panel = new JPanel();
		panel.setBounds(64, 220, 690, 170);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNumConexion = new JLabel("N\u00FAmero conexi\u00F3n");
		lblNumConexion.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumConexion.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblNumConexion.setBounds(10, 0, 160, 14);
		panel.add(lblNumConexion);
		
		JLabel lblHoraInicio = new JLabel("Hora inicio");
		lblHoraInicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoraInicio.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblHoraInicio.setBounds(180, 2, 160, 14);
		panel.add(lblHoraInicio);
		
		JLabel lblHoraFin = new JLabel("Hora fin");
		lblHoraFin.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoraFin.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblHoraFin.setBounds(350, 2, 160, 14);
		panel.add(lblHoraFin);
		
		JLabel lblPrecioConexion = new JLabel("Precio");
		lblPrecioConexion.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecioConexion.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblPrecioConexion.setBounds(520, 4, 160, 14);
		panel.add(lblPrecioConexion);
		
		JLabel lblPedidos = new JLabel("Pedidos");
		lblPedidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPedidos.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblPedidos.setBounds(10, 49, 160, 14);
		panel.add(lblPedidos);
		
		JLabel label = new JLabel("001");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label.setBounds(10, 25, 160, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("12:00");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_1.setBounds(180, 25, 160, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("14:00");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_2.setBounds(350, 25, 160, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("6,00\u20AC");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_3.setBounds(520, 25, 160, 14);
		panel.add(label_3);
		
		JLabel lblCerveza = new JLabel("Cerveza");
		lblCerveza.setHorizontalAlignment(SwingConstants.CENTER);
		lblCerveza.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblCerveza.setBounds(10, 74, 160, 14);
		panel.add(lblCerveza);
		
		JLabel lblPatatasFritas = new JLabel("Patatas fritas");
		lblPatatasFritas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPatatasFritas.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblPatatasFritas.setBounds(10, 99, 160, 14);
		panel.add(lblPatatasFritas);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblCantidad.setBounds(180, 49, 160, 14);
		panel.add(lblCantidad);
		
		JLabel lblHoraPedido = new JLabel("Hora");
		lblHoraPedido.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoraPedido.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblHoraPedido.setBounds(350, 49, 160, 14);
		panel.add(lblHoraPedido);
		
		JLabel lblPrecioPedido = new JLabel("Precio");
		lblPrecioPedido.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecioPedido.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblPrecioPedido.setBounds(520, 49, 160, 14);
		panel.add(lblPrecioPedido);
		
		JLabel label_4 = new JLabel("1");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_4.setBounds(180, 74, 160, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("13:10");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_5.setBounds(350, 74, 160, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("0.80");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_6.setBounds(520, 74, 160, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("2");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_7.setBounds(180, 99, 160, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("13:11");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_8.setBounds(350, 99, 160, 14);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("2,00");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_9.setBounds(520, 99, 160, 14);
		panel.add(label_9);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblTotal.setBounds(350, 145, 160, 14);
		panel.add(lblTotal);
		
		JLabel lblPrecioTotal = new JLabel("8,80\u20AC");
		lblPrecioTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecioTotal.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblPrecioTotal.setBounds(520, 145, 160, 14);
		panel.add(lblPrecioTotal);
		
		JButton btnVer = new JButton("Ver");
		btnVer.setForeground(Color.WHITE);
		btnVer.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnVer.setBorder(new LineBorder(new Color(153, 0, 51), 3));
		btnVer.setBackground(new Color(153, 0, 102));
		btnVer.setBounds(323, 164, 178, 30);
		contentPane.add(btnVer);
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(SwingConstants.CENTER);
	}
}
