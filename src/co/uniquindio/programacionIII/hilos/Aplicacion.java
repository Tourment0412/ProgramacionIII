package co.uniquindio.programacionIII.hilos;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente1 = new Cliente("Juan", new int[] { 1, 2, 3 });
		Cliente cliente2 = new Cliente("Maria", new int[] { 2, 4, 6, 8 });

		Cajero cajero1= new Cajero("Pedrito", cliente1);
		Cajero cajero2 = new Cajero("Juanito",cliente2);

		// El metodo start no deja que enviarle un cliente, por lo tanto es necesario
		// que el cliente sea enviado
		// Como parametro al contructor
		cajero1.start();
		cajero2.start();
	}

}
