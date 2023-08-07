package Colections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;



public class ExGenCollectionsList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> coresLista = new ArrayList<String>();
		
		
		Scanner leia = new Scanner (System.in);
		
		for (int x=1; x<6; x++) {
			System.out.printf("\nDigite a %dº cor: ",x);
			String cor = leia.nextLine();
			coresLista.add(cor);
			
		}
		
		System.out.println("\nListar  todas as cores: ");
		
		for(String listaElementos:coresLista) {
			System.out.println(listaElementos);
		}
		
		System.out.println("\nOrdenar as cores: ");
		
		Collections.sort(coresLista);
		System.out.println(coresLista);
		

	}

}
