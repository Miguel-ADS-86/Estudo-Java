package InterfaceComConstrutores;

import javax.swing.JOptionPane;

public class Executar {
	public static void main(String []args) {
		 
		 String login = JOptionPane.showInputDialog("Login");
	   	 String senha = JOptionPane.showInputDialog("Senha");
	   	 
	   	 AcessoSistema acesso = new Pessoa(login,senha);
	   	 System.out.println(acesso.validar());
	   	 
	   	 // ou desta forma resumindo codigo
	   	 
	   	 System.out.println("segunda forma " + new Pessoa(login,senha).validar());
	   	 
		
	}
}
