package PraticadeLab0611;

public class NoteBook extends Produto implements Venda {
	
	private String HD;
	private String memoria;
	
	public String getHD() {
		return HD;
	}


	public void setHD(String hD) {
		HD = hD;
	}
	
	public String getMemoria() {
		return memoria;
	}


	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}


	public NoteBook(String cdo, String desc, double preco, String HD, String memoria) {
		super(cdo, desc, preco);
		setHD(HD);
		setMemoria(memoria);
		
	}


	@Override
	public double valorTotal() {
		double valor = getPreco();
		valor*=1.2;
		setPreco(valor);
		return super.getPreco();
	}

	
	@Override
	public String toString() {
		System.out.printf("\n"+getHD()+"\n"+getMemoria());
		return super.toString();
	}
}
