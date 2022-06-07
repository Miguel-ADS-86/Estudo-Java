package modulo_15_Datas_Tempo_Periodo_apiDatetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UsandoCalendar {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		/*
		System.out.println("Ano " + calendar.get(calendar.YEAR));
		System.out.println("Mês " + calendar.get(calendar.MONTH));
		System.out.println("Calendar em milisegundos " + calendar.getTimeInMillis());
		System.out.println("Dia do mês " + calendar.get(calendar.DAY_OF_MONTH));
		System.out.println("Dia da semana " + calendar.get(calendar.DAY_OF_WEEK));
        System.out.println("Hora do dia " + calendar.get(calendar.HOUR_OF_DAY));
        System.out.println("Minuto da hora " + calendar.get(calendar.MINUTE));
        System.out.println("Segundos " + calendar.get(calendar.SECOND));*/
		
		/*
		String formato = "dd/MM/yyyy HH:mm.ss";
		SimpleDateFormat formate = new SimpleDateFormat(formato);
		
		System.out.println("calendar data atual em formato padão String "
				+ formate.format(calendar.getTime()));*/
		
		String formatoData = "dd/MM/yyyy";
		// serve para converter a String em Date usando o metodo parse
		SimpleDateFormat dataFormatada = new SimpleDateFormat(formatoData);
		
		Date dataVencimento = dataFormatada.parse("10/06/2022");
		Date dataAtual = dataFormatada.parse("11/06/2022");
		
		if(dataVencimento.after(dataAtual)) {// after depois e before é antes ou (menor)
			System.out.println("Boleto não vencido " + dataFormatada.format(dataVencimento));
		}else {
			System.out.println("Boleto vencido " + dataFormatada.format(dataAtual) + " Vencimento " + dataFormatada.format(dataVencimento));
		}
	}

}
