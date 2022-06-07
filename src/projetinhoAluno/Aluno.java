package projetinhoAluno;

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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anoNascimento;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
		result = prime * result + ((instituicao == null) ? 0 : instituicao.hashCode());
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
		if (anoNascimento != other.anoNascimento)
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (disciplinas == null) {
			if (other.disciplinas != null)
				return false;
		} else if (!disciplinas.equals(other.disciplinas))
			return false;
		if (instituicao == null) {
			if (other.instituicao != null)
				return false;
		} else if (!instituicao.equals(other.instituicao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	public double calculoMedia() {
		double media = 0;
		
		for(Disciplina disciplina : disciplinas) {
			media += disciplina.getNota();
		}
		
		return media / disciplinas.size();// ele retorna a quantidade de objetos na lista.
	}
	
	
	public boolean resultadoAluno() {
		if(this.calculoMedia() >= 7) {
			return true;
		}else {
			return false;
		}
	}
	
	public int calcularIdade() {
		int ano = Year.now().getValue(); // metodo para pegar o ano atual
		int resultado = ano - anoNascimento;
		return resultado;
	}
	
	public String statusAluno() {
		if(calculoMedia() >= 5) {
			if(calculoMedia() >= 5 && calculoMedia() <= 6) {
				return StatusAluno.RECUPERACAO;
			}else {
				return StatusAluno.APROVADO;
			}
			
		}else {
			return StatusAluno.REPROVADO;
		}
		
	}
	// este metodo tb é valido, porem so se precisar fazer varias validações ai precisa 
	// fazer desta forma
	public void addDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
	
	
}
