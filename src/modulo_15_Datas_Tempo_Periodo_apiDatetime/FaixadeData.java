package modulo_15_Datas_Tempo_Periodo_apiDatetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;



public class FaixadeData {
/*saber quantos dias existe entre uma faixa de data, 
 * exemplo quantos dias está vencida uma conta*/
	public static void main(String[] args) throws ParseException {
	String dataInformada = "2021-04-01";
	
    // LocalDate.now() ele pega a data atual.
	// LocalDate.parse("voce passa a data que você quiser");
	// e este metodo voce passa 2 datas para ele poder fazer os calculos das datas
	long dias =	ChronoUnit.DAYS.between(LocalDate.parse(dataInformada), LocalDate.now());
	System.out.println("possui " + dias + " dias");

	long meses =	ChronoUnit.MONTHS.between(LocalDate.parse(dataInformada), LocalDate.now());
	System.out.println("possui " + meses + " Mês ou Mêses");
	
	long anos =	ChronoUnit.YEARS.between(LocalDate.parse(dataInformada), LocalDate.now());
	System.out.println("possui " + anos + " Ano ou Anos"); 
	
	
	
	}

}
