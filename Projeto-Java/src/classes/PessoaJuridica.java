package classes;

public class PessoaJuridica extends Cadastro {
	
	private String cnpj;
	
//Constutor pessoa jur�dica
    public PessoaJuridica(String nome, String endereco, 
            String telefone, String email,  String cnpj) {

        super(nome, endereco, telefone, email);
        this.cnpj = cnpj;
    }
    
//M�todo para inserir as informa��es da pessoa f�sica.  
    public void setInformacoes() {
   		System.out.println("\n\t\t ::: Dados da Empresa ::: ");
		
		System.out.print("\nNome: ");
		setNome(input.nextLine());
		
		do {
			System.out.print("CNPJ: ");
			setCnpj(input.nextLine());
		} while(validaCNPJ() == false);
		
		System.out.print("Endere�o: ");
		setEndereco(input.nextLine());
		
		System.out.print("Telefone: ");
		setTelefone(input.nextLine());
		
		System.out.print("Email: ");
		setEmail(input.nextLine());
   	}
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
   
//M�todo para validar se o CPF possui 14 n�meros.
    public boolean validaCNPJ() {
    	if((this.getCnpj().length()!=14))
    		System.err.println("Erro. Digite um CNPJ v�lido.");
    	return this.getCnpj().length()==14;
    }

//M�todo final que printa na tela o contrato de empr�stimo da pessoa jur�dica
    public void imprimirInfoEmp() {
    	System.out.println("\t\t\n ::: Contrato de Empr�stimo de Equipamentos :::");
        System.out.println("\nN�mero do Contrato: " + getRandom());
        System.out.println("\nNome: "+getNome()+"\nCNPJ: "+getCnpj()+"\nEndere�o: "+getEndereco()
        +"\nTelefone: "+getTelefone()+"\nEmail: "+getEmail());
    }
    
//M�todo final que printa na tela a carteirinha do doador
    public void imprimirInfoDoacao() {
        System.out.println("\t\t\n ::: AGRADECIMENTOS :::");
        System.out.println("\nMuito obrigado " + getNome() + "!!!\nAgradecemos a sua doa��o!!");
    }
}