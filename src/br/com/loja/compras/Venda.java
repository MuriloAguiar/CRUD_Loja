package br.com.loja.compras;

import java.util.ArrayList;
import java.util.List;

import br.com.loja.produto.Produto;

public class Venda {
	
	private String nomeCliente;
	private String cpfCliente;
	private List<Produto> produtosCliente;

	public Venda(String nomeCliente, String cpfCliente, List<Produto> produtosCliente) {
		
		this.nomeCliente=nomeCliente;
		this.cpfCliente=cpfCliente;
		this.produtosCliente = new ArrayList();
		for (Produto produto : produtosCliente) {
			
			this.produtosCliente.add(produto);
			
		}	
	}
	
	

	public String getNomeCliente() {
		return nomeCliente;
	}
	

	public String getCpfCliente() {
		return cpfCliente;
	}
	

	public List<Produto> getProdutosCliente() {
		return produtosCliente;
	}

	
	
}
