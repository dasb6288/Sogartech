package Clientes;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import img.Fondo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.LineBorder;
import java.awt.Cursor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import BDD.BD_Login;
import BDD.BD_Pedidos;
import BDD.BD_Productos;
import Modelos.Cliente;
import Modelos.Conexion;
import Modelos.Pedido;
import Modelos.Producto;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.util.Vector;

public class ClienteRealizarPedido extends JFrame {

	private final JPanel contentPane = new Fondo();
	ImageIcon mahou, lays, cafe, home;
	ImageIcon iconMahou, iconLays, iconCafe, iconHome;
	private JLabel lblNuestrosProductos;
	private JButton btnHome, btnPedir;
	private JTable table;
	private JPanel panelProductos, panelInfo;
	int fila=-1, cod_producto;

	public ClienteRealizarPedido(BD_Login bd, Cliente cliente, Conexion conexion) {
		
		setForeground(new Color(0, 0, 204));
		setBackground(new Color(0, 0, 204));
		setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 18));
		setTitle("CiberCaf\u00E9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 500);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelProductos = new JPanel();
		panelProductos.setBackground(Color.WHITE);
		panelProductos.setBounds(10, 57, 360, 371);
		contentPane.add(panelProductos);
		panelProductos.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 340, 349);
		panelProductos.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// ID de la fila seleccionada
				fila=table.getSelectedRow();
				cod_producto=(int) table.getValueAt(fila, 0);
			}
		});
		table.setRowHeight(50);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nombre", "Precio"
			}
		));
		table.getColumnModel().getColumn(0).setMaxWidth(0);
		table.getColumnModel().getColumn(0).setMinWidth(0);
		table.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
		table.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(SwingConstants.CENTER);
		table.getColumnModel().getColumn(0).setCellRenderer(tcr);
		table.getColumnModel().getColumn(1).setCellRenderer(tcr);
		table.getColumnModel().getColumn(2).setCellRenderer(tcr);
		scrollPane.setViewportView(table);
		scrollPane.getViewport().setBackground(Color.WHITE);
		
		Rellena_Tabla();
		
		mahou = new ImageIcon(getClass().getResource("/img/mahou.jpg"));
		lays = new ImageIcon(getClass().getResource("/img/lays.jpg"));
		cafe = new ImageIcon(getClass().getResource("/img/cafeSolo.png"));
		
		lblNuestrosProductos = new JLabel("Nuestros productos");
		lblNuestrosProductos.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 35));
		lblNuestrosProductos.setForeground(Color.WHITE);
		lblNuestrosProductos.setBackground(Color.WHITE);
		lblNuestrosProductos.setBounds(10, 11, 804, 35);
		contentPane.add(lblNuestrosProductos);
		
		panelInfo = new JPanel();
		panelInfo.setBackground(Color.WHITE);
		panelInfo.setBounds(553, 57, 261, 230);
		contentPane.add(panelInfo);
		panelInfo.setLayout(null);
		
		btnHome = new JButton("");		
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				ClienteMenu vClienteMenu=new ClienteMenu(bd, cliente, conexion);
				vClienteMenu.setLocationRelativeTo(null);
				vClienteMenu.setVisible(true);
			}
		});
		btnHome.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setBounds(770, 410, 44, 40);
		btnHome.setBackground(new Color(153, 0, 102));
		contentPane.add(btnHome);
		home = new ImageIcon(getClass().getResource("/img/home.png"));
		iconHome=new ImageIcon(home.getImage().getScaledInstance(btnHome.getWidth(), btnHome.getHeight(), Image.SCALE_DEFAULT));
		btnHome.setIcon(iconHome);
		
		btnPedir = new JButton("Pedir");
		btnPedir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(fila == -1) {
					JOptionPane.showMessageDialog(null, "Selecciona una fila");
				}else {
					int respuesta=JOptionPane.showConfirmDialog(null, "¿Seguro que desea continuar con el pedido?");
					if (respuesta==JOptionPane.YES_OPTION) {
						//Realizar pedido
						BD_Pedidos bd_pedidos=new BD_Pedidos("mysql-properties.xml");
						LocalDateTime fecha_hora=LocalDateTime.now();
						int id_conexion=bd.recupera_id(conexion);
						Pedido pedido=new Pedido(fecha_hora, 1, cod_producto, id_conexion);
						int resp=bd_pedidos.realizar_pedido(pedido);
						//System.out.println(resp);
					}
				}
			}
		});
		btnPedir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPedir.setForeground(Color.WHITE);
		btnPedir.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 16));
		btnPedir.setBorder(new LineBorder(new Color(255, 102, 0), 3));
		btnPedir.setBackground(new Color(255, 153, 0));
		btnPedir.setBounds(380, 156, 163, 30);
		contentPane.add(btnPedir);

	}
	
	public void Rellena_Tabla(){
		BD_Productos bd_productos=new BD_Productos("mysql-properties.xml");
		
		DefaultTableModel dtm=(DefaultTableModel) table.getModel();
		dtm.setRowCount(0);
		try {
			Vector<Producto> productos=bd_productos.listar_Productos();
			for(Producto p : productos){
				//ImageIcon lblImagen = new ImageIcon(getClass().getResource("/img/"+p.getImagen()));
				//ImageIcon foto = new ImageIcon(lblImagen.getImage().getScaledInstance(50, 50, 0));
				dtm.addRow(new Object[] {p.getCod_producto(), p.getNombre(), p.getPrecio()});
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
