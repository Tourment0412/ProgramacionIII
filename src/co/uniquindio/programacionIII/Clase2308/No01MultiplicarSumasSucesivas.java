package co.uniquindio.programacionIII.Clase2308;

public class No01MultiplicarSumasSucesivas {

	
	//1. Multiplicar dos números mediante sumas sucesivas.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiplicarSumasSucesivas(11, 11));
	}
	
	public static int multiplicarSumasSucesivas(int factor1,int factor2) {
		if(factor2==1) {
			return factor1;
		}
		else {
			return factor1+ multiplicarSumasSucesivas(factor1, factor2-1);
		}
	}

}
