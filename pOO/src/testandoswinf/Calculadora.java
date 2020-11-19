package testandoswinf;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {
	private JTextField txt_n1;
	private JTextField txt_n2;
	private JTextField txt_resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Calculadora", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel.setBounds(10, 11, 283, 313);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1\u00BA N\u00B0");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(23, 24, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2\u00BA N\u00B0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(23, 63, 46, 14);
		panel.add(lblNewLabel_1);
		
		txt_n1 = new JTextField();
		txt_n1.setBounds(93, 21, 161, 20);
		panel.add(txt_n1);
		txt_n1.setColumns(10);
		
		txt_n2 = new JTextField();
		txt_n2.setBounds(93, 60, 161, 20);
		panel.add(txt_n2);
		txt_n2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(23, 111, 58, 14);
		panel.add(lblNewLabel_2);
		
		txt_resultado = new JTextField();
		txt_resultado.setBounds(93, 108, 161, 20);
		panel.add(txt_resultado);
		txt_resultado.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_n1.setText("");
				txt_n2.setText("");
				txt_resultado.setText("");
			}
		});
		btnLimpar.setBounds(18, 161, 63, 23);
		panel.add(btnLimpar);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float n1, n2, resultado;
				n1 = Float.parseFloat(txt_n1.getText());
				n2 = Float.parseFloat(txt_n2.getText());
				resultado = n1+n2;
				txt_resultado.setText(String.valueOf(resultado));
			}
		});
		btnAdicionar.setBounds(105, 161, 77, 23);
		panel.add(btnAdicionar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(196, 161, 58, 23);
		panel.add(btnSair);
	}
}
