package a3_2024;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Tela_inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_inicio frame = new Tela_inicio();
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
	public Tela_inicio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\matheus\\Downloads\\file.png"));
		
		setAutoRequestFocus(false);
		setBackground(Color.CYAN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setFont(new Font("Stencil", Font.PLAIN, 11));
		contentPane.setBackground(new Color(79, 39, 0));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//TEXTO RESTAURANTE
		
		JLabel lbl_restaurante = new JLabel("~ LES BLUE'S ~");
		lbl_restaurante.setBounds(10, 76, 764, 165);
		lbl_restaurante.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_restaurante.setToolTipText("");
		lbl_restaurante.setFont(new Font("Agency FB", Font.BOLD | Font.ITALIC, 76));
		lbl_restaurante.setForeground(new Color(255, 255, 255));
		contentPane.add(lbl_restaurante);
		
		
		//BOTAO INICIAR MENU
		
		JButton bntINICIAR = new JButton("INICIAR");
		bntINICIAR.setBounds(319, 284, 156, 37);
		bntINICIAR.setFont(new Font("Stencil", Font.PLAIN, 21));
		bntINICIAR.setBorderPainted(false);
		bntINICIAR.setForeground(Color.BLACK);
		bntINICIAR.setBackground(new Color(255, 128, 0));
		bntINICIAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Cardapio Tela_Cardapio = new Tela_Cardapio();
				Tela_Cardapio.setVisible(true);
				dispose();
			}
		});
		contentPane.add(bntINICIAR);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Tela_inicio.class.getResource("/a3_2024/images/file.png")));
		lblNewLabel.setBounds(405, 240, 514, 331);
		contentPane.add(lblNewLabel);
	}
}