package co.uniquindio.programacionIII.ejerciciosRecursividad;

public class N11MenorMatrizCuadrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a= {{1,2,3},{4,0,6},{-1,7,8}};
		System.out.println(hallarMenorMatriz(a));

	}
	
	
	
	
	public static int hallarMenorMatriz(int[][]a) {
		int menor=a[0][0];
		return hallarMenosMatrizAux(a,0,0,menor);
	}




	private static int hallarMenosMatrizAux(int[][] a, int i, int j, int menor) {
		if(i==a.length)return menor;
		//Va mejor abajo ya que la i me debe detener en el momento que se pase
		if(a.length!=a[i].length) return Integer.MIN_VALUE;
		if(j==a[0].length)return hallarMenosMatrizAux(a, i+1, 0, menor);
		if(menor>a[i][j]) return hallarMenosMatrizAux(a, i, j+1, a[i][j]);
		return hallarMenosMatrizAux(a, i, j+1, menor);
	}

}
