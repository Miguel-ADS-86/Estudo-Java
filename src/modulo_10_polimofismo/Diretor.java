package modulo_10_polimofismo;

public class Diretor extends Pessoa{
 
	private String funcao;
 
	public String getFuncao() {
		return funcao;
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
    // sobrescrevendo o metodo abstrato mostrando o polimofismo, onde o diretor
	//tem um salario e o aluno outro
	@Override
	public double salario() {
		
		return 2500;
	}
 
}
