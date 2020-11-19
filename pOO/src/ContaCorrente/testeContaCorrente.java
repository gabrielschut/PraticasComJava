package ContaCorrente;

public class testeContaCorrente {
	public static void main(String[] args) {
		double a=0;
		contaCorrente c1 = new contaCorrente("Gabriel", 12345, "997707070", "gabriel.almeida@gmail.com", 500.0);
		
		System.out.printf("Nome: "+c1.getNome()+"\n");
		System.out.printf("CPF: "+c1.getCPF()+"\n");
		System.out.printf("Telefone: "+c1.getTelefone()+"\n");
		System.out.println("E-mail: "+c1.getEmail()+("\n"));
		System.out.print("Saldo em conta R$"+c1.getSaldo()+("\n"));
		
		
		c1.Credito(a);
		c1.Debito(a);
		
		System.out.println("Saldo ao final do dia \n"+"R$"+c1.getSaldo());
	}
	
	
	
	
}
