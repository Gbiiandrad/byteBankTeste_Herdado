package byteBankTeste_Herdado;

// Quando assinar o "contrato" vc tem que implementar o "implements"
public class Cliente implements Autenticavel {

	private AutenticacaoUtil autentificador;
	
	public Cliente() {
		this.autentificador = new AutenticacaoUtil();
		
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
