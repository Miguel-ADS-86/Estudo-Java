package modulo_16_lendoArquivoColocandoListaDeObjetos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LendoArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		//pegando o arquivo para ser lido, mais pegando como entrada,
		//para poder pegar os valores dos arquivos.
		FileInputStream 
		entrada = new FileInputStream(new File(
				"C:\\Users\\migue\\OneDrive\\Documentos\\Cursos\\Estudo-Java\\src\\modulo_16_lendoArquivoColocandoListaDeObjetos\\pessoa.txt"));
        // criando uma lista de pessoas para adicionar os dados vindo do txt
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
        /*pega os valores vindo do txt e passando o padrão utf8 de escrita*/
		Scanner pegarValor = new Scanner(entrada, "UTF-8");
		//enquanto tiver proximo valor traga
		while (pegarValor.hasNext()) {
			String linha = pegarValor.nextLine();
			if(linha != null && !linha.isEmpty()) {
            String[]dados = linha.split("\\;");
            
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(dados[0]);
            pessoa.setEmail(dados[1]);
            pessoa.setIdade(Integer.valueOf(dados[2]));
            
            pessoas.add(pessoa);
         }
	  }
		
		for(Pessoa p:pessoas) {/*poderia gravar no banco de dados, enviar por e-mail, gerar boletos, fazer qualquer coisa*/
			System.out.println(p);
		}

	}

}
