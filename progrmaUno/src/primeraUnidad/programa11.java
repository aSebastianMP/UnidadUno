package primeraUnidad;

import java.util.Scanner;

public class programa11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;
		float n;
		double r;

		
	do{	
		Scanner leer = new Scanner(System.in);
		System.out.println("1.....Pulgadas a centimetros");
		System.out.println("2.....pies a centimetros");
		System.out.println("3.....pies a pulgadas");
		System.out.print("Ingresa un numero de las siguientes opciones");
		opc = leer.nextInt();

		switch(opc){
			case 1:
			System.out.println("Ingresa la cantidad de pulgadas:");
			n = leer.nextFloat();
			r=n*2.54;
			System.out.println("La cantidad de centimetros es: "+r);
				break;
				
			case 2:
				System.out.println("Ingresa la cantidad de pies:");
				n = leer.nextFloat();
				r=n*30.48;
				System.out.println("La cantidad de centimetros es: "+r);
					break;
					
			case 3:
				System.out.println("Ingresa la cantidad de pies:");
				n = leer.nextFloat();
				r=n*12;
				System.out.println("La cantidad de pulgadas es: "+r);
					break;
					
			default:
				System.out.println("Opcion no valida");	
		}
		}while(opc<4);	
		
	}

}
