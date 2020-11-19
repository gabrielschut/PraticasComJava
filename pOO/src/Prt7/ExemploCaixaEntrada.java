package Prt7;

import javax.swing.JOptionPane;

public class ExemploCaixaEntrada {
	
	public static void main(String[] args) {
		
		int resulta = 0;
		
		do {
			calcula();
			JOptionPane.showConfirmDialog(null,"Deseja Finalizar a execução?", "Saida",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			
		}while(resulta == 1 ); //1= não 0= Sim;
			
		System.exit(0);
		
		
	}
	public static void calcula() {
		int n1, n2, r;
		n1 =Integer.parseInt(JOptionPane.showInputDialog(null, "Primeiro Número ", "Informeo primeiro número",JOptionPane.QUESTION_MESSAGE));
		n2 =Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo Número ", "Informeo segundo número",JOptionPane.QUESTION_MESSAGE));
		r = n1+n2;
		JOptionPane.showMessageDialog(null, "Resultado da soma = "+ r);
	}
	
}
