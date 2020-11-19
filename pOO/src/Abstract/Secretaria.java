package Abstract;

public class Secretaria extends Funcionário{

	private String departamento;
	private String idioma;
	
	
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	
	@Override
	public double Reajuste(double salario) {
		double a= salario*0.15;
		salario +=a;
		super.setSalario(salario);
		return salario;
	}
	
	
}
