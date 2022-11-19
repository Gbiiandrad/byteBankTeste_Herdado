package byteBankTeste_Herdado;


/* Neste caso o "extends" é para o Gerente herdar tudo os atributos da classe Funcionario, pois o mesmo tem nome, cpf e salario.
 * E ele assinou o "contrato." ele passa a ser autenticavel.
*/
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autentificador;
	
	public Gerente() {
		this.autentificador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Bonificação do GERENTE: ");
		return super.getSalario(); 
		
		//return super.getBonificacao() + super.getSalario(); 
		
		/* O super precisa subir para a classe mãe para encontrar esse atributo, ou seja, não está definido nesta classe. 
		 * Quando o método está definido na classe "mãe" você é obrigado a chama-la de "SUPER".*/
		
		}

	@Override
	public void setSenha(int senha) {
		this.autentificador.setSenha(senha);
	}
	

	@Override
	public boolean autentica(int senha) {
		return this.autentificador.autentica(senha);
	}

	
}


