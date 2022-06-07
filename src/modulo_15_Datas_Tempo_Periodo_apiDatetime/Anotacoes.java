package modulo_15_Datas_Tempo_Periodo_apiDatetime;

public class Anotacoes {/*

agente pode formatar a data usando o objeto SimpleDateFormat:
Exemplo: 

SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

para formatar a data: 

formatoData.format("10-05-2022");

e podemos converter uma data em String para Date usando o formatodata.parse:

Date vencimento = formatoData.parse("16-06-2022");

public class EstudoData{
	public static void main(String []args){
		//para se trabalhar com o calendar tem que inicialo desta forma
		// e também ele pega a data atual
		Calendar calendar = Calendar.instance();
		
		// formato para a data padrão como eu quero que ela seja formatada.
		String formatoPadrao = "dd-MM-yyyy";
		
		// vou usar um objeto que converte uma String para Data e podemos usar
		// seus metodos tambem.Dentro do seu construtor passamos a data do formato
		// que você quer, podendo ser dd-MM-yyyy ou String dataMeuJeito = "dd-MM-yyyy";
	
		SimpleDateFormat simple = new SimpleDateFormat(formatoPadrao);
		
		// simulando data do banco de dados colocando o tipo 
		//date e sua variavel:
		Date dataBanco = "16-12-2021";
		
		// adicionando a data no calendar para poder trabalhar com ela.
		usamos o metodo setTime() e passamos o formato da data e depois passamos
		a data que queremos trabalhar.
		calendar.setTime(simple.format(formatoPadrao).parse(dataBanco));
		
		//agora podemos trabalhar com esta dataBanco, somando datas e diminuindo
		// datas.
		//nesse metodo ele recebe 2 parametros, o primeiro o dia do mês, e o numero
		// inteiro que você quer somar ou diminir.
		calendar.add(calendar.DAY_OF_MONTH,2);
		
		// somando o mês a partir da data passada anteriormente dataBanco.
		calendar.add(calendar.MONTH,1);
		
		// somando o ano a partir da data passada anteriormente dataBanco.
		calendar.add(calendar.YEAR,1);
		
		
		/////////////////////////////////////////////////////////////////////
		
		//////////// trabalhando com After(depois ou maior) e Before(antes ou menor)
		String padrao="dd-MM-yyyy";
		SimpleDateFormat simple = new SimpleDateFormat(padrao);
		Calendar calendar = Calendar.Instance();
		
		Date vencimento = simple.parse("10/05/2022");
		Date dataAtual = simple.parse("11/05/2022");

        if(vencimento.after(dataAtual)){
			System.out.println("Boleto está vencido ");
		}else{
			System.out.println("Boleto ainda não venceu");
		}		
		
	}
}



*/}
