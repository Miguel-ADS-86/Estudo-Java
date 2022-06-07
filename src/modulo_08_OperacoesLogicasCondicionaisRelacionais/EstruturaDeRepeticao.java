package modulo_08_OperacoesLogicasCondicionaisRelacionais;

public class EstruturaDeRepeticao {
    /*while -> verifica e depois executa o codigo
     * do while -> executa e depois verifica.
     * 
     * 
     * */
	public static void main(String[] args) {
		int numero = 0;
		int numero2 = 0;
		while (numero <= 10) {
			System.out.println("Número - " + numero++);
		}
		
		do {
			System.out.println("Número2 - " + numero2++);
		}while(numero2 <= 10);
	}
}
