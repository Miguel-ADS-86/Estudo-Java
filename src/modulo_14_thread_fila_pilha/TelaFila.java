package modulo_14_thread_fila_pilha;
import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;


public class TelaFila extends JDialog{
	//criando os componentes para ser usado no construtor.
	 private JLabel descricaoNome = new JLabel("Nome");
	 private JTextField jtNome = new JTextField();
	 private JLabel descricaoEmail = new JLabel("Email");
	 private JTextField jtEmail = new JTextField();
	 
	 private JButton jbGerar = new JButton("Gerar");
	 private JButton jbPausar = new JButton("Pausar");
	 
	 private JPanel painel = new JPanel();
	 
	 private FilaPilha pilha = new FilaPilha();
	 	 
	
	//Construtor
	public TelaFila() {
	    //configuração da tela. como tamanho e dimensões
		setTitle("Minha tela de Time com Thread");//titulo da tela
		setSize(new DimensionUIResource(260,260));//coloca a dimensão da tela
		setLocationRelativeTo(null);// deixa a tela centralizada
		setResizable(false);//não permite redimensionar a tela
	// fim da configuração da tela ///
	/////////////////////////////////////////////////////////////////////////////////

	// Definir um controlador de componetes que funciona feito uma tabela onde o x é 
	// a linha e o Y a coluna.
		
		GridBagConstraints grid = new GridBagConstraints();
		grid.gridx = 0;
	    grid.gridy = 0;
	    //grid.gridwidth =2; aqui ele coloca uma colunca com espaço de duas colunas
	    // e podemos coloca grid.gridwidth =1; assim resolve os problemas de espaçamento dos botões
		//                     top,esquerda,baixo,direita.
	    grid.insets = new Insets(5,10,5,5);
	    grid.anchor = grid.WEST;
		
		
		
	//////////////////////////////////////////////////////////////////////////////////

	// adicionando os componentes e colocando as dimensões e adicionamos ao painel,
	// pois todos componentes fica dentro de um painel e depois adicionamos o painel
	// ao JDialog atraves do construtor da classe, como ele extends do JDialogJDialog.
	//mais no meu caso não precisei.    
	    descricaoNome.setPreferredSize(new DimensionUIResource(200,25));
	    painel.add(descricaoNome, grid);//ele recebe o objeto e o grid que é o posicionamento
	    
	    jtNome.setPreferredSize(new DimensionUIResource(200,25));
	    grid.gridy ++;
	    painel.add(jtNome, grid);
	    
	    descricaoEmail.setPreferredSize(new DimensionUIResource(200,25));
	    painel.add(descricaoEmail, grid);
	    
	    jtEmail.setPreferredSize(new DimensionUIResource(200,25));
	    grid.gridy ++;
	    painel.add(jtEmail, grid);
	    
	    jbGerar.setPreferredSize(new DimensionUIResource(92, 25));
	    painel.add(jbGerar, grid);
	    
	    jbPausar.setPreferredSize(new DimensionUIResource(92,25));
	    grid.gridx ++;
	    painel.add(jbPausar, grid);
	    
	    
	    jbGerar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome(jtNome.getText());
			pessoa.setEmail(jtEmail.getText());
			
			pilha.adicionar(pessoa);
			
				
	    	
	    }});
	    
	    jbPausar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}});
	    
	    pilha.start();
	    add(painel);// adicionando o painel ao JDialog
		setVisible(true);// vai ser sempre o último comando a ser executado. ele possi,
		//bilita a visualização da tela.
	}
}
