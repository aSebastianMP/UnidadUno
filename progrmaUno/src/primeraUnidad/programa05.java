package primeraUnidad;

import java.util.Scanner;

public class programa05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte c;
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingresa tu calificaci�n: ");
		c = leer.nextByte();
		
		if(c>79){
			System.out.println("Estas aprobado.");
		}
		else{
			System.out.println("Estas reprobado.");
		}
	}

}
