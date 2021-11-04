package br.com.model;

public class Endereco {
	
	private int cdEndereco;
	private String nomeCidade;
	private String siglaEstado;
	private String cep;
	private String logradouro;
	private int numero;
	private String complemento;
	
	
	public Endereco(int cdEndereco, String nomeCidade, String siglaEstado, String cep, String logradouro, int numero,
			String complemento) {
		super();
		this.cdEndereco = cdEndereco;
		this.nomeCidade = nomeCidade;
		this.siglaEstado = siglaEstado;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
	}


	public int getCdEndereco() {
		return cdEndereco;
	}


	public void setCdEndereco(int cdEndereco) {
		this.cdEndereco = cdEndereco;
	}


	public String getNomeCidade() {
		return nomeCidade;
	}


	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}


	public String getSiglaEstado() {
		return siglaEstado;
	}


	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	
	
	
	
	

}
