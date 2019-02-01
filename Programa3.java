package programas;

import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		byte edad;
		float estatura;
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.print("Ingresa tu nombre: ");
		nombre = leer.nextLine();
		
		System.out.print("Ingresa tu edad: ");
		edad = leer.nextByte();
		
		System.out.print("Ingresa tu estatura: ");
		estatura = leer.nextFloat();
		
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Estatura: "+estatura);
		
		

	}

}
