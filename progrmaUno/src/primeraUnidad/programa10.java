package primeraUnidad;

import java.text.DecimalFormat;
import java.util.Scanner;

public class programa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float c1,c2,c3,s;
		double r,d;
		Scanner leer = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("###,###.##");
		
		System.out.print("Precio del primer articulo: ");
		c1 = leer.nextFloat();
		System.out.print("Precio del segundo articulo: ");
		c2 = leer.nextFloat();
		System.out.print("Precio del tercer articulo: ");
		c3 = leer.nextFloat();
		s=c1+c2+c3;
		
		if(s>1500){
			d=(s*0.11);
			r=s-d;
			System.out.println("Usted tiene un descuento de 11%");
			System.out.print("El total de su compra es: "+r);
			
		}
		else{
			d=(s*0.10);
			r=s-d;
			System.out.println("Usted tiene un descuento de 10%");
			System.out.print("El total de su compra es: "+r);
		}
			
	}

}
