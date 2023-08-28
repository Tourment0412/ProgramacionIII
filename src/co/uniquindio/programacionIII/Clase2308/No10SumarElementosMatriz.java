package co.uniquindio.programacionIII.Clase2308;

public class No10SumarElementosMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz= {{1,2,3},{4,5,6},{7,8,9},{10,2,3}};
		System.out.println(sumarElementosMatriz(matriz, 0, 0, 0));

	}
	
	public static int sumarElementosMatriz(int[][]a,int i, int j, int suma) {
		if(i!=a.length) {
			if (j != a[0].length) {
				return sumarElementosMatriz(a, i, j+1, suma+a[i][j]);
			} else {
				
				return sumarElementosMatriz(a, i+1, 0, suma);
			}
		}
		return suma;
	}

}
