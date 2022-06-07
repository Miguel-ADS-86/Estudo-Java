package modulo_14_TelaJDialog_comThreads;

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

public class Tela extends JDialog{
//criando os componentes para ser usado no construtor.
 private JLabel descricaoHora1 = new JLabel("Time Thread 1");
 private JTextField mostrarTempo1 = new JTextField();
 private JLabel descricaoHora2 = new JLabel("Time Thread 2");
 private JTextField mostrarTempo2 = new JTextField();
 private JButton jbuttonStart = new JButton("Start");
 private JButton jbuttonStop = new JButton("Stop");
 
 private JPanel painel = new JPanel();
 
 // criando a thread
 private Runnable thread1 = new Runnable() {
	@Override
	public void run() {
		while(true) {
			mostrarTempo1.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(
					Calendar.getInstance().getTime()));
			try{
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			   }
			
			}
		}

};

private Runnable thread2 = new Runnable() {
	@Override
	public void run() {
		while(true) {
			mostrarTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss")
					.format(Calendar.getInstance().getTime()));
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
};
 
 private Thread threadTempo1;
 private Thread threadTempo2;
 
 
//Construtor
public Tela() {
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
    descricaoHora1.setPreferredSize(new DimensionUIResource(200,25));
    painel.add(descricaoHora1, grid);//ele recebe o objeto e o grid que é o posicionamento
    
    mostrarTempo1.setPreferredSize(new DimensionUIResource(200,25));
    grid.gridy ++;
    mostrarTempo1.setEditable(false);
    painel.add(mostrarTempo1, grid);
    
    descricaoHora2.setPreferredSize(new DimensionUIResource(200,25));
    painel.add(descricaoHora2, grid);
    
    mostrarTempo2.setPreferredSize(new DimensionUIResource(200,25));
    grid.gridy ++;
    mostrarTempo2.setEditable(false);
    painel.add(mostrarTempo2, grid);
    
    jbuttonStart.setPreferredSize(new DimensionUIResource(92, 25));
    painel.add(jbuttonStart, grid);
    
    jbuttonStop.setPreferredSize(new DimensionUIResource(92,25));
    grid.gridx ++;
    painel.add(jbuttonStop, grid);
    
    
    jbuttonStart.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// executa o clique no botão
			threadTempo1 = new Thread(thread1);
			threadTempo2 = new Thread(thread2);
			threadTempo1.start();
			threadTempo2.start();
		}
    	
    });
    
    jbuttonStop.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			threadTempo1.stop();// esta depreciado mais ainda funciona, para fins academicos
			threadTempo2.stop();
		}});
    
    add(painel);// adicionando o painel ao JDialog
	setVisible(true);// vai ser sempre o último comando a ser executado. ele possi,
	//bilita a visualização da tela.
}
	
}
