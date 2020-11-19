package Prt7;

import java.awt.BorderLayout;

import javax.swing.*;
//import javax.swing.border.Border;

public class ExemploBorderLayout extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JButton sim, nao, cancelar, salvar, confirmar;
	
	public ExemploBorderLayout() {
		super("exemplo border");
		sim = new JButton("sim");
		nao = new JButton("Não");
		cancelar = new JButton("Cancelar");
		salvar = new JButton("Salvar");
		confirmar = new JButton("Confirmar");
		getContentPane().setLayout(new BorderLayout());
		add(salvar, BorderLayout.CENTER);
		add(sim, BorderLayout.EAST);
		add(nao, BorderLayout.WEST);
		add(cancelar, BorderLayout.SOUTH);
		add(confirmar, BorderLayout.NORTH);
	}
	

}
