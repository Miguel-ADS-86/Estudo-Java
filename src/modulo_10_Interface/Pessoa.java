package modulo_10_Interface;

public class Pessoa implements Autenticar{
	private String nome;
	private int idade;
	private String login;
	private String senha;
	
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
	
	// contrutor
	public Pessoa() {}
	public Pessoa(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	
	@Override
	public boolean autenticarUsuario() {
		return login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin");
	}
	
}
