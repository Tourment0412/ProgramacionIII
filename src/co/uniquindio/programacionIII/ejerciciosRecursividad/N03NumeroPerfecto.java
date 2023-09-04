package co.uniquindio.programacionIII.ejerciciosRecursividad;

public class N03NumeroPerfecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hallarNumeroPerfecto(496,2, 1));

	}
	
	
	public static boolean hallarNumeroPerfecto(int num, int i, int suma) {
		boolean ban=true;
		if(i!= (num/2)+1) {
			if(num%i==0) {
				return hallarNumeroPerfecto(num,i+1,suma+i);
			}
			else {
				return hallarNumeroPerfecto(num, i+1, suma);
			}
		}else if(suma!=num) return !ban;
		return ban;
	}
		
	
}


