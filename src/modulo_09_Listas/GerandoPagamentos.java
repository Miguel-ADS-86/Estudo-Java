package modulo_09_Listas;

import javax.swing.JOptionPane;

public class GerandoPagamentos {

	public static void main(String[] args) {
		
		//criando uma lista de pagamento por mês e adicionando os pagamentos na lista.
		Funcionario funcionario = new Funcionario();
		String valor = JOptionPane.showInputDialog("Digite a quantidade de meses pago!");
        if(valor.equals("")) {
        	JOptionPane.showMessageDialog(null, "Valor vazio não pode fazer a operação");
        }else {
        	  for(int cont=0; cont <= Integer.valueOf(valor); cont++) {
        		   Pagamento pagamento = new Pagamento();
	        		   String codigo = JOptionPane.showInputDialog("Digite o código de pagamento!");
	        		   		pagamento.setCodigo(Integer.valueOf(codigo));
	        		   String mes = JOptionPane.showInputDialog("Digite o mês que foi pago!");
	        		   		pagamento.setMes(mes);
	        		   String salario = JOptionPane.showInputDialog("Digite o salário do mês de " + pagamento.getMes() +"!");
	        		   		pagamento.setSalario(Double.valueOf(salario));
	        		   		funcionario.getPagamentos().add(pagamento);
        	  }
        	
        }
        
        // listando os pagamentos 
        
        for(Pagamento pg: funcionario.getPagamentos()) {
        	System.out.println("Código : " + pg.getCodigo());
        	System.out.println("Mês : " + pg.getMes());
        	System.out.println("Salário : " + pg.getSalario());
        	System.out.println("-----------------------------------------------------");
        }
        
        // removendo seu pagamento pelo seu código:
        
          int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja remover o pagamento");
          if(confirmacao == 0) {
        	  String codigoPagamento = JOptionPane.showInputDialog("Digite o codigo de pagamento");
        	  for(Pagamento pagamento:funcionario.getPagamentos()) {
        		  if(pagamento.getCodigo() == Integer.valueOf(codigoPagamento)) {
        			 
        			  funcionario.getPagamentos().remove(pagamento);
        			  break;// usamos o break para interroper o loop
        		  }
        	  }
        	  
        	  
          }else {
        	  JOptionPane.showMessageDialog(null, "Continuou o sistema");
          }
          
          for(Pagamento pg: funcionario.getPagamentos()) {
          	System.out.println("Código : " + pg.getCodigo());
          	System.out.println("Mês : " + pg.getMes());
          	System.out.println("Salário : " + pg.getSalario());
          	System.out.println("-----------------------------------------------------");
          }
          
          // procurar pagamento 
           int opcao = JOptionPane.showConfirmDialog(null,"Deseja procurar um pagamento");
           if(opcao == 0) {
        	   String txtValor = JOptionPane.showInputDialog("Digite o código para buscar o pagamento");
        	   for(Pagamento pg: funcionario.getPagamentos()) {
        		   if(pg.getCodigo() == Integer.valueOf(txtValor)) {
        			   System.out.println("Código : " + pg.getCodigo());
        	           System.out.println("Mês : " + pg.getMes());
        	           System.out.println("Salário : " + pg.getSalario());
        	           break;
        		   }else {
        			   JOptionPane.showMessageDialog(null, "Pagamento não está cadastrado!");
        		   }
        	   }
           }
           
           // editar valor
           int opcao2 = JOptionPane.showConfirmDialog(null,"Deseja Editar o pagamento");
           if(opcao2 == 0) {
        	   String txtValor = JOptionPane.showInputDialog("Digite o código do pagamento que deseja editar");
        	   for(Pagamento pg: funcionario.getPagamentos()) {
        		   if(pg.getCodigo() == Integer.valueOf(txtValor)) {
        			   String mes = JOptionPane.showInputDialog("Digite o mês que foi pago!");
	        		   String salario = JOptionPane.showInputDialog("Digite o salário do mês!");
	        		   pg.setMes(mes);
	        		   pg.setSalario(Double.valueOf(salario));
	        		   funcionario.getPagamentos().add(pg);
		        		   for(Pagamento p: funcionario.getPagamentos()) {
		                    	System.out.println("Código editado : " + p.getCodigo());
		                    	System.out.println("Mês editado: " + p.getMes());
		                    	System.out.println("Salário editado: " + p.getSalario());
		                    	System.out.println("-----------------------------------------------------");
		                    }
		        		   		break;
        		   }else {
        			   JOptionPane.showMessageDialog(null, "Não foi possivél editar!");
        		   }
        	   }
           }
           
          
           
           // chamando o metodo de somar salario
          JOptionPane.showMessageDialog(null, funcionario.somaSalario());
	}

}
