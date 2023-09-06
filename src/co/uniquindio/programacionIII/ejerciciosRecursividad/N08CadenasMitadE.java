package co.uniquindio.programacionIII.ejerciciosRecursividad;

public class N08CadenasMitadE {
	
	
	
	/*
	 * 
	 * Buscar en un arreglo de cadenas cuales de ellas tiene como letra del medio la “e”
	 * 
	 * 
	 * 
	 * voy a hacerlo que las palabras con tamanio par al no tener letra media ni se cuenten
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] a= {"Pablo","Paelo","madecol","loakeoplo"};
		System.out.println(hallarCadenasLetraMediaE(a));

	}
	
	
	//Se puede con ArrayList tambien, voy a hacer String de strings
	public static String hallarCadenasLetraMediaE(String[]a) {
		return hallarCadenasLetraMediaEAux(a, 0, "");
	}
	
	public static String hallarCadenasLetraMediaEAux(String[]a, int i, String cad) {
		if(i==a.length) return cad;
		if(a[i].length()%2==0) return hallarCadenasLetraMediaEAux(a, i+1, cad);
		int media=(a[i].length()/2);
		if(a[i].charAt(media)=='e'|| a[i].charAt(media)=='E') return hallarCadenasLetraMediaEAux(a, i+1, cad+a[i]+"\t");
		return hallarCadenasLetraMediaEAux(a, i+1, cad);
	}

}
