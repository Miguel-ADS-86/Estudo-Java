package modulo_14_Thread;

public class ExecutarModulo14 {

	public static void main(String[] args) throws InterruptedException {
		
		/*Tempo de interrupção com Sleep*/
		
		for(int pos=0; pos < 10; pos++) {
			/*Quero executar este envio com o tempo de parada, ou com um 
			 * tempo determinado*/
			System.out.println("Executando algo rotina, por exemplo envio de e-mail");
			Thread.sleep(1000);// ele da um tempo de 1 segundo
		}
		System.out.println("CHEGOU AO FIM DO CÓDIGO TESTE DE THREAD");
		
	}

}
