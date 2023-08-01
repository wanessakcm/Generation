package ExerciciosExtrasGen;

import java.util.Scanner;

public class ExExtra02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1, nota2, nota3, nota4, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com a nota1: ");
		nota1=ler.nextFloat();
		System.out.println("\nEntre com a nota2: ");
		nota2=ler.nextFloat();
		System.out.println("\nEntre com a nota3: ");
		nota3=ler.nextFloat();
		System.out.println("\nEntre com a nota4: ");
		nota4=ler.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("\nMédia Aritimética: "+media);
		System.out.printf("\nMédia Aritimética: %.2f",media);

	}

}
