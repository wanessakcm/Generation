package POO;

public class PessoaFisica extends Cliente {
	
	private String rG;
	private String ufNascimento;
	
	public PessoaFisica(String nomeCliente, String endereco, String cpf, int dataDeNascimento, String numeroDeTelefone,
			String rG, String ufNascimento) {
		super(nomeCliente, endereco, cpf, dataDeNascimento, numeroDeTelefone);
		this.rG = rG;
		this.ufNascimento = ufNascimento;
	}

	public String getrG() {
		return rG;
	}

	public void setrG(String rG) {
		this.rG = rG;
	}

	public String getUfNascimento() {
		return ufNascimento;
	}

	public void setUfNascimento(String ufNascimento) {
		this.ufNascimento = ufNascimento;
	}
	
	public void imprimirInfo(){
		System.out.println("\nNome do Cliente: "+getNomeCliente()
		+"\nCPF: "+getCpf()
		+"\nRG: "+rG
		+"\nEndereço: "+getEndereco()
		+"\nData de Nascimento: "+getDataDeNascimento()
		+"\nNúmero de Telefone: "+getNumeroDeTelefone()
		+"\nUF de Nascimento: "+ufNascimento);
		
	}
	public void validaRG() {
		if (rG.length()!= 9) {
			System.out.println("\n--RG INVÁLIDO !!! ");
		}else {
			System.out.println("\nRG VÁLIDO!!!");
		}
	}
	
		
	
	
	

}
