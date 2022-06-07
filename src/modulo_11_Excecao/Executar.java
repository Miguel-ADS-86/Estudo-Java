package modulo_11_Excecao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Executar {

	public static void main(String[] args) {
		
	/*	try {
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			Pessoa p = null;// forçando o erro para exibir a exceção
			p.setIdade(12);
			p.setNome("Miguel");
			pessoas.add(p);
			for(Pessoa iteracao: pessoas) {
				System.out.println("Idade " + iteracao.getIdade() + " Nome: " + iteracao.getNome());
			}
		}catch(Exception e){
			e.printStackTrace();// se não colocar este metodo ele não exibe no console.
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar pessoa");// exibir erro para o 
			// usuário!
		}
		*/  
		
		// ENTENDENDO A CALSS EXCEPTION
		
		try {
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			Pessoa p = null;// forçando o erro para exibir a exceção
			p.setIdade(12);
			p.setNome("Miguel");
			pessoas.add(p);
			for(Pessoa iteracao: pessoas) {
				System.out.println("Idade " + iteracao.getIdade() + " Nome: " + iteracao.getNome());
			}
		}catch(Exception e){
			//e.printStackTrace();// se não colocar este metodo ele não exibe no console.
		    System.out.println(e.getMessage());// mensagem do erro ou causa.
		    
		    // ou podemos usar o metodo getStacktrace(), ele retorna um array.
		    for(int i=0; i < e.getStackTrace().length; i++) {
		    	System.out.println(" Class  de erro: " + e.getStackTrace()[i].getClassName());
		    	System.out.println(" Metodo de erro: " + e.getStackTrace()[i].getMethodName());
		    	System.out.println(" Linha  de erro: " + e.getStackTrace()[i].getLineNumber());
		    }
		    
		}
	}

}
