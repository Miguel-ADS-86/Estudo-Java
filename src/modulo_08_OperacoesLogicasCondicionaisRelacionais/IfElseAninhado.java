package modulo_08_OperacoesLogicasCondicionaisRelacionais;

public class IfElseAninhado {
    /*operações aninhadas*/
	public static void main(String[] args) {
		int media = 69;

		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno aprovado direto parabéns " + media);
				} else {
					System.out.println("Aluno aprovado direto " + media);
				}
			} else {
				System.out.println("Aluno está em recuperação " + media);
			}
		} else {
			System.out.println("Aluno reprovado direto " + media);
		}
	}
}
