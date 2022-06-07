package modulo_15_Datas_Tempo_Periodo_apiDatetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalculandoDiaMesAnoComCalendar {
	public static void main(String []args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance(); // ela pega a data atual 
		
		// simular que vem do banco de dados
		String formatoDeData = "dd-MM-yyyy";
		String dataBanco = "12-06-2021";

		calendar.setTime(new SimpleDateFormat(formatoDeData).parse(dataBanco));
		
		calendar.add(calendar.DAY_OF_MONTH, 2);// podemos usar numeros negativos para inves de somar diminuir
		System.out.println("Somando dia do mes " + new SimpleDateFormat(formatoDeData).format(calendar.getTime()));
         
		calendar.add(calendar.MONTH,2);
		System.out.println("Somando o mes " + new SimpleDateFormat(formatoDeData).format(calendar.getTime()));
		
		calendar.add(calendar.YEAR,2);
		System.out.println("Somando o mes " + new SimpleDateFormat(formatoDeData).format(calendar.getTime()));
		
		
	}
}
