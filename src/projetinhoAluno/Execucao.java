package projetinhoAluno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;
public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	 Disciplina disciplina1 = new Disciplina();
	 Disciplina disciplina2 = new Disciplina();
	 Disciplina disciplina3 = new Disciplina();
	 Disciplina disciplina4 = new Disciplina();
	 
	 Aluno aluno = new Aluno();
	 
	 disciplina1.setDisciplina("Java Web");
	 disciplina1.setNota(7.5);
	 disciplina2.setDisciplina("Java Script");
	 disciplina2.setNota(8.5);
	 disciplina3.setDisciplina("HTML & CSS");
	 disciplina3.setNota(7.5);
	 disciplina4.setDisciplina("SQL Server");
	 disciplina4.setNota(9.5);
	 
	 aluno.setNome("Junior Miguel");
	 aluno.setInstituicao("Unibratec");
	 aluno.setCpf("012.535.924-53");
	 aluno.getDisciplinas().add(disciplina1);
	 aluno.getDisciplinas().add(disciplina2);
	 aluno.getDisciplinas().add(disciplina3);
	 aluno.getDisciplinas().add(disciplina4);
	 
	 System.out.println(aluno.toString());
	 System.out.println("A média do Aluno foi " + aluno.calculoMedia());
	 System.out.println("O aluno está " + (aluno.resultadoAluno() ? "aprovado" : "reprovado"));
	 
	*/
		
		// Fazendo de forma mais dinamica...
		
	   List<Aluno> alunos = new ArrayList<Aluno>();// criando lista de alunos
	   /*entendendo um pouco de hashmap:
	    * hshmap: é uma forma de você carregar dados e recuperar o valor
	    * quando você implementa ele vai aparecer assim HashMap<K, V> onde tem o K, é a chave
	    * na string vai pegar o status do aluno.
	    * O HashMap pe uma lista que dentro dela temos uma chave que indentifica uma sequencia de 
	    * valores ou seja lisa de recuperação, aprovados e reprovados tudo isso em uma lista só o
	    * HashMap
	    * NA chave vamos informa o tipo da chave que seria o K e o V informar o objeto
	    * */
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		for(int i = 1; i <= 5; i++) {
		String nome = JOptionPane.showInputDialog("Nome do Aluno");
		String cpf = JOptionPane.showInputDialog("CPF do Aluno");
		String instituicao = JOptionPane.showInputDialog("Instituição do Aluno");
		String ano = JOptionPane.showInputDialog("Digite o ano de aniversario");
		
		// instanciar o aluno para poder inserir os dados
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setCpf(cpf);
		aluno.setInstituicao(instituicao);
		aluno.setAnoNascimento(Integer.valueOf(ano));
		
		// deixando de forma dinamica construindo um for para colocar 4 notas e 4 disciplinas
		
		for(int pos =1; pos <= 1; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos);
			String notaDisciplina = JOptionPane.showInputDialog("Nota " + pos);
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));// double.ValueOf() convert de String para double
			
			aluno.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		if(escolha == 0) {
		  /*no array ele remove por inteiros e no remove no metodo ele remove por objetos
		   * então usamos o método intValue() para remover pelo indice da lista e o -1 para 
		   * pegar o valor exato ja que em toda lista se inicia com o zero!*/
		  int continuarRemover = 0;
		  int pos = 1;
		  while(continuarRemover == 0) {
			  String removerDisciplna = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4");
			  aluno.getDisciplinas().remove(Integer.valueOf(removerDisciplna).intValue() -pos); 
			  pos++; // este incremento serve para tirar um erro de excluir o 2 e depois o 4 e não da erro de posição
			  continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover");
			  System.out.println(aluno.toString());
		   }
		  
		    }
		       alunos.add(aluno);
		}
		
		
		/*
		 for(Aluno aluno : alunos) {
			 // procurando o um aluno na lista, encontrando para o loop e exibe o aluno encontrado
			 if(aluno.getNome().equalsIgnoreCase("Miguel")) {
				 System.out.println(aluno.toString());
				 System.out.println("A média do aluno é " + aluno.calculoMedia());
				 System.out.println("O aluno está " + (aluno.resultadoAluno() ? " aprovado " : " reprovado "));
				 System.out.println("Sua idade é " + aluno.calcularIdade()); 
				 break;
			 }			 
		 }*/
		// encontrando um aluno e removendo ele da lista.
		/*for(Aluno aluno : alunos) {
			 if(aluno.getNome().equalsIgnoreCase("Miguel")) {
				 alunos.remove(aluno);
				 break;
			 }else {
				 System.out.println(aluno.toString());
				 System.out.println("A média do aluno é " + aluno.calculoMedia());
				 System.out.println("O aluno está " + (aluno.resultadoAluno() ? " aprovado " : " reprovado "));
				 System.out.println("Sua idade é " + aluno.calcularIdade()); 
			 }			 
		 }*/
		// um for dentro do outro so para nivel de pratica.
		for(Aluno aluno: alunos) {
			System.out.println("Alunos que sobraram na lista");
			System.out.println("Aluno : " + aluno.getNome());
			System.out.println("Suas materias são");
			for(Disciplina dis : aluno.getDisciplinas()) {
				System.out.println(dis.getDisciplina());
			}
		}
		
		// percorrendo a lista por posição e pegando o valor pelo índice da lista
		
		/*for(int pos = 0; pos < alunos.size(); pos++) {
			Aluno aluno = alunos.get(pos);
			if(aluno.getNome().equalsIgnoreCase("Miguel")) {
				Aluno trocarAluno = new Aluno();
				
				trocarAluno.setNome("Aluno trocado");
				trocarAluno.setCpf("0125388");
				trocarAluno.setInstituicao("Catolica");
				trocarAluno.setAnoNascimento(1987);
				// eu pegando a lista de disciplinas em aluno e usando o metodo
				//set para pegar a posição do aluno na lista e substituir com a disciplina
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Java");
				disciplina.setNota(10);
				
				trocarAluno.getDisciplinas().add(disciplina);
				alunos.set(pos, trocarAluno);
				aluno = alunos.get(pos);// aqui vai receber o aluno que foi trocado dentro da 
				//lista na posição.
				
			}
			
			System.out.println("Nome " + aluno.getNome());
			System.out.println("Média do aluno " + aluno.calculoMedia());
			System.out.println("Resultado " + aluno.resultadoAluno());
			
			//separando lista de alunos reprovados, recuperação e aprovados.*/
	       
		    /*Quando usamos o HashMap n precisamos mais dessas Listas abaixo
			List<Aluno> alunosAprovados = new ArrayList<Aluno>();
			List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
			List<Aluno> alunosReprovados = new ArrayList<Aluno>();
			for(Aluno al: alunos) {
				if(al.statusAluno().equalsIgnoreCase(StatusAluno.APROVADO)) {
					alunosAprovados.add(al);
				}else if(al.statusAluno().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					alunosRecuperacao.add(al);
				}else {
					alunosReprovados.add(al);
				}
			*/
		    
		    // aqui temos que iniciar o HashMap antes de percorrer a lista,
		    //colocamos a chave e criamos a Lista desta chave
		    
		    maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		    maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		    maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		    
			for(Aluno al: alunos) {
				if(al.statusAluno().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(al);
				}else if(al.statusAluno().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(al);
				}else {
					maps.get(StatusAluno.REPROVADO).add(al);
				}
			}
			
			
		}
		
}


