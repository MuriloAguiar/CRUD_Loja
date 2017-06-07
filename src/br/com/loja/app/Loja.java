package br.com.loja.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.loja.compras.Venda;

public class Loja {
	
	private static Scanner teclado;
	private List<Venda> vendas;
	private Venda v;

	public Loja() {
		this.teclado = new Scanner(System.in);
		this.vendas = new ArrayList();
		
	}

	public static void main(String[] args) {
		int opcao1;
		opcao1 = menuUm();
		if(opcao1==1){
			
			
		}
		else if(opcao1==2){
			
		}
		

	}
	
	
	public static int menuUm() {
		int opcao;
		do{
			System.out.println("\nEscolha:\n\t1-Gerente\n\t2-Cliente");
			opcao = teclado.nextInt();
		} while(opcao!=1 || opcao!=2);
		return opcao;
	}
	

}
