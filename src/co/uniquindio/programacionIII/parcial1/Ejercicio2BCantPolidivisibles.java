package co.uniquindio.programacionIII.parcial1;

public class Ejercicio2BCantPolidivisibles {
	
	//Nos falto la parte de contar los polidivisibles en array, un buen despiste
	public static void main(String[] args) {
		int []a= {345654,232445};
		System.out.println(contarPolidivisibles(a));
	}
	/* Con lo de contar ya no necesitamos este metodos solo se necesitaria el auxiliar
	 * 
	 */
	private static boolean esPolidivisible(int n) {
		if (n <= 0)
			return false;
		return esPolidivisibleAux(n, calcularDigitos(n, 0));
	}

	private static int calcularDigitos(int n, int pot) {
		if (n == 0)
			return pot;
		return calcularDigitos(n / 10, pot + 1);
	}

	private static boolean esPolidivisibleAux(int n, int i) {
		if (n == 0)
			return true;
		if (n % i != 0)
			return false;
		return esPolidivisibleAux(n / 10, i - 1);
	}
	
	//Este seria el metodo que falta como auxiliar y un metodo principal que solo lleve el numero
	private static int contarPolidivisiblesAux(int[]a,int i,int cont) {
		if(i==a.length) return cont;
		if(esPolidivisibleAux(a[i], calcularDigitos(a[i], 0))) return contarPolidivisiblesAux(a, i+1, cont+1);
		return contarPolidivisiblesAux(a, i+1, cont);
	}
	//Siendo este metodo el que se llame en main
	private static int contarPolidivisibles(int[]a) {
		return contarPolidivisiblesAux(a, 0, 0);
	}

}
