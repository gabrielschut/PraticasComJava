package atividadeProduto;

import java.util.Scanner;

public class classValor {
	Scanner ler = new Scanner(System.in);
	private double numero;
	
	
	public void setNumero(double numero) {
		System.out.print("Insira um numero : ");
		numero = ler.nextDouble();
		this.numero = numero;
	}
	
	public double Dobra() {
		this.numero*=2;
		return this.numero;
	}
}
