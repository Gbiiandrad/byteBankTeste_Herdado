package byteBankTeste_Herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		//existe a classe e o tipo Funcionario, mas nao podemor cria-lo
		Gerente mark = new Gerente();
		mark.setNome("Mark Sloan");
		mark.setCpf("111222333-04");
		mark.setSalario(2600.00);
		
		System.out.println(mark.getNome());
		System.out.println(mark.getBonificacao());
		

	}

}
