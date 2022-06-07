package modulo_13_Arrays_estruturas_de_dados;

import javax.swing.JOptionPane;

public class PrimeiroArray {

	public static void main(String[] args) {
		/*
 Array ou vetores em Java Parte de estrutura de dados é uma das mais importantes 
 onde aprendemos a manipular os dados em determinadas posições.*/
		
/*como criar um array: double notas[]; ou double[] notas;*/
		
/*sempre deve ter a quantidade de posições definidas*/
 //   double[] notas = new double[4];	
//para colocar valor dentro do Array
 /*   notas[0] = 9.8;
    notas[1] = 8.7;
    notas[2] = 9.7;
    notas[3] = 9.9;
   
    for(int i=0; i < notas.length;i++) {
    System.out.println("Nota " + (i + 1) + " - " + notas[i]);
    } 
    */
////////////////////////////////////////////////////////////////////////////////////////////
	// ENTRADA E LEITURA DE FORMA DINAMICA!
	/*	try {
		String valor = JOptionPane.showInputDialog("Digite a quantidade de notas.");
		
		double[] notas = new double[Integer.valueOf(valor)];
		//adiciono nota em um vetor de forma dinamica
		for(int pos=0; pos < notas.length; pos++) {
			String nota = JOptionPane.showInputDialog("Digite a nota " + (pos+1));
			notas[pos] = Double.parseDouble(nota);
		}
		// listo as notas de forma dinamica
		for(int pos = 0; pos < notas.length; pos++) {
			System.out.println("A nota é " + (pos+1) + " : " +notas[pos]);
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		
		
	//Diferentes formas de atribuição de valores
    //posições               0   1   2
		double[] valores = {9.5,7.5,7.0}; 
		
	// varios tipos de dados usamos String
	/*
		String[] valores2 = new String[4];
		valores2[0] = "Miguel";
		valores2[1] = "90.8";
		valores2[2] = "Curso Java";
		valores2[3] = "miguelanalista7@gmail.com";
	 */
		
	// outra forma de fazer 
	 String[] vlr = {"Miguel","90.8","Curso Java","miguelanalista7@gmail.com"};
	 for(int v = 0; v < vlr.length; v++) {
		 System.out.println("Valor na posição : "+ v + " é igual = " + vlr[v]);
	 }
	 
	 // temos array de inteiros de floats String double
	}

}
