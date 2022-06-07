package modulo_15_Datas_NovaApiJava;

import java.time.LocalDate;
import java.time.Period;

public class FaixaDeTempo_objetoPeriodo {

	public static void main(String[] args) {
		/* Trabalhar com periodos entre datas*/
		
		LocalDate dataAntiga =  LocalDate.of(1986, 12, 16);
		LocalDate dataNova =  LocalDate.of(2022, 06, 04);
       
		System.out.println("A data antiga é maior que data nova " + 
		dataAntiga.isAfter(dataNova));
		
		System.out.println("A data antiga é menor que data nova " + 
				dataAntiga.isBefore(dataNova));
		
		System.out.println("Comparando as datas são iguais: "+
		dataAntiga.isEqual(dataNova));
		
		// periodo agora usando o objeto Period do java.time
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos anos: " + periodo.getYears());
		System.out.println("Quantos mêses: " + periodo.getMonths());
		System.out.println("Total de mêses: " + periodo.toTotalMonths());
		System.out.println("Quantos dias: " + periodo.getDays());
	}

}
