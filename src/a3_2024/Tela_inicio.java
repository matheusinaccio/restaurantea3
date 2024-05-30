package a3_2024;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import java.awt.SystemColor;

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
		
		setAutoRequestFocus(false);
		setBackground(Color.CYAN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Stencil", Font.PLAIN, 11));
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//TEXTO RESTAURANTE
		
		JLabel lbl_restaurante = new JLabel("LES BLUE'S");
		lbl_restaurante.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_restaurante.setToolTipText("");
		lbl_restaurante.setBounds(10, 132, 764, 65);
		lbl_restaurante.setFont(new Font("Stencil", Font.BOLD, 39));
		lbl_restaurante.setForeground(new Color(0, 0, 0));
		contentPane.add(lbl_restaurante);
		
		//BOTAO INICIAR MENU
		
		JButton bntINICIAR = new JButton("INICIAR");
		bntINICIAR.setFont(new Font("Stencil", Font.PLAIN, 21));
		bntINICIAR.setBorderPainted(false);
		bntINICIAR.setForeground(Color.BLACK);
		bntINICIAR.setBackground(new Color(100, 149, 237));
		bntINICIAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Cardapio Tela_Cardapio = new Tela_Cardapio();
				Tela_Cardapio.setVisible(true);
				dispose();
			}
		});
		bntINICIAR.setBounds(319, 254, 156, 37);
		contentPane.add(bntINICIAR);
	}
}