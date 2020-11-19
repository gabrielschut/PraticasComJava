package PraticadeLab8;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Calculadora extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		getContentPane().setBackground(UIManager.getColor("Button.shadow"));
		getContentPane().setLayout(null);
		setVisible(true);
		setBounds(100,100,275,325);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Calculadora", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel.setBounds(10, 11, 239, 265);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1\u00BA N\u00B0");
		lblNewLabel.setBounds(22, 25, 46, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2\u00BA N\u00B0");
		lblNewLabel_1.setBounds(22, 55, 46, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel_1);
		
		txt_n1 = new JTextField();
		txt_n1.setBounds(78, 22, 151, 20);
		panel.add(txt_n1);
		txt_n1.setColumns(10);
		
		txt_n2 = new JTextField();
		txt_n2.setBounds(78, 52, 151, 20);
		panel.add(txt_n2);
		txt_n2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(10, 91, 58, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel_2);
		
		txt_resultado = new JTextField();
		txt_resultado.setBounds(78, 88, 151, 20);
		panel.add(txt_resultado);
		txt_resultado.setColumns(10);
		
		JButton btnLimpar = new JButton("C");
		btnLimpar.setBounds(160, 130, 58, 23);
		btnLimpar.setForeground(new Color(0, 128, 0));
		btnLimpar.setBackground(UIManager.getColor("Button.shadow"));
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_n1.setText("");
				txt_n2.setText("");
				txt_resultado.setText("");
			}
		});
		panel.add(btnLimpar);
		
		JButton btnAdicionar = new JButton("+");
		btnAdicionar.setBounds(22, 130, 53, 23);
		btnAdicionar.setForeground(new Color(0, 0, 205));
		btnAdicionar.setBackground(UIManager.getColor("Button.shadow"));
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float n1, n2, resultado;
				n1 = Float.parseFloat(txt_n1.getText());
				n2 = Float.parseFloat(txt_n2.getText());
				resultado = n1+n2;
				txt_resultado.setText(String.valueOf(resultado));
			}
		});
		panel.add(btnAdicionar);
		
		JButton btnNewButton = new JButton("/");
		btnNewButton.setBounds(88, 130, 58, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float n1, n2, resultado;
				n1 = Float.parseFloat(txt_n1.getText());
				n2 = Float.parseFloat(txt_n2.getText());
				resultado = n1/n2;
				txt_resultado.setText(String.valueOf(resultado));
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 205));
		btnNewButton.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setBounds(22, 174, 53, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float n1, n2, resultado;
				n1 = Float.parseFloat(txt_n1.getText());
				n2 = Float.parseFloat(txt_n2.getText());
				resultado = n1-n2;
				txt_resultado.setText(String.valueOf(resultado));
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 205));
		btnNewButton_1.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("X\u00B2");
		btnNewButton_2.setBounds(88, 174, 58, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1, resultado;
				n1 = Double.parseDouble(txt_n1.getText());
				resultado = Math.pow(n1, 2);
				txt_resultado.setText(String.valueOf(resultado));
			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 205));
		btnNewButton_2.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u221A");
		btnNewButton_3.setBounds(160, 174, 58, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1,resultado;
				n1 = Double.parseDouble(txt_n1.getText());
				resultado = Math.pow(n1, 0.5);
				txt_resultado.setText(String.valueOf(resultado));
			}
		});
		btnNewButton_3.setForeground(new Color(0, 0, 205));
		btnNewButton_3.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("*");
		btnNewButton_4.setBounds(22, 216, 53, 23);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float n1, n2, resultado;
				n1 = Float.parseFloat(txt_n1.getText());
				n2 = Float.parseFloat(txt_n2.getText());
				resultado = n1*n2;
				txt_resultado.setText(String.valueOf(resultado));
			}
		});
		btnNewButton_4.setForeground(new Color(0, 0, 205));
		btnNewButton_4.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("X\u00B3");
		btnNewButton_5.setBounds(87, 216, 59, 23);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1, resultado;
				n1 = Double.parseDouble(txt_n1.getText());
				resultado = Math.pow(n1, 3);
				txt_resultado.setText(String.valueOf(resultado));
				
			}
		});
		btnNewButton_5.setForeground(new Color(0, 0, 205));
		btnNewButton_5.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("n!");
		btnNewButton_6.setBounds(160, 216, 58, 23);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1, multiplicador;
				multiplicador=0;
				n1 = Double.parseDouble(txt_n1.getText());
				multiplicador=n1;
				while(n1>1) {
					multiplicador*=(n1-1);
					n1--;

				}
				txt_resultado.setText(String.valueOf(multiplicador));
				
			}
		});
		btnNewButton_6.setForeground(new Color(0, 0, 205));
		btnNewButton_6.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(btnNewButton_6);
	}
}
