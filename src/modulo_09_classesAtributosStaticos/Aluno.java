package modulo_09_classesAtributosStaticos;

public class Aluno {
	private String nome;
	private double media1,media2,resultado;
	
	public void calcularMedia() {
	  resultado = (media1 + media2)/2;
	  	if(resultado >= 5) {
	  		System.out.println(Status.APROVADO);
	  	}else {
	  		System.out.println(Status.REPROVADO);
	  	}
	}
	
	
	

}
