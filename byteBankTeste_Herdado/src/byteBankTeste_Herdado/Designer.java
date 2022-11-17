package byteBankTeste_Herdado;


// Neste caso o "extends" é para o Designer herdar tudo os atributos da classe Funcionário, pois o mesmo tem nome, cpf e salario.
public class Designer extends Funcionario {
	
	public double getBonificacao() {	
		System.out.println("Bonificação do Designer: ");
		return 200; 

		
		}
	
}


