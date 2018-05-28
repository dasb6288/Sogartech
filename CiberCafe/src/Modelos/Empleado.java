package Modelos;

import java.time.LocalDateTime;

public class Empleado extends Persona {
	
	private String cargo;

	public Empleado(String dni, String nombre, String apellidos, String telefono, String correo,
			LocalDateTime fecha_alta, String cargo) {
		super(dni, nombre, apellidos, telefono, correo, fecha_alta);
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	@Override
	public String toString() {
		String aux=super.toString();
		aux+= "Empleado [cargo=" + cargo + "]";
		
		return aux;
	}

	
	
}
