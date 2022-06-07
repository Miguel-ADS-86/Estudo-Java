package modulo_11_classeCostumizadaExcecao;

public class CostumizandoOutrasFormas {

	public static void main(String[] args) throws Exception {
		/*
		 * capturando o erro e exibindo a mensagem costumizada
		try {
			System.out.println(4 / 0);
		}catch(Exception e) {
			throw new IllegalArgumentException("não pode dividir um numero por 0");
		}*/
		
		//lançando sua propia exceção que de erro em uma divisão onde o quociente der 2
		/*int valor = 4;
		if((valor / 2) == 2) {
			throw new IllegalArgumentException("não pode ter valor de quociente 2");
		}*/

		// usando o exception e colocando o thorws subindo a exceção pra cima, para a classe pai
		// o throws fica no metodo que chama a execução
		try {
			System.out.println(4 / 0);
		}catch(Exception e) {
			throw new Exception("não pode dividir um numero por 0");
		}
	}

}
