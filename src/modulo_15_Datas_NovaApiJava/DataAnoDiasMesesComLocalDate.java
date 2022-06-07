package modulo_15_Datas_NovaApiJava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataAnoDiasMesesComLocalDate {

	public static void main(String[] args) {
		/*Data: anos, dias, meses e parcelas*/

 LocalDate dataBase = LocalDate.parse("1986-12-16");
 
 System.out.println("Adicionar mais 5 dias " + 
 dataBase.plusDays(5).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
 
 System.out.println("Adicionar mais 5 semanas " + 
		 dataBase.plusWeeks(5).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
 System.out.println("Adicionar mais 5 meses " + 
		 dataBase.plusMonths(5).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
 
 System.out.println("Adicionar mais 5 anos " + 
		 dataBase.plusYears(5).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
 
// podemos atribuir somando com a data a partir da data base
 
 /*--------------------------------------------------------------------------*/
 System.out.println("--------------------------------------------------------------------------");
 System.out.println("Adicionar mais 5 dias " + 
 (dataBase = dataBase.plusDays(5)).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
 
 System.out.println("Adicionar mais 5 semanas " + 
		 (dataBase = dataBase.plusWeeks(5)).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
 System.out.println("Adicionar mais 5 meses " + 
		 (dataBase = dataBase.plusMonths(5)).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
 
 System.out.println("Adicionar mais 5 anos " + 
		 (dataBase = dataBase.plusYears(5)).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
 
 /*--------------------------------------------------------------------------------*/
//diminuindo os anos usamos o minus.
 System.out.println("--------------------------------------------------------------------------------");
 System.out.println("Adicionar menos 5 dias " + 
 dataBase.minusDays(5).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
 
 System.out.println("Adicionar menos 5 semanas " + 
		 dataBase.minusWeeks(5).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
 System.out.println("Adicionar menos 5 meses " + 
		 dataBase.minusMonths(5).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
 
 System.out.println("Adicionar menos 5 anos " + 
		 dataBase.minusYears(5).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
 System.out.println("-----------------------------------------------------------------");
 
 // Gerando parcela com o LocalDate
 
 LocalDate banco = LocalDate.parse("2022-06-05");
 
	 for(int parcela = 1; parcela <= 12; parcela++) {
		 banco = banco.plusMonths(1);
		 System.out.println("Parcela " + parcela + " vencimento: "+
		 banco.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
	 }
 
 
	}	
	
}
