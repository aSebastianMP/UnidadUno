package primeraUnidad;

import java.util.Scanner;

public class programa06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingresa un numero: ");
		n = leer.nextInt();
		
		if(n%2==0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero es impar");
		}
	}

}
