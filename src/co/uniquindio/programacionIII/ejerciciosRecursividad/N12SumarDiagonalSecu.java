package co.uniquindio.programacionIII.ejerciciosRecursividad;

public class N12SumarDiagonalSecu {
	
	
	/*. Sumar los valores de la diagonal secundaria de una matriz de double
	 * 
	 * Voy a asumir que la matriz es cuadrada
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		System.out.println(sumarDiagonalSecundaria(a));
	}
	
	
	
	public static int sumarDiagonalSecundaria(int[][]a) {
		if(a.length!=a[0].length) return Integer.MIN_VALUE;
		return sumarDiagonalSecundariaAux(a,0,0,0);
	}



	private static int sumarDiagonalSecundariaAux(int[][] a, int i, int j, int suma) {
		if(i==a.length) return suma;
		if(j==a[i].length) return sumarDiagonalSecundariaAux(a, i+1, 0, suma);
		if(i+j==a.length-1) return sumarDiagonalSecundariaAux(a, i, j+1, suma+a[i][j]);
		return sumarDiagonalSecundariaAux(a, i, j+1, suma);
	}
	
	
	

}
