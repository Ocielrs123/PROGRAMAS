package programas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class programa10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner op=new Scanner(System.in);
		DecimalFormat formateador=newDecimalFormat("###,###.##");
		
		byte s=1;
		byte can;
		double n=0.0, t=0.0;
		
		
		
		
		System.out.println("Productos a ingresar: ");
			can=op.nextByte();
			
		do{
			System.out.println("Ingrese el valor del producto"+s);
			n=op.nextDouble();
			t=t+n;
			s++;
			
		}while(s<=can);
			
			
		if ((t>=1500)){
		t=t*1.11;
		}
		else{
		System.out.println("Monto: "+t+" El total es: "+(t*1.1));
	
		}
			System.out.print("Total con aumento: "+t);
	}

	private static DecimalFormat newDecimalFormat(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
