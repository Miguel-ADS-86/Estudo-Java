package modulo_10_Heranca;
/*esta interface será nosso contrato de autenticação*/
public interface PermitirAcesso {
	public boolean autenticar();/*apenas declaração do metodo*/
	public boolean autenticar(String login, String senha);// sobrescrevemos criando um metodo com o mesmo nome mais com parametros
	
}
