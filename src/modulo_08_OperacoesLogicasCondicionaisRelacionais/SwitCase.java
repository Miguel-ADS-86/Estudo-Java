package modulo_08_OperacoesLogicasCondicionaisRelacionais;

public class SwitCase {
/*Serve para operações exatas*/
	public static void main(String []args) {
		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
        
		switch(media) {
		case 70:
			System.out.println("Aluno Aprovado " + media);
			break;
		
		default:
			System.out.println("Outro valor " + media);
			break;
		}
		
		
	}
	
}
