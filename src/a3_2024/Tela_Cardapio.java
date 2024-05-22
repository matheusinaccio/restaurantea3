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

public class Tela_Cardapio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
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
		
		JLabel lblNewLabel = new JLabel("Pedidos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(142, 11, 84, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNomePedido = new JLabel("NOME PEDIDO");
		lblNomePedido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNomePedido.setBounds(455, 47, 156, 44);
		contentPane.add(lblNomePedido);
		
		JButton btnNewButton = new JButton("Pedir");
		btnNewButton.setBounds(642, 62, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNomePedido_1 = new JLabel("NOME PEDIDO");
		lblNomePedido_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNomePedido_1.setBounds(455, 114, 156, 44);
		contentPane.add(lblNomePedido_1);
		
		JButton btnNewButton_1 = new JButton("Pedir");
		btnNewButton_1.setBounds(642, 129, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNomePedido_2 = new JLabel("NOME PEDIDO");
		lblNomePedido_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNomePedido_2.setBounds(455, 189, 156, 44);
		contentPane.add(lblNomePedido_2);
		
		JButton btnNewButton_2 = new JButton("Pedir");
		btnNewButton_2.setBounds(642, 204, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNomePedido_3 = new JLabel("NOME PEDIDO");
		lblNomePedido_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNomePedido_3.setBounds(455, 264, 156, 44);
		contentPane.add(lblNomePedido_3);
		
		JButton btnNewButton_3 = new JButton("Pedir");
		btnNewButton_3.setBounds(642, 279, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNomePedido_4 = new JLabel("NOME PEDIDO");
		lblNomePedido_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNomePedido_4.setBounds(455, 350, 156, 44);
		contentPane.add(lblNomePedido_4);
		
		JButton btnNewButton_4 = new JButton("Pedir");
		btnNewButton_4.setBounds(642, 365, 89, 23);
		contentPane.add(btnNewButton_4);
		
		textField = new JTextField();
		textField.setBounds(47, 66, 318, 256);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Enviar");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(49, 485, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("Apagar");
		btnNewButton_5_1.setBounds(253, 485, 89, 23);
		contentPane.add(btnNewButton_5_1);
		
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
	}
}