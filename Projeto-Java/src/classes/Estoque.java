package classes;

import java.util.Scanner;

public class Estoque {
		
	int op;
	String verifica;
	Scanner input = new Scanner(System.in);
	
	
	public int menuEstoque() {
		System.out.print("\n\t::: Menu do estoque :::"
				+ "\n---------------------------------------"
				+ "\n(1) Adicionar produtos ao estoque"
				+ "\n(2) Remover produtos do estoque"
				+ "\n(3) Mostrar todos os produtos do estoque"
				+ "\n(0) Encerrar "
				+ "\n---------------------------------------"
			+"\nDigite a opção desejada: ");
		op = input.nextInt();
		return op;
	}
	
	public String addProd() {
		input.nextLine();
		System.out.print("\nDigite o produto para adicionar ao estoque: ");
		verifica = input.nextLine();
		verifica = verifica.toLowerCase();
		return verifica;
	}
	
	public String removeProd() {
		input.nextLine();
		System.out.print("\nDigite o produto para remover do estoque: ");
		verifica = input.nextLine();
		verifica = verifica.toLowerCase();
		return verifica;
	}
	
	public int quantidade() {
		System.out.print("\nDigite a quantidade: ");
		int quant = input.nextInt();
		return quant;
	}
}