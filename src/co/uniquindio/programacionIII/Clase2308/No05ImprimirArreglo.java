package co.uniquindio.programacionIII.Clase2308;

public class No05ImprimirArreglo {

	public static void main (String []args) {
		Object[] array= {1,2,3,4,5};
		System.out.print("{");
		imprimirArray(array, 0);
		

	}
	
	public static void imprimirArray( Object[]a, int i ) {
		if (i!= a.length) {
			System.out.print(a[i]);
			imprimirArray(a, i+1);
		}
		else {
			System.out.print("}");
		}
	}
	
	
	

}
