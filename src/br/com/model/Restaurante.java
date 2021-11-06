package br.com.model;

import java.sql.Time;
import java.util.List;

public class Restaurante {
	
	private int codigo;
	private String nome;
	private String cnpj;
	private String telefone;
	private String email;
	private int alcance;
	private Time horaFuncionamento;
	private boolean flagIso;
	private List<Categoria> categoria;
	private ContaBancaria conta;
	private Dono dono;
	private Endereco endereco;
	private FaixaPreco faixaPreco;
	private List<Pagamento> pagamento;
	private Plano plano;
	
	
	public Restaurante() {
	
	}


	public Restaurante(int codigo, String nome, String cnpj, String telefone, String email, int alcance,
			Time horaFuncionamento, boolean flagIso, List<Categoria> categoria, ContaBancaria conta, Dono dono,
			Endereco endereco, FaixaPreco faixaPreco, List<Pagamento> pagamento, Plano plano) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
		this.alcance = alcance;
		this.horaFuncionamento = horaFuncionamento;
		this.flagIso = flagIso;
		this.categoria = categoria;
		this.conta = conta;
		this.dono = dono;
		this.endereco = endereco;
		this.faixaPreco = faixaPreco;
		this.pagamento = pagamento;
		this.plano = plano;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAlcance() {
		return alcance;
	}


	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}


	public Time getHoraFuncionamento() {
		return horaFuncionamento;
	}


	public void setHoraFuncionamento(Time horaFuncionamento) {
		this.horaFuncionamento = horaFuncionamento;
	}


	public boolean isFlagIso() {
		return flagIso;
	}


	public void setFlagIso(boolean flagIso) {
		this.flagIso = flagIso;
	}


	public List<Categoria> getCategoria() {
		return categoria;
	}


	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}


	public ContaBancaria getConta() {
		return conta;
	}


	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}


	public Dono getDono() {
		return dono;
	}


	public void setDono(Dono dono) {
		this.dono = dono;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public FaixaPreco getFaixaPreco() {
		return faixaPreco;
	}


	public void setFaixaPreco(FaixaPreco faixaPreco) {
		this.faixaPreco = faixaPreco;
	}


	public List<Pagamento> getPagamento() {
		return pagamento;
	}


	public void setPagamento(List<Pagamento> pagamento) {
		this.pagamento = pagamento;
	}


	public Plano getPlano() {
		return plano;
	}


	public void setPlano(Plano plano) {
		this.plano = plano;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
