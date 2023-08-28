package co.uniquindio.programacionIII.Clase2308;

public class No3SumaImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumarImpares(1, 5));

	}
	
	
	public static int sumarImpares (int i, int n) {
		if(i<n) {
			return i + sumarImpares(i+2, n);
		}else {
			return 0;
		}
	}
	// el punto 4 ya lo teniamos hecho
}
