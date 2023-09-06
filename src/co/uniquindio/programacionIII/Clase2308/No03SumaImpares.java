package co.uniquindio.programacionIII.Clase2308;

public class No03SumaImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumarImpares2(1, 8,1));
		System.out.println(sumarNumsImparesNAux(7, 1, 0));

	}
	
	
	public static int sumarImpares (int i, int n) {
		if(i<n) {
			return i + sumarImpares(i+2, n);
		}else {
			return 0;
		}
	}
	
	
	public static int sumarImpares2(int i, int n, int suma) {
		if(i<n-1) {
			return sumarImpares2(i+2, n,suma+i+2);
		}
		else {
			return suma;
		}
	}
	
	public static int sumarNumsImparesNAux(int n, int numImpar, int acumulador) {
		if (numImpar > n)
			return acumulador;
		return sumarNumsImparesNAux(n, numImpar + 2, acumulador + numImpar);
	}
	// el punto 4 ya lo teniamos hecho
}
