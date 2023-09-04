package co.uniquindio.programacionIII.ejerciciosRecursividad;

import java.util.Arrays;

public class N02OrdenarArrayDescendente {
	
	
	
	/*
	 * Ordenar un array de forma descendente.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1= {2,3,5,1,6,7,0,8,4,9};
		int [] array2= Arrays.copyOf(array1, array1.length);
		
		
		ordenarArrayDescendenteAux(array1, 0, 0);
		imprimirArray(array1, 0);
		
		ordenarArrayDescendente2(array2, 0, 1);
		imprimirArray(array2, 0);
		

	}
	
	
	//Compara de a pareja de numeros
	private static void ordenarArrayDescendenteAux(int[] array,int i,int j) {
		if(i<=array.length-1) {
			if(j<=array.length-2) {
				if(array[j]<array[j+1]) {
					int aux= array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
					ordenarArrayDescendenteAux(array, i, j+1);
				}
				else {
					ordenarArrayDescendenteAux(array, i, j+1);
				}
			}else {
				ordenarArrayDescendenteAux(array, i+1, 0);
			}
		}	
	}
	
	
	//Compara el mayor en un inicio con todos
	public static void ordenarArrayDescendente2(int[]array, int i, int j) {
		
		if(i!=array.length-1) {
			if(j==array.length) {
				ordenarArrayDescendente2(array, i+1, i+2);
			}
			else if(array[i]<array[j]) {
				int aux= array[i];
				array[i]= array[j];
				array[j]=aux;
				ordenarArrayDescendente2(array, i, j+1);
			}else {
				ordenarArrayDescendente2(array, i, j+1);
			}
		}
	}
	
	
	public static void imprimirArray( int[]a, int i ) {
		if (i!= a.length) {
			System.out.print(a[i]);
			imprimirArray(a, i+1);
		}
		else {
			System.out.print("}");
		}
	}
}
