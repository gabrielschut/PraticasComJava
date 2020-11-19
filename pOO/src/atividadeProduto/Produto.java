package atividadeProduto;

import java.util.Scanner;

public class Produto {

	private String descricao;
	private int qtd;
	private double preco;
	
	Scanner ler = new Scanner(System.in);
	
	public void setDescricao(String descricao) {
		System.out.print("Insira a descrição do produto: ");
		descricao = ler.nextLine();
		this.descricao =descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setQuantidade(int qtd) {
		System.out.print("Insira a quantidade que possoui: ");
		qtd = ler.nextInt();
		this.qtd = qtd;
	}
	
	public int getQuantidade() {
		return this.qtd;
	}
	
	public void setPreco(double preco) {
		System.out.print("Insira o valor unitario do produto: ");
		preco = ler.nextDouble();
		this.preco = preco;
	}
	public double getPreco() {
		return this.preco;
	}
	
	public double desc() {
		if(this.preco <100) {
			preco*=0.95;
		}
		else {
			this.preco*=0.90;
		}
		return this.preco;
	}
	
	public double valdesconto(double desconto) {
		if(this.preco <100) {
			desconto = this.preco*0.05;
		}
		else {
			desconto = this.preco *0.10;
		}
		return desconto;
				
	}
}
