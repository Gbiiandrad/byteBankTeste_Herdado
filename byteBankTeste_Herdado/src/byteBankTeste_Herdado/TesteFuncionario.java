package byteBankTeste_Herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario mark = new Funcionario();
		mark.setNome("Mark Sloan");
		mark.setCpf("111222333-04");
		mark.setSalario(2600.00);
		
		System.out.println(mark.getNome());
		System.out.println(mark.getBonificacao());
		

	}

}
