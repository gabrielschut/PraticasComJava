package Lista1;

public abstract class Empregado {

	private String codigo;
	private String nome;
	private double salarioBase;
	
	public Empregado(String codigo, String nome, double salario) {
		setCodigo(codigo);
		setNome(nome);
		setSalarioBase(salario);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public abstract double calculaSalario();
	
}
