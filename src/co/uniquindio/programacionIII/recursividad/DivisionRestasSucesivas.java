package co.uniquindio.programacionIII.recursividad;

public class DivisionRestasSucesivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(dividirRestasSucesivas(28, 0, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
	
	
	public static int dividirRestasSucesivas(int dividendo,int divisor,int i) throws Exception {
		if(dividendo<divisor) {
			return i;
		}
		else if( divisor==0) {
			throw new Exception("Division no valida");
		}
		else {
			return dividirRestasSucesivas(dividendo-divisor,divisor,i+1);
		}
	}

}
