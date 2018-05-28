package Modelos;

import java.time.LocalDateTime;

public class Cliente extends Persona {
	
	private boolean socio;

	public Cliente(String dni, String nombre, String apellidos, String telefono, String correo,
			LocalDateTime fecha_alta, boolean socio) {
		super(dni, nombre, apellidos, telefono, correo, fecha_alta);
		this.socio = socio;
	}

	public boolean isSocio() {
		return socio;
	}

	@Override
	public String toString() {
		String aux=super.toString();
		aux+= "Cliente [socio=" + socio + "]";
		
		return aux;
	}
	
	
	
}
