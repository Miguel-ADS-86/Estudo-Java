package modulo_11_classeCostumizadaExcecao;

public class ExcecaoProcessarAluno extends Exception{
	public ExcecaoProcessarAluno(String erro) {
		// aqui podemos deixa a mensagem de forma fixa concatenando com o erro
		super("Erro de compilação " + erro);
	}
}
