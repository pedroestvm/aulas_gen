package AulasJava;

import java.util.Scanner;

public class LacosCond2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a;
		System.out.print("Digite um número:");
		a = leia.nextInt();
		
        if ((a > 0) && (a % 2 ==0)) {
        	System.out.println("O Número "+ a +" é par e positivo!");
        }else if ((a > 0) && (a % 2 != 0)) {
        	System.out.println("O Número "+ a +" é ímpar e positivo!");
        }else if ((a < 0) && (a % 2 == 0)) {
        	System.out.println("O Número "+ a +" é par e negativo!");
        }else {
        	System.out.println("O Número "+ a +" é par e negativo!");
        }
	}

}
