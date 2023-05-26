package AulasJava;

import java.util.Scanner;

public class LacosCod4 {
	//código não está completo
	public static void main(String[] args) {
    String colaborador;
    int cargo;
    float salario,reajuste,novosal;
    
    Scanner leia = new Scanner(System.in);
	System.out.println("Nome do colaborador:");
	colaborador = leia.next();
	System.out.println("Cargo:");
	cargo = leia.nextInt();
	System.out.println("Salário");
	salario = leia.nextFloat();
	
	switch(cargo) {
	case 1:
	 novosal=salario+(0.10f*salario);
	 System.out.println(colaborador+"Gerente"+novosal);
	 
	 
	 
	}
	

	}

}
