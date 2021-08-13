package classes;

import java.util.Scanner;
import java.util.Random;

public class Cadastro {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private String receita;
	int opcao;
	int doaEmpresta;
	
	Scanner input = new Scanner(System.in);
	Random sorteia = new Random();

	public Cadastro(String nome, String endereco, 
			String telefone, String email, String receita) {	
	}
	
	public Cadastro(String nome, String endereco, 
			String telefone, String email) {
			}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

	public String getReceita() {
		return receita;
	}

	public void setReceita(String receita) {
		this.receita = receita;
	}
	
	public int doaEmpresta() {
   		System.out.println("\t\t\t::: ONG AmparAção :::\n"
   				+ "::: EMPRÉSTIMO DE EQUIPAMENTOS PARA PESSOAS COM DIFICULDADE DE LOCOMOÇÃO :::\n");
   		System.out.print("(1) Doação \n(2) Empréstimo \nDigite a opção desejada: ");
		return input.nextInt();
   	}
	
	public int fisicaJuridica() {
		System.out.print("\n(1) Pessoa Física \n(2) Pessoa Jurídica \nDigite uma das opções acima: ");
		opcao = input.nextInt();
		return opcao;
	}
	
	public int getRandom() {
    	int min = 100000000;
    	int max = 999999999;
    	int numero = sorteia.nextInt((max-min) + 1) + min;
    	return numero;
	}
}