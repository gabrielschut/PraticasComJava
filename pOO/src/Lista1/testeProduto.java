package Lista1;

public class testeProduto {

	public static void main(String[] args) {
		
		Livro Hsemfim = new Livro("010111", 49.99, "A história sem fim.", "Michel Ende", "Martins Fontes", 1979, "9788561635954");
		
		Compact_Disc cd = new Compact_Disc("12457429", 32.50, "Musica Pop", "Bad 25", "Michel Jackson", "Epic");
		
		Hsemfim.imprime();
		System.out.println("\n");
		cd.imprime();
	}
	
	
	
}
