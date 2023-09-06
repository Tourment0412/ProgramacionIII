package co.uniquindio.programacionIII.Clase2308;

public class No09ImprimirMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] matriz= {{1,2,3},{4,5,6},{7,8,9}};
		
		imprimirMatriz(matriz, 0, 0);
		
		

	}
	
	/*  "\t" es el tabulador, sirve para numero mas grances en la matriz 
	 * 
	 */
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
