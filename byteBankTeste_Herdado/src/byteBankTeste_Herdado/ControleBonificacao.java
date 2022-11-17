package byteBankTeste_Herdado;

public class ControleBonificacao {
	
	private double soma;
	
	
	/* Iremos ter essa referência abaixo para a bonificação, ou seja, toda que levar a referência "funcionário" ele funcionará normalmente. 
	 * Ex do que fazer:
	 * 
	 * Gerente gerente1 = new Gerente(); -- Original 
	 * 
	 * Funcionario gerente1 = new Gerente(); -- Com a referencia. Apenas mudar do "Gerente" para "funcionario" no primeiro.
	 * 
	 * P.S: isso é usado para não precisar criar um public void para cada funcionario (gernte, editor de video, Rh e etc..) da empresa.
	*/
	
	public void registra(Funcionario funcionario) {
		double boni = funcionario.getBonificacao();
		this.soma = this.soma + boni;
	}

	
	public double getSoma() {
		return soma;
	}

}
