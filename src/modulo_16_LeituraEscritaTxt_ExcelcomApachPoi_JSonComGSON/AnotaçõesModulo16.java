package modulo_16_LeituraEscritaTxt_ExcelcomApachPoi_JSonComGSON;

import java.io.FileWriter;

public class AnotaçõesModulo16 {/*
Sobre o arquivo txt:
para se trabalhar com ele ultilizamos a biblioteca java.io.File;

1) instanciamos o arquivo File passando o endereço do arquivo.

File arquivo = new File(c:\\user\\miguel\\arquivo.txt);
caso o arquivo não exista cria o arquivo.
       
       if(!arquivo.exists()){
       		arquivo.createNewFile();
       } 
2) instanciamos o objeto FileWriter e no seu construtor passa o arquivo.

	 FileWriter escreverArquivo = new FileWriter(arquivo);
	    escreverArquivo.write("Deus é fiel");
		escreverArquivo.write("\n");//quebra a linha
		escreverArquivo.write("já resolveu os meus problemas.");
	 
	para persistir as alterações chamamos o metodo flush();
		escreverArquivo.flush();
		escreverArquivo.close(); para fechar, para de escrever, sempre precisamos
		chamar este metodo.

*/}
