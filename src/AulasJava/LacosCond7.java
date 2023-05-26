package AulasJava;

import java.util.Scanner;

public class LacosCond7 {

	public static void main(String[] args) {
		
		float n1,n2,som,sub,mult,div;
		int op;
		
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1º número:");
		n1=leia.nextFloat();
		System.out.println("Digite o 2º número:");
		n2=leia.nextFloat();
		
		System.out.println("Operação:");
	    op=leia.nextInt();
	    
	    switch(op) {
	    case 1:
	    som=(n1+n2);
	    System.out.println("resultado" +som);
	    break;
	    
	    case 2:
	    sub=(n1-n2);
	    System.out.println("resultado" +sub);
	    break;
	    
	    case 3:
	    mult=(n1*n2);
	    System.out.println("resultado" +mult);
	    break;
	    
	}
	}
}
