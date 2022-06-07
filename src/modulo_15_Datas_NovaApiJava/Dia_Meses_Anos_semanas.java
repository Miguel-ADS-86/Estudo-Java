package modulo_15_Datas_NovaApiJava;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Dia_Meses_Anos_semanas {

	public static void main(String[] args) {
		
		LocalDateTime local = LocalDateTime.now();
		
		/*quando vamos inserir uma data sem pegar a data atual temos que colocar
		 * o valo com "yyyy-MM-dd" por padr�o*/
		//LocalDate local = LocalDate.parse("1956-12-23");
		
		                   //aqui voc� formata a data para o tipo que voc� quer.
		System.out.println(local.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da Semana: " + local.getDayOfWeek());
		
		System.out.println("Dia do M�s: " + local.getDayOfMonth());
		
		System.out.println("Dia do Ano: " + local.getDayOfYear());
		
		System.out.println("N�mero do M�s: " + local.getMonthValue()+
				" - Nome do M�s: " + local.getMonth());
		
		System.out.println("Ano: " + local.getYear());
		
		
	}

}
