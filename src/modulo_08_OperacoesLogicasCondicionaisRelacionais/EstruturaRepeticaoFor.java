package modulo_08_OperacoesLogicasCondicionaisRelacionais;

public class EstruturaRepeticaoFor {
/*usado quando precisamos percorrer um numero, uma lista de dados*/
	
	public static void main(String []args) {
		/*
		for(int numero=0; numero <= 10; numero++) {
			System.out.println("Tabuáda - " + 2 + " x " + numero + " = " + numero * 2);
		}*/
		
		/*usando estrutura de repetição com o break
		for(int numero=0; numero <= 10; numero++) {
			if(numero == 7) {
				System.out.println("Obaaa encontrei o numero " + numero);
				System.out.println("Parando execução");
				break;
			}
		}*/
		
		/*Estrutura de repetição com o continue, ele encontra o numero 03 e continua
		 * executando a partir do numero 3, exemplo o sistema vai ler um numero de 0
		 * a 10, o sistema encontrando o numero 03 ele vai nimprimir 3,4,5,6,7,8,9,10
		 * mais o 0,1,2 não vai ser exibido*/
		/* O continue tambem serve para pular um processo quando ele encontra o numero 3
		 * ele não execulta o processando o laço ele vai direto para o for e quando a iteração
		 * chega no 4 que não atende a condição ele execulta o processando laço de repetição */
		
		for(int numero=0; numero <= 10; numero++) {
			if(numero == 1 || numero == 2 || numero == 3) {
				System.out.println("Obaaa encontrei o numero " + numero);
				continue;
			}
			System.out.println("processando laço de repetição");
		}
	}
	
}
