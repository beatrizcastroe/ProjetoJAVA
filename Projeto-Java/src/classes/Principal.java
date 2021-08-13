package classes;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		int contC=20, contM=20, contA=20, contP=20, contL=20, opcaoEstoque, opcaoPessoa=0, quant=0;
		String verifica;
		
		//Instanciando objetos
		PessoaFisica cpf = new PessoaFisica (null, null, null, null, null, null);
		PessoaJuridica cnpj = new PessoaJuridica (null, null, null, null, null);
		Cadastro cadastro = new Cadastro(null, null, null, null, null);
		Estoque estoque = new Estoque();
		List <String> produtos = new ArrayList <String>();
		//Definindo os 5 produtos da lista
		produtos.add("cadeira de rodas");
		produtos.add("muleta");
		produtos.add("andador");
		produtos.add("protese");
		produtos.add("liner");
		
//Chama metodo doaEmpresta da classe Cadastro e armazena em 'doacao'
		int doacao = cadastro.doaEmpresta();
		
		do {
//Chama metodo fisicaJuridica da classe Cadastro e armazena em 'opcaoPessoa'
			opcaoPessoa = cadastro.fisicaJuridica();
			
//Verifica se é Pessoa Física ou Jurídica e armazena os dados.
			switch(opcaoPessoa) {
			case 1:
				cpf.setInformacoes(doacao);
				break;
			case 2:
				cnpj.setInformacoes();
				break;
			default:
				System.err.print("* Opção Inválida *");
			}
		} while (opcaoPessoa != 1 && opcaoPessoa != 2);
	
//Imprime menu do Estoque e pergunta ao usuário o que fazer.
		do {
			opcaoEstoque = estoque.menuEstoque();
			switch (opcaoEstoque) {
//Caso digite 1, usuário escolhe qual o produto e quanto adicionar.
			case 1: 
				verifica = estoque.addProd();
				quant = estoque.quantidade();
				
				if (produtos.contains(verifica)) {
					if (verifica.equals("cadeira de rodas")) {
						contC += quant;
					}
					else if (verifica.equals("muleta")) {
						contM += quant;
					}
					else if (verifica.equals("andador")) {
						contA += quant;
					}
					else if (verifica.equals("protese")) {
						contP += quant;
					}
					else if (verifica.equals("liner")) {
						contL += quant;
					}
				} 
				else {
					System.out.println("\nProduto não reconhecido.");
				}
				break;
//Caso digite 2, usuário escolhe qual o produto e quanto remover.	
			case 2:
				verifica = estoque.removeProd();
				quant = estoque.quantidade();
				
				if (produtos.contains(verifica)) {
					if (verifica.equals("cadeira de rodas")) {
						contC -= quant;
					}
					else if (verifica.equals("muleta")) {
						contM -= quant;
					}
					else if (verifica.equals("andador")) {
						contA -= quant;
					}
					else if (verifica.equals("protese")) {
						contP -= quant;
					}
					else if (verifica.equals("liner")) {
						contL -= quant;
					}
					else {
						System.out.println("Produto digitado não existe!!!");
					}
				}
				break;
//Caso digite 3, o sistema imprime os 5 produtos e as quantidades.		
			case 3:
				System.out.println("\t\t\n::: Equipamentos disponíveis para empréstimo :::\n");
//for each para rodar a lista toda e imprimir os 5 produtos
				for(String listaProdutos:produtos) {
					if(listaProdutos=="muleta") {
						System.out.println("* Muleta: " + contM + "un *");
					} else if(listaProdutos=="andador") {
						System.out.println("* Andador: " + contA + "un *");
					} else if(listaProdutos=="protese") {
						System.out.println("* Protese de perna: " + contP + "un *");
					} else if(listaProdutos=="liner") {
						System.out.println("* Liner: " + contL + "un *");
					} else if(listaProdutos=="cadeira de rodas") {
						System.out.println("* Cadeira de rodas: " + contC + "un *");
					}
					
				}
				break;
//Caso digite 0, sai do menu do estoque.
			default:
				System.out.println("\nVocê finalizou o programa, volte sempre! :D");
			}
		} while (opcaoEstoque != 0);

//Verifica se é fisica ou juridica e também se vai doar ou receber e imprime a informação correta. 
		if(opcaoPessoa == 1 && doacao == 1) {
			cpf.imprimirInfoDoacao();
		} else if(opcaoPessoa == 1 && doacao == 2){
			cpf.imprimirInfoEmp();
		} else if(opcaoPessoa== 2 && doacao == 1){
			cnpj.imprimirInfoDoacao();
		} else {
			cnpj.imprimirInfoEmp();
		}
	}

}