package programas;

import java.util.Scanner;

public class Datosdegente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leer = new Scanner (System.in);
		
		
		
		System.out.print("Ingresa tu nombre: ");
		String nombre;
		nombre = leer.nextLine();
		
		
		System.out.print("Ingresa tu edad: ");
		int edad;
		edad = leer.nextInt();
		
		System.out.print("Ingresa tu altura: ");
		double altura;
		altura = leer.nextDouble();
		
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Altura: "+altura);
		

	}

}
