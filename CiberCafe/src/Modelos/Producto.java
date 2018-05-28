package Modelos;

public class Producto {
	
	private int cod_producto;
	private String nombre;
	private double precio;
	private int stock;
	private String imagen;
	
	public Producto(int cod_producto, String nombre, double precio, int stock, String imagen) {
		super();
		this.cod_producto = cod_producto;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.imagen = imagen;
	}

	public int getCod_producto() {
		return cod_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	public String getImagen() {
		return imagen;
	}

	public void setId_producto(int id_producto) {
		this.cod_producto = cod_producto;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Producto [cod_producto=" + cod_producto + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock
				+ ", imagen=" + imagen + "]";
	}
	
	
	
}
