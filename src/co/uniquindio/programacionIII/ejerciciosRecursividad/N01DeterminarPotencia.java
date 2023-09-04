package co.uniquindio.programacionIII.ejerciciosRecursividad;

public class N01DeterminarPotencia {
	
	
	/*
	 * Escribir un método que reciba 2 enteros n y b y devuelva true si n es potencia de b. Ej. 16
		es potencia de 2, 64 es potencia de 4, 50 no es potencia de 10
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(determinarPotencia(2, 16));

	}
	
	
	
	public static boolean determinarPotencia(int n,int b) {
		return determinarPotenciaAux(n, b, n);
	}
	
	public static boolean determinarPotenciaAux(int n, int b, int acum) {
		boolean ban=true;
		if(acum<=b) {
			
			if (acum!=b) {
				return determinarPotenciaAux(n,b,acum*n);
			}
			else {
				return ban;
			}
		}
		return !ban;
		
	
	}

}
