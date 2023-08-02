package JavaTech;

import java.util.Scanner;

public class ExercicioGenSwitch05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int quantidade, produto;
		float preco=0, total;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n CÓDIGO  - \tPRODUTO   - \tPREÇO UNITÁRIO ");
		System.out.println("\n 1-\t      Cachorro Quente       10,00 ");
		System.out.println("\n 2-\t      X-Salada              15,00 ");
		System.out.println("\n 3-\t      X-Bacon               18,00 ");
		System.out.println("\n 4-\t      Bauru                 12,00 ");
		System.out.println("\n 5-\t      Refrigerante           8,00 ");
		System.out.println("\n 6-\t      Suco de laranja       13,00 ");
		
		System.out.println("\n\nDigite o código do produto: ");
		produto = ler.nextInt();
		
		switch(produto) {
		case 1: 
			System.out.println("\nOpção selecionada:  Cachorro Quente");
			preco = 10.00f;
			break;
		case 2:
			System.out.println("\nOpção selecionada:  X-Salada");
			preco = 15.00f;
			break;
		case 3:
			System.out.println("\nOpção selecionada:  X-Bacon");
			preco = 18.00f;
			break;
		case 4:
			System.out.println("\nOpção selecionada:  Bauru");
			preco = 12.00f;
			break;
		case 5:
			System.out.println("\nOpção selecionada:  Refrigerante");
			preco = 8.00f;
		case 6:
			System.out.println("\nOpção selecionada:  Suco de laranja");
			preco = 13.00f;
		default:
			System.out.println("\nOpção inválida!!! Selecione uma opção válida!");

 	       }
		System.out.println("\nDigite a quantidade: ");
		quantidade=ler.nextInt();
		
		total = (preco*quantidade);
		
		System.out.println("\nProduto: "+produto);
		System.out.printf("\nValor total do pedido: %.2f",total,"Reais");

  }
	
}
