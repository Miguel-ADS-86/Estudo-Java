package modulo_14_thread_fila_pilha;
/*Usando fila (pilha) em threads*/

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class FilaPilha extends Thread{
/*quando vamos fazer varios procesos demorados, colocamos em
 * uma fila ou pilha, para trabalhar paralelamente, e usaremos o,
 * ConcurrentLinkedQueue.
 *       []
 *       []
 *       []
 *       []
 * Fila de processo
 * ele vai executando o processo paralelamente em uma fila, ou seja 
 * vai enviar relatorio, envbiar email, gerar boleto.*/
// esta pilha tem que ser statica para poder pegar a mesma instancia adicionar na pilha 
// e poder executar em paralelo.
private static ConcurrentLinkedQueue<Pessoa> pilhaPessoa = 
                          new ConcurrentLinkedQueue<Pessoa>();

/*Tenho que ter um metodo para eu adicionar na pilha*/
public static void adicionar(Pessoa pessoa) {
	pilhaPessoa.add(pessoa);
}


@Override
	public void run() {
	    System.out.println("Fila rondado");
		while(true) {// este enquanto é obrigatorio, enquanto tiver uma iteração
	    Iterator iteracao = pilhaPessoa.iterator();
		synchronized (iteracao) {/*Bloquea o acesso a esta lista por outro processo*/
			while(iteracao.hasNext()) {/*enquanto tiver dados na lista vai processar*/
				Pessoa  processar = (Pessoa) iteracao.next();
				/*Processar 10 mil notas fiscais*/
				/*Gerar Uma lista enorme de pdf*/
				/*Gerar um envio em massa de Email*/
				/*aqui é a cereja do bolo voce chama seu metodo para executar paralelamente
				 * e este este iterator serve para percorrer a lista de processos que esta na
				 * pilha*/
				System.out.println("------------------------------------------------");
				System.out.println(processar.getNome() + " - " + processar.getEmail());
				
				iteracao.remove();
				try {// dar um tempo para descarga de memoria, é uma boa pratica
					Thread.sleep(100);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		try {/*Processou toda a Lista da um tempo para limpeza de Memória*/
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	} 
	 }
   
}
