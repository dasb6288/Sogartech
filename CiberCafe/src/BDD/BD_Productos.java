package BDD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import Modelos.Producto;

public class BD_Productos extends BD_Conector {
	
	private static Statement s;	
	private static ResultSet reg;
	private static int resp;

	public BD_Productos(String fileName) {
		super(fileName);
	}
	
	public Vector<Producto> listar_Productos(){
		Vector<Producto> productos=new Vector<Producto>();
		String cadenaSQL="SELECT * FROM productos";
		
		try{
			this.abrir();
			s=c.createStatement();
			reg=s.executeQuery(cadenaSQL);
			while ( reg.next()){
				Producto p=new Producto(reg.getInt("cod_producto"), reg.getString("nombre"), reg.getDouble("precio"), reg.getInt("stock"), reg.getString("imagen"));
				productos.add(p);
			}
			s.close();
			this.cerrar();
			return productos;
		}
		catch ( SQLException e){		
			return null;			
		}
	}
	
	
}
