package byteBankTeste_Herdado;

// Quando assinar o "contrato" vc tem que implementar o "implements"
public class Cliente implements Autenticavel {

	private int senha;
		
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;		
	}
	

	@Override
	public boolean autentica(int senha) {
		
		if(this.senha == senha) {
			return true;
		} 
		else {
			return false;
		}	
	}

}
