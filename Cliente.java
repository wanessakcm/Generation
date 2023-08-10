package POO;

import javax.xml.crypto.Data;

public class Cliente {

	private String nomeCliente;
	private String endereco;
	private String cpf;
	private int dataDeNascimento;
	private String numeroDeTelefone;
	
	//gerando o construtor
	public Cliente(String nomeCliente, String endereco, String cpf, int dataDeNascimento, String numeroDeTelefone) {
		super();
		this.nomeCliente = nomeCliente;
		this.endereco = endereco;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
		this.numeroDeTelefone = numeroDeTelefone;
	}
	
	//declaração de métodos de get e set da minha classe
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(int dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getNumeroDeTelefone() {
		return numeroDeTelefone;
	}

	public void setNumeroDeTelefone(String numeroDeTelefone) {
		this.numeroDeTelefone = numeroDeTelefone;
	}
	
	//declaração de métodos específicos
	
	public void imprimirInfo() {
		System.out.println("\nNome: "+nomeCliente+"\nEndereço: "+endereco+
				"\nInscrito(a) no CPF sob o nº:  "+cpf+"\nData de nascimento: "+dataDeNascimento+
				"\nNúmero para contato: "+numeroDeTelefone);
	}
	
	
	
}
