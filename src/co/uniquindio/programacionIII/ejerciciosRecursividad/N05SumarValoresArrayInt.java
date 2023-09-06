package co.uniquindio.programacionIII.ejerciciosRecursividad;

public class N05SumarValoresArrayInt {
	
	
	/*. Sumar todos los valores de un arreglo de int y retornar dicho valor.
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {15,4,0,100,90,2,5};
		System.out.println(sumarElementoArreglos(0, a, 0));

	}
	
	
	public static int sumarElementoArreglos(int i,int[]a,int suma) {
		if(i!=a.length) {
			return sumarElementoArreglos(i+1, a, suma+a[i]);
		}
		return suma;
	}
}
