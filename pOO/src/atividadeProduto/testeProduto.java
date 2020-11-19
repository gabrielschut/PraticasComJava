package atividadeProduto;



public class testeProduto {

	static String descricao;
	static int qtd;
	static double preco, desconto; 
	public static void main(String[] args) {
	
		Produto p1 = new Produto();
		
		p1.setDescricao(descricao);
		p1.setQuantidade(qtd);
		p1.setPreco(preco);
	
		System.out.println("Produto: "+ p1.getDescricao());
		System.out.println("Quantidade: "+ p1.getQuantidade());
		System.out.println("Valor: "+ p1.getPreco());
		System.out.println("Total de desconto: "+p1.valdesconto(desconto));
		System.out.println("Com desconto: "+p1.desc());
		
	}
}
