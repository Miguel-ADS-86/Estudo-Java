package modulo_16_lendoArquivoTxt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LErArquivoTxt {
 	public static void main(String[] args) throws FileNotFoundException{
   //iniciando o arquivo,com a entrada de arquivo FileInputStream do pacote 
   /*import java.io.FileInputStream;
    * no seu construtor passamos o new File(com o endereço do arquivo entre "//") e com duas 
    * barras*/
   FileInputStream entradaDados = 
		   new FileInputStream(new File("C:\\Users\\migue\\OneDrive\\Documentos\\Cursos\\Estudo-Java\\src\\modulo_16_lendoArquivoTxt\\pessoa.txt"));
   
   /*agora vamos ler os arquivos com a classe Scanner
    * passamos no scanner o arquivo a entrada de dados e o tipo de escrita a codificação que 
    * quer UTF-8*/
  
   // usamos o Scanner para 
   Scanner lendoArquivos = new Scanner(entradaDados,"UTF-8");
   
   
   // enquanto tiver linhas para ler leia.
	while (lendoArquivos.hasNext()) {
		String linha = lendoArquivos.nextLine();
		if (linha != null && !linha.isEmpty()) {// para tirar linhas vazias
			System.out.println(linha);
		}
	}
   
 }
}
