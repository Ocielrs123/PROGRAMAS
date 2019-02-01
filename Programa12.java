package programas;

import java.util.Scanner;

public class Programa12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String resp;
		float calif;
		double s=0 , prom;
		int i=0;
				
				
		Scanner leer= new Scanner(System.in);
		
		
		do{
		
		System.out.print("Ingrese una calificación: ");
		calif = leer.nextFloat();
		
		s=s+calif;
		i=i+1;
		prom=s/i;
		
		System.out.println("Quiere caprutar otra califiacion? (S/N)");
		resp= leer.next();
		
	}while(resp.equals("S"));
	
	if(prom>0 & prom<50){
		System.out.print("Suspenso");
	}
	
	if(prom>40 & prom<70){
		System.out.print("Aprobado");
	}
	
	if(prom>69 & prom<90){
		System.out.print("Notable");
	}
		
	if(prom>89 & prom<100){
		System.out.print("Sobresaliente");
	}
	
	if(prom==100){
		System.out.print("Matricula de honor");
	}
}
		

	}


