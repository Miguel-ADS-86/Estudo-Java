package modulo_13_metodo_Split_conversao_deArrays;

import java.util.Arrays;
import java.util.List;

public class Executa {

	public static void main(String[] args) {
	String texto = "Miguel / curso / java / nota 10";
		
		String[] valor = texto.split("/");
	   	
		for(int i=0; i < valor.length; i++) {
			System.out.print(valor[i]);
		}
		
		// convertendo um Array em uma lista
		//usamos o metodo Arrays.asList em java
		//List<String> list = Arrays.asList(valor);
		/*
		for(String i: list){
			System.out.println(i);
		}*/
		
		
		/*converter lista em array*/
		/*String[] conversaoArray = list.toArray(new String[3]);
		
		for(int g=0; g < conversaoArray.length; g++) {
			System.out.println(conversaoArray[g]);
		}*/

	}

}
