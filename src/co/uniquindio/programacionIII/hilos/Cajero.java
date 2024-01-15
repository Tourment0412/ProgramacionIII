package co.uniquindio.programacionIII.hilos;

public class Cajero extends Thread{
	
	private String nombre;
	private Cliente cliente;
	
	
	public Cajero(String nombre,Cliente cliente) {
		this.nombre = nombre;
		this.cliente=cliente;
	}


	public void atrenderCliente() {
		System.out.println("Esta atendiendo el cajero"+nombre);
		for(Integer i: cliente.getProductos()) {
			System.out.println("El cajero " +nombre +"Se esta procesando el producto y tardo "+i+" Segundos"+"Del cliente "+cliente.getNombre());
			//podemos mostrar como va el tiempo en milisegundos cada que entre un nuevo producto
			int tiem= (int)System.currentTimeMillis();
			System.out.println(""+(tiem/1000));
			try {
				//dormimos el hilo lo que dure el procesar el produ
				Thread.sleep(i*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int tiempo= (int)System.currentTimeMillis();
		System.out.println(""+(tiempo/1000));
	}
	@Override
	public void run() {
		atrenderCliente();
		super.run();
	}

}
