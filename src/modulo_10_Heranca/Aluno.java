package modulo_10_Heranca;

public class Aluno extends Pessoa {
  private String dataMatricula;
  private String nomeEscola;
  private String serieMatriculado;
  
  
public String getDataMatricula() {
	return dataMatricula;
}
public void setDataMatricula(String dataMatricula) {
	this.dataMatricula = dataMatricula;
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

  //construtor chamando os atributos da
  public Aluno(String nome, String dataNascimento) {
	  super.nome = nome;
	  super.dataNascimento = dataNascimento;
  }
  
  //contrutor vazio
  public Aluno() {}
  
  // sobrescrevendo o metodo e mudando a regra de negocio para maior idade 20
  //@override ele sobrescreve o metodo tanto da propia classe como da super classe
  @Override
	public boolean retornaMaiorIdade() {
		return idade >= 20;
	}
  
  // sobrescrevendo o metodo da classe abstrata pai assim podendo manipular o metodo
@Override
public double salario() {
	
	return 1800;
}
}
