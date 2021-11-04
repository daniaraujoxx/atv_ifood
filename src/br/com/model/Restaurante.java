package br.com.model;

import java.sql.Time;

public class Restaurante {
	
	private int codigo;
	private String nome;
	private String cnpj;
	private String telefone;
	private String email;
	private int alcance;
	private Time horaFuncionamento;
	private boolean flagIso;
	
	
	public Restaurante(int codigo, String nome, String cnpj, String telefone, String email, int alcance,
			Time horaFuncionamento, boolean flagIso) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
		this.alcance = alcance;
		this.horaFuncionamento = horaFuncionamento;
		this.flagIso = flagIso;
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
	
	
	
	
	
	
	
	

}
