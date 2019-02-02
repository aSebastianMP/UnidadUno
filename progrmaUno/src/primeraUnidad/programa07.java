package primeraUnidad;

import java.util.Scanner;

public class programa07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float grados;
		double gradosc;
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingresa los grados fahrenheit: ");
		grados = leer.nextFloat();
		gradosc= ((grados-32)*0.555555);
		
		System.out.println("Los grados fahrenheit son: "+grados);
		System.out.println("Los grados centigrados son: "+gradosc);

	}

}
