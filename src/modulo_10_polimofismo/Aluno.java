package modulo_10_polimofismo;

public class Aluno extends Pessoa {
	private String turma;

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	@Override
	public double salario() {
		
		return 1500;
	}
	
}
