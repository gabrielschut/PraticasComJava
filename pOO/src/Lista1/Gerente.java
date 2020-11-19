package Lista1;

public class Gerente extends Empregado{

	private double bonus;
	
	public Gerente(String codigo, String nome, double salario,double bonus) {
		super(codigo, nome, salario);
		setBonus(bonus);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double calculaSalario() {
		double a = super.getSalarioBase()+this.bonus;
		super.setSalarioBase(a);
		return a;
	}

}
