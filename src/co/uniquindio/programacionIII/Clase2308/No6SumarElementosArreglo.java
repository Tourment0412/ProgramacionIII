package co.uniquindio.programacionIII.Clase2308;

public class No6SumarElementosArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5};
		System.out.println(sumarElementoArreglos(0, a, 0));

	}
	
	
	public static int sumarElementoArreglos(int i,int[]a,int suma) {
		if(i!=a.length) {
			return sumarElementoArreglos(i+1, a, suma+a[i]);
		}
		else {
			return suma;
		}
	}
}
