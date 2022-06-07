package InterfaceComParametro;

import javax.swing.JOptionPane;

public class Executar {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("login");
		String senha = JOptionPane.showInputDialog("senha");
		
		AcessoSistema acesso = new Pessoa();
		System.out.println(acesso.validar(login, senha));
		
		// ou desta forma que reduz codigo 
		
		System.out.println(new Pessoa().validar(login, senha));

	}

}
