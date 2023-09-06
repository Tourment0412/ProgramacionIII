package co.uniquindio.programacionIII.Clase2308;

public class No05ImprimirArreglo {

	public static void main (String []args) {
		Object[] array= {1,2,3,4,5};
		
		imprimirArray(array, 0);
		

	}
	
	public static void imprimirArray( Object[]a, int i ) {
		if(i==0) {
			System.out.print("{");
		}
		
		if (i!= a.length) {
			System.out.print(a[i]);
			imprimirArray(a, i+1);
		}
		else {
			System.out.print("}");
		}
	}
	
	
	

}
