package byteBankTeste_Herdado;

public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente funcionarioAutentificavel = new Gerente();
		funcionarioAutentificavel.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(3333);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
		
		
		SistemaInterno sistema = new SistemaInterno();
		sistema.autentica(funcionarioAutentificavel);
		sistema.autentica(adm);
		sistema.autentica(cliente);
		
		
		

	}

}
