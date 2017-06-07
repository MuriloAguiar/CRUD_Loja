package br.com.loja.usuario;

public abstract class Usuario {

	protected String nome;
	protected String cpf;
	
	public Usuario(String nome,String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

}
