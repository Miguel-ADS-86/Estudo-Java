package InterfaceComParametro;

public class Pessoa implements AcessoSistema {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public boolean validar(String login, String senha) {
		return login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin");
	}
	
	
}
