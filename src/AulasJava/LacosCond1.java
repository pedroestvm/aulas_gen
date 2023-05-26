package AulasJava;

import java.util.Scanner;

public class LacosCond1 {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
        
		System.out.println("Digite o número:");
		a = leia.nextInt();
		System.out.println("Digite o número:");
		b = leia.nextInt();
		System.out.println("Digite o número:");
		c = leia.nextInt();
		
		 if ((a + b) > c) {
	            System.out.println("A Soma de A + B é Maior do que C");
	        } else if ((a + b) < c) {
	            System.out.println("A Soma de A + B é Menor do que C");
	        }

	        else {
	            System.out.println("A Soma de A + B é Igual a C");

	}
	}
}
