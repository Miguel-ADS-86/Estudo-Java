package modulo_14_Thread;

import javax.swing.JOptionPane;

public class CriandoPrimeiraThread {
/*executando o primeira thread rodando em paralelo */
	public static void main(String[] args) throws InterruptedException {
	      
		 new Thread() {
			 public void run() {
				// código da rotina que eu quero executar em paralelo
					for(int pos=0; pos < 10; pos++) {
						/*Quero executar este envio com o tempo de parada, ou com um 
						 * tempo determinado*/
						System.out.println("Executando algo rotina, por exemplo envio de e-mail");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}// ele da um tempo de 1 segundo
					}
				 
			 }
			 
		 }.start();
          
		// codigo do sistema do usuário continua o fluxo de trabalho
		System.out.println("CHEGOU AO FIM DO CÓDIGO TESTE DE THREAD");
		/*Fluxo do sistema, cadastro de vendas alho do tipo*/
        JOptionPane.showMessageDialog(null, "Systema continua executando para o usuário");
	}

}
