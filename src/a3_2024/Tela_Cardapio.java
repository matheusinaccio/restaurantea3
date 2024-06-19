package a3_2024;

import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
import javax.swing.*;
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
	private JTextArea textObserv;
	boolean Xmisto = false;
	boolean XBacon = false;
	boolean XFrango = false;
	boolean XTudo = false;
	boolean XAmericano = false;
	boolean XSalada = false;
	boolean XAmoda = false;
	boolean Xburger = false;
	boolean Xbacon = false;
	boolean XCalabresa = false;

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
	//A parte que imprime o texto
	public class ArrayPrinter implements Printable {
		public ArrayList<String> Lista;

		public ArrayPrinter(ArrayList<String> Lista) {
			this.Lista = Lista;
		}

		public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
			Graphics2D g2d = (Graphics2D) graphics;
			g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

			// seta a fonte do testo e o tamanho
			Font font = new Font("Monospaced", Font.PLAIN, 6);
			g2d.setFont(font);

			// largura e altura do texto sendo y altura e lineWidth largura
			int y = 5;
			int lineWidth = 120; 
			FontMetrics metrics = g2d.getFontMetrics();

			for (String item : Lista) {
				String[] lines = item.split("\\r?\\n");
				for (String line : lines) {
					int x = 0;
					String[] words = line.split("\\s+");
					StringBuilder lineText = new StringBuilder();

					for (String word : words) {
						if (metrics.stringWidth(lineText.toString() + word + " ") > lineWidth) {
							g2d.drawString(lineText.toString(), 0, y);
							y += metrics.getHeight();
							lineText.setLength(0);
						}
						lineText.append(word).append(" ");
					}
					g2d.drawString(lineText.toString(), 0, y);
					y += metrics.getHeight();
				}
				y += metrics.getHeight(); // add extra space between lines
			}
			return PAGE_EXISTS;
		}
	}

	public Tela_Cardapio() {
		//Lista de pedidos
		ArrayList<String> Lista = new ArrayList<>();
		Random random = new Random();
		int numeroSorteado = random.nextInt(5) + 1;
		LocalDateTime agora = LocalDateTime.now();

		// Define o formato da hora
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		String horaFormatada = agora.format(formatter);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(79, 39, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Area do texto que mostra as comidas
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(255, 241, 223));
		textArea.setEditable(false);
		textArea.setBounds(76, 69, 316, 236);
		contentPane.add(textArea);
		// Area do texto de observações
		JTextArea textObserv = new JTextArea();
		textObserv.setLineWrap(true);
		textObserv.setWrapStyleWord(true);
		textObserv.setBackground(new Color(255, 241, 223));
		textObserv.setBounds(76, 380, 316, 158);
		contentPane.add(textObserv);

		//Contador de comidas
		final int[] contadorXtudo = { 0 };
		final int[] contadorXburguer = { 0 };
		final int[] contadorXamericano = { 0 };
		final int[] contadorXsalada = { 0 };
		final int[] contadorXAmoda = { 0 };
		final int[] contadorXfrango = { 0 };
		final int[] contadorXcalabresa = { 0 };
		final int[] contadorXbacon = { 0 };
		final int[] contadorXmisto = { 0 };

		//Botões que adicionam a comida
		JButton btnaddXtudo = new JButton("X-TUDO");
		btnaddXtudo.setIcon(new ImageIcon("C:\\Users\\mathe\\eclipse-workspace\\a324\\Img\\X-Tudo.png"));
		btnaddXtudo.setBackground(new Color(255, 219, 183));
		btnaddXtudo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contadorXtudo[0]++;
				String textoAtual = textArea.getText();
				if (textoAtual.contains("X-TUDO")) {
					textoAtual = textoAtual.replaceAll("(\\d+)-X-TUDO ;\n", contadorXtudo[0] + "-X-TUDO ;\n");
				} else {
					textoAtual += contadorXtudo[0] + "-X-TUDO ;\n";
				}
				textArea.setText(textoAtual);
				XTudo = true;
			}
		});
		btnaddXtudo.setBounds(442, 65, 150, 33);
		contentPane.add(btnaddXtudo);

		JButton btn3Button = new JButton("X-AMERICANO");
		btn3Button.setBackground(new Color(255, 219, 183));
		btn3Button.setIcon(new ImageIcon("C:\\Users\\mathe\\eclipse-workspace\\a324\\Img\\X-Americano.png"));
		btn3Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contadorXamericano[0]++;
				String textoAtual = textArea.getText();
				if (textoAtual.contains("X-AMERICANO")) {
					textoAtual = textoAtual.replaceAll("(\\d+)-X-AMERICANO ;\n", contadorXamericano[0] + "-X-AMERICANO ;\n");
				} else {
					textoAtual += contadorXamericano[0] + "-X-AMERICANO ;\n";
				}
				textArea.setText(textoAtual);
				XAmericano = true;
			}
		});
		btn3Button.setBounds(613, 65, 150, 33);
		contentPane.add(btn3Button);

		
		JButton btn4Button = new JButton("X-SALADA");
		btn4Button.setBackground(new Color(255, 219, 183));
		btn4Button.setIcon(new ImageIcon("C:\\Users\\mathe\\eclipse-workspace\\a324\\Img\\X-Salada.png"));
		btn4Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contadorXsalada[0]++;
				String textoAtual = textArea.getText();
				if (textoAtual.contains("X-SALADA")) {
					textoAtual = textoAtual.replaceAll("(\\d+)-X-SALADA ;\n", contadorXsalada[0] + "-X-SALADA ;\n");
				} else {
					textoAtual += contadorXsalada[0] + "-X-SALADA ;\n";
				}
				textArea.setText(textoAtual);
				XSalada = true;
			}
		});
		btn4Button.setBounds(442, 124, 150, 33);
		contentPane.add(btn4Button);


		JButton btn5Button = new JButton(" X-AMODA");
		btn5Button.setBackground(new Color(255, 219, 183));
		btn5Button.setIcon(new ImageIcon("C:\\Users\\mathe\\eclipse-workspace\\a324\\Img\\X-Amoda.png"));
		btn5Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contadorXAmoda[0]++;
				String textoAtual = textArea.getText();
				if (textoAtual.contains("X-AMODA")) {
					textoAtual = textoAtual.replaceAll("(\\d+)-X-AMODA ;\n", contadorXAmoda[0] + "-X-AMODA ;\n");
				} else {
					textoAtual += contadorXAmoda[0] + "-X-AMODA ;\n";
				}
				textArea.setText(textoAtual);
				XAmoda = true;
			}
		});
		btn5Button.setBounds(613, 124, 150, 33);
		contentPane.add(btn5Button);

		JButton btn6Button = new JButton("X-FRANGO");
		btn6Button.setBackground(new Color(255, 219, 183));
		btn6Button.setIcon(new ImageIcon("C:\\Users\\mathe\\eclipse-workspace\\a324\\Img\\X-Frango.png"));
		btn6Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contadorXfrango[0]++;
				String textoAtual = textArea.getText();
				if (textoAtual.contains("X-FRANGO")) {
					textoAtual = textoAtual.replaceAll("(\\d+)-X-FRANGO ;\n", contadorXfrango[0] + "-X-FRANGO ;\n");
				} else {
					textoAtual += contadorXfrango[0] + "-X-FRANGO ;\n";
				}
				textArea.setText(textoAtual);
				XFrango = true;
			}
		});
		btn6Button.setBounds(442, 189, 150, 33);
		contentPane.add(btn6Button);

		// Botão XCalabresa
		JButton btn7Button = new JButton("X-CALABRESA");
		btn7Button.setBackground(new Color(255, 219, 183));
		btn7Button.setIcon(new ImageIcon("C:\\Users\\mathe\\eclipse-workspace\\a324\\Img\\X-Calabresa.png"));
		btn7Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contadorXcalabresa[0]++;
				String textoAtual = textArea.getText();
				if (textoAtual.contains("X-CALABRESA")) {
					textoAtual = textoAtual.replaceAll("(\\d+)-X-CALABRESA ;\n", contadorXcalabresa[0] + "-X-CALABRESA ;\n");
				} else {
					textoAtual += contadorXcalabresa[0] + "-X-CALABRESA ;\n";
				}
				textArea.setText(textoAtual);
				XCalabresa = true;
			}
		});
		btn7Button.setBounds(613, 189, 150, 33);
		contentPane.add(btn7Button);
		// Botão XBacon
		JButton btn8Button = new JButton("X-BACON");
		btn8Button.setBackground(new Color(255, 219, 183));
		btn8Button.setIcon(new ImageIcon("C:\\Users\\mathe\\eclipse-workspace\\a324\\Img\\X-Bacon.png"));
		btn8Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contadorXbacon[0]++;
				String textoAtual = textArea.getText();
				if (textoAtual.contains("X-BACON")) {
					textoAtual = textoAtual.replaceAll("(\\d+)-X-BACON ;\n", contadorXbacon[0] + "-X-BACON ;\n");
				} else {
					textoAtual += contadorXbacon[0] + "-X-BACON ;\n";
				}
				textArea.setText(textoAtual);
				XBacon = true;
			}
		});
		btn8Button.setBounds(442, 244, 150, 33);
		contentPane.add(btn8Button);

		// Botão Misto

		JButton btn9Button = new JButton("MISTO");
		btn9Button.setBackground(new Color(255, 219, 183));
		btn9Button.setIcon(new ImageIcon("C:\\Users\\mathe\\eclipse-workspace\\a324\\Img\\X-Misto.png"));
		btn9Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contadorXmisto[0]++;
				String textoAtual = textArea.getText();
				if (textoAtual.contains("X-MISTO")) {
					textoAtual = textoAtual.replaceAll("(\\d+)-X-MISTO ;\n", contadorXmisto[0] + "-X-MISTO ;\n");
				} else {
					textoAtual += contadorXmisto[0] + "-X-MISTO ;\n";
				}
				textArea.setText(textoAtual);
				Xmisto = true;
			}
		});
		btn9Button.setBounds(613, 244, 150, 33);
		contentPane.add(btn9Button);

		// Btn Com funçoes --------------------

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Stencil", Font.PLAIN, 20));
		btnEnviar.setForeground(Color.GREEN);
		btnEnviar.setBackground(new Color(255, 128, 0));
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextArea seuTextArea = textArea;
				// Checa se tem pedidos para fazer
				if (textArea.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O campo de texto está vazio! ");
					System.out.println("Request NULL");
					// caso tenha
				} else {
					Lista.add("Mesa: " + String.valueOf(numeroSorteado) + " // " + " Data: " + horaFormatada);
					Lista.add("Pedidos //");
					// adiciona os pedidos no arraylist
					if (XBacon == true) {
						Lista.add(contadorXbacon[0] + "-Xbacon\n");
					}
					if (Xmisto == true) {
						Lista.add(contadorXmisto[0] + "-Xmisto\n");
					}
					if (XFrango == true) {
						Lista.add(contadorXfrango[0] + "-Xfrango\n");
					}
					if (XTudo == true) {
						Lista.add(contadorXtudo[0] + "-Xtudo\n");
					}
					if (XAmericano == true) {
						Lista.add(contadorXamericano[0] + "-Xamericano\n");
					}
					if (XSalada == true) {
						Lista.add(contadorXAmoda[0] + "-Xsalada\n");
					}
					if (XCalabresa == true) {
						Lista.add(contadorXcalabresa[0] + "-Xcalabresa\n");
					}
					if (Xbacon == true) {
						Lista.add(contadorXbacon[1] + "-Xbacon\n");
					}
					if (XAmoda == true) {
						Lista.add(contadorXAmoda[0] + "-Xamoda\n");
					}
					if (Xburger == true) {
						Lista.add(contadorXbacon[1] + "-Xburger\n");
					}

					Lista.add("Observações //");
					Lista.add(textObserv.getText());
					System.out.println(Lista);
					// * Printer  Start*/
					//formata a pagina e chama a impreção
					PrinterJob job = PrinterJob.getPrinterJob();
					ArrayPrinter printer = new ArrayPrinter(Lista);
					Paper paper = new Paper();
					paper.setSize(124, 1400); // seta tudo em 40 mm
					paper.setImageableArea(0, 0, 120, 1390); // coloca a margin em mm
					PageFormat pageFormat = new PageFormat();
					pageFormat.setPaper(paper);
					pageFormat.setOrientation(PageFormat.PORTRAIT);
					Book book = new Book();
					book.append(printer, pageFormat);

					job.setPageable(book);
					if(job.printDialog()){
					try {
						job.print();
					} catch (Exception err) {
						System.out.println("Error: " + err.getMessage());
						err.printStackTrace();
					}
				}
					// *End */
					// limpa tudo apos o termino da impreção
					contadorXtudo[0] = 0;
					contadorXburguer[0] = 0;
					contadorXamericano[0] = 0;
					contadorXsalada[0] = 0;
					contadorXAmoda[0] = 0;
					contadorXfrango[0] = 0;
					contadorXcalabresa[0] = 0;
					contadorXbacon[0] = 0;
					contadorXmisto[0] = 0;
					XBacon = false;
					XFrango = false;
					XTudo = false;
					Xmisto = false;
					XAmericano = false;
					XSalada = false;
					XAmericano = false;
					XCalabresa = false;
					Xbacon = false;
					Xburger = false;
				}
				textArea.setText("");
				textObserv.setText("");
				Lista.clear();
			}
		});
		btnEnviar.setBounds(442, 492, 113, 44);
		contentPane.add(btnEnviar);
		// botao apagar
		JButton btnAPAGAR = new JButton("Apagar");
		btnAPAGAR.setForeground(Color.RED);
		btnAPAGAR.setFont(new Font("Stencil", Font.PLAIN, 20));
		btnAPAGAR.setBackground(new Color(255, 128, 0));
		btnAPAGAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textObserv.setText("");
				Lista.clear();
				contadorXtudo[0] = 0;
				contadorXburguer[0] = 0;
				contadorXamericano[0] = 0;
				contadorXsalada[0] = 0;
				contadorXAmoda[0] = 0;
				contadorXfrango[0] = 0;
				contadorXcalabresa[0] = 0;
				contadorXbacon[0] = 0;
				contadorXmisto[0] = 0;
				XBacon = false;
				XFrango = false;
				XTudo = false;
				Xmisto = false;
				XAmericano = false;
				XSalada = false;
				XAmericano = false;
				XCalabresa = false;
				Xbacon = false;
				Xburger = false;
			}
		});
		btnAPAGAR.setBounds(639, 492, 113, 44);
		contentPane.add(btnAPAGAR);

		JButton btnNewButton_6 = new JButton("Voltar");
		btnNewButton_6.setBackground(new Color(255, 128, 0));
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("Stencil", Font.PLAIN, 20));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_inicio Tela_inicio = new Tela_inicio();
				Tela_inicio.setVisible(true);
				dispose();
			}
		});
		btnNewButton_6.setBounds(10, 11, 122, 44);
		contentPane.add(btnNewButton_6);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon(Tela_Cardapio.class.getResource("/a3_2024/images/pdd.png")));
		lblNewLabel.setBounds(10, 69, 46, 164);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setIcon(new ImageIcon(Tela_Cardapio.class.getResource("/a3_2024/images/obs.png")));
		lblNewLabel_1.setBounds(0, 316, 77, 245);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Tela_Cardapio.class.getResource("/a3_2024/images/file_1.png")));
		lblNewLabel_2.setBounds(402, 244, 400, 346);
		contentPane.add(lblNewLabel_2);
	}
}