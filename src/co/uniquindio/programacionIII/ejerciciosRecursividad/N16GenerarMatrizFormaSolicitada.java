package co.uniquindio.programacionIII.ejerciciosRecursividad;

public class N16GenerarMatrizFormaSolicitada {
	
	
	/*   0 0 0 0 0 1
	 * 	 0 0 0 0 1 2
	 * 	 0 0 0 1 2 3
	 * 	 0 0 1 2 3 4
	 *   0 1 2 3 4 5
	 * 	 1 2 3 4 5 6
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimirMatriz(llenarMamtrizFormaSolicitada(6), 0, 0);

	}
	
	
	
	public static int [][] llenarMamtrizFormaSolicitada(int tam){
		int [][] a= new int [tam][tam];
		return llenarMatrizFormaSolicitadaAux(a,0,0,0);
	}



	private static int[][] llenarMatrizFormaSolicitadaAux(int[][] a, int i, int j, int k) {
		if(i==a.length)return a;
		if(j==a[0].length) return llenarMatrizFormaSolicitadaAux(a, i+1, 0, 0);
		if(i+j<a.length-1) {
			a[i][j]=k;
			return llenarMatrizFormaSolicitadaAux(a, i, j+1, k);
		}
		if(i+j==a.length-1) {
			a[i][j]=k+1;
			return llenarMatrizFormaSolicitadaAux(a, i, j+1, 0);
		}
		a[i][j]=k+2;
		return llenarMatrizFormaSolicitadaAux(a, i, j+1, k+1);
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
