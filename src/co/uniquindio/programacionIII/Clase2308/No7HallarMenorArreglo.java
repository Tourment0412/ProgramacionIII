package co.uniquindio.programacionIII.Clase2308;

public class No7HallarMenorArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {2,3,4,5,1};
		int menor= a[0];
		System.out.println(hallarMenorArreglo(a, 1, menor));

	}
	
	
	public static int hallarMenorArreglo (int[]a,int i,int menor) {
		if(i!= a.length) {
			if(a[i]<menor) {
				hallarMenorArreglo(a, i+1, a[i]);
			}
		}
		return menor;
	}

}
