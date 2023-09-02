package co.uniquindio.programacionIII.taller1;


public class Punto1 {
	public static void main(String[] args) {
		int m = 28;
		int n = 31;
		int multiplicar = multiplicarRuso(m, n);
		System.out.println(multiplicar);
	}

	public static int multiplicarRuso(int m, int n) {
		return multiplicarRusoAux(m, n, 0);
	}

	public static int multiplicarRusoAux(int m, int n, int suma) {
		if (m == 0 || n == 0)
			return suma;
		return multiplicarRusoAux(m / 2, n * 2, m % 2 == 0 ? suma : (suma + n));
	}
}
