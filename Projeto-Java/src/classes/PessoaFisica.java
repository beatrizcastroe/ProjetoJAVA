package classes;

import java.util.Random;

public class PessoaFisica extends Cadastro {
		private String cpf;
		Random sorteia = new Random();
		
//Constutor pessoa f�sica
	   	public PessoaFisica(String nome, String endereco, 
	         String telefone, String email, String receita, String cpf) {

	       super(nome, endereco, telefone, email, receita);
	       this.cpf = cpf;
	    }
	   	
//M�todo para inserir as informa��es da pessoa f�sica
	   	public void setInformacoes(int doacao) {
			if(doacao == 2) {
				System.out.println("\n\t\t ::: Dados do Paciente ::: ");
			} else {
				System.out.println("\n\t\t ::: Dados do Doador ::: ");
			}
			
			System.out.print("\nNome: ");
			setNome(input.nextLine());
			
			do {
				System.out.print("CPF: ");
				setCpf(input.nextLine());
			} while(validaCPF() == false);
			
			System.out.print("Endere�o: ");
			setEndereco(input.nextLine());
			
			System.out.print("Telefone: ");
			setTelefone(input.nextLine());
			
			System.out.print("Email: ");
			setEmail(input.nextLine());
			
			if(doacao == 2) {
				System.out.print("C�digo da receita: ");
				setReceita(input.nextLine());
			}
	   	}
	   
	   	
	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }
	    
//M�todo para validar se o CPF possui 11 n�meros.
	    public boolean validaCPF() {
	    	if((this.getCpf().length()!=11))
	    			System.err.println("Erro. Digite um CPF v�lido.");	    		
	    	return (this.getCpf().length() == 11);
	    }
	    
//M�todo final que printa na tela o contrato de empr�stimo da pessoa f�sica
	    public void imprimirInfoEmp() {
	        System.out.println("\t\t\n ::: Contrato de Empr�stimo de Equipamentos :::");
	        System.out.println("\nN�mero do Contrato: " + getRandom());
	        System.out.println("\nNome: "+getNome()+"\nCPF: "+getCpf()+"\nEndere�o: "+getEndereco()
	        +"\nTelefone: "+getTelefone()+"\nEmail: "+getEmail());
	    }
	    
//M�todo final que printa na tela a carteirinha do doador
	    public void imprimirInfoDoacao() {
	        System.out.println("\t\t\n ::: Carteirinha de Doador :::");
	        System.out.println("\nID Doador: " + getRandom());
	        System.out.println("\nNome: "+getNome()+"\tTelefone: "+getTelefone());
	    }
	}