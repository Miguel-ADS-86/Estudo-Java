package exercicioTesteOO;

public class Produtos extends Vendas {
	private int codigo;
	private String nomeProduto;
	private double valorProduto;
	
	public Produtos() {
	}
	
	public Produtos(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		 this.nomeProduto = nomeProduto;
	}

	@Override
	public String ListarNome(String nome) {
		
		return this.nomeProduto = nome;
	}

}
