package modulo_16_LeituraEscritaTxt_ExcelcomApachPoi_JSonComGSON;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoTxt {

	public static void main(String[] args) throws IOException {
		/*para se trabalhar com arquivos existe a classe do pacote 
		 *java.io.File */
	
		File arquivo = new File("C:\\Users\\migue\\OneDrive\\Documentos\\Projetos\\CursoJavaDEV\\src\\modulo_16_LeituraEscritaTxt_ExcelcomApachPoi_JSonComGSON\\arquivo.txt");
	    
		// condi��o para verificar se o arquivo existe, caso n�o exista ele cria um
		//novo arquivo.
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		//metodo para escrever no arquivo txt.
		// instancia o objeto FileWriter e no seu construtor passa o arquivo.
		FileWriter escreverArquivo = new FileWriter(arquivo);
		
		// agora s� pegar o metodo para escrever no arquivo write.
		escreverArquivo.write("Deus � fiel");
		escreverArquivo.write("\n");//quebra a linha
		escreverArquivo.write("j� resolveu os meus problemas.");
		//para persistir as altera��es chamamos o metodo flush();
		escreverArquivo.flush();
		escreverArquivo.close();

	}

}
