package primeraUnidad;

import java.util.Scanner;

public class programa12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r;
		int i=0;
		float c;
		double s=0, p;
		Scanner leer = new Scanner(System.in);
	do{
		System.out.println("Ingrese la calificacion: ");
		c = leer.nextFloat();
		s=s+c;
		i=i+1;
		p=s/i;
		
		System.out.println("Queire capturar una calificacion? (S/N)");
		r = leer.next();
		
	}while(r.equals("S"));
	
	if(p>0 & p<50){
		System.out.println("Suspenso");
	
	}
	
	if(p>49 & p<70){
		System.out.println("Aprobado");
	}
	
	if(p>70 & p<90){
		System.out.println("Notable");
	
	}
	
	if(p>89 & p<100){
		System.out.println("Aprobado");
	}
	
	if(p==100){
		System.out.println("Matricula de honor");
	}
	
	}
}
//