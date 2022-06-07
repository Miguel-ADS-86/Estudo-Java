package exercicioTesteOO;

public class ExecutarCodigo {

	public static void main(String[] args) {
		// esta forma de fazer instanciando Produtos p = new Produtos();
		String nome = "Notbook";
        Produtos p = new Produtos(nome);
		System.out.println(p.getNomeProduto());
		
		// outra forma de fazer diminuindo mais a linha de código
		/*Desta forma eu não crio uma variavel do tipo do objeto e instâncio, eu ja 
		 * instancio e passo o valor direto atravez do construtor. 
		 * Produtos é o tipo e p seria a variavel que é do tipo Produtos eu não criou
		 * ja dou o new direto criando o objeto e chamando o metodo*/
		System.out.println("o nome do produto é " + new Produtos(nome).getNomeProduto());
//////////////////////////////////////////////////////////////////////////////////////////////////////		
		/*Em uma classe pai abstrata como não podemos instancia-la, Podemos criar um objeto da classe pai
		 * e dando o New na classe filha, desta forma conseguimos manipular os metodos só os metodos
		 * da classe pai, sem enchergar o da classe filha exemplo:
		 * Classe  obj    cria Construtor
		 * Vendas   v =   new  Produtos();
		 * 
		 * a classe Vendas é a classe pai e a classe Produto é a classe filha 
		 * 
		 * Agora se quisermos pegar os metodos e atributos tanto da classe pai e filho, a classe pai sendo abstrata
		 * ou não, instanciamos a classe filha ou "subclasse" ;
		 * 
		 * eu consigo pegar um metodo de produto mesmo tendo criado um objeto Vendas v, pois 
		 * na classe pai abstrata tem um metodo abstrato que esta sendo implementado 
		 * no produto por isso conseguimos enchergar este metodo na classe Produtos, pois os metodos abstratos
		 * obrigatóriamente tem que ser implementado pela classe filha. 
		 * 
		 * */
		String nome2 = "Sansung";
		Vendas v = new Produtos();
		System.out.println(v.ListarNome(nome2));
		
//////////////////////////////////////////////////////////////////////////////////////////////
        
 }
}
