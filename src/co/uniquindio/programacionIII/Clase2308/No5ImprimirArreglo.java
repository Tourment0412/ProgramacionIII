package co.uniquindio.programacionIII.Clase2308;

public class No5ImprimirArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {1,2,3,4,5};

	}
	
	//Este es el del profesor
	public static void imprimirArreglo(int i, int[]a) {
		if(i<a.length) {
			System.out.print(a[i]);
			imprimirArreglo(i+1, a);
		}
	}
	
	
	

}
