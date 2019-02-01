package programas;

import java.util.Scanner;

public class Programa9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Byte opc;
		float pulg=0, pies=0;
		double operacion=0;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("OPCIONES:");
		System.out.println("1° Pulgadas a Centimetros");
		System.out.println("2° Pies a Centimetros");
		System.out.println("3° Pies a Pulgadas");
		System.out.print("Elija una opcion: ");
		opc = leer.nextByte();
		
switch (opc){
		
		case 1: System.out.print("Ingrese las Pulgadas a convertir: ");
		pulg = leer.nextFloat();
		operacion = pulg*2.54;
		System.out.print("Centimetros: "+operacion);
		break;
		case 2: System.out.print("Ingrese los Pies a convertir: ");
		pies = leer.nextFloat();
		operacion = pies*30.48;
		System.out.print("Centimetros: "+operacion);
		break;
		case 3: System.out.print("Ingrese los Pies a convertir: ");
		pies = leer.nextFloat();
		operacion=pies*12;
		System.out.print("Pulgadas: "+operacion);
		break;
		
		
		default: System.out.print("Caracter invalido...");
		
		
		
		}
		

	}

}
