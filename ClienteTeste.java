package POO;

public class ClienteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente[] lista = new Cliente [3];
		
		lista[0] = new Cliente("Wanessa Melo","Rua Dom Adalberto Sobral-nº 541,Parapuã - SP","123.456.789-12",17011994,"(11) 954872136");
		lista[1] = new Cliente("Pedro Herique","Rua Alípio José de Oliveira-nº 323, Lapa - SP","789.456.123-01",27031982,"(11) 987594216");
		lista[2] = new Cliente("Theo Racelly","Rua Jabaquara-nº 281, Itaberaba - SP","456.963.353-12",11111992,"(11) 975421296");
		
		for(Cliente roda:lista) {
				roda.imprimirInfo();
				System.out.println("\n*************************************************************************");
		}
		
		
		
	}

}
