package co.uniquindio.programacionIII.ejerciciosRecursividad;

public class N10PromedioDiagonalMatrizCuadrada {
	
	/*Hallar el promedio de los elementos de la diagonal de una matriz cuadrada.

	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(hallarPromedioDiagonal(a));

	}
	
	
	
	public static double hallarPromedioDiagonal(int[][]a) {
		return hallarPromedioDiagonalAux(a,0,0,0);
	}



	private static double hallarPromedioDiagonalAux(int[][] a, int i, int j,int cont) {
		if(a.length!=a[i].length) return -1.0;
		if(i==a.length) return cont/(double)i;
		return hallarPromedioDiagonalAux(a, i+1, j+1, cont+a[i][j]);
	}

}
