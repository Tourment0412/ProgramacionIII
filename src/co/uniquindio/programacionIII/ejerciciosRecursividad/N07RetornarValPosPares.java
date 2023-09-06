package co.uniquindio.programacionIII.ejerciciosRecursividad;

public class N07RetornarValPosPares {
	
	/*
	 * 
	 * Retornar en una cadena los números ubicados en las posiciones pares de un arreglo de
		int.
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7};
		System.out.println(hallarNumerosPosicionesPares(a));

	}
	
	
	
	public static String hallarNumerosPosicionesPares(int[]a) {
		//return hallarNumerosPosicionesParesAux(a,0,"");
		return hallarNumerosPosicionesParesAux(a, 0, "");
	}



	private static String hallarNumerosPosicionesParesAux(int[] a, int i,String cad) {
		if(i==a.length) return cad;
		if(i%2==0) {
			cad+=a[i]+"";
			return hallarNumerosPosicionesParesAux(a, i+1, cad);
		}
		return hallarNumerosPosicionesParesAux(a, i+1, cad);
	}
	
	


}
