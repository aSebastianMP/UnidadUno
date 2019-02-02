package primeraUnidad;

import java.util.Scanner;

public class programa10B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner op=new Scanner(System.in);
		byte s;
		int c=0, p=-1;
		double t=0;
		
		System.out.println("Ingrese un número del 0 al 76");
		System.out.println("Ningún valor por encima del indicado es invalido.");
		
		do{
			System.out.println("Ingrese los números");
				s=op.nextByte();
				c=c+s;
				p++;
		}while(s<=76);
			
		c=c-s;
		t=c/p;
		
		System.out.println("La suma total es "+c);
		System.out.print("El promedio de la suma es "+t);

	}

}
