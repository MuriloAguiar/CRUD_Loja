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
			menuGerente();	
		}
		else if(opcao1==2){
			menuCliente();
		}
		

	}
	
	
	public static int menuUm() {
		int opcao=0;
		do{
			System.out.println("\nEscolha:\n\t1-Gerente\n\t2-Cliente");
			opcao = teclado.nextInt();
		} while(opcao!=1 || opcao!=2);
		return opcao;
	}
	
	
	//Menu gerente
	
	public static int menuGerente(){
		int opcao=0;
		do{
			System.out.println("\\n\t1-Cadastrar\n\t2-Ver Vendas\n\t3-Voltar\n");
			opcao = teclado.nextInt();
			switch(opcao){
			case 1: 
				break;
			case 2:
				break;
			case 3:
				System.out.println("Tchauu!");
				break;
			default:
				System.out.println("\n\n\t\t\t***Invalido***");
				break;
			}
		}while(opcao!=3);
		return 0;
	}
	
	
	
	//Menu cliente
	
	public static int menuCliente(){
		int opcao=0;
		do{
			System.out.println("1-Produtos\n\t2-Carrinho\n\t3-Finalizar Compra");
			opcao= teclado.nextInt();
			if(opcao==1){
				// lista produtos e deixa a escolha
			}
			else if(opcao==2){
				// Menu do carrinho
			}
			else if (opcao==3){
				// Finaliza
			}
		}while(opcao<1 && opcao>3);
		return 0;
		
	}
	

}
