package Lista1;

public class Engenheiro extends Empregado{

	private String departamento;
	private String CREA;
	
	
	public Engenheiro(String codigo, String nome, double salario, String departamento, String CREA) {
		super(codigo, nome, salario);
		setDepartamento(departamento);
		setCREA(CREA);
	}
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCREA() {
		return CREA;
	}

	public void setCREA(String cREA) {
		CREA = cREA;
	}

	@Override
	public double calculaSalario() {
		double a = super.getSalarioBase()*1.5;
		super.setSalarioBase(a);
		return a;
	}


	
}
