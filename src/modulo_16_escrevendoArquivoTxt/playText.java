package modulo_16_escrevendoArquivoTxt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class playText {

	public static void main(String[] args) throws IOException {
		
		
		Pessoa p1 = new Pessoa(1,"Jessyca","kekinha@gmail.com");
		Pessoa p2 = new Pessoa(2,"Kelly","kelly@gmail.com");
		Pessoa p3 = new Pessoa(3,"Alice","alice@gmail.com");
		Pessoa p4 = new Pessoa(4,"Sulamyta","sulamyta@gmail.com");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		
		File arquivoP = new File("C:\\Users\\migue\\OneDrive\\Documentos\\Projetos\\CursoJavaDEV\\src\\modulo_16_escrevendoArquivoTxt\\pessoa.txt");
		
		if(!arquivoP.exists()) {
			arquivoP.createNewFile();
		}
		
		
	    FileWriter escrever = new FileWriter(arquivoP);
	    // "/n" ele quebra a linha
	    for(Pessoa p: pessoas) {
	    	escrever.write("id: "+ p.getId() + " nome: "+p.getNome()+" email: "+ p.getEmail()+ "\n");
	    }
	    
	    escrever.flush();//comita o arquivo
	    escrever.close();// fecha o arquivo
	}

}
