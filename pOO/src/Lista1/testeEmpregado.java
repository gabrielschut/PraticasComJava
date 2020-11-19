package Lista1;

public class testeEmpregado {
	
	public static void main(String[] args) {
		
		Engenheiro playboy1 = new Engenheiro("10101e", "Pierre", 5000.00, "Energia", "A5478245");
		Gerente Desgracado1 = new Gerente("00253g", "Marcos", 2800.55, 280.05);
		
		playboy1.calculaSalario();
		Desgracado1.calculaSalario();
		System.out.println("Engenheiro "+playboy1.getSalarioBase());
		System.out.println("Gerente "+Desgracado1.getSalarioBase());
	}
	
}
