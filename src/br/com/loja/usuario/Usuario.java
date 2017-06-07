package br.com.loja.usuario;

public abstract class Usuario {

	protected String nome;
	protected int cpf;
	
	public Usuario(String nome,int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

}
