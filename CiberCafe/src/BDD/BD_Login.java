package BDD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Modelos.Cliente;
import Modelos.Conexion;
import Modelos.Empleado;

public class BD_Login extends BD_Conector {
	
	private static Statement s;	
	private static ResultSet reg;
	private static int resp;

	public BD_Login(String fileName) {
		super(fileName);
	}
	
	public Cliente loginClientes(String usuario, String pass){
		String cadenaSQL="SELECT * from clientes WHERE correo ='"+usuario+"' AND dni_cliente = '"+pass+"'";
		Cliente cliente=null;
		try{
			this.abrir();
			s=c.createStatement();
			reg=s.executeQuery(cadenaSQL);
			if ( reg.next()){
				java.sql.Timestamp f=reg.getTimestamp("fecha_alta");
				LocalDateTime fecha_alta=f.toLocalDateTime();
				cliente=new Cliente(reg.getString("dni_cliente"), reg.getString("nombre"), reg.getString("apellidos"), reg.getString("telefono"), reg.getString("correo"), fecha_alta, reg.getBoolean("socio"));
				
			}
			s.close();
			this.cerrar();
			return cliente;
		}
		catch ( SQLException e){		
			return null;			
		}
	}
	
	public Empleado loginEmpleados(String usuario, String pass){
		String cadenaSQL="SELECT * from empleados WHERE correo ='"+usuario+"' AND dni_empleado = '"+pass+"'";
		Empleado empleado=null;
		try{
			this.abrir();
			s=c.createStatement();
			reg=s.executeQuery(cadenaSQL);
			if ( reg.next()){
				java.sql.Timestamp f=reg.getTimestamp("fecha_alta");
				LocalDateTime fecha_alta=f.toLocalDateTime();
				empleado=new Empleado(reg.getString("dni_empleado"), reg.getString("nombre"), reg.getString("apellidos"), reg.getString("telefono"), reg.getString("correo"), fecha_alta, reg.getString("cargo"));
				
			}
			s.close();
			this.cerrar();
			return empleado;
		}
		catch ( SQLException e){		
			return null;			
		}
	}
	
	public int iniciar_sesion(Conexion conexion){
		String cadenaSQL="INSERT INTO conexiones (hora_inicio, hora_fin, id_ordenador, dni_cliente) VALUES('"+conexion.getHora_inicio()+"',"+ conexion.getHora_fin()+","+conexion.getId_ordenador()+",'"+conexion.getDni_cliente()+"')";
		//System.out.println(cadenaSQL);
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
	
	public int recupera_id(Conexion conexion) {
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		//LocalDateTime dateTime = conexion.getHora_inicio();
		//String formattedDateTime = dateTime.format(formatter);
		//SELECT * FROM `conexiones` WHERE DATE_FORMAT(hora_inicio, '%Y-%m-%d %H:%i') = '2018-05-15 12:49'
		//String cadenaSQL="SELECT id_conexion FROM conexiones WHERE DATE_FORMAT(hora_inicio, '%Y-%m-%d %H:%i') ='"+formattedDateTime+"' AND hora_fin IS NULL AND id_ordenador="+conexion.getId_ordenador()+" AND dni_cliente='"+conexion.getDni_cliente()+"'";
		String cadenaSQL="SELECT id_conexion FROM conexiones WHERE hora_fin IS NULL AND id_ordenador="+conexion.getId_ordenador()+" AND dni_cliente='"+conexion.getDni_cliente()+"'";
		//System.out.println(cadenaSQL);
		int id=0;
		try{
			this.abrir();
			s=c.createStatement();
			reg=s.executeQuery(cadenaSQL);
			if ( reg.next()){
				id=reg.getInt("id_conexion");
			}
			s.close();
			this.cerrar();
			return id;
		}
		catch ( SQLException e){		
			return -1;			
		}
	}
	
	public int cerrar_sesion(int id_conexion, LocalDateTime hora_fin){
		String cadenaSQL="UPDATE conexiones SET hora_fin='"+hora_fin+"' WHERE id_conexion="+id_conexion;
		//System.out.println(cadenaSQL);
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
