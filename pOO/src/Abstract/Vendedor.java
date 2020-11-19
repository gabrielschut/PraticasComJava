package Abstract;

public class Vendedor extends Funcionário{

	private String regiao;
	private double comissao;
	
	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public double Reajuste(double salario) {
		double a = salario *0.1;
		salario +=a;
		super.setSalario(salario);
		return salario;
	}

	
}
