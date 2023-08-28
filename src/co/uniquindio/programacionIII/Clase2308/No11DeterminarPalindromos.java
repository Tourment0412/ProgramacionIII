package co.uniquindio.programacionIII.Clase2308;

public class No11DeterminarPalindromos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad="alunaeseanula";
		System.out.println(determinarPalindromo(cad, 0));

	}
	
	
	public static boolean determinarPalindromo(String cad, int i) {
		if (cad.length()==0) {
			return false;
		}
		if(cad.length()==1) {
			return true;
		}
		if(i>cad.length()/2) {
			return true;
		}
		if(cad.charAt(i)!=cad.charAt(cad.length()-i-1)) {
			return false;
		}
		return determinarPalindromo(cad, i+1);
	}

}
