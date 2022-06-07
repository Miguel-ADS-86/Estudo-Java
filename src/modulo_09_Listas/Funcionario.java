package modulo_09_Listas;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	private int cpf;
	private String nome;
	private List<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}
	
	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cpf;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (cpf != other.cpf)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Funcionario [cpf=" + cpf + ", nome=" + nome + "]";
	}
	
	
	public double somaSalario() {
		double soma_salario = 0;
		for(Pagamento p: pagamentos) {
			soma_salario += p.getSalario();
		}
		return soma_salario;
	}
	
	
	

}
