package co.uniquindio.programacionIII.hilos;

public class Cliente {
	
	private String nombre;
	private int [] productos;//tiempos a procesar
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int[] getProductos() {
		return productos;
	}
	public void setProductos(int[] productos) {
		this.productos = productos;
	}
	public Cliente(String nombre, int[] productos) {
		super();
		this.nombre = nombre;
		this.productos = productos;
	}

	
	
}
