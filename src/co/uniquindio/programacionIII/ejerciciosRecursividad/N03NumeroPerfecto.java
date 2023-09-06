package co.uniquindio.programacionIII.ejerciciosRecursividad;



/*
 * Un número N es perfecto si la suma de sus divisores (excluido el propio N) es N. Por
ejemplo 28 es perfecto, pues sus divisores (excluido el 28) son 1,2,4,7 y 14 su suma da
28. Escriba un método que indique si N es perfecto.
 */

public class N03NumeroPerfecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hallarNumeroPerfecto(28,2, 1));

	}
	
	
	public static boolean hallarNumeroPerfecto(int num, int i, int suma) {
		
		if(i!= (num/2)+1) {
			if(num%i==0) {
				return hallarNumeroPerfecto(num,i+1,suma+i);
			}
			else {
				return hallarNumeroPerfecto(num, i+1, suma);
			}
		}else if(suma!=num) return false;
		return true;
	}
		
	
}


