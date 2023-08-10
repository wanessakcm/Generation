package POO;

public class ClienteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		PessoaFisica [] listaPessoaFisica = new PessoaFisica [3];
		
		listaPessoaFisica[0] = new PessoaFisica("Wanessa Melo","Rua Dom Adalberto Sobral-nº 541,Parapuã - SP","123.456.789-12",17011994,"(11) 954872136","147258963","Pernambuco");
		listaPessoaFisica[1] = new PessoaFisica("Pedro Herique","Rua Alípio José de Oliveira-nº 323, Lapa - SP","789.456.123-01",27031982,"(11) 987594216","147258369","RS");
		listaPessoaFisica[2] = new PessoaFisica("Theo Racelly","Rua Jabaquara-nº 281, Itaberaba - SP","456.963.353-12",11111992,"(11) 975421296","789456123","SP");
		
		for(PessoaFisica roda:listaPessoaFisica) {
			System.out.println("\n****************************** PESSOA FÍSICA **************************************");
			roda.imprimirInfo();
			roda.validaRG();
		System.out.println("\n");
		
		}
		
		PessoaJuridica [] listaPessoaJuridica = new PessoaJuridica [3];
		
		listaPessoaJuridica[0]= new PessoaJuridica("Jorge Luiz","Rua Dom Adalberto Sobral-nº 541,Parapuã - SP","123.456.789-12",17011994,"(11) 954872136","95412368566121","Supermercado Góes");
		listaPessoaJuridica[1] = new PessoaJuridica("Rogério Andrade","Rua Alípio José de Oliveira-nº 323, Lapa - SP","789.456.123-01",27031982,"(11) 987594216","55486639722413","RR Calçados");
		listaPessoaJuridica[2] = new PessoaJuridica("Raul Simões","Rua Farroupilha nº 111, Centro - SP","789.456.123-01",27031982,"(11) 987594216","55486639722513","RR Calçados");
		
		for(PessoaJuridica rodar1:listaPessoaJuridica) {
			System.out.println("\n****************************** PESSOA JURÍDICA **************************************");
			rodar1.imprimirInfo();
			rodar1.validaCNPJ();
		System.out.println("\n");
		
		}
		
		
	}

}
