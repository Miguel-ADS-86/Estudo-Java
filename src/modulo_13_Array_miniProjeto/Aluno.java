package modulo_13_Array_miniProjeto;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import modulo_08_OperacoesLogicasCondicionaisRelacionais.ProgramaCalcularMedia;

public class Aluno {
	private String nome;
	private String cpf;
	private String instituicao;
	private int anoNascimento;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", cpf=" + cpf + ", instituicao=" + instituicao + ", anoNascimento="
				+ anoNascimento + ", disciplinas=" + disciplinas + "]";
	}
	
	
	
	public int calcularIdade() {
		int ano = Year.now().getValue(); // metodo para pegar o ano atual
		int resultado = ano - anoNascimento;
		return resultado;
	}
	
	
	// este metodo tb é valido, porem so se precisar fazer varias validações ai precisa 
	// fazer desta forma
	public void addDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
	
	
}
