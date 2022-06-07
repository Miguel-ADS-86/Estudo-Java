package modulo_11_Excecao_multiplosCatch;

public class Rodar {
/*DESTA FORMA CONSEGUIMOS CAPTURAR VARIOS ERROS */
	public static void main(String[] args) {
		
		try {
			String valorTeste = null;//este erro vai da de variavel não iniciada e da erro de converter String para int
			int valor = 0;
			Aluno aluno = new Aluno();// Aluno aluno; sem o new vai da o erro de nullpointException
			aluno.setNome("Ana Alice");
			aluno.setSerie("2º serie");
			System.out.println(valor = Integer.parseInt(valorTeste));
			System.out.println("Nome: " + aluno.getNome() + " - " + "Serie: " + aluno.getSerie());
				}catch(NullPointerException erro) {
					  System.out.println("objeto ou variavel nulo " + erro.getMessage());
				}catch(NumberFormatException erro) {
					System.out.println("Não é possivel converter um objeto nulo");
				}catch(Exception erro) {
				    erro.printStackTrace();
				}

	}

}
