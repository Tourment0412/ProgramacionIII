package co.uniquindio.programacionIII.Clase2308;

public class No07HallarMenorArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {2,3,4,5,1};
		int menor= a[0];
		System.out.println(hallarMenorArreglo(a, 0, menor));

	}
	
	/* Aca se hace un segundo llamado en el caso de que no se encuentre un elemento menos al establecido
	 * Por lo que se hace necesario enviar de nuevo el metodo sin modificar el valor del menos
	 * 
	 * No es como fibonnacci donde los llamados recursivos aumentan exponencialmente, debido a que
	 * el segundo llamado solo se hara efectivo cuando se cumpla alguna condicion, en fibonacci si o si se hacia
	 * 
	 */
	public static int hallarMenorArreglo (int[]a,int i,int menor) {
		if(i!= a.length) {
			if(a[i]<menor) {
				return hallarMenorArreglo(a, i+1, a[i]);
			}else {
				return hallarMenorArreglo(a,i+1,menor);
			}
		}
		return menor;
	}

}
