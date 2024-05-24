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
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTextArea;

public class Tela_Cardapio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtObservao;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Tela_Cardapio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//CAIXA DE PEDIDOS
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(49, 85, 316, 222);
		contentPane.add(textArea);
		
		JLabel lbl1pedido = new JLabel("X-TUDO");
		lbl1pedido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1pedido.setBounds(455, 44, 156, 44);
		contentPane.add(lbl1pedido);
		
		//teste de array ---------------------------------------------------------
		
		
		
		//PRIMEIRO BOTAO ADICIONAR
		JButton btn1Button = new JButton(" + ");
		btn1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText() + "   X-TUDO ;\n   ");
		
				
			
			
			}
		});
		btn1Button.setBounds(628, 63, 53, 14);
		contentPane.add(btn1Button);
		
		//SEGUNDO BOTAO ADICIONAR
		JButton btn2Button = new JButton(" + ");
		btn2Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textArea.setText(textArea.getText() + "X-BURGUER ;\n  ");
					}
		});
		btn2Button.setBounds(628, 90, 53, 14);
		contentPane.add(btn2Button);
				
		//terceiro BOTAO ADICIONAR
				
		JButton btn3Button = new JButton(" + ");
		btn3Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textArea.setText(textArea.getText() +" X-AMERICANO ;\n ");
		}
		});
		btn3Button.setBounds(628, 120, 53, 14);
		contentPane.add(btn3Button);
				
		//quarto BOTAO ADICIONAR
				
		JButton btn4Button = new JButton(" + ");
		btn4Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textArea.setText(textArea.getText() +"  X-SALADA ;\n");
		}
		});
		btn4Button.setBounds(628, 151, 53, 14);
		contentPane.add(btn4Button);
				
		//quinto BOTAO ADICIONAR
				
		JButton btn5Button = new JButton(" + ");
		btn5Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textArea.setText(textArea.getText() +"   X-AMODA ;\n");
		}
		});
		btn5Button.setBounds(628, 183, 53, 14);
		contentPane.add(btn5Button);
		
		//sexto BOTAO ADICIONAR
		
		JButton btn6Button = new JButton(" + ");
		btn6Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textArea.setText(textArea.getText() +"   X-FRANGO ;\n");
		}
		});
		btn6Button.setBounds(628, 216, 53, 14);
		contentPane.add(btn6Button);
		
		//setimo BOTAO ADICIONAR
		
		JButton btn7Button = new JButton(" + ");
		btn7Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textArea.setText(textArea.getText() +"   X-CALABRESA ;\n");
		}
		});
		btn7Button.setBounds(628, 248, 53, 14);
		contentPane.add(btn7Button);
		
		//oitavo BOTAO ADICIONAR
		
		JButton btn8Button = new JButton(" + ");
		btn8Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textArea.setText(textArea.getText() +"   X-BACON ;\n");
		}
		});
		btn8Button.setBounds(628, 278, 53, 14);
		contentPane.add(btn8Button);
				
		//nono BOTAO ADICIONAR
				
		JButton btn9Button = new JButton(" + ");
		btn9Button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			textArea.setText(textArea.getText() +"   MISTO ;\n");
		}
		});
		btn9Button.setBounds(628, 308, 53, 14);
		contentPane.add(btn9Button);
		
		
		
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
		
		
		
		JButton btnNewButton_5 = new JButton("Enviar");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(49, 485, 89, 23);
		contentPane.add(btnNewButton_5);
		
		//BOTAO APAGAR PEDIDOS
		
		JButton btnAPAGAR = new JButton("Apagar");
		btnAPAGAR.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        textArea.setText(""); 
		    }
		});
		btnAPAGAR.setBounds(253, 485, 89, 23);
		contentPane.add(btnAPAGAR);
		
		txtObservao = new JTextField();
		txtObservao.setHorizontalAlignment(SwingConstants.LEFT);
		txtObservao.setColumns(10);
		txtObservao.setBounds(47, 333, 318, 121);
		contentPane.add(txtObservao);
		
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
		
		
		
		
		
		
		
	}
}