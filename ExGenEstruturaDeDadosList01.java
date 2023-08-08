package EstruturaDeDados;

import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class ExGenEstruturaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> fila= new LinkedList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		
		int opcao;
		
		while(true) {
			
			System.out.println("****************************************");
			System.out.println("                                        ");
			System.out.println("     1 - Adicionar Cliente na Fila      ");
			System.out.println("     2 - Listar todos os Clientes       ");
			System.out.println("     3 - Retirar Cliente da Fila        ");
			System.out.println("     0 - Sair                           ");
			System.out.println("                                        ");
			System.out.println("****************************************");
			System.out.println("   ENTRE COM A OPÇÃO DESEJADA :         ");
			System.out.println("                                        ");
			
			opcao = leia.nextInt();
			
			if(opcao==0) {
				System.out.println("\nPrograma Finalizado! ");
				leia.close();
				System.exit(0);
				
			}
			
			switch (opcao) {
			
			case 1 :
				leia.nextLine();
				System.out.println("\nDigite o nome: ");
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.println("\nFila: \n");
				Iterator<String> iFila = fila.iterator();
					while(iFila.hasNext()) {
						System.out.println(iFila.next());
			     	}
					
					System.out.println("\n\nCliente Adicionado!");
				break;
				
			case 2 :
				leia.nextLine();
					System.out.println("Lista de Clientes na fila");
					Iterator<String> iiFila = fila.iterator();
					while(iiFila.hasNext()) {
						System.out.println(iiFila.next());
			     	}
				
				break;
				
			case 3:
				leia.nextLine();
                 if(fila.isEmpty()) {
                	 System.out.println("\nA Fila está Vazia!");
                 }else {
                
			    fila.remove();
				System.out.println("\nFila : ");
				Iterator<String> iiiFila = fila.iterator();
				while(iiiFila.hasNext()) {
					System.out.println(iiiFila.next());
		     	}
                 }
				 break;
				default:
					System.out.println("\nDigite uma opção válida!");
				
			
			}
			
		
		}
		
		
	}

}
