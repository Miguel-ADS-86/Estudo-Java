package modulo_07;

public class VariavelGlobal {
	//Variavel Global é acessivel a todos
	static int maiorIdadeGlobal = 30;
	
	public static void main(String []args) {
		//variavel local porque pertence somente ao metodo
		int maiorIdadeLocal = 18;
	}
	
	public static void metodo2() {
	System.out.println(maiorIdadeGlobal);	
	}

}
