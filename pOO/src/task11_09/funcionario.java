package task11_09;

public class funcionario {

	private String nome;
	private double salario;
	private int idade;
	//Construtor n�o padr�o
	//Construtor com parametros espec�ficos.
	public funcionario(String nome, double salario, int idade) {
		this.nome = nome;
		this.salario = salario;
		this.idade = idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
}
