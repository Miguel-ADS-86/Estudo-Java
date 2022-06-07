package modulo_10_Interface;

import javax.swing.JOptionPane;

public class ExecucaoDasClasses {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Login");
		String senha = JOptionPane.showInputDialog("Senha");
		
		//AuxiliarAcesso acessar = new AuxiliarAcesso();
		Autenticar acesso = new Pessoa(login, senha);
		/*
		if(acessar.permitirAcesso(acesso)) {
			System.out.println("Acesso Liberado");
		}else {
			System.out.println("Acesso negado");
		}*/
		
		
		if(new AuxiliarAcesso(acesso).permitirAcesso()) {
			System.out.println("Acesso Liberado");
		}else {
			System.out.println("Acesso negado");
		}
		
	}

}
