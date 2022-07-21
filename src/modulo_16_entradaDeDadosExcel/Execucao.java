package modulo_16_entradaDeDadosExcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) throws IOException {
		// pego o arquivo excel ja existente em uma pasta
		File arquivo = new File("C:\\Users\\Miguel\\Documents\\Projetos\\Estudo-Java\\src\\modulo_16_ecrevendoValoresExcel\\nomes.csv");
     
		//criando uma lista de vendas:
		List<Pessoa> pessoas = new ArrayList<>(); 
		//ler o arquivo e manipular os objetos e inserir em uma lista
		Scanner sc = new Scanner(arquivo,"UTF-8");
		while(sc.hasNext()) {
			String linha = sc.nextLine();
			String[] dados = linha.split("\\;");
			Pessoa p = new Pessoa();
			p.setCodigo(Integer.parseInt(dados[0]));
			p.setNome(dados[1]);
			pessoas.add(p);
		}
		// exibo as informações da importaçção dos dados em excel
		for(Pessoa p:pessoas) {
			System.out.println(p.getCodigo()+";"+p.getNome());
		}
		
	}

}
