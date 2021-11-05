package br.com.model;

public class Pagamento {
	
	private int codigo;
	private int descricao;
	
	
	public Pagamento(int codigo, int descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getDescricao() {
		return descricao;
	}


	public void setDescricao(int descricao) {
		this.descricao = descricao;
	}
	
	
	

}
