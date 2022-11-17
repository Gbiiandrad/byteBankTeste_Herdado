package byteBankTeste_Herdado;


// Neste caso o "extends" é para o Gerente herdar tudo os atributos da classe Funcionário, pois o mesmo tem nome, cpf e salario.
public class Gerente extends Funcionario {
	
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		
		if(this.senha == senha) {
			return true;
		} 
		else {
			return false;
		}		
		
	}	
	
	public double getBonificacao() {
		
		System.out.println("Bonificação do GERENTE: ");
		
		return super.getBonificacao() + super.getSalario(); 
		
		/* O super precisa subir para a classe mãe para encontrar esse atributo, ou seja, não está definido nesta classe. 
		 * Quando o método está definido na classe "mãe" você é obrigado a chama-la de "SUPER".*/
		
		}
	
}


