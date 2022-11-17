package byteBankTeste_Herdado;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Meredith Grey");
		gerente1.setCpf("222333444-05");
		gerente1.setSalario(5000.0);
		
		System.out.println("Nome: " + gerente1.getNome());
		System.out.println("CPF: " + gerente1.getCpf());
		System.out.println("Salário: " + gerente1.getSalario());
		
		gerente1.setSenha(1111);		
		boolean autenticou = gerente1.autentica(1111);
		
		System.out.println(autenticou);
		
		System.out.println("A bonificação recebida foi: " + gerente1.getBonificacao());

	}

}
