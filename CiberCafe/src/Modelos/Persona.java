package Modelos;

import java.time.LocalDateTime;

public class Persona {
	
	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected String telefono;
	protected String correo;
	protected LocalDateTime fecha_alta;
	
	public Persona(String dni, String nombre, String apellidos, String telefono, String correo,
			LocalDateTime fecha_alta) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
		this.fecha_alta = fecha_alta;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public LocalDateTime getFecha_alta() {
		return fecha_alta;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", correo=" + correo + ", fecha_alta=" + fecha_alta + "]";
	}
	
	
}
