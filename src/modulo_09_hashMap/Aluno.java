package modulo_09_hashMap;

import java.util.ArrayList;
import java.util.List;

import modulo_09_classesAtributosStaticos.Status;

public class Aluno {
private String nome;
private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public List<Disciplina> getDisciplinas() {
	return disciplinas;
}
public void setDisciplinas(List<Disciplina> disciplinas) {
	this.disciplinas = disciplinas;
}

public double calcularNota() {
	double media = 0;
	for(Disciplina d: disciplinas) {
		media += d.getNota();
	}
	return media = media / 4;
}

public String getTaAprovado() {
	if(calcularNota() >= 5) {
		if(calcularNota() >= 5 && calcularNota() <= 6) {
			return Status.RECUPERACAO;
		}else {
			return Status.APROVADO;
		}
	}else {
		return Status.REPROVADO;
	}
}

   
}
