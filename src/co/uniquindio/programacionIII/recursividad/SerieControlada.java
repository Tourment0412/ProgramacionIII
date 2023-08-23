package co.uniquindio.programacionIII.recursividad;

public class SerieControlada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimir(1);

	}
	
	
	public static void imprimir (int x) {
		if(x<=5) {
			System.out.print(x+" ");
			imprimir(x+1);
		}
	}

}
