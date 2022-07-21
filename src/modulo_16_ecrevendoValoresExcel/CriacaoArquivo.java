package modulo_16_ecrevendoValoresExcel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CriacaoArquivo {
	public static void main(String[] args) throws IOException {
        //pegar o arquivo caso ele não exista cria-lo
		File arquivo = new File("C:\\Users\\Miguel\\Documents\\Projetos\\Estudo-Java\\src\\modulo_16_ecrevendoValoresExcel\\nomes.csv");
		if(!arquivo.exists()) {// verifico se existe, se não existir cria um.
			arquivo.createNewFile();
		}
		//manipular os objetos e escrever no arquivo
		FileWriter escrever = new FileWriter(arquivo);
		List<Pessoa> pessoas = new ArrayList<>();
		Pessoa pessoa1 = new Pessoa(1,"Rafaela Santos");
		Pessoa pessoa2 = new Pessoa(2,"Michelle Melo");
		Pessoa pessoa3 = new Pessoa(3,"Eduarda Alves");
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		// exibilo
		for(Pessoa p:pessoas) {
			escrever.write(p.getCodigo()+";"+p.getNome()+"\n");
		}
		escrever.flush();//comita os dados
		escrever.close();//para de escrever
	}
	// do mesmo jeito que se faz no arquivo txt se faz no excel só muda o tipo
	//de formato
	
}
