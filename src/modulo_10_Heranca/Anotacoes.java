package modulo_10_Heranca;

public class Anotacoes {
	/* Herança em OO, permite criação de novas classes a partir de outra ja existentes, e 
	 * essas novas classes são chamadas de subclasses
	 * 
	 * Quando criamos uma classe pai, criamos seus atributos como protected não como private 
	 * pois se não vai da erro quando chamarmos os atributos da classe pai ou seja
	 * da super classe.
	 * 
	 * private:usado apenas para manipular atributos da propia classe.
	 * protected:usado na classe pai e na classe filha.
	 * 
	 * para usarmos a Herança usamos a palavra chave extends
	 * 
	 *      SOBRESCRITA DE METODOS
	 *   
	 * Notação @Override conseguimos sobrescrever o metodo ou mudar a regra de negocio, podendo
	 * ser usado em herança com metodos na classe pai e sobrescrevendo nas filhas ou em classe normal..
	 * 
	 *   CLASSES ABSTRATAS
	 * classe abstrata: qual a inteção dela, é de servir como um modelo, e uma classe abstrata impede
	 * que possa ser instanciada e utilizamos a palavra chave abstract, servindo para manter a regra
	 * dentro do sistema impedindo que um dev use a classe de uma forma errada.
	 *  è o meio de não permitir ser criado um objeto dentro de um sistema de um determinado tipo generico
	 *  exemplos pessoa, e trabalhar com objetos concretos como aluno que herda de pessoa. 
	 *  
	 *  Metodos abstratos: metodo abstrato só existe em uma classe abstrata, que obrigartoriamente é 
	 *  implementado nas classes filhas, vai ser um metodo tambem sobrescito como no exemplo 
	 *  nesse pacote Herança.
	 *  metodo abstrato é declarado mais não definido ex:
	 *  publi double salario();
	 *  
	 *  Polimofismo (poli = muitas, morphos = formas): varias formas, exemplo sobrescrita de metodo o mesmo metodo mais podendo
	 *  fazer ele de varias formas diferentes.
	 *  exemplo de polimofismo:
	 *  
	 *  Pessoa pessoa = new Aluno(); // então aqui eu posso pegar os dados de aluno e de pessoa varias formas
	 *  
	 *  FALANDO AGORA SOBRE INTERFACESSS -----------------------------------------------------------
	 *  
	 *  Define uma serie de metodos mas nunca conter implementações deles, ele so expõe o que o 
	 *  objeto deve fazer.
	 *  Ela é um contrato onde quem assina se responsabiliza por implementar esses métodos.
	 *  
	 *  palavra reservada interface exemplo:
	 *  
	 *  public interface PermirtirAcesso{
	 *         public boolean autenticar();
	 *  }
	 *  
	 *  Diferença de Abstração e Herança x Interface
	 *  
	 *  na abstração e Herança as classes filhas implementarão os metodos abstratos
	 *  e poderam acessar metodos e atributos da classe pai.
	 *  
	 *  na interface: só tera acesso aos metodos as classes que implementarem a interface 
	 *  assim eu posso ter 3 ou mais classes filhas e escolher uma que implemente um metodo que eu não
	 *  quero que as outras não implementem, usando a interface e assinando o contrato com ela.
	 *  
	 *  
	 *  
	 */ 
}