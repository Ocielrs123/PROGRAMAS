package programas;

import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
float cal;
		
		
		Scanner leer = new Scanner(System.in);
		
		
		
		System.out.print("Ingresa tu calificacion: ");
		cal = leer.nextByte();
		
		
		
		if(cal>=80)
		{
		System.out.println("Calificacion: "+cal+" Aprobado!");
		
		}
		else 
			{
			System.out.println("Calificacion: "+cal+" Reprobado...");
			}
		

	}

}
