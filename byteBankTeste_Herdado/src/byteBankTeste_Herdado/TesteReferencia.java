package byteBankTeste_Herdado;

public class TesteReferencia {

	public static void main(String[] args) {
		
		
		/* Funcionario gerente1 = new Gerente(); 
		 * -- Podemos fazer do modo diferente do proposto, MAS lembrando que por mais que tem "new Gerente" ele não será um,
		 *  portanto ele não tem o privilégio do gerente ( a senha ) e ele será considerado "funcionário". Não podemos fazer ao
		 *   contrário como por ex: 
		 *   
		    Gerente gerente1 = new Funcionario();
		     
		    
		 *   forma correta: 
		 *   Gerente gerente1 = new Gerente(); 
		 *   				ou
		 *   Funcionario gerente1 = new Gerente(); -- mas com o privilégio SOMENTE do funcionário.*/
		
		
		
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Owen Hunt");
		gerente1.setSalario(5000.0);
		
		
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(2000.0);
		
		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setSalario(2500.0);
		
		Designer designer = new Designer();
		designer.setSalario(2500.0);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		
		//registro:
		controle.registra(gerente1);
		controle.registra(funcionario);
		controle.registra(editorVideo);
		controle.registra(designer);
		
		System.out.println("Salario com a Bonificação: " + controle.getSoma());
		

	}

}
