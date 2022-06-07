package modulo_08_OperacoesLogicasCondicionaisRelacionais;

public class OperadoresTenario {
   public static void main(String []args) {
	   
	   /*operadores tenários usados para micro validações, validações de uma linha*/
	   int mediaAluno = 70;
	   String saidaResultado;
	                  /* condição     tenario    verdadiro         falso      */
	   saidaResultado = mediaAluno >= 70 ? "Aluno aprovado" : "Aluno reprovado";
	  
	   System.out.println(saidaResultado);
   }
}
