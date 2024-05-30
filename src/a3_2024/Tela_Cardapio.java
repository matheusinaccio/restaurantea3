package a3_2024;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Tela_Cardapio extends JFrame {	
	
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtObservao;
	ArrayList<String> Lista = new ArrayList<>();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Cardapio frame = new Tela_Cardapio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
        
	public Tela_Cardapio() {
		 Random random = new Random();
	        
	        
	        int numeroSorteado = random.nextInt(5) + 1;
	       
	        
	        
	        LocalDateTime agora = LocalDateTime.now();
	        
	        // Define o formato da hora
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	        String horaFormatada = agora.format(formatter);

	      
	        
	        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Labels e TextAreas
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(49, 85, 316, 222);
		contentPane.add(textArea);
		//observação
		JTextArea textObserv = new JTextArea();
		textObserv.setBounds(49, 334, 316, 108);
		contentPane.add(textObserv);
		
		JLabel lbl1pedido = new JLabel("X-TUDO");
		lbl1pedido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1pedido.setBounds(455, 44, 156, 44);
		contentPane.add(lbl1pedido);

		JLabel lbl2pedido = new JLabel("X-BURGUER");
		lbl2pedido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2pedido.setBounds(455, 75, 156, 44);
		contentPane.add(lbl2pedido);
		
		JLabel lbl3pedido = new JLabel("X-AMERICANO");
		lbl3pedido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl3pedido.setBounds(455, 105, 156, 44);
		contentPane.add(lbl3pedido);
		
		JLabel lbl4pedido = new JLabel("X-SALADA");
		lbl4pedido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl4pedido.setBounds(455, 136, 156, 44);
		contentPane.add(lbl4pedido);
		
		JLabel lbl5pedido = new JLabel("X-AMODA");
		lbl5pedido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl5pedido.setBounds(455, 168, 156, 44);
		contentPane.add(lbl5pedido);
		
		JLabel lbl6pedido = new JLabel("X-FRANGO");
		lbl6pedido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl6pedido.setBounds(455, 201, 156, 44);
		contentPane.add(lbl6pedido);

		JLabel lbl7pedido = new JLabel("X-CALABRESA");
		lbl7pedido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl7pedido.setBounds(455, 233, 156, 44);
		contentPane.add(lbl7pedido);
		
		JLabel lbl8pedido = new JLabel("X-BACON");
		lbl8pedido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl8pedido.setBounds(455, 263, 156, 44);
		contentPane.add(lbl8pedido);
		
		JLabel lbl9pedido = new JLabel("MISTO\r\n");
		lbl9pedido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl9pedido.setBounds(455, 298, 156, 44);
		contentPane.add(lbl9pedido);
		
		
		//Botoes --------------------------------
		//teste contador
		final int[] contadorXtudo = {0};
		final int[] contadorXburguer = {0};
		final int[] contadorXamericano = {0};
		final int[] contadorXsalada = {0};
		final int[] contadorXAmoda = {0};
		final int[] contadorXfrango = {0};
		final int[] contadorXcalabresa = {0};
		final int[] contadorXbacon = {0};
		final int[] contadorXmisto = {0};
		

		//Botão Xtudo
		JButton btnaddXtudo = new JButton(" + ");
		btnaddXtudo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contadorXtudo[0]++;
				String textoAtual = textArea.getText();
		        String novoTexto = textoAtual.replaceAll("\\d+-X-TUDO ;\n", "") + contadorXtudo[0] + "-X-TUDO ;\n";
		        textArea.setText(novoTexto);
		    }
		});
		btnaddXtudo.setBounds(628, 63, 53, 14);
		contentPane.add(btnaddXtudo);
		
		//Botão Xburger
		JButton btn2Button = new JButton(" + ");
		btn2Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			contadorXburguer[0]++;
			String textoAtual = textArea.getText();
	        String novoTexto = textoAtual.replaceAll("\\d+-X-BURGUER ;\n", "") + contadorXburguer[0] + "-X-BURGUER ;\n";
	        textArea.setText(novoTexto);
	    }
	});
		
		btn2Button.setBounds(628, 90, 53, 14);
		contentPane.add(btn2Button);
				
		//Botão XAmericano
				
		JButton btn3Button = new JButton(" + ");
		btn3Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			contadorXamericano[0]++;
			String textoAtual = textArea.getText();
	        String novoTexto = textoAtual.replaceAll("\\d+-X-AMERICANO ;\n", "") + contadorXamericano[0] + "-X-AMERICANO ;\n";
	        textArea.setText(novoTexto);
	    }
	});
		btn3Button.setBounds(628, 120, 53, 14);
		contentPane.add(btn3Button);
				
		//Botão XSalada
				
		JButton btn4Button = new JButton(" + ");
		btn4Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			contadorXsalada[0]++;
			String textoAtual = textArea.getText();
	        String novoTexto = textoAtual.replaceAll("\\d+-X-SALADA ;\n", "") + contadorXsalada[0] + "-X-SALADA ;\n";
	        textArea.setText(novoTexto);
	    }
	});
		btn4Button.setBounds(628, 151, 53, 14);
		contentPane.add(btn4Button);
				
		//Botão XAmoda
				
		JButton btn5Button = new JButton(" + ");
		btn5Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			contadorXAmoda[0]++;
			String textoAtual = textArea.getText();
	        String novoTexto = textoAtual.replaceAll("\\d+-X-AMODA ;\n", "") + contadorXAmoda[0] + "-X-AMODA ;\n";
	        textArea.setText(novoTexto);
	    }
	});
		btn5Button.setBounds(628, 183, 53, 14);
		contentPane.add(btn5Button);
		
		//Botão XFrango
		JButton btn6Button = new JButton(" + ");
		btn6Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			contadorXfrango[0]++;
			String textoAtual = textArea.getText();
	        String novoTexto = textoAtual.replaceAll("\\d+-X-FRANGO ;\n", "") + contadorXfrango[0] + "-X-FRANGO ;\n";
	        textArea.setText(novoTexto);
	    }
	});
		btn6Button.setBounds(628, 216, 53, 14);
		contentPane.add(btn6Button);
		
		//Botão XCalabresa
		
		JButton btn7Button = new JButton(" + ");
		btn7Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			contadorXcalabresa[0]++;
			String textoAtual = textArea.getText();
	        String novoTexto = textoAtual.replaceAll("\\d+-X-CALABRESA ;\n", "") + contadorXcalabresa[0] + "-X-CALABRESA ;\n";
	        textArea.setText(novoTexto);
	    }
	});
		btn7Button.setBounds(628, 248, 53, 14);
		contentPane.add(btn7Button);
		
		//Botão XBacon
		
		JButton btn8Button = new JButton(" + ");
		btn8Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			contadorXbacon[0]++;
			String textoAtual = textArea.getText();
	        String novoTexto = textoAtual.replaceAll("\\d+-X-BACON ;\n", "") + contadorXbacon[0] + "-X-BACON ;\n";
	        textArea.setText(novoTexto);
	    }
	});
		btn8Button.setBounds(628, 278, 53, 14);
		contentPane.add(btn8Button);
				
		//Botão Misto
				
		JButton btn9Button = new JButton(" + ");
		btn9Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			contadorXmisto[0]++;
			String textoAtual = textArea.getText();
	        String novoTexto = textoAtual.replaceAll("\\d+-X-MISTO ;\n", "") + contadorXmisto[0] + "-X-MISTO ;\n";
	        textArea.setText(novoTexto);
	    }
	});
		btn9Button.setBounds(628, 308, 53, 14);
		contentPane.add(btn9Button);
		
		//Btn Com funçoes --------------------

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea seuTextArea = textArea;
				if (textArea.getText().trim().isEmpty()) {
					
					JOptionPane.showMessageDialog(null, "O campo de texto está vazio! ");
					System.out.println("Request NULL");
					
				}else{
				Lista.add("Mesa: " + numeroSorteado + ", Horario do Pedido: "+horaFormatada);
				Lista.add(textArea.getText());
				Lista.add(textObserv.getText());
				System.out.println(Lista);
				contadorXtudo[0] = 0;                  
				contadorXburguer [0] = 0;                
				contadorXamericano[0] = 0;                 
				contadorXsalada [0] = 0;                 
				contadorXAmoda[0] = 0;                 
				contadorXfrango[0] = 0;                 
				contadorXcalabresa [0] = 0;                 
				contadorXbacon[0] = 0;                 
				contadorXmisto[0] = 0;
				}
				textArea.setText("");
				textObserv.setText("");
				Lista.clear();
		}
		});
		btnEnviar.setBounds(49, 485, 89, 23);
		contentPane.add(btnEnviar);
		
		//botao apagar 
		JButton btnAPAGAR = new JButton("Apagar");
		btnAPAGAR.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    textArea.setText("");
				Lista.clear();
				contadorXtudo[0] = 0;
				contadorXburguer [0] = 0;
				contadorXamericano[0] = 0;
			  contadorXsalada [0] = 0;
			  contadorXAmoda[0] = 0;
			  contadorXfrango[0] = 0;
				contadorXcalabresa [0] = 0;
			  contadorXbacon[0] = 0;
			  contadorXmisto[0] = 0;	
		    }
		});
		btnAPAGAR.setBounds(253, 485, 89, 23);
		contentPane.add(btnAPAGAR);	
		JButton btnNewButton_6 = new JButton("Voltar");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_inicio Tela_inicio  = new Tela_inicio();
				Tela_inicio.setVisible(true);
				dispose();
			}
		});
		btnNewButton_6.setBounds(26, 11, 67, 44);
		contentPane.add(btnNewButton_6);
	}
}