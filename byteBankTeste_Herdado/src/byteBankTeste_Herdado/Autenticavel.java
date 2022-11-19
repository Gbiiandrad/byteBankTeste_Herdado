package byteBankTeste_Herdado;

/*Contrato Autenticavel
 	* Quem assina esse contrato( não podendo usar o "extends"), precisa implementar:
 		*Metodo "setSenha"
 		*Metodo "autentica"
 */
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
