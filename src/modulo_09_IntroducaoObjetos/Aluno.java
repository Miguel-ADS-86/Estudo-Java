package modulo_09_IntroducaoObjetos;

public class Aluno {
    /*por padrão o modificado de acesso é private*/
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String matricula;
	private String nomeEscola;
	private String serieMatriculado;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	
	
	/*Metedos setters e gettrs
	 * Set -> adiciona ou recebe dados para os atributos
	 * Get -> é para resgatar ou obter o valor do atributo
	 * This -> serve para dizer que o atributo é da classe
	 * */
	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
		
	public Aluno() {
		/*cria os dados na memoria, sendo padrão do java, ou seja o new Aluno chama
		 * este contrutor por padrão que implicitamente o sistema cria ou um construtor
		 * criado na classe*/
	}
	
	/*podemos ter outro construtores para ter valores definidos. que seria construtor
	 * com parametros*/
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	
	/*
	 * e podemos criar contrutores com todos os parametros acima como é muito comum
	 */
	public Aluno(String nome, int idade, String dataNascimento, String registroGeral, String numeroCpf, String nomeMae,
			String nomePai, String matricula, String nomeEscola, String serieMatriculado) {
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.registroGeral = registroGeral;
		this.numeroCpf = numeroCpf;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.matricula = matricula;
		this.nomeEscola = nomeEscola;
		this.serieMatriculado = serieMatriculado;
		
	}
	
	public double getMediaNota() {
		return (nota1 + nota2 + nota3 + nota4)/4;
	}
	
	
	/*this eu posso fazer referencia ao metodo da classe ou variavel atributo*/
	
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media >= 7) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if(media >= 7) {
			return "Aluno aprovado";
		}else {
			return "Aluno reprovado";
		}
		
	}
	/*Metodo toString -> descrição do objeto na memoria
	 *serve para mostrar os dados de forma mais simplificadas.
	 * */

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", matricula=" + matricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado
				+ ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	
}
