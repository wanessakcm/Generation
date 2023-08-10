package POO;

public class PessoaJuridica extends Cliente {
	
	private String cnpj;
	private String nomeFantasia;
	
	public PessoaJuridica(String nomeCliente, String endereco, String cpf, int dataDeNascimento,
			String numeroDeTelefone, String cnpj, String nomeFantasia) {
		super(nomeCliente, endereco, cpf, dataDeNascimento, numeroDeTelefone);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public void imprimirInfo(){
		System.out.println("\nNome Fantasia: "+nomeFantasia
		+"\nCNPJ: "+cnpj
		+"\nCPF: "+getCpf()
		+"\nEndereço: "+getEndereco()
		+"\nData de Nascimento: "+getDataDeNascimento()
		+"\nNúmero de Telefone: "+getNumeroDeTelefone()
		+"\nNome do Cliente: "+getNomeCliente());
		
	}
	public void validaCNPJ() {
		if (cnpj.length()!= 14) {
			System.out.println("\n--CNPJ INVÁLIDO !!! ");
		}else {
			System.out.println("\n--CNPJ VÁLIDO!!!");
		}
	}
	
	
	
	
	

}
