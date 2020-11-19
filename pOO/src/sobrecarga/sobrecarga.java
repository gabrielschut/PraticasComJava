package sobrecarga;

public class sobrecarga {
	private int resultado;
	
	public int calcula(int a) {
		this.resultado=(a/2);
		return this.resultado;

	}
	public int calcula(int a, int b) {
		this.resultado = a-b;
		return this.resultado;
	}
	
	public int calcula(int a, int b, int c) {
		this.resultado = a*b*c;
		return this.resultado;
	}
	
	public int calcula(int a, int b, int c, int d) {
		this.resultado = a+b+c+d;
		return this.resultado;
	}
	
	public void ImprimeCalculo() {
		System.out.println("Oresultado foi "+ this.resultado);
	}
}
