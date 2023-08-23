package co.uniquindio.programacionIII.recursividad;

public class SumaConsecutivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumaRecursiva(5));

	}
	
	
	public static int sumaRecursiva(int n) {
		int res;
		if(n==1) {
			return 1;
		}
		else {
			res= n + sumaRecursiva(n-1);
		}
		
		return res;
		
	}

}
