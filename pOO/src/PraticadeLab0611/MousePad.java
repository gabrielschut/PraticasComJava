package PraticadeLab0611;

public class MousePad extends Produto implements Venda{

	private String cor;
	private String tamanho;
	
	public MousePad(String cdo, String desc, double preco, String cor, String tamanho) {
		super(cdo, desc, preco);
		setCor(cor);
		setTamanho(tamanho);
	}

	@Override
	public double valorTotal() {
		double v = getPreco();
		v*=1.1;
		setPreco(v);
		return getPreco();
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		System.out.printf("\n"+getCor()+"\n"+getTamanho());
		return super.toString();
	}

}
