package modulo_10_Interface;

// nesta classe vai verificar quem tem o contrato da interface e permite o acesso
public class AuxiliarAcesso {
	// outra forma de amarra usando o construtor
	private Autenticar autenticar;
	
	
    // o metodo tem que ser do mesmo tipo da interface
	/*public boolean permitirAcesso(Autenticar acesso) {
	  return acesso.autenticarUsuario();
	}*/
	
	public boolean permitirAcesso() {
		  return autenticar.autenticarUsuario();
		}
	
	public AuxiliarAcesso() {}
	
	public AuxiliarAcesso(Autenticar autenticar) {
		this.autenticar = autenticar;
	}
	
}
