package modulo_08_OperacoesLogicasCondicionaisRelacionais;

public class OperacoesRelacionais {
	/* os operadores lógicos e embaixo alguns exemplos
	 *  ==
	 *  !=
	 *  <
	 *  >
	 *  <=
	 *  >=
	 * */
	public static void main(String []args) {
		int nota1 = 90;
		int nota2 = 91;
		
		if(nota1 == nota2) {
			System.out.println("As notas são iguais");
		}else {
			System.out.println("As notas não são iguais");
		}
		
		if(nota1 != nota2) {
			System.out.println("As notas são diferentes");
		}else {
			System.out.println("As notas são iguais");
		}
		
		if(nota1 < nota2) {
			System.out.println("Nota 1 é menor");
		}else {
			System.out.println("Nota 1 não é menor");
		}
		
	}
}
