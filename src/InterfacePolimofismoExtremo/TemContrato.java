package InterfacePolimofismoExtremo;

public class TemContrato {
     AcessoSistema acesso;
	
    /* aqui atravez de metodo
	public boolean permitirAcesso(AcessoSistema acesso) {
		return acesso.validar();
	}*/
     
     // aqui o metodo que chama os metodos que implementam a interface
     public boolean permitirAcesso() {
    	 return acesso.validar();
     }
     // atravez de contrutor
     public TemContrato(AcessoSistema acesso) {
    	 this.acesso = acesso;
     }
	
	

}
