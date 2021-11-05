package br.com.model;

public class FaixaPreco {
	
	private int codigo;
	private String descricao;
	private double valorMedio;
	
	
	public FaixaPreco(int codigo, String descricao, double valorMedio) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorMedio = valorMedio;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getValorMedio() {
		return valorMedio;
	}


	public void setValorMedio(double valorMedio) {
		this.valorMedio = valorMedio;
	}
	
	
	

}
