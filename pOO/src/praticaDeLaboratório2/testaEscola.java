package praticaDeLaboratório2;

public class testaEscola {
	public static void main(String[] args) {
	int a=0, b=0;
		
		
	Escola a1 =new Escola("Maria", "Macapa", 12345, 0);
	
	Escola a2 = new Escola("João","Jundiai", 54321, 10);
		
		a1.adicionaCredito(a, b);
		a2.adicionaCredito(a, b);
		System.out.println("");
		a1.imprime();
		System.out.println("\n");
		a2.imprime();
				
		
	}
}
