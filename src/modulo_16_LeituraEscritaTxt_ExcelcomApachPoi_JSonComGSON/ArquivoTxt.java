package modulo_16_LeituraEscritaTxt_ExcelcomApachPoi_JSonComGSON;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoTxt {

	public static void main(String[] args) throws IOException {
		/*para se trabalhar com arquivos existe a classe do pacote 
		 *java.io.File */
	
		File arquivo = new File("C:\\Users\\migue\\OneDrive\\Documentos\\Projetos\\CursoJavaDEV\\src\\modulo_16_LeituraEscritaTxt_ExcelcomApachPoi_JSonComGSON\\arquivo.txt");
	    
		// condição para verificar se o arquivo existe, caso não exista ele cria um
		//novo arquivo.
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		//metodo para escrever no arquivo txt.
		// instancia o objeto FileWriter e no seu construtor passa o arquivo.
		FileWriter escreverArquivo = new FileWriter(arquivo);
		
		// agora só pegar o metodo para escrever no arquivo write.
		escreverArquivo.write("Deus é fiel");
		escreverArquivo.write("\n");//quebra a linha
		escreverArquivo.write("já resolveu os meus problemas.");
		//para persistir as alterações chamamos o metodo flush();
		escreverArquivo.flush();
		escreverArquivo.close();

	}

}
