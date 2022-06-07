package modulo_10_Heranca;

public class Diretor extends Pessoa{
	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	// sobrescrevendo o metodo da classe abstrata pai assim podendo manipular o metodo
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 3200;
	}
}
