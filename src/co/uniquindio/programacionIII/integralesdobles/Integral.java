package co.uniquindio.programacionIII.integralesdobles;

public class Integral {
	
	
	private Integral instance;
	
	double sumaLinea;
	double sumaTotal;
	
	public Integral getInstance() {
		if(instance==null)
			instance= new Integral();
		return instance;
	}
	
	//public double

}
