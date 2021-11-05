package br.com.model;

public class ContaBancaria {
	
	private int codigo;
	private int numero;
	private int agencia;
	private String tipo;
	private String nomeTitular;
	
	
	public ContaBancaria(int codigo, int numero, int agencia, String tipo, String nomeTitular) {
		super();
		this.codigo = codigo;
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.nomeTitular = nomeTitular;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getNomeTitular() {
		return nomeTitular;
	}


	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	
	

}
