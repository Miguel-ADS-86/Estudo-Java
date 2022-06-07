package modulo_13_Arrays_ManipulandoArrayObjetos;

public class Teste {

	public static void main(String[] args) {
		// criação dos alunos
		Aluno aluno = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno.setNome("Miguel");
		aluno.setAnoNascimento(1986);
		aluno.setInstituicao("Unibratec");
		
		aluno2.setNome("Sulamyta");
		aluno2.setAnoNascimento(2001);
		aluno2.setInstituicao("Uninassau");
		
		//criação do tipo nota
		double[] notas = {5.5,9.0,10,7.8};
		double[] notas2 = {8.5,10,10,9.8};
		
		//criação das disciplinas
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java Web");
		disciplina.setNota(notas);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Cosmeticos");
		disciplina2.setNota(notas2);
		
		//vamos relacionar aluno com desciplina
		aluno.getDisciplinas().add(disciplina);
		aluno2.getDisciplinas().add(disciplina2);
		
		Aluno[] alunosArray = new Aluno[2];
		alunosArray[0] = aluno;
		alunosArray[1] = aluno2;
		
		for(int i=0; i < alunosArray.length; i++) {
			System.out.println("Nome: " + alunosArray[i].getNome() + " - Ano Nascimento " + alunosArray[i].getAnoNascimento());
		    
			for(Disciplina ds:alunosArray[i].getDisciplinas()) {
		    	System.out.println("Disciplina: " + ds.getDisciplina());
		    	
		    	for(int y=0; y < ds.getNota().length; y++) {
		    		System.out.println("nota na posição " + y + " - " +ds.getNota()[y]);
		    	}
		         System.out.println("---------------------------------------");
		    }
		}
	   
		
	}

}
