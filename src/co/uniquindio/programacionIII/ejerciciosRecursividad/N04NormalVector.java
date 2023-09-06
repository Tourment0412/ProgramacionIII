package co.uniquindio.programacionIII.ejerciciosRecursividad;

public class N04NormalVector {

	
	/* Escriba un método que retorne la norma de un vector (a) de tamaño n. La norma de un
vector se calcula sacando la raíz cuadrada a la sumatoria de cada uno de sus elementos al
cuadrado.

	 * 
	 * 
	 * El vector es un arreglo de enteros
	 */
	public static void main (String [] args) {
		
		int [] a= {15,4,0,100,90,2,5};
		System.out.println(calcularNormaVector(a));
		
	}
	
	
	public static int calcularNormaVector(int[]a) {
		return (int) Math.sqrt(calcularNormaVectorAux(a, 0, 0));
		
	}
	public static int calcularNormaVectorAux(int[]a,int i, int suma) {
		
		if(i!=a.length) {
			return calcularNormaVectorAux(a, i+1, suma+(a[i]*a[i]));
		}
		
		return suma;
		
	}
	
	
}
