package co.uniquindio.programacionIII.ejerciciosRecursividad;

public class N09DoublesArribaAbajoPromedio {
	
	/*Dado un arreglo de double, contar cuántos números están por encima del promedio y
	cuántos por debajo.
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double []a= {0.0,1.0,2.0,3.0};
		System.out.println(contarArribaProm(a));
		System.out.println(contarAbajoProm(a));

	}
	
	
	
	
	
	public static int contarArribaProm(double[]a) {
		double prom= hallarPromedioArreglo(a,0,0);
		return contarArribaPromAux(a, prom, 0, 0);
	}

	public static int contarAbajoProm(double[]a) {
		double prom= hallarPromedioArreglo(a,0,0);
		return contarAbajoPromAux(a, prom, 0, 0);
	}
	
	public static int contarAbajoPromAux(double[]a, double prom,int i, int cont) {
		if(i==a.length) return cont;
		if(a[i]<prom) return contarAbajoPromAux(a, prom, i+1, cont+1);
		return contarAbajoPromAux(a, prom, i+1, cont);
	}


	public static int contarArribaPromAux(double[]a, double prom,int i, int cont) {
		if(i==a.length) return cont;
		if(a[i]>prom) return contarArribaPromAux(a, prom, i+1, cont+1);
		return contarArribaPromAux(a, prom, i+1, cont);
	}
	
	
	
	public static double hallarPromedioArreglo(double[] a, int i,double cont) {
		if(i==a.length) return cont/a.length;
		return hallarPromedioArreglo(a, i+1, cont+a[i]);
	}

}
