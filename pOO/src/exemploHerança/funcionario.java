package exemploHerança;

public class funcionario {

	private String nome;
	private String endereco;
	private int matricula;
	
	public funcionario(String nome, String endereco, int matricula) {
		setNome(nome);
		setEndereco(endereco);
		setMatricula(matricula);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
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
