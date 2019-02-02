package primeraUnidad;

import java.util.Scanner;

public class programa03 {
	public static String nombre;
	public static int edad;
	public static double altura;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.print("ingresa tu nombre:");
		nombre = leer.nextLine();
		
		System.out.print("ingresa tu edad:");
		edad = leer.nextInt();
		
		System.out.print("ingresa tu altura:");
		altura = leer.nextDouble();
		
		System.out.println("Tu nombre es: "+nombre);
		System.out.println("Tu edad es: "+edad);
		System.out.println("Tu altura es: "+altura);


	}

}
