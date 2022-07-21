package modulo_16_comApachePoi_CriandoPlanilha;

public class Vendas {
    private int id;
    private String nome_produto;
    private double valor;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome_produto() {
		return nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
    
	public Vendas() {}
	public Vendas(int id,String nome_produto, double valor) {
		this.id = id;
		this.nome_produto = nome_produto;
		this.valor = valor;
	}
}
