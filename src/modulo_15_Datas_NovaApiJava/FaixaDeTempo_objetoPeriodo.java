package modulo_15_Datas_NovaApiJava;

import java.time.LocalDate;
import java.time.Period;

public class FaixaDeTempo_objetoPeriodo {

	public static void main(String[] args) {
		/* Trabalhar com periodos entre datas*/
		
		LocalDate dataAntiga =  LocalDate.of(1986, 12, 16);
		LocalDate dataNova =  LocalDate.of(2022, 06, 04);
       
		System.out.println("A data antiga � maior que data nova " + 
		dataAntiga.isAfter(dataNova));
		
		System.out.println("A data antiga � menor que data nova " + 
				dataAntiga.isBefore(dataNova));
		
		System.out.println("Comparando as datas s�o iguais: "+
		dataAntiga.isEqual(dataNova));
		
		// periodo agora usando o objeto Period do java.time
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos anos: " + periodo.getYears());
		System.out.println("Quantos m�ses: " + periodo.getMonths());
		System.out.println("Total de m�ses: " + periodo.toTotalMonths());
		System.out.println("Quantos dias: " + periodo.getDays());
	}

}
