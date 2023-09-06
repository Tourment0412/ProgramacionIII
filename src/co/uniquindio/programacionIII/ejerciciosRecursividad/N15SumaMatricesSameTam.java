package co.uniquindio.programacionIII.ejerciciosRecursividad;

public class N15SumaMatricesSameTam {
	
	/*
	 * Realizar la suma de 2 matrices cuadradas de los mismos tamaños
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{2,0,1},{3,0,0},{5,1,1}};
		int [][]b= {{1,0,1},{1,2,1},{1,1,0}};
		int[][]d= sumarMatricesCuadMismoTam(a, b);
		imprimirMatriz(d, 0, 0);

	}
	
	
	public static int[][] sumarMatricesCuadMismoTam(int[][]a,int[][]b){
		int[][]c= new int [1][1];
		if(a.length!=a[0].length||b.length!=b[0].length)return c;
		if(a.length!=b.length) return c;
		int[][]d= new int[a.length][a.length];
		return sumarMatricesCuadMismoTamAux(a,b,d,0,0);
		
	}


	private static int[][] sumarMatricesCuadMismoTamAux(int[][] a, int[][] b, int[][] d,int i,int j) {
		if(i==a.length) return d;
		if(j==a[i].length) return sumarMatricesCuadMismoTamAux(a, b, d, i+1, 0);
		d[i][j]= a[i][j]+b[i][j];
		return sumarMatricesCuadMismoTamAux(a, b,d, i, j+1);

	}
	
	public static void imprimirMatriz(int[][]a,int i, int j) {
		if(i!=a.length) {
			if (j != a[0].length) {
				System.out.print(a[i][j]+"\t");
				imprimirMatriz(a, i, j + 1);
			} else {
				//Aca tambien se puede tener el println para poder asi hacer el salto de linea
				System.out.print("\n");
				imprimirMatriz(a, i + 1, 0);
			}
		}
	}
	

}
