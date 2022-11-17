package byteBankTeste_Herdado;


// Neste caso o "extends" é para o EditorVideo herdar tudo os atributos da classe Funcionário, pois o mesmo tem nome, cpf e salario.
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {	
		System.out.println("Bonificação do EDITOR DE VIDEO: ");
		return super.getBonificacao() + 100; 
		}
	
}


