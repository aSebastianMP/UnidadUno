package primeraUnidad;

import java.util.Scanner;

public class programa10A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		String r;
		float p;
		double s = 0, t = 0;
		Scanner leer = new Scanner(System.in);
		
		do{
			System.out.print("Ingrese el precio del producto: ");
			p = leer.nextFloat();
			s=s+p;
			c=c+1;
			System.out.print("Desea ingresar otro producto? (S/N) ");
			r = leer.next();
		}
		
		while(r.equals("S"));
			
		if(s>=1500){
			t=s+(s*0.11);
			System.out.println("Usted tiene un incremento de 11%");
			System.out.print("El total de su compra es: "+t);
		}
		else{
			t=s+(s*0.10);
			System.out.println("Usted tiene un incremento de 10%");
			System.out.print("El total de su compra es: "+t);
		}
	}

}
