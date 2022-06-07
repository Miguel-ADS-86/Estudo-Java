package modulo_10_Heranca;

public class Execucao {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Miguel");
		aluno.setIdade(18);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Dida");
		diretor.setIdade(20);
		
		System.out.println("O aluno é " + aluno.getNome());
		System.out.println("O diretor é " + diretor.getNome());
		
		System.out.println(aluno.retornaMaiorIdade());
		System.out.println(aluno.salario());
		System.out.println(diretor.retornaMaiorIdade());
		System.out.println(diretor.salario());
		
		/*exemplo de polimofismo, varias formas de se fazer algo.
		Pessoa pessoa = new Aluno(); // posso dizer que pesso é um aluno
		pessoa = diretor;// posso sobrescrever dizendo que pessoa agora é um diretor.*/
        
		/*tanto diretor como o aluno é uma pessoa por isso este metodo abaixo aceita
		 * outro exemplo de polimofismo*/
		
        teste(diretor);
        teste(aluno);
        
        /*Seria outra forma mais robusta de amarrar sem precisar criar atributos na classe
         * secretario*/
       /* 
        PermitirAcesso secretario = new Secretario();
        System.out.println("Usando interface " + secretario.autenticar("admin", "admin"));*/
        
        // podemos diminuir mais o codigo desta forma
       // System.out.println("Segunda forma de fazer " + new Secretario().autenticar("admin", "admin"));
	   
        // outra forma atravez de construtores, mais dai precisamos da senha e login na classe secretario
       /* 
        PermitirAcesso permitirAcesso = new Secretario("admin","admin");
        if(permitirAcesso.autenticar()) {
        	System.out.println("Acesso permitido");
        }else {
        	System.out.println("Acesso não permitido");
        }*/
        
        // outra forma de fazer usando a classe FuncaoAutenticar para amarrar ainda mais
        // que so quem implementa a interface utilize, um dos padrões mais usados.
        
        /*
        FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();
        
        PermitirAcesso permitirAcesso = new Secretario("admin","admin");
        if(autenticacao.autenticarCurso(permitirAcesso)) {
        	System.out.println("Acesso permitido");
        }else {
        	System.out.println("Acesso não permitido");
        }*/
        
        // outra forma mais amarrada para chamar o metodo permitir acesso
         
        /*
        PermitirAcesso permitirAcesso = new Secretario("admin","admin");
       // permitirAcesso.
        
        if(new FuncaoAutenticacao(permitirAcesso).autenticarCurso()) {
        	System.out.println("Acesso permitido");
        }else {
        	System.out.println("Acesso não permitido");
        }*/
        
        // outra forma de fazer com menos linhas..
        //invez de instanciar posso instanciar ja dentro do objeto
        //PermitirAcesso permitirAcesso = new Secretario("admin","admin");
         
         if(new FuncaoAutenticacao(new Secretario("admin","admin")).autenticarCurso()) {
         	System.out.println("Acesso permitido");
         }else {
         	System.out.println("Acesso não permitido");
         }
        
        
        
	}
	//tambem chamado de metodo generico pois Pessoa é uma classe pai das filhas diretor e aluno.
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é " + pessoa.getNome() + " e o seu salário é " +
	        pessoa.salario());
	}

}
