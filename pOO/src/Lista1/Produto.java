package Lista1;

public class Produto {

	private String codigo;
	private double preco;
	private String descricao;
	
	public Produto(String codigo, double preco, String descricao) {
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

	public String getDescricao() {
		return descricao;
	}
	
public void imprime() {
	System.out.println("Cod do produto: "+getCodigo());
	System.out.println("R$"+getPreco());
	System.out.println("Descrição:"+getDescricao());
	}
	
}
