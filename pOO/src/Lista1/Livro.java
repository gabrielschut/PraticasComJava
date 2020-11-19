package Lista1;

public class Livro extends Produto{

	private String autor;
	private String editora;
	private String ISBN;
	private int ano;
	
	public String getAutor() {
		return autor;
	}

	public String getEditora() {
		return editora;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getAno() {
		return ano;
	}

	public Livro(String codigo, double preco, String descricao,String autor, String editora, int ano, String ISBN) {
		super(codigo, preco, descricao);
		this.autor = autor;
		this.editora = editora;
		this.ano = ano;
		this.ISBN = ISBN;
	}

	@Override
	public void imprime() {
		super.imprime();
		System.out.println("Autor: "+getAutor());
		System.out.println("Editora: "+getEditora());
		System.out.println("Ano de lançamento: "+getAno());
		System.out.println("ISBN: "+getISBN());
	}
}
