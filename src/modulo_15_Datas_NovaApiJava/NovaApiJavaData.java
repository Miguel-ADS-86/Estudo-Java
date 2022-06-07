package modulo_15_Datas_NovaApiJava;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NovaApiJavaData {

	public static void main(String[] args) {
		/*esta nova API de data a partir do java 8*/
		// esta nova API é do pacote java.Time
		
		//como eu pego a data atual com a nova API
		LocalDate dataAtual = LocalDate.now();
		System.out.println("A data atual: " + dataAtual);
		
		// trabalhar com horas também e a hora atual
		LocalTime horaAtual = LocalTime.now();
		System.out.println("A hora atual: " + horaAtual);

		// para trabalhar com data e hora juntos usamos 
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		System.out.println("data e hora atual: "+dataAtualHoraAtual);
		
	}

}
