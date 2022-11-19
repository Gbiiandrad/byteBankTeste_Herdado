package byteBankTeste_Herdado;

public class SistemaInterno {
	
	private int senha = 2222 ;
	
	public void autentica(Autenticavel funcionarioAutentificavel) {
		boolean autenticou = funcionarioAutentificavel.autentica(this.senha);
		
		if (autenticou) {
			System.out.println("Seja BEM - VINDO!!");
		}
		else {
			System.out.println("ERRO! Você nao tem a autorizacao para entrar no sistema.");
		}
	}
	
	

}
