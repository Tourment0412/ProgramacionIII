package co.uniquindio.programacionIII.ejerciciosRecursividad;

public class N14SumarBordesMatriz {
	
	
	/*
	 * 
	 * Sumar todos los bordes de una matriz no cuadrada
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]a= {{1,2,3},
				{4,5,6},
				{7,8,10}};
		System.out.println(sumarBordesMatriz(a));

	}
	
	
	public static int sumarBordesMatriz(int[][]a) {
		return sumarBordesMatrizAux(a,0,0,0);
	}


	private static int sumarBordesMatrizAux(int[][] a, int i, int j, int suma) {
		if(i==a.length) return suma;
		if(j==a[i].length) return sumarBordesMatrizAux(a, i+1, 0, suma);
		if(i==0||i==a.length-1||(i!=0&&i!=a.length-1)&&(j==0||j==a[i].length-1)) return sumarBordesMatrizAux(a, i, j+1, suma+a[i][j]);
		return sumarBordesMatrizAux(a, i, j+1, suma);
	}

}
