package co.uniquindio.programacionIII.ejerciciosRecursividad;

public class N06ContarPrimosArray {

	
	
	
	
	/*
	 * 
	 * Contar cuántos números primos hay en un arreglo de enteros y retornar dicha cuenta.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,2,3,4,5,13,97};
		System.out.println(contarPrimos(a));

	}
	
	
	
	
	public static int contarPrimos(int[]a) {
		return contarPrimosAux(a,0, 0);
	}




	private static int contarPrimosAux(int[] a, int i, int sum) {
		// TODO Auto-generated method stub
		if(i!=a.length) {
			if(isPrimo(a[i], 2)) {
				return contarPrimosAux(a, i+1, sum+1);
			}
			else {
				return contarPrimosAux(a, i+1, sum);
			}
		}
		return sum;
	}
	
	
	public static boolean isPrimo(int num,int i) {
		if(num==0|| num==1) return false;
		if(i<=num/2) {
			if(num%i==0) return false;
			else return isPrimo(num, i+1);
		}
		return true;
	}

}
