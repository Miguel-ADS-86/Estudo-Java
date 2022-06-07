package modulo_15_Datas_NovaApiJava;

import java.time.Duration;
import java.time.Instant;

public class Tempo_de_Processo_com_Instant {

	public static void main(String[] args) throws InterruptedException {
		// para se trabalhar com tempo
    
	// pegando o tempo atual
	Instant inicio = Instant.now();
	
	Thread.sleep(2000);
	Instant ifinal = Instant.now();
	
	//duração de tempo entre tempos 
	Duration duracao = Duration.between(inicio, ifinal);
	
	System.out.println("Duração em nano segundos: " + duracao.toNanos());
	
	System.out.println("Duração em minutos: " + duracao.toMinutes());
	
	System.out.println("Duração em Horas: " + duracao.toHours());
	
	System.out.println("Duração em Milisegundos: " + duracao.toMillis());
	
	System.out.println("Duração em Dias: " + duracao.toDays());
	
	System.out.println("Duração em segundos: " + duracao.toSeconds());
		
		
	}

}
