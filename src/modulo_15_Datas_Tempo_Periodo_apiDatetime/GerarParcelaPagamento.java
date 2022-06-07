package modulo_15_Datas_Tempo_Periodo_apiDatetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GerarParcelaPagamento {

	public static void main(String[] args) throws ParseException {
		
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("05/06/2022");
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(dataInicial);
		
		for(int i = 1; i <= 12; i++) {
			calendar.add(Calendar.MONTH, 1);
			System.out.println("parcela " + i + " Vencimento " + 
			new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}

	}

}
