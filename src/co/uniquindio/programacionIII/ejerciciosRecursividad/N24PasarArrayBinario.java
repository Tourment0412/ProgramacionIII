package co.uniquindio.programacionIII.ejerciciosRecursividad;

import java.util.ArrayList;

public class N24PasarArrayBinario {
	
	/*
	 * 
	 * Dado un ArrayList de tipo Integer (con números en base 10) retorne un ArrayList con los
		números en base 2 de cada uno de sus elementos.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {8,4};
		System.out.println(devolverListaBinario(a));

	}
	public static ArrayList<Double> devolverListaBinario(int[]nums){
		ArrayList<Double>a= new ArrayList<Double>();
		return devolverListaBinariosAux(a, nums, 0);
	}
	
	public static ArrayList<Double> devolverListaBinariosAux(ArrayList<Double>a,int[]nums,int i){
		if(i==nums.length) return a;
		a.add(devolverBinario(nums[i], 0, 1));
		return devolverListaBinariosAux(a, nums, i+1);
		
	}
	
	//Potencia inicia en 1
	public static double devolverBinario(int num,double resultado,int potencia) {
		if(num<2) return resultado+(num*potencia);
		return devolverBinario(num/2, resultado+((num%2)*potencia), potencia*10);
		
	}

}
