package modulo_09_hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import modulo_09_classesAtributosStaticos.Status;

public class ExeucaoClasse {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		//Adicionando aluno
		String qtd_alunos = JOptionPane.showInputDialog("Qual a quantidades de alunos a serem cadastrado");
		for(int i=1; i<= Integer.valueOf(qtd_alunos); i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do Aluno " + i);
			Aluno aluno = new Aluno();
			aluno.setNome(nome);
			String qtd_disciplina = JOptionPane.showInputDialog("Digite a quantidades de diciplinas tendo que ser 4!");

			for(int y=1; y<= Integer.parseInt(qtd_disciplina); y++) {
					Disciplina disciplina = new Disciplina();

					String nomeDisciplina = JOptionPane.showInputDialog("Nomde da Disciplina " + y);
					String nota = JOptionPane.showInputDialog("Nota da Disciplina " + disciplina.getNomeDisciplina());
					disciplina.setNomeDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(nota));
					aluno.getDisciplinas().add(disciplina);
				}
					alunos.add(aluno);
		}
		// criando agora um HashMap  de cada tipo aprovado
		maps.put(Status.APROVADO, new ArrayList<Aluno>());
		maps.put(Status.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(Status.REPROVADO, new ArrayList<Aluno>());
		
		for(Aluno aluno:alunos){
			if(aluno.getTaAprovado().equalsIgnoreCase(Status.APROVADO)) {
				maps.get(Status.APROVADO).add(aluno);
			}else if(aluno.getTaAprovado().equalsIgnoreCase(Status.RECUPERACAO)) {
				maps.get(Status.RECUPERACAO).add(aluno);
			}else if(aluno.getTaAprovado().equalsIgnoreCase(Status.REPROVADO)) {
				maps.get(Status.REPROVADO).add(aluno);
			}
		}
		
		System.out.println("----------Lista de Aprovados -----------------");
		for(Aluno aluno:maps.get(Status.APROVADO)) {
			System.out.println("Nome do Aluno: " + aluno.getNome() + " sua media: " + aluno.calcularNota() + " está " + aluno.getTaAprovado());
			for(Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println("Disciplina: " + disciplina.getNomeDisciplina() +" Nota: "+ disciplina.getNota());
			}
			System.out.println("--------------------------------------------------------------------");
		}
		
		System.out.println("----------Lista de Recuperação -----------------");
		for(Aluno aluno:maps.get(Status.RECUPERACAO)) {
			System.out.println("Nome do Aluno: " + aluno.getNome() + " sua media: " + aluno.calcularNota() + " está " + aluno.getTaAprovado());
			for(Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println("Disciplina: " + disciplina.getNomeDisciplina() +" Nota: "+ disciplina.getNota());
			}
			System.out.println("--------------------------------------------------------------------");
		}
		
		System.out.println("----------Lista de Reprovados -----------------");
		for(Aluno aluno:maps.get(Status.REPROVADO)) {
			System.out.println("Nome do Aluno: " + aluno.getNome() + " sua media: " + aluno.calcularNota() + " está " + aluno.getTaAprovado());
			for(Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println("Disciplina: " + disciplina.getNomeDisciplina() +" Nota: "+ disciplina.getNota());
			}
			System.out.println("--------------------------------------------------------------------");
		}
		
		
		/*
		for(Aluno aluno:alunos) {
			System.out.println("Nome do Aluno: " + aluno.getNome() + " sua media: " + aluno.calcularNota() + " sstá " + aluno.getTaAprovado());
			for(Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println("Disciplina: " + disciplina.getNomeDisciplina() +" Nota: "+ disciplina.getNota());
			}
			System.out.println("--------------------------------------------------------------------");
		}
		*/
		
					
	}

}
