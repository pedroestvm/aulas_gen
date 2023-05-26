package aula3;

import java.util.Scanner;

public class DoWhiles {

	public static void main(String[] args) {
		int numero, soma=0;
		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("\nDigite um número");
			numero = leia.nextInt();
			if(numero>0 ) {
            soma=soma+numero;	
			}	
		}while (numero !=0);
        //System.out.println("Fim do Programa");
        System.out.println("Resultado: " + soma);
			
		
	
	}
	}


