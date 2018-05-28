package BDD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Modelos.Pedido;

public class BD_Pedidos extends BD_Conector {
	
	private static Statement s;	
	private static ResultSet reg;
	private static int resp;

	public BD_Pedidos(String fileName) {
		super(fileName);
	}
	
	public int realizar_pedido(Pedido pedido){
		String cadenaSQL="INSERT INTO pedidos (fecha_hora, cantidad, cod_producto, id_conexion) VALUES('"+pedido.getFecha_hora()+"',"+pedido.getCantidad()+","+pedido.getCod_producto()+","+pedido.getId_conexion()+")";
		System.out.println(cadenaSQL);
		try{
		this.abrir();
		s=c.createStatement();
		resp=s.executeUpdate(cadenaSQL);
		s.close();
		this.cerrar();
		return resp;
		}
		catch ( SQLException e){			
			return -1;
		}
	}
	
}
