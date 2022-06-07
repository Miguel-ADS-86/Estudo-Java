package modulo_10_polimofismo;

public class Play {

	public static void main(String[] args) {
		
	Aluno aluno = new Aluno();
	aluno.setNome("Sulamyta");
	
	Diretor diretor = new Diretor();
	diretor.setNome("Miguel");
	
	setarPessoa(aluno);
	setarPessoa(diretor);
	/*ou seja ambos implementam o mesmo metodo da classe abstrata e com 
	 * valores diferentes*/
	
	}
	
	public static void setarPessoa(Pessoa pessoa) {
		System.out.println(" Nome " + pessoa.nome + " Salário " + pessoa.salario());
	}

}
