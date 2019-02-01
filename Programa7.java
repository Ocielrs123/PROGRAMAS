package programas;

import java.util.Scanner;

public class Programa7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float c, f;
		
		
    	Scanner leer = new Scanner (System.in);
    	
    	
    	System.out.println("Ingrese los grados Fahrenheit: ");
    	f = leer.nextFloat();
    	
    	c=(float) ((f-32)/1.8);
    	System.out.println("Grados en fahrenheit: " + f);
    	System.out.println("Grados en centigrados: " + c);
    	

	}

}
