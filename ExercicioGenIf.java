package JavaTech;

import java.util.Scanner;

public class ExercicioGenIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,somaAB;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de A: ");
		a = leia.nextInt();
		System.out.println("\nDigite o valor de B: ");
		b = leia.nextInt();
		System.out.println("\nDigite o valor de C: ");
		c = leia.nextInt();
		
		somaAB = a + b;
		
		if(somaAB>c) {
			System.out.println("\nA soma de A e B: "+ somaAB + " é maior que C");
		}
		
		else if (somaAB<c) {
			System.out.println("\nA soma de A e B: "+ somaAB + " é menor que C");
		}
		
		else {
			System.out.println("\nA soma de A e B: "+ somaAB + " é igual que C");
		}
	}

}
