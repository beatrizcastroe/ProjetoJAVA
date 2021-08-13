package classes;

public class PessoaJuridica extends Cadastro {
	
	private String cnpj;
	
//Constutor pessoa jurídica
    public PessoaJuridica(String nome, String endereco, 
            String telefone, String email,  String cnpj) {

        super(nome, endereco, telefone, email);
        this.cnpj = cnpj;
    }
    
//Método para inserir as informações da pessoa física.  
    public void setInformacoes() {
   		System.out.println("\n\t\t ::: Dados da Empresa ::: ");
		
		System.out.print("\nNome: ");
		setNome(input.nextLine());
		
		do {
			System.out.print("CNPJ: ");
			setCnpj(input.nextLine());
		} while(validaCNPJ() == false);
		
		System.out.print("Endereço: ");
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
   
//Método para validar se o CPF possui 14 números.
    public boolean validaCNPJ() {
    	if((this.getCnpj().length()!=14))
    		System.err.println("Erro. Digite um CNPJ válido.");
    	return this.getCnpj().length()==14;
    }

//Método final que printa na tela o contrato de empréstimo da pessoa jurídica
    public void imprimirInfoEmp() {
    	System.out.println("\t\t\n ::: Contrato de Empréstimo de Equipamentos :::");
        System.out.println("\nNúmero do Contrato: " + getRandom());
        System.out.println("\nNome: "+getNome()+"\nCNPJ: "+getCnpj()+"\nEndereço: "+getEndereco()
        +"\nTelefone: "+getTelefone()+"\nEmail: "+getEmail());
    }
    
//Método final que printa na tela a carteirinha do doador
    public void imprimirInfoDoacao() {
        System.out.println("\t\t\n ::: AGRADECIMENTOS :::");
        System.out.println("\nMuito obrigado " + getNome() + "!!!\nAgradecemos a sua doação!!");
    }
}