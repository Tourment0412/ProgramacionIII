package co.uniquindio.programacionIII.ejerciciosRecursividad;

public class N01DeterminarPotencia {
	
	
	/*
	 * Escribir un método que reciba 2 enteros n y b y devuelva true si n es potencia de b. Ej. 16
		es potencia de 2, 64 es potencia de 4, 50 no es potencia de 10
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(determinarPotencia(10, 50));

	}
	
	
	
	public static boolean determinarPotencia(int b,int n) {
		//return determinarPotenciaAux(b, n, b);
		return determinarPotencia2(b, n, b);
	}
	
	public static boolean determinarPotenciaAux(int b, int n, int acum) {
		boolean ban=true;
		if(acum<=n) {
			
			if (acum!=n) {
				return determinarPotenciaAux(b,n,acum*b);
			}
			else {
				return ban;
			}
		}
		return !ban;
		
	
	}
	
	public static boolean determinarPotencia2(int b,int n,int acum) {
		if(acum>n) return false;
		if(acum!=n) return determinarPotencia2(b, n, acum*b);
		return true;
	}

}
