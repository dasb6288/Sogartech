package Modelos;

import java.time.LocalDateTime;

public class Pedido {
	
	private LocalDateTime fecha_hora;
	private int cantidad;
	private int cod_producto;
	private int id_conexion;
	
	public Pedido(LocalDateTime fecha_hora, int cantidad, int cod_producto, int id_conexion) {
		super();
		this.fecha_hora = fecha_hora;
		this.cantidad = cantidad;
		this.cod_producto = cod_producto;
		this.id_conexion = id_conexion;
	}

	public LocalDateTime getFecha_hora() {
		return fecha_hora;
	}

	public int getCantidad() {
		return cantidad;
	}

	public int getCod_producto() {
		return cod_producto;
	}

	public int getId_conexion() {
		return id_conexion;
	}

	public void setFecha_hora(LocalDateTime fecha_hora) {
		this.fecha_hora = fecha_hora;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setCod_producto(int cod_producto) {
		this.cod_producto = cod_producto;
	}

	public void setId_conexion(int id_conexion) {
		this.id_conexion = id_conexion;
	}

	@Override
	public String toString() {
		return "Pedido [fecha_hora=" + fecha_hora + ", cantidad=" + cantidad + ", cod_producto=" + cod_producto
				+ ", id_conexion=" + id_conexion + "]";
	}
	
	
}
