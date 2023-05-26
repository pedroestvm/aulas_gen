package AulasJava;

import java.util.Scanner;

public class LacoCond5 {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);

	int quant,cod;
	float valort;
    
	System.out.println("1 - Cachorro Quente \n2 - X-Salada \n3 - X-Bacon \n4 - Bauru \n5 - Refrigerante \n6 - Suco de Laranja ");
	System.out.println("Digite o código do item desejado: ");
	cod = leia.nextInt();
	System.out.println("Quantidade:");
	quant = leia.nextInt();
	
	switch(cod) {
	case 1: 
		valort= quant* 10;
	System.out.println( "Item: Cachorro Quente, o valor total é de R$" +valort);
	break;
		
	case 2:
		valort= quant* 15;
	System.out.println("Item: X-Salada, o valor total é de R$"+valort);
	break;
	
	case 3:
		valort= quant* 18;
	System.out.println("Item: X-Bacom, o valor total é de R$"+valort);
	break;
	
	case 4:
		valort= quant* 12;
	System.out.println("Item: Bauru, o valor total é de R$"+valort);
	break;
	
	case 5:
		valort= quant* 8;
	System.out.println("Item: Refrigerante, o valor total é de R$"+valort);
	break;
	
	case 6:
		valort= quant* 13;
	System.out.println("Item: Suco de laranja, o valor total é de R$"+valort);
	break;
	}
	}
}
