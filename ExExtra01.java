package ExerciciosExtrasGen;

import java.util.Scanner;

public class ExExtra01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario, abono, novo_salario;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite o valor do salário: ");
		salario = leia.nextFloat();
		System.out.println("\nDigite o valor do abono: ");
		abono = leia.nextFloat();
		
		novo_salario = (salario + abono);
		System.out.println("\nNovo salário é de "+ novo_salario+" reais");
	}

}
