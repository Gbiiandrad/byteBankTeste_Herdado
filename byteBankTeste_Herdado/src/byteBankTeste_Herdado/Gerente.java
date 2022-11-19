package byteBankTeste_Herdado;


/* Neste caso o "extends" é para o Gerente herdar tudo os atributos da classe Funcionario, pois o mesmo tem nome, cpf e salario.
 * E ele assinou o "contrato." ele passa a ser autenticavel.
*/
public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	public double getBonificacao() {
		
		System.out.println("Bonificação do GERENTE: ");
		return super.getSalario(); 
		
		//return super.getBonificacao() + super.getSalario(); 
		
		/* O super precisa subir para a classe mãe para encontrar esse atributo, ou seja, não está definido nesta classe. 
		 * Quando o método está definido na classe "mãe" você é obrigado a chama-la de "SUPER".*/
		
		}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		
		if(this.senha == senha) {
			return true;
		} 
		else {
			return false;
		}	
	}
	
}


