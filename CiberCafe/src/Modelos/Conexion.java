package Modelos;

import java.time.LocalDateTime;

public class Conexion {
	
	private LocalDateTime hora_inicio;
	private LocalDateTime hora_fin;
	private int id_ordenador;
	private String dni_cliente;
	
	public Conexion(String dni_cliente) {
		super();
		this.hora_inicio = LocalDateTime.now();
		this.hora_fin = null;
		this.id_ordenador = 1;
		this.dni_cliente = dni_cliente;
	}

	public LocalDateTime getHora_inicio() {
		return hora_inicio;
	}

	public LocalDateTime getHora_fin() {
		return hora_fin;
	}

	public int getId_ordenador() {
		return id_ordenador;
	}

	public String getDni_cliente() {
		return dni_cliente;
	}

	public void setHora_fin(LocalDateTime hora_fin) {
		this.hora_fin = hora_fin;
	}

	@Override
	public String toString() {
		return "Conexion [hora_inicio=" + hora_inicio + ", hora_fin=" + hora_fin
				+ ", id_ordenador=" + id_ordenador + ", dni_cliente=" + dni_cliente + "]";
	}
	
	
	
}
