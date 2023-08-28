package co.uniquindio.programacionIII.Clase2308;

public class No2DividirRecursivo {
	
	
	/*Para hacer divisiones mediante restas sucesivas la idea es contar cada resta
	 * y reducir el diviendo mediante restas
	 * 
	 * Hay que deternerse cuando:
	 * las resta sea negativa
	 * 
	 * o el casi base mas presente que seria:
	 * 
	 * que si el divisior es mayor que el dividendo la respuesta siempre va a ser cero punto
	 * algo (0.algo)
	 * 
	 * 
	 * Entonces se propone contar restas cada vez que el dividendo sea mayor que el divisor
	 * para asi poder lograr una division entera
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(dividir(6, 3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static int dividir(int a, int b) throws Exception {
		if(b==0) {
			throw new Exception ("Division no valida");
		}
		else if(b>a) {
			return 0;
		}
		else {
			return 1+dividir(a-b,b);
		}
	}

}
