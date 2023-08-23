package co.uniquindio.programacionIII.recursividad;

public class DivisionRestasSucesivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dividirRestasSucesivas(28, 3, 0));

	}
	
	
	public static int dividirRestasSucesivas(int dividendo,int divisor,int i) {
		if(dividendo<divisor) {
			return i;
		}
		else {
			return dividirRestasSucesivas(dividendo-divisor,divisor,i+1);
		}
	}

}
