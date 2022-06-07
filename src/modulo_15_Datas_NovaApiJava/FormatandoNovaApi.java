package modulo_15_Datas_NovaApiJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatandoNovaApi {

	public static void main(String[] args) {
/*usamos o DateTimeFormatter para poder formatar as datas da nossa forma
 * e tambem para escolher a melor opção para formatarmos a data
 * 
 * Usamos o DateTimeFormatter.ofPattern("dd/MM/yyyy") parra formatar a data da nossa forma 
 * 
 * 
 * 
 * */ 
		
		
//como eu pego a data atual com a nova API
LocalDate dataAtual = LocalDate.now();
System.out.println("A data atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
// trabalhar com horas também e a hora atual
LocalTime horaAtual = LocalTime.now();
System.out.println("A hora atual: " + horaAtual);

// para trabalhar com data e hora juntos usamos 
LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
System.out.println("data e hora atual: "+ dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));



	}

}
