package br.com.loja.usuario;

public class Gerente extends Usuario{

	private int senha;
	
	public Gerente(String nome,int cpf,int senha) {
		super(nome,cpf);
		this.senha = senha;
	}

}
