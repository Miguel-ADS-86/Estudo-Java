package modulo_16_LendoExcelApachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiLeituraExcel {

	public static void main(String[] args) throws Exception {
		// precisamos uma entrada
		FileInputStream entrada = new FileInputStream("C:\\Users\\Miguel\\Documents\\testeVendas\\vendas.xls");
        HSSFWorkbook workbook = new HSSFWorkbook(entrada); // prepara a entrada do arquivo excel para ler
        HSSFSheet planilha = workbook.getSheetAt(0);// pega a primeira planulha do nosso arquivo excel.
	
        // precisamos percorrer as linhas, para isso vamos usar o Iterator.
        Iterator<Row> linhaIterator = planilha.iterator();
	    
        //vou criar uma lista de vendas
        List<Vendas> vendas = new ArrayList<>();
	   
        while(linhaIterator.hasNext()) {
        	Row linha = linhaIterator.next();//pega os dados das vendas na linha
          	
        	Iterator<Cell> celulas = linha.iterator(); //para cada linha eu percorro as celulas onde estão os valores
            Vendas venda = new Vendas();
        	while(celulas.hasNext()) {//percorre as celulas
        		Cell cell = celulas.next();
        		switch(cell.getColumnIndex()) {
        		case 0:
        			venda.setId(Double.valueOf(cell.getNumericCellValue()).intValue());
        			break;
        		case 1:
        			venda.setNome_produto(cell.getStringCellValue());
        			break;
        		case 2:
        			venda.setValor(cell.getNumericCellValue());
         		}
        	}// percorreu todas as celulas, fim das celulas da linha
        	 
        	    vendas.add(venda);
        
        }
        
        entrada.close();// obrigatoriamente tem que fechar o arquivo
	    
        for(Vendas venda:vendas) {
        	System.out.println("-----"+venda.getId()+";"+venda.getNome_produto()+";"+venda.getValor());
        }
	}

}
