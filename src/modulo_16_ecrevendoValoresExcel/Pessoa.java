package modulo_16_ecrevendoValoresExcel;

public class Pessoa {
	//1-criar os atributos
	private int codigo;
	private String nome;

	// 2- criar os metodos getrs e seters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pessoa(int codigo,String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

}
