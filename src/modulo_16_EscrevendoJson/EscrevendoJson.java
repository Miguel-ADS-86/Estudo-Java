package modulo_16_EscrevendoJson;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscrevendoJson {

	public static void main(String[] args) throws Exception {
		Pessoa pessoa1 = new Pessoa(1,"Miguel","54564488");
		Pessoa pessoa2 = new Pessoa(2,"João","9658247");
		Pessoa pessoa3 = new Pessoa(1,"Ana","55587982");
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();// ele serve para organizar o codigo json, deixa ele estruturado
		
       // String json = new Gson().toJson(pessoas);// cria o json, passando a lista de ojetos
		
		String json = gson.toJson(pessoas);
		
		//com o FileWrite pode da problemas com a acentuação, ai podemos usar o OutputStreamWrite 
       // FileWriter escrever = new FileWriter("C:\\Users\\Miguel\\Documents\\Projetos\\Estudo-Java\\src\\modulo_16_EscrevendoJson\\file.json");
        
		//NESSE CASO RESOLVE O PROBLEMA DE ACENTUAÇÃO
        OutputStreamWriter escrever = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Miguel\\Documents\\Projetos\\Estudo-Java\\src\\modulo_16_EscrevendoJson\\file.json"),"UTF-8");
        
        System.out.println(json);
        
        escrever.write(json);
        escrever.flush();
        escrever.close();
        
        /* -------------------LENDO O ARQUIVO JSON------------------------*/
        FileReader fileReader = new FileReader("C:\\Users\\Miguel\\Documents\\Projetos\\Estudo-Java\\src\\modulo_16_EscrevendoJson\\file.json");
	    JsonArray jsonArray = (JsonArray)JsonParser.parseReader(fileReader);// pegando os dados do arquivo e colocando no JsonArray
	    
	    List<Pessoa> pessoas2 = new ArrayList<Pessoa>();
	    
	    for(JsonElement element: jsonArray) {// percorrendo o array json criado
	    	Pessoa pessoa = new Gson().fromJson(element, Pessoa.class);// converte para pessoa ou classe passada
	    	pessoas2.add(pessoa);
	    }
	    
	    System.out.println("leitura do arquivo json " + pessoas2);
	    
	}

}
