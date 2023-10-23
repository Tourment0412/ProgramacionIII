package co.uniquindio.programacionIII.temas;

import java.util.ArrayList;
import java.util.Iterator;

public class PruebaComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lista= new ArrayList<>();
		lista.add(1);
		lista.add(3);
		lista.add(2);
		lista.add(5);
		lista.add(0);
		
		lista.sort((o1,o2)->o2.compareTo(o1));
		imprimirLista(lista);
	}

	private static void imprimirLista(ArrayList<Integer> lista) {
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
	}

}
