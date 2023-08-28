package co.uniquindio.programacionIII.Clase2308;

public class No08ContarElementoArray {
	
	
	public static void main (String []args) {
		Integer[] array= {1,2,3,4,5,4,4,2};
		Integer elementoBuscar= 4;
		System.out.println("El elemento "+elementoBuscar +" se encuentra: "+contarElemento(array, 0, elementoBuscar, 0)+" veces");
		
		

	}
	
	public static int contarElemento( Object[]a, int i, Object elemento, int cont) {
		if (i!= a.length) {
			if(a[i]==elemento) {
				return contarElemento(a,i+1,elemento,cont+1); 
			}
			else {
				return contarElemento(a,i+1,elemento,cont);
			}
		}
		return cont;
		
	}
	
	


}
