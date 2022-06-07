package InterfaceDiretamenteComObjeto;

import javax.swing.JOptionPane;

public class Executar {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		String login = JOptionPane.showInputDialog("login");
	    String senha = JOptionPane.showInputDialog("senha");
	    
	    pessoa.setLogin(login);
	    pessoa.setSenha(senha);
	    
	    System.out.println(pessoa.validar());
	}

}
