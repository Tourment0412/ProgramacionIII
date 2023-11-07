package co.uniquindio.programacionIII.integralesdobles;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la función (por ejemplo, x^2): ");
        String funcion = scanner.nextLine();
        
        System.out.println("Ingrese el inicio del intervalo de x: ");
        double inix=scanner.nextDouble();
        
        System.out.println("Ingrese el fin del intervalo de x: ");
        double finx=scanner.nextDouble();
        
        System.out.println("Ingrese las divisiones de x: ");
        double divix=scanner.nextDouble();
        
        
        System.out.println("Ingrese el inicio del intervalo de y: ");
        double iniy=scanner.nextDouble();
        
        System.out.println("Ingrese el fin del intervalo de y: ");
        double finy=scanner.nextDouble();
        
        System.out.println("Ingrese las divisiones de y: ");
        double diviy=scanner.nextDouble();
        
        
        double deltaX=(finx-inix)/divix;
        double deltaY=(finy-iniy)/diviy;
        

	}
	
	

}
