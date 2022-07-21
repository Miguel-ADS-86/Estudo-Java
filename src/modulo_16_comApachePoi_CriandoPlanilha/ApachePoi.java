package modulo_16_comApachePoi_CriandoPlanilha;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {
	public static void main(String[] args) throws Exception{
		
	 // pegar o arquivo se não existir eu crio
	 File arquivo = new File("C:\\Users\\Miguel\\Documents\\Projetos\\Estudo-Java\\src\\modulo_16_comApachePoi\\vendas.xls");
     if(!arquivo.exists()) {
    	arquivo.createNewFile(); 
     }
     Vendas v1 = new Vendas(1,"bike Oggi",1350.00);
     Vendas v2 = new Vendas(2,"bike Caloi",1150.00);
     Vendas v3 = new Vendas(3,"bike Audax",1350.00);
     List<Vendas> vds = new ArrayList<>();
     vds.add(v1);
     vds.add(v2);
     vds.add(v3);
     HSSFWorkbook hsworkbook = new HSSFWorkbook();// ele vai ser usado para escrever na planilha
     HSSFSheet linhaVendas = hsworkbook.createSheet("Planilha de vendas");// criar a planilha
     
     //escrever dentro da planilha
     int numLinha =0;// para ter o controle do numero de linhas fazemos ele aqui fora.
     for(Vendas v:vds) { 
    	Row linha = linhaVendas.createRow(numLinha++);// criando a linha na planilha
    	
    	int celula = 0;//variavel de controle
    	
    	Cell celid = linha.createCell(celula++);// cria a celula 1
    	celid.setCellValue(v.getId());
    	
    	Cell celNomeProduto = linha.createCell(celula++);// cria a celula 2
    	celNomeProduto.setCellValue(v.getNome_produto());
    	
    	Cell celValor = linha.createCell(celula++);// cria a celula 3
    	celValor.setCellValue(v.getValor());
     }// terminou de montar a planilha
     FileOutputStream saida = new FileOutputStream(arquivo);
     hsworkbook.write(saida);// escreva a planilha em arquivo
     saida.flush();
     saida.close();
		 
	  System.out.println("Criado o arquivo");
	}
}
