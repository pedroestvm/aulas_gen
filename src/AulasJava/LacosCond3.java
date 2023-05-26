package AulasJava;

import java.util.Scanner;

public class LacosCond3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//código não está funcionando corretamente
		String nome;
		int idade;
		boolean pd;
		
		System.out.println("Nome do doador;");
		nome=leia.next();
		
		System.out.println("Idade do doador;");
		idade=leia.nextInt();
				
		System.out.println("Primeira doação de sangue?: \n(true para sim -false- para não)");
		pd = leia.hasNextDouble();
		
		if(idade >=18 && idade >=59) {
		System.out.println("Você está apto");
		}
		else if(idade <18 && idade >69) {
	    System.out.println("Não esta apto");
		}
	    else if(idade >= 60 && idade <= 69 && pd == true) {
	    	System.out.println("Não esta apto");
	    }
	    else {
	    	System.out.println("n está apto");

	}

	}
}
