package co.uniquindio.programacionIII.ejerciciosRecursividad;

public class N13CadMasLargaMatriz {
	
	
	/*De una matriz de cadenas cuadrada mostrar la cadena más larga.

	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][]a= {{"carla","carlos"},{"memesss","opo"}};
		
		System.out.println(hallarCadenaMasLargaMatriz(a));
		

	}
	
	
	
	public static String hallarCadenaMasLargaMatriz(String[][]a) {
		String cad= a[0][0];
		return hallarCadenaMasLargaMatrizAux(a,0,0,cad);
	}



	private static String hallarCadenaMasLargaMatrizAux(String[][] a, int i, int j, String cad) {
		if(i==a.length)return cad;
		if(j==a[i].length)return hallarCadenaMasLargaMatrizAux(a, i+1, 0, cad);
		if(cad.length()<a[i][j].length()) return hallarCadenaMasLargaMatrizAux(a, i, j+1, a[i][j]);
		return hallarCadenaMasLargaMatrizAux(a, i, j+1, cad);
	}

}
