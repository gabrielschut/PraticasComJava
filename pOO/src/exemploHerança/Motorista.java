package exemploHerança;

public class Motorista extends funcionario{

	private String nome;
	private String endereco;
	private int matricula;
	
	public Motorista(String nome, String endereco, int matricula) {
		super(nome, endereco, matricula);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	
}
