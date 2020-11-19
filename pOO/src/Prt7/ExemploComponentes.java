package Prt7;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ExemploComponentes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private JLabel rotulo;
	private JTextField texto;
	private JButton botao;
	
	public ExemploComponentes() {
		super("Teste de Janela");
		setLayout(new FlowLayout());
		rotulo = new JLabel("Nome: ");
		add(rotulo);
		
		texto = new JTextField(15);
		add(texto);
		
		botao = new JButton("Botão");
		add(botao);
		
		
		
	}
}
