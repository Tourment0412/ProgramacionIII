package co.uniquindio.programacionIII.parcial1;

public class Ejercicio2ARaizDigital {

	
	
	//Nos quedo bueno, 10/10
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int raizDig = calcularRaizDig(591);
		System.out.println(raizDig);

	}
	private static int calcularRaizDig(int n) {
		if (n < 10)
			return n;
		return calcularRaizDig(sumarDigitos(n, 0));
	}

	private static int sumarDigitos(int n, int suma) {
		if (n == 0)
			return suma;
		return sumarDigitos(n / 10, suma + n % 10);
	}
}
