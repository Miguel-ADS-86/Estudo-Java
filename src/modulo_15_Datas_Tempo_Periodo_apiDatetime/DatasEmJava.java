package modulo_15_Datas_Tempo_Periodo_apiDatetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
   
     // este metodos vbão ser substituidos pelo calendar 
     // por isso estão alguns depreciados.
     /*
      * 
     Date date = new Date();
     System.out.println( " Data em milisegundos "+ date.getTime());
     System.out.println("Dia do mês " + date.getDate());
     System.out.println("Dia da semana " + date.getDay());
     System.out.println("Hora do dia " + date.getHours());
     System.out.println("Minutos " + date.getMinutes());
     System.out.println("Segundos " + date.getSeconds());
     System.out.println("Ano " + (date.getYear() + 1900));*/
     
     
    /* ------------------- simple date formate ----------------------------*/
     /*podemos pegar uma string e converter para um objeto de data, pode trocar o formato
      * de uma data*/
     String formatorData1 = "yyyy-MM-dd"; // para gravar em banco desta forma
     String formatorData2 = "dd/MM/yyyy"; //para mostrar em tela para usuário desta forma.
     String formatorData3 = "dd/MM/yyyy HH:mm.ss"; //
     String formatorData4 = "dd-MM-yyyy HH:mm.ss";// para gravar em banco desta forma
     SimpleDateFormat simple = new SimpleDateFormat(formatorData3);
     Date date = new Date();
     System.out.println("Data atual em formato padrão e String " + simple.format(date));  
     
     simple = new SimpleDateFormat(formatorData4);
     System.out.println(simple.parse("16-12-1986 16:30.4"));
     // com o uso do parse eu converto a String em data tb. 

	}

}
