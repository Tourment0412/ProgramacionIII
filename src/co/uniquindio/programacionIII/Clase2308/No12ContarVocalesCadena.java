package co.uniquindio.programacionIII.Clase2308;

public class No12ContarVocalesCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vocales="aeiouAEIOU";
		System.out.println(contarVocales("oso",vocales,0,0));

	}
	
	
	public static boolean isVocal(char caracter, int i, String vocales) {
		
		if(i!=vocales.length()){
			if(vocales.charAt(i)==caracter) {
				return true;
			}
			else {
				return isVocal(caracter, i+1,vocales);
			}
		}
		return false;
	}
	
	
	public static int contarVocales (String cad, String vocales, int i, int cont) {
		if(cad.length()==0) {
			return 0;
		}
		if(i!= cad.length()) {
			if(isVocal(cad.charAt(i), 0, vocales)) {
				return contarVocales(cad, vocales, i+1, cont+1);
			}
			else {
				return contarVocales(cad, vocales, i+1, cont);
			}
		}
		return cont;
	}

}
