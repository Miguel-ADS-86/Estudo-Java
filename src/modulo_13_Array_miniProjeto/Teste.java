package modulo_13_Array_miniProjeto;

public class Teste {

	public static void main(String[] args) {
		// criação dos alunos
		Aluno aluno = new Aluno();
		aluno.setNome("Miguel");
		aluno.setAnoNascimento(1986);
		aluno.setInstituicao("Unibratec");
		
		//criação do tipo nota
		double[] notas = {5.5,9.0,10,7.8};
		
		//criação das disciplinas
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java Web");
		disciplina.setNota(notas);
		
		//vamos relacionar aluno com desciplina
		aluno.getDisciplinas().add(disciplina);
		
	    //listar alunos e suas disciplinas
		System.out.println(aluno.getNome() + " - " + aluno.getInstituicao());
		System.out.println(aluno.getCpf() + " - " + aluno.getAnoNascimento());
		for(Disciplina ds: aluno.getDisciplinas()) {
			System.out.println(ds.getDisciplina());
			double MaxValor = 0;
			for(int pos=0; pos < ds.getNota().length; pos++) {
				int contador = pos+1;
				System.out.println("Nota: da " + contador + " Unidade " + ds.getNota()[pos]);
				
				if(pos == 0) {
					MaxValor = ds.getNota()[pos];
				}else if(ds.getNota()[pos] > MaxValor) {
					MaxValor = ds.getNota()[pos];
				}
			}
			System.out.println("A maior nota da Disciplina " + disciplina.getDisciplina() + " é de valor " + MaxValor);
		}
		
		// quando agente quer pegar um valor de um array ex:
		/*  ds.getNota()[pos]   neste caso eu coloco o get()[] e os colchetes*/
		
	}

}
