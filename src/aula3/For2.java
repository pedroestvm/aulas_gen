package aula3;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		
		int contador,num,par = 0, imp = 0;
		
		
		Scanner leia = new Scanner(System.in);
		
		for(contador = 1; contador <= 10; contador++) {
			System.out.println("Digite o "+ contador +"º número:");
			num = leia.nextInt();
		
		
		if(num % 2 == 0) {
		 par = par + 1;
		}else {
			imp = imp + 1;
		}
		}
	System.out.println("Total de pares: " +par);
	System.out.println("Total de impares: " +imp);
		
				
						
	  }				
	 }
	

