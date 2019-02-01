package programas;

import java.util.Scanner;

public class Programa6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, residuo = 0;
		Scanner leer = new Scanner (System.in);
		
		
		
		
		System.out.println("Ingrese un numero entero: ");
		num = leer.nextInt();
		
		residuo = (num / 2);
		
		if (residuo == 0)
			System.out.println("El numero " + num + " es par");
		else 
			System.out.println("El numero " + num + " es non");
	}

}
