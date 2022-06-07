package modulo_10_Heranca;
/* é um padrão que realmente e receber alguem que tenha o contrato de 
 * permitir acesso e chamar o autenticar : )*/
public class FuncaoAutenticacao {
	private PermitirAcesso acesso;
	
	/*
	public boolean autenticarCurso(PermitirAcesso acesso) {
		return acesso.autenticar();
	}*/
	
	public boolean autenticarCurso() {
		return acesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.acesso = acesso;
	}
	
}
