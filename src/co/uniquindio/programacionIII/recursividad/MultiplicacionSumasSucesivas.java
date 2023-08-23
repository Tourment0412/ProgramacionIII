package co.uniquindio.programacionIII.recursividad;

public class MultiplicacionSumasSucesivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiplicarSumasSucesivas(2, 4));
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
